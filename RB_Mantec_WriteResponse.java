package com.qa.stub;

//import java.io.DataInputStream;
import java.io.File;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import com.ibm.mq.MQC;
import com.ibm.mq.MQException;
import com.ibm.mq.MQMessage;
import com.ibm.mq.MQPutMessageOptions;
import com.ibm.mq.MQQueue;
import com.ibm.mq.MQQueueManager;



public class RB_Mantec_WriteResponse extends RB_Mantec_ReadRequest {
	static String Type;
	static DocumentBuilderFactory docFactory;
	static DocumentBuilder docBuilder;
	static Document doc;
	static Element acctbatchinqrs;
	static String statusBookCode;
	//static String xmlMessage;
	private MQQueueManager mqQueueManager;
	public byte[] reqmsgId;
	private String respStatus;
		
	
	public RB_Mantec_WriteResponse()
	{
		super(args);
		// TODO Auto-generated constructor stub
	}

	public void mqWrite(byte[] reqmessage, String resqname) throws SAXException, InterruptedException, MQException{
			
		try {
			
			mqQueueManager = new MQQueueManager(qmgrName);
			
		    int writeOptions = MQC.MQOO_OUTPUT + MQC.MQOO_FAIL_IF_QUIESCING;
				 
		    CreateMDZResponse cs = new CreateMDZResponse();
		  
		    CreateNZMResponse cn = new CreateNZMResponse();
		   
		    
			try
			{
				
			    System.out.println("Acct Size=="+acctId.size());
				
				docFactory = DocumentBuilderFactory.newInstance();
				docBuilder = docFactory.newDocumentBuilder();
		 		doc = docBuilder.newDocument();
					
				
				if(serviceType.equals("nzm"))
				{
					 cn.createNZMHeader();
					 for(String temp : acctId)
				 	 {
							 if(reqacctId.contains(temp)) 
			   		 		 {		   		 			
								 	for (int z = 0; z < rulesacctId.size(); z++) 
								 	{		
							    	 		if (rulesacctId.get(z).toString().equals(temp))
									 		{
							    	 			System.out.println(temp);
							    	 			log.debug(temp);
							    	 			respStatus = rulesacctId.get(z+1).toString();			 	    	
							    	 			cn.createNZMNegativeResponse(respStatus, temp);
							   	    		}	
								 	} 							 
			   		 		 }						 
							 else
			   		 		 {
			   		 			 cn.createNZMPositiveResp(temp);
			   		 		 }			 	
				 	  }	
				}
				
				
				
								
				 			
				 else 
				 { 
					 cs.createMDZHeader();
					 for(String temp : acctId)
				 	 {
							 if(reqacctId.contains(temp)) 
			   		 		 {		   		 			
								 	for (int z = 0; z < rulesacctId.size(); z++) 
								 	{		
							    	 		if (rulesacctId.get(z).toString().equals(temp))
									 		{
							    	 			System.out.println(temp);
							    	 			log.debug(temp);
							    	 			respStatus = rulesacctId.get(z+1).toString();			 	    	
							    	 			cs.createMDZNegativeResponse(respStatus, temp);
							 	    		}	
					    	 		}						 
			   		 		 }						 
							 else
			   		 		 {
			   		 			 cs.createMDZPositiveResp(temp);
			   		 		 }			 	
				 	  }	
				}
				
							
				// write the content into xml file
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(args[0]+"/out/Response_"+fileNameTime));
		 
			
				transformer.transform(source, result);
		 
				System.out.println("File saved!");	
				log.debug("File saved!");
				
			
				MQQueue	queue2 = mqQueueManager.accessQueue(resqname, writeOptions,null,null,null);
			
				//DataInputStream input = new DataInputStream(System.in);
	
				String reqPath;
				reqPath=args[0]+"/out/Response_"+fileNameTime;
				File userFile = new File(reqPath);
	
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				Document doct = db.parse(userFile);
				
	
				DOMSource domSource = new DOMSource(doct);
				StringWriter writer = new StringWriter();
				StreamResult result2 = new StreamResult(writer);
				TransformerFactory tf = TransformerFactory.newInstance();
				Transformer transformer2 = tf.newTransformer();
				transformer2.transform(domSource, result2);
				writer.flush();
				
				
				
				String b = writer.toString();
				//System.out.println("Writing started....");
				System.out.println("Sending a Response Message as XML....\n\n");
				log.debug("Sending a Response Message as XML....\n\n");
	
				MQMessage sendmsg               = new MQMessage();
				sendmsg.format                  = MQC.MQFMT_STRING;
				sendmsg.feedback                = MQC.MQFB_NONE;  
				sendmsg.messageType             = MQC.MQMT_DATAGRAM;
				sendmsg.replyToQueueName        = resqname;
			    sendmsg.replyToQueueManagerName = qmgrName;
			   
			    
			    System.out.println("resqname="+resqname);
										
				MQPutMessageOptions pmo = new MQPutMessageOptions();  // accept the defaults, same
										                              // as MQPMO_DEFAULT constant
				sendmsg.clearMessage();				
				sendmsg.messageId = MQC.MQMI_NONE;				
				sendmsg.correlationId = MQC.MQCI_NONE;
			
				sendmsg.writeString(b);
			   
				sendmsg.correlationId = reqmessage;
				
				
				//put the message on the queue	
				
					
				queue2.put(sendmsg, pmo);
				
				
				System.out.println("sending message");
				log.debug("sending message");
			
				queue2.close();
							
				System.out.println("closing queue");
				
				log.debug("closing queue");
				
				}
				catch (com.ibm.mq.MQException mqex)
				{
				System.out.println(mqex);
				}
				catch (java.io.IOException ioex)
				{
				
				ioex.printStackTrace();
		        System.err.println("Problem writing to the file");
		        log.debug("Problem writing to the file");
				}
				
				
	 
		  } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		  } catch (TransformerException tfe) {
			tfe.printStackTrace();
		  }
	}

	
	public byte[] reqmessage() {
		return reqmessage;
	}

	public void setReqMessage(byte[] reqmessage) {
		this.reqmessage = reqmessage;
	}

}
