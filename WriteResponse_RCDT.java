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



public class WriteResponse_RCDT extends ReadRequest_RCDT  {
	static String Type;
	static DocumentBuilderFactory docFactory;
	static DocumentBuilder docBuilder;
	static Document doc;
	static Element acctbatchinqrs;
	static Element accttrninqrs;
	//static String xmlMessage;
	private MQQueueManager mqQueueManager;
	private String respStatus;
	
	
	public byte[] reqmsgId;
		public WriteResponse_RCDT() {
		super(args);
		// TODO Auto-generated constructor stub
	}

	public void mqWrite(byte[] reqmessage_RCDT, String resqname_RCDT) throws SAXException, InterruptedException, MQException{
		
		try {
			
			mqQueueManager = new MQQueueManager(qmgrName);
			
		    int writeOptions = MQC.MQOO_OUTPUT + MQC.MQOO_FAIL_IF_QUIESCING;
				    
		    CreateMDZResponse_RCDT rcdt_cs = new CreateMDZResponse_RCDT();
		    CreateINTResponse_RCDT rcdt_cv = new CreateINTResponse_RCDT();
		    CreateF10Response_RCDT rcdt_ck = new CreateF10Response_RCDT();
		    CreateNZMResponse_RCDT rcdt_cn = new CreateNZMResponse_RCDT();
		    CreateSYSResponse_RCDT rcdt_cy = new CreateSYSResponse_RCDT();
		    CreateCAPResponse_RCDT rcdt_cp = new CreateCAPResponse_RCDT();
		    CreateV2PResponse_RCDT rcdt_cm = new CreateV2PResponse_RCDT();
		    
			try
			{
				
				System.out.println("Acct Size=="+acctId.size());
				
				docFactory = DocumentBuilderFactory.newInstance();
				docBuilder = docFactory.newDocumentBuilder();
		 
				
				doc = docBuilder.newDocument();
			
				if(serviceType.equals("mdz"))
				{			 
					 
					 for(String tempo : acctId)
				 	 {
							 if(reqacctId.contains(tempo)) 
			   		 		 {		   		 			
								 	for (int z = 0; z < rulesacctId.size(); z++) 
								 	{		
							    	 		if (rulesacctId.get(z).toString().equals(tempo))
									 		{
							    	 			System.out.println(tempo);
							    	 			log.debug(tempo);
							    	 			respStatus = rulesacctId.get(z+1).toString();
							    	 			
							    	 			if(respStatus.equals("UNAVAILABLE-ACCT"))
							    	 			{	
							    	 				 rcdt_cs.createMDZNegativeHeader_RCDT(tempo);
							    	 				 rcdt_cs.createMDZUnvAccResponse_RCDT(tempo);
							    	 			}
							    	 			else
							    	 			{
							    	 				rcdt_cs.createMDZHeader_RCDT();
							    	 			    rcdt_cs.createMDZNegativeResp_RCDT(respStatus, tempo);
							    	 			}
							 	    		}	
					    	 		}						 
			   		 		 }						 
							 else
			   		 		 {
								 rcdt_cs.createMDZHeader_RCDT();
								 rcdt_cs.createMDZPositiveResp_RCDT(tempo);
			   		 		 }			 	
				 	  }	
				}
							
				else if(serviceType.equals("int"))
				{
					//rcdt_cv.createINTHeader_RCDT();
					 for(String tempo : acctId)
				 	 {
							 if(reqacctId.contains(tempo)) 
			   		 		 {		   		 			
								 	for (int z = 0; z < rulesacctId.size(); z++) 
								 	{		
							    	 		if (rulesacctId.get(z).toString().equals(tempo))
									 		{
							    	 			System.out.println(tempo);
							    	 			log.debug(tempo);
							    	 			respStatus = rulesacctId.get(z+1).toString();			 	    	
							    	 			if(respStatus.equals("UNAVAILABLE-ACCT"))
							    	 			{	
							    	 				 rcdt_cv.createINTNegativeHeader_RCDT(tempo);
							    	 				 rcdt_cv.createINTUnvAccResponse_RCDT(tempo);
							    	 			}
							    	 			else
							    	 			{
							    	 				rcdt_cv.createINTHeader_RCDT();
							    	 			    rcdt_cv.createINTNegativeResp_RCDT(respStatus, tempo);
							    	 			}
							 	    		}	
					    	 		}						 
			   		 		 }						 
							 else
			   		 		 {
								 rcdt_cs.createMDZHeader_RCDT();
								 rcdt_cv.createINTPositiveResp_RCDT(tempo);
			   		 		 }			 	
				 	  }	
				}				
				
				else if(serviceType.equals("f10"))
				{ 
					//rcdt_ck.createF10Header_RCDT();
					 for(String tempo : acctId)
				 	 {
							 if(reqacctId.contains(tempo)) 
			   		 		 {		   		 			
								 	for (int z = 0; z < rulesacctId.size(); z++) 
								 	{		
							    	 		if (rulesacctId.get(z).toString().equals(tempo))
									 		{
							    	 			System.out.println(tempo);
							    	 			log.debug(tempo);
							    	 			respStatus = rulesacctId.get(z+1).toString();			 	    	
							    	 			if(respStatus.equals("UNAVAILABLE-ACCT"))
							    	 			{	
							    	 				 rcdt_ck.createF10NegativeHeader_RCDT(tempo);
							    	 				 rcdt_ck.createF10UnvAccResponse_RCDT(tempo);
							    	 			}
							    	 			else
							    	 			{
							    	 				rcdt_ck.createF10Header_RCDT();
							    	 			    rcdt_ck.createF10NegativeResp_RCDT(respStatus, tempo);
							    	 			}
							 	    		}	
					    	 		}						 
			   		 		 }						 
							 else
			   		 		 {
								 rcdt_cs.createMDZHeader_RCDT();
								 rcdt_ck.createF10PositiveResp_RCDT(tempo);
			   		 		 }			 	
				 	  }	
				 }
				 
				
				else if(serviceType.equals("nzm"))
				{ 
					//rcdt_ck.createF10Header_RCDT();
					 for(String tempo : acctId)
				 	 {
							 if(reqacctId.contains(tempo)) 
			   		 		 {		   		 			
								 	for (int z = 0; z < rulesacctId.size(); z++) 
								 	{		
							    	 		if (rulesacctId.get(z).toString().equals(tempo))
									 		{
							    	 			System.out.println(tempo);
							    	 			log.debug(tempo);
							    	 			respStatus = rulesacctId.get(z+1).toString();			 	    	
							    	 			if(respStatus.equals("UNAVAILABLE-ACCT"))
							    	 			{	
							    	 				 rcdt_cn.createNZMNegativeHeader_RCDT(tempo);
							    	 				 rcdt_cn.createNZMUnvAccResponse_RCDT(tempo);
							    	 			}
							    	 			else
							    	 			{
							    	 				rcdt_cn.createNZMHeader_RCDT();
							    	 			    rcdt_cn.createNZMNegativeResp_RCDT(respStatus, tempo);
							    	 			}
							 	    		}	
					    	 		}						 
			   		 		 }						 
							 else
			   		 		 {
								 rcdt_cn.createNZMHeader_RCDT();
								 rcdt_cn.createNZMPositiveResp_RCDT(tempo);
			   		 		 }			 	
				 	  }	
				 }
				
				else if(serviceType.equals("sys"))
				{ 
					//rcdt_ck.createF10Header_RCDT();
					 for(String tempo : acctId)
				 	 {
							 if(reqacctId.contains(tempo)) 
			   		 		 {		   		 			
								 	for (int z = 0; z < rulesacctId.size(); z++) 
								 	{		
							    	 		if (rulesacctId.get(z).toString().equals(tempo))
									 		{
							    	 			System.out.println(tempo);
							    	 			log.debug(tempo);
							    	 			respStatus = rulesacctId.get(z+1).toString();			 	    	
							    	 			if(respStatus.equals("UNAVAILABLE-ACCT"))
							    	 			{	
							    	 				 rcdt_cy.createSYSNegativeHeader_RCDT(tempo);
							    	 				 rcdt_cy.createSYSUnvAccResponse_RCDT(tempo);
							    	 			}
							    	 			else
							    	 			{
							    	 				rcdt_cy.createSYSHeader_RCDT();
							    	 			    rcdt_cy.createSYSNegativeResp_RCDT(respStatus, tempo);
							    	 			}
							 	    		}	
					    	 		}						 
			   		 		 }						 
							 else
			   		 		 {
								 rcdt_cy.createSYSHeader_RCDT();
								 rcdt_cy.createSYSPositiveResp_RCDT(tempo);
			   		 		 }			 	
				 	  }	
				 }
				
				else if(serviceType.equals("cap"))
				{ 
					//rcdt_ck.createF10Header_RCDT();
					 for(String tempo : acctId)
				 	 {
							 if(reqacctId.contains(tempo)) 
			   		 		 {		   		 			
								 	for (int z = 0; z < rulesacctId.size(); z++) 
								 	{		
							    	 		if (rulesacctId.get(z).toString().equals(tempo))
									 		{
							    	 			System.out.println(tempo);
							    	 			log.debug(tempo);
							    	 			respStatus = rulesacctId.get(z+1).toString();			 	    	
							    	 			if(respStatus.equals("UNAVAILABLE-ACCT"))
							    	 			{	
							    	 				 rcdt_cp.createCAPNegativeHeader_RCDT(tempo);
							    	 				 rcdt_cp.createCAPUnvAccResponse_RCDT(tempo);
							    	 			}
							    	 			else
							    	 			{
							    	 				rcdt_cp.createCAPHeader_RCDT();
							    	 			    rcdt_cp.createCAPNegativeResp_RCDT(respStatus, tempo);
							    	 			}
							 	    		}	
					    	 		}						 
			   		 		 }						 
							 else
			   		 		 {
								 rcdt_cp.createCAPHeader_RCDT();
								 rcdt_cp.createCAPPositiveResp_RCDT(tempo);
			   		 		 }			 	
				 	  }	
				 }
				
				else if(serviceType.equals("v2p"))
				{ 
					//rcdt_ck.createF10Header_RCDT();
					 for(String tempo : acctId)
				 	 {
							 if(reqacctId.contains(tempo)) 
			   		 		 {		   		 			
								 	for (int z = 0; z < rulesacctId.size(); z++) 
								 	{		
							    	 		if (rulesacctId.get(z).toString().equals(tempo))
									 		{
							    	 			System.out.println(tempo);
							    	 			log.debug(tempo);
							    	 			respStatus = rulesacctId.get(z+1).toString();			 	    	
							    	 			if(respStatus.equals("UNAVAILABLE-ACCT"))
							    	 			{	
							    	 				 rcdt_cm.createV2PNegativeHeader_RCDT(tempo);
							    	 				 rcdt_cm.createV2PUnvAccResponse_RCDT(tempo);
							    	 			}
							    	 			else
							    	 			{
							    	 				rcdt_cm.createV2PHeader_RCDT();
							    	 			    rcdt_cm.createV2PNegativeResp_RCDT(respStatus, tempo);
							    	 			}
							 	    		}	
					    	 		}						 
			   		 		 }						 
							 else
			   		 		 {
								 rcdt_cm.createV2PHeader_RCDT();
								 rcdt_cm.createV2PPositiveResp_RCDT(tempo);
			   		 		 }			 	
				 	  }	
				 }
				 			
				 else 
				 { 
					 rcdt_cs.createMDZHeader_RCDT();
					 for(String tempo : acctId)
				 	 {
							 if(reqacctId.contains(tempo)) 
			   		 		 {		   		 			
								 	for (int z = 0; z < rulesacctId.size(); z++) 
								 	{		
							    	 		if (rulesacctId.get(z).toString().equals(tempo))
									 		{
							    	 			System.out.println(tempo);
							    	 			log.debug(tempo);
							    	 			respStatus = rulesacctId.get(z+1).toString();			 	    	
							    	 			rcdt_cs.createMDZNegativeResp_RCDT(respStatus, tempo);
							 	    		}	
					    	 		}						 
			   		 		 }						 
							 else
			   		 		 {
								 rcdt_cs.createMDZPositiveResp_RCDT(tempo);
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
				
			
				MQQueue	queue2 = mqQueueManager.accessQueue(resqname_RCDT, writeOptions,null,null,null);
			
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
				sendmsg.replyToQueueName        = resqname_RCDT;
			    sendmsg.replyToQueueManagerName = qmgrName;
			   
			    
			    System.out.println("resqname="+resqname_RCDT);
										
				MQPutMessageOptions pmo = new MQPutMessageOptions();  // accept the defaults, same
										                              // as MQPMO_DEFAULT constant
				sendmsg.clearMessage();				
				sendmsg.messageId = MQC.MQMI_NONE;				
				sendmsg.correlationId = MQC.MQCI_NONE;
			
				sendmsg.writeString(b);
			   
				sendmsg.correlationId = reqmessage_RCDT;
				
				
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

	
	public byte[] reqmessage_RCDT() {
		return reqmessage_RCDT;
	}

	public void setReqMessage(byte[] reqmessage_RCDT) {
		this.reqmessage_RCDT = reqmessage_RCDT;
	}

}
