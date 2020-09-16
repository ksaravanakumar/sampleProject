package com.qa.stub;


import com.ibm.disthub2.impl.util.Hex;
import com.ibm.mq.*;
import com.ibm.mq.constants.CMQC;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class RB_Mantec_ReadRequest implements Runnable
{
private MQQueueManager mqQueueManager = null; // QMGR object
private MQQueue queue; // Queue object

private String hostName; // host name
private String channel; // server connection channel
private String port; // port number on which the QMGR is running
static String qmgrName; // queue manager name
static String qName; // queue name
//static String resqName; // queue name
private String msgFileName; // message file name
private String msgFileNameTrim; // message file name
private String timeNow;// time at which the file gets downloaded
public static String fileNameTime; //fileName with time
public static final Logger log = LogManager.getLogger(RB_Mantec_ReadRequest.class.getName());
Properties mqProperties;
private String serviceName;
//private MQMessage message;
static String serviceType;
static String serviceTypeSpec;
private static String ResStatus;
private static String destAcctId;
//private static String bookCode;
private static File afile;
//static String respStatus;
static String destReqId;
static ArrayList<String> acctId;
static ArrayList<String> branchId;
static ArrayList<String> reqacctId;
static ArrayList<String> rulesacctId;
static ArrayList<String> acctGrp;
public byte[] reqmessage;
public byte[] reqcorr;
public String resqname;



MQQueueManager _queueManager;


public static String[] args;
public int mqCount;
public int threadSleepTime;
	
public RB_Mantec_ReadRequest(String[] args)
{
	 RB_Mantec_ReadRequest.args = args;		 
}


public void run() {
	//Display info about this particular thread
	log.debug("Started Fetching Requests...............");
	System.out.println("Started Fetching Requests...............");
	while(true) {
             
			init();
	  
	}		
 }

public void init()
{
	try
	{
		System.out.println("New args:"+args[0]);
		String fileName = args[0]+"/properties/mqConfig.properties";
		this.readPropertyFile(fileName);
		this.mqInit( );
		System.out.println("Mq initializing started "+new Date());
		log.debug("Mq initializing started "+new Date());
	}
	catch( Exception e)
	{
		e.printStackTrace();
	}
}



public void mqInit( )
{// Initiation of the MQ parameter
	try
	{	
		System.out.println("host name : " + hostName+"\n"
		+"QMGR name : " + qmgrName+"\n"
		+"port number : " + port+"\n"
		+"channel : " + channel+"\n"
		+"file name : " + msgFileName+"\n"
		+"queue name : " + qName+"\n"
		+"\n");
		
		log.debug("host name : " + hostName+"\n"
				+"QMGR name : " + qmgrName+"\n"
				+"port number : " + port+"\n"
				+"channel : " + channel+"\n"
				+"file name : " + msgFileName+"\n"
				+"queue name : " + qName+"\n"
				+"\n");
		
		mqOperations();
	} 
	catch (Exception e)
	{
		e.printStackTrace();
	}
}


public void mqOperations() throws Exception, MQException
{// connect, open, browse, close & disconnects
		qName = mqProperties.getProperty("manqName");
		String queue1 = qName.substring(0,qName.indexOf("|"));
		serviceName = qName.substring(qName.indexOf("|")+1);
		qName = queue1;
		fileNameTime = serviceName+".xml";
		
		RB_Mantec_WriteResponse wr = new RB_Mantec_WriteResponse();
				
		try
		{
		    mqConnect(); // queue manager connection
			mqRead(); // reads the messages in queue and creates an XML file and moves it with new message to the 'Request_Input' folder
		    wr.mqWrite(reqmessage,resqname);//writes response xml and sends it
		    mqClose(); // close the queue
		    mqDisconnect();// disconnect the queue
		  
		}
		catch (Exception exp)
		{
			exp.printStackTrace();
		}	
}//mqOperations ends here


public void mqConnect() throws Exception, MQException 
{// Connection to the queue manager
	try
	{
		MQEnvironment.hostname = hostName;
		MQEnvironment.channel = channel;
		MQEnvironment.port = Integer.parseInt(port);
		System.out.println("Connecting to ......"+ "\n" + hostName + "\n" + channel + "\n" + port);
		log.debug("Connecting to ......"+ "\n" + hostName + "\n" + channel + "\n" + port);
		mqQueueManager = new MQQueueManager(qmgrName);
		System.out.println("Qmgr ---------- " + qmgrName + " connection successful ");
		log.debug("Qmgr ---------- " + qmgrName + " connection successful ");
	}
	catch ( MQException mqExp) 
	{
		System.out.println("Error in connecting to queue manager -- "+qmgrName+" with CC : " + mqExp.completionCode +" RC : " + mqExp.reasonCode);
		log.debug("Error in connecting to queue manager -- "+qmgrName+" with CC : " + mqExp.completionCode +" RC : " + mqExp.reasonCode);
		mqClose();
	
	}
}

public void mqDisconnect() throws Exception, MQException
{// disconnects the queue manager
	try 
	{
		mqQueueManager.disconnect();
		System.out.println("Qmgr : " + qmgrName + " disconnection successful ");
		log.debug("Qmgr : " + qmgrName + " disconnection successful ");
	}
	catch ( MQException mqExp) 
	{
		
		if (mqExp.completionCode == 2 && mqExp.reasonCode == MQException.MQRC_NO_MSG_AVAILABLE) {
			
			log.debug("No messages to read!!!");
		
	}
	else
	{
		log.error("GET Exception: " + mqExp);
	}
		System.out.println("Error in queue manager disconnect...."+"QMGR Name : " + qmgrName+"CC : " + mqExp.completionCode+"RC : " + mqExp.reasonCode);
		log.debug("Error in queue manager disconnect...."+"QMGR Name : " + qmgrName+"CC : " + mqExp.completionCode+"RC : " + mqExp.reasonCode);
		mqClose();
		
	}
}// end of mqDisconnect

public void mqRead() throws Exception 
{// reads the request posted in the queue
	
	try 
	{
		
		MQMessage message;
		
		int openOption = 0;
		openOption = MQC.MQOO_BROWSE + MQC.MQOO_INPUT_SHARED; // open options for browse & share
		//openOption =   MQC.MQOO_INPUT_SHARED + MQC.MQGMO_NO_WAIT + MQC.MQGMO_FAIL_IF_QUIESCING + MQC.MQGMO_CONVERT;
		//openOption = MQC.MQOO_INQUIRE + MQC.MQOO_FAIL_IF_QUIESCING + MQC.MQOO_INPUT_SHARED;
		queue = mqQueueManager.accessQueue(qName, openOption,null,null,null);
		MQGetMessageOptions getMessageOptions = new MQGetMessageOptions();
	   // getMessageOptions.options = MQC.MQOO_INPUT_AS_Q_DEF;
		getMessageOptions.options = MQC.MQOO_INPUT_AS_Q_DEF + MQC.MQGMO_NO_WAIT + MQC.MQGMO_FAIL_IF_QUIESCING+ MQC.MQGMO_CONVERT;
		getMessageOptions.matchOptions = CMQC.MQMO_MATCH_CORREL_ID;
		
		//MQC.MQGMO_BROWSE_FIRST MQC.MQGMO_WAIT ; //for browsing
		getMessageOptions.waitInterval = MQC.MQWI_UNLIMITED;
		//getMessageOptions.waitInterval = 1000;
		/*MQC.MQWI_UNLIMITED;
		for waiting unlimited times
		waits unlimited*/
		message = new MQMessage();
		BufferedWriter writer ;
		String strMsg;
		
		System.out.println( "waiting for message ... " );
		log.debug( "waiting for message ... ");
		queue.get(message, getMessageOptions);
		System.out.println( "Get message sucessful... ");
		log.debug("Get message sucessful... ");
		System.out.println(message);
		log.debug(message);
		byte[] b = new byte[message.getMessageLength()];
		message.readFully(b);
		
		System.out.println("message.toString()="+message.toString());
	
		
		System.out.println("message.replyToQueueName="+message.replyToQueueName);
		log.debug("message.replyToQueueName="+message.replyToQueueName.trim());
		
		resqname=message.replyToQueueName.trim();
		strMsg = new String(b);
		System.out.println("\n"+strMsg);
		log.debug("\n"+strMsg);
		//if empty message, close the queue...
		if ( strMsg.trim().equals("") )
		{
			System.out.println("empty message, closing the queue ..." + qName);
			log.debug("empty message, closing the queue ..." + qName);
		}
		
		
		
		//long exp=System.currentTimeMillis()+30000;
		
		
		
		reqmessage=message.messageId;
		
		String bytes = Hex.toString(reqmessage);

		System.out.println("Message ID of the Request:"+bytes);
		log.debug("Message ID of the Request:"+bytes);
		
		//System.out.println("This is the expiry time of request message"+exp);
		//log.debug("This is the expiry time of request message"+exp);
	
		
	    message.clearMessage();
		msgFileNameTrim=fileNameTime.substring(0, fileNameTime.lastIndexOf('.'));
		timeNow = "_"+new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		fileNameTime = (msgFileNameTrim+timeNow+".xml");
		writer = new BufferedWriter(new FileWriter(args[0]+"/"+"temp"+"/"+fileNameTime, true));
		writer.write(new String(b));
		writer.write("\n");
		writer.close();
		//getMessageOptions.options = MQC.MQOO_INPUT_AS_Q_DEF;
		
		//MQC.MQGMO_BROWSE_NEXT MQC.MQGMO_WAIT ;
		} 
		catch (IOException e) 
		{
			System.out.println("IOException during GET in mqOpen: " + e.getMessage());
			log.debug("IOException during GET in mqOpen: " + e.getMessage());
		}
		catch ( MQException mqExp) 
		{
			if (mqExp.completionCode == 2 && mqExp.reasonCode == 2033) {
				
					log.debug("No messages to read!!!");
				
			}
			else
			{
				log.error("GET Exception: " + mqExp);
			}
			
		
			mqClose();
			
		}
	
	
	        try{
			
			File file = new File(args[0]+"/"+"temp"+"/"+fileNameTime); 
	
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	 		DocumentBuilder db = dbf.newDocumentBuilder();
	 		Document doc = db.parse(file);
	     	doc.getDocumentElement().normalize();
	 		//Reading the values from the request which are meant to be sent with the response
	 		NodeList nl = doc.getElementsByTagName("AcctBatchInqRq");
				
	 		nl = doc.getElementsByTagName("RqUID");
	 		Node datanode = nl.item(0);
	 		destReqId = datanode.getTextContent();
	 		System.out.println(destReqId);
	 		
	 		nl = doc.getElementsByTagName("SPName");
	 		datanode = nl.item(0);
	 		serviceType = datanode.getTextContent();
	 		serviceTypeSpec = datanode.getTextContent();
	 		
	 		
	 		serviceType = serviceType.substring(0,serviceType.indexOf("."));
	 		
	 		serviceTypeSpec = serviceTypeSpec.substring(serviceTypeSpec.lastIndexOf("/")+1);
	 		
	 		
	 		System.out.println(serviceType);
	 		System.out.println(serviceTypeSpec);
	 		 	
	 		if(serviceType.equals("sg"))
	 		{serviceType="mdz";}
	 		else if(serviceType.equals("vn"))
	 		{serviceType="int";}
	 		else if(serviceType.equals("hk"))
	 		{serviceType="f10";}
	 		else if(serviceType.equals("kh"))
	 		{serviceType="int";}
	 		else if(serviceType.equals("nz"))
	 		{
	 			if(serviceTypeSpec.equals("markets"))
	 			{
	 				System.out.println(serviceTypeSpec);
	 				serviceType="nzm";}
	 			else{serviceType="sys";}
	 		}
	 		else if(serviceType.equals("au"))
	 		{
	 			serviceType="cmm";
	 			
	 		}
	 		else{System.out.println("No core banking format !!!");
	 		log.debug("No core banking format !!!");}
	 		
	 		NodeList nodeList = doc.getElementsByTagName("AcctId");
						
	 		
	 		acctId=new ArrayList<String>();

			for (int s = 0; s < nodeList.getLength(); s++) 
			{
			
					Node fstNode = nodeList.item(s);
			    
					if (fstNode.getNodeType() == Node.ELEMENT_NODE)
					{
			  			Element fstElmnt = (Element) fstNode;
						NodeList reqIdElmntLst = fstElmnt.getChildNodes();
						Node reqElmnt = (Node) reqIdElmntLst.item(0);
						log.debug("AcctId : "+reqElmnt.getTextContent());
						acctId.add(reqElmnt.getTextContent());
				     }	
						
					
			}
			
			
			NodeList nodeList2 = doc.getElementsByTagName("BranchIdent");
						
	 		
	 		branchId=new ArrayList<String>();

			for (int s = 0; s < nodeList2.getLength(); s++) 
			{
			
					Node fstNode = nodeList2.item(s);
			    
					if (fstNode.getNodeType() == Node.ELEMENT_NODE)
					{
			  			Element fstElmnt = (Element) fstNode;
						NodeList reqIdElmntLst = fstElmnt.getChildNodes();
						Node reqElmnt = (Node) reqIdElmntLst.item(0);
						log.debug("BranchId : "+reqElmnt.getTextContent());
						branchId.add(reqElmnt.getTextContent());
		     	     }	
						
					
			}
			
			afile = new File(args[0]+"/"+"temp"+"/"+fileNameTime);
			
			System.out.println("This is the path:"+args[0]+"/"+"temp"+"/"+fileNameTime);
			if(afile.renameTo(new File(args[0]+"/in/"+serviceType+"/"+ afile.getName())))
			{
		 		System.out.println("File transfer successful!");
		 		log.debug("File transfer successful!");
			}
			else
	 	   	{
				System.out.println("File transfer Unsuccessful!");
				log.debug("File transfer Unsuccessful!");
	 	   	}
			
			File bfile = new File(args[0]+"/rules/rules_RB.xml");	
			
			DocumentBuilderFactory dbg = DocumentBuilderFactory.newInstance();
	 		DocumentBuilder dbc = dbg.newDocumentBuilder();
	 		Document doct = dbc.parse(bfile);
	 		doct.getDocumentElement().normalize();
		 		
			rulesacctId=new ArrayList<String>();
			  
			//Reading the values from the request which are meant to be sent with the response
		    NodeList nl2 = doct.getElementsByTagName("Retrieve_Balance_Rules");
		 	Node datanode2;
		 	
		 	reqacctId=new ArrayList<String>();
		 	
		 	acctGrp=new ArrayList<String>();
		 	
		 		
		 	for (int s = 0; s < nl2.getLength(); s++) 
			{		
							
		 		nl2 = doct.getElementsByTagName("AcctId");
			 	datanode2 = nl2.item(s);
				destAcctId = datanode2.getTextContent();
				rulesacctId.add(destAcctId);
				
					
				NodeList nlstatus = doct.getElementsByTagName("ResStatus");
				datanode2 = nlstatus.item(s);
				ResStatus = datanode2.getTextContent();
				rulesacctId.add(ResStatus);
				
//				//To take the bookcode/branchid/acctgrp
//				NodeList nlacctGrp = doct.getElementsByTagName("AcctGrp");
//				datanode2 = nlacctGrp.item(s);
//				bookCode = datanode2.getTextContent();
//				acctGrp.add(bookCode);
				
			 }
		 			 		
		 	 for(String temp: acctId)
	 	     {
		 		 if(rulesacctId.contains(temp)) 
		 		 {
		 		   reqacctId.add(temp);
		 		 }
		 		   
		      }
		 	 
	        }
	        catch(FileNotFoundException ex){
	        	
	        	System.out.println("No requests Inbound!!");
	        	log.debug("No requests Inbound!!");
	        }

}
		




public void mqClose() 
{// close the queue
	try
	{
		System.out.println(queue);	
		queue.close();
	} 
	catch (MQException mqExp)
	{
		System.out.println("Error in closing queue ...."+"Queue Name : " + qName+" CC : " + mqExp.completionCode+" RC : " + mqExp.reasonCode);
		log.debug("Error in closing queue ...."+"Queue Name : " + qName+" CC : " + mqExp.completionCode+" RC : " + mqExp.reasonCode);
	}
}





public void readPropertyFile(String fileName) throws Exception 
{// reading from the property file
	try 
	{
		mqProperties = new Properties();
		FileInputStream fileInputStream = new FileInputStream(fileName);
		mqProperties.load(fileInputStream);
		hostName = mqProperties.getProperty("hostName");
		qmgrName = mqProperties.getProperty("qmgrName");
		port = mqProperties.getProperty("port");
		channel = mqProperties.getProperty("channel");
		qName= mqProperties.getProperty("manqName");
		resqname = mqProperties.getProperty("manresqName");
		fileInputStream.close();
	} 
	catch (Exception exp) 
	{
		exp.printStackTrace();
	}
	
}

public static void main(String args[])
{

System.out.println(args[0]);

Thread runner = new Thread(new RB_Mantec_ReadRequest(args)); 
runner.start();


}

}
