package com.qa.stub;



import org.w3c.dom.Element;

public class CreateMDZResponse extends WriteResponse {
	
public void createMDZHeader() 
{
	
				System.out.println("This is the request id     : "+destReqId);
	
				acctbatchinqrs = doc.createElement("AcctBatchInqRs");
			    doc.appendChild(acctbatchinqrs);
		 
			
			    Element status = doc.createElement("Status");
				acctbatchinqrs.appendChild(status);
		 
				Element statuscode = doc.createElement("StatusCode");
				statuscode.appendChild(doc.createTextNode("1"));
				status.appendChild(statuscode);
		 
				
				Element serverstatuscode = doc.createElement("ServerStatusCode");
				
				
				serverstatuscode.appendChild(doc.createTextNode("MIDANZ"));
				status.appendChild(serverstatuscode); 
		 
			
				Element severity = doc.createElement("Severity");
				severity.appendChild(doc.createTextNode("Info"));
				status.appendChild(severity);
		 
				Element statusdesc = doc.createElement("StatusDesc");
				statusdesc.appendChild(doc.createTextNode("Success"));
				status.appendChild(statusdesc);
				
			
				Element rquid = doc.createElement("RqUID");
				rquid.appendChild(doc.createTextNode(destReqId));
				acctbatchinqrs.appendChild(rquid);
								
				Element msgrqhdr = doc.createElement("MsgRqHdr");
				acctbatchinqrs.appendChild(msgrqhdr);
				
				Element networktrninfo = doc.createElement("NetworkTrnInfo");
				msgrqhdr.appendChild(networktrninfo);
				
				Element networkowner = doc.createElement("NetworkOwner");
				networkowner.appendChild(doc.createTextNode("Other"));
				networktrninfo.appendChild(networkowner);
				
				Element terminalid = doc.createElement("TerminalId");
				terminalid.appendChild(doc.createTextNode("TRANSACTV"));
				networktrninfo.appendChild(terminalid);
				
				Element name = doc.createElement("Name");
				name.appendChild(doc.createTextNode("SGCORPU1"));
				networktrninfo.appendChild(name);
				
				Element BankIdType = doc.createElement("BankIdType");
				BankIdType.appendChild(doc.createTextNode("BSB"));
				networktrninfo.appendChild(BankIdType);
				
				Element BankId = doc.createElement("BankId");
				BankId.appendChild(doc.createTextNode("01392"));
				networktrninfo.appendChild(BankId);
			
				Element signonreq = doc.createElement("SignonRq");
				msgrqhdr.appendChild(signonreq);
				
				Element clientdt = doc.createElement("ClientDt");
				clientdt.appendChild(doc.createTextNode("2015-07-06T00:00:00.000+10:00"));
				signonreq.appendChild(clientdt);
				
				Element clientapp = doc.createElement("ClientApp");
				signonreq.appendChild(clientapp);
				
				Element org = doc.createElement("Org");
				org.appendChild(doc.createTextNode("sg.com.anz"));
				clientapp.appendChild(org);
				
				Element namesignon = doc.createElement("Name");
				namesignon.appendChild(doc.createTextNode("GCP"));
				clientapp.appendChild(namesignon);
				
				Element version = doc.createElement("Version");
				version.appendChild(doc.createTextNode("2.3"));
				clientapp.appendChild(version);
				
		
}

public void createMDZNotAvailHeader() 
{
	
				
	
				acctbatchinqrs = doc.createElement("AcctBatchInqRs");
			    doc.appendChild(acctbatchinqrs);
		 
			
			    Element status = doc.createElement("Status");
				acctbatchinqrs.appendChild(status);
		 
				Element statuscode = doc.createElement("StatusCode");
				statuscode.appendChild(doc.createTextNode("2300"));
				status.appendChild(statuscode);
		 
				
				
		 
			
				Element severity = doc.createElement("Severity");
				severity.appendChild(doc.createTextNode("Error"));
				status.appendChild(severity);
		 
				Element statusdesc = doc.createElement("StatusDesc");
				statusdesc.appendChild(doc.createTextNode("Single or Source Account Invalid"));
				status.appendChild(statusdesc);
				
			
				Element rquid = doc.createElement("RqUID");
				rquid.appendChild(doc.createTextNode(destReqId));
				acctbatchinqrs.appendChild(rquid);
								
				Element msgrqhdr = doc.createElement("MsgRqHdr");
				acctbatchinqrs.appendChild(msgrqhdr);
				
				Element networktrninfo = doc.createElement("NetworkTrnInfo");
				msgrqhdr.appendChild(networktrninfo);
				
				Element networkowner = doc.createElement("NetworkOwner");
				networkowner.appendChild(doc.createTextNode("Other"));
				networktrninfo.appendChild(networkowner);
				
				Element terminalid = doc.createElement("TerminalId");
				terminalid.appendChild(doc.createTextNode("TRANSACTV"));
				networktrninfo.appendChild(terminalid);
				
				Element name = doc.createElement("Name");
				name.appendChild(doc.createTextNode("SGCORPU1"));
				networktrninfo.appendChild(name);
				
				Element BankIdType = doc.createElement("BankIdType");
				BankIdType.appendChild(doc.createTextNode("BSB"));
				networktrninfo.appendChild(BankIdType);
				
				Element BankId = doc.createElement("BankId");
				BankId.appendChild(doc.createTextNode("01392"));
				networktrninfo.appendChild(BankId);
			
				Element signonreq = doc.createElement("SignonRq");
				msgrqhdr.appendChild(signonreq);
				
				Element clientdt = doc.createElement("ClientDt");
				clientdt.appendChild(doc.createTextNode("2015-07-06T00:00:00.000+10:00"));
				signonreq.appendChild(clientdt);
				
				Element clientapp = doc.createElement("ClientApp");
				signonreq.appendChild(clientapp);
				
				Element org = doc.createElement("Org");
				org.appendChild(doc.createTextNode("sg.com.anz"));
				clientapp.appendChild(org);
				
				Element namesignon = doc.createElement("Name");
				namesignon.appendChild(doc.createTextNode("GCP"));
				clientapp.appendChild(namesignon);
				
				Element version = doc.createElement("Version");
				version.appendChild(doc.createTextNode("2.3"));
				clientapp.appendChild(version);
				
		
}




		
public void createMDZPositiveResp(String temps)

{
				Element acctrec = doc.createElement("AcctRec");
				acctbatchinqrs.appendChild(acctrec);
				
				Element acctid = doc.createElement("AcctId");
				acctid.appendChild(doc.createTextNode(temps));
				acctrec.appendChild(acctid);
			
				Element acctinfo = doc.createElement("AcctInfo");
				acctrec.appendChild(acctinfo);
				
				Element curcode = doc.createElement("CurCode");
				curcode.appendChild(doc.createTextNode("SGD"));
				acctinfo.appendChild(curcode);
				
				Element desc = doc.createElement("Desc");
				desc.appendChild(doc.createTextNode("CURRENT A/C NO.3"));
				acctinfo.appendChild(desc);
				
				Element fidata = doc.createElement("FIData");
				acctinfo.appendChild(fidata);
				
				Element branchiden = doc.createElement("BranchIden");
				branchiden.appendChild(doc.createTextNode("SGB"));
				fidata.appendChild(branchiden);
			
				Element country = doc.createElement("Country");
				country.appendChild(doc.createTextNode("SG"));
				fidata.appendChild(country);
			
				Element acctuse = doc.createElement("AcctUse");
				acctuse.appendChild(doc.createTextNode("Business"));
				acctinfo.appendChild(acctuse);
				
				Element intratedata = doc.createElement("IntRateData");
				acctinfo.appendChild(intratedata);
			
				Element rate = doc.createElement("Rate");
				rate.appendChild(doc.createTextNode("0.00000000"));
				intratedata.appendChild(rate);
				
				Element freq = doc.createElement("Freq");
				intratedata.appendChild(freq);
				
				Element productiden = doc.createElement("ProductIdent");
				productiden.appendChild(doc.createTextNode("00013"));
				acctinfo.appendChild(productiden);
				
				Element initialamount = doc.createElement("InitialAmount");
				acctinfo.appendChild(initialamount);
				
				Element amt = doc.createElement("Amount");
				amt.appendChild(doc.createTextNode("0.00"));
				initialamount.appendChild(amt);
				
				Element curcodeIA = doc.createElement("CurCode");
				initialamount.appendChild(curcodeIA);
			
				Element acctype = doc.createElement("AcctType");
				acctype.appendChild(doc.createTextNode("SDA"));
				acctinfo.appendChild(acctype);
				
				Element acctitle = doc.createElement("AcctTitle");
				acctitle.appendChild(doc.createTextNode("Bank"));
				acctinfo.appendChild(acctitle);
				
				Element opendt = doc.createElement("OpenDt");
				opendt.appendChild(doc.createTextNode("2015-02-12T00:00:00.000"));
				acctinfo.appendChild(opendt);
				
				Element postaddr = doc.createElement("PostAddr");
				acctinfo.appendChild(postaddr);
				
				Element city = doc.createElement("City");
				postaddr.appendChild(city);
				
				Element stateprov = doc.createElement("StateProv");
				postaddr.appendChild(stateprov);
				
				Element postalcode = doc.createElement("PostalCode");
				postaddr.appendChild(postalcode);
				
				Element countryPA = doc.createElement("Country");
				postaddr.appendChild(countryPA);
				
				Element addrnonstruct = doc.createElement("AddrNonStruct");
				postaddr.appendChild(addrnonstruct);
				
				Element addr1 = doc.createElement("Addr1");
				addr1.appendChild(doc.createTextNode("BANK"));
				addrnonstruct.appendChild(addr1);
				
				Element addr2 = doc.createElement("Addr2");
				addr2.appendChild(doc.createTextNode("ADDRESS1"));
				addrnonstruct.appendChild(addr2);
				
				Element addr3 = doc.createElement("Add3");
				addr3.appendChild(doc.createTextNode("ADDRESS1"));
				addrnonstruct.appendChild(addr3);
				
				Element addr4 = doc.createElement("Addr4");
				addr4.appendChild(doc.createTextNode("ADDRESS1"));
				addrnonstruct.appendChild(addr4);
				
				Element addr5 = doc.createElement("Addr5");
				addr5.appendChild(doc.createTextNode("ADDRESS1"));
				addrnonstruct.appendChild(addr5);
				
				Element addr6 = doc.createElement("Addr6");
				addr6.appendChild(doc.createTextNode("ADDRESS1"));
				addrnonstruct.appendChild(addr6);
				
				Element acctbal = doc.createElement("AcctBal");
				acctinfo.appendChild(acctbal);
				
				Element baltype = doc.createElement("BalType");
				baltype.appendChild(doc.createTextNode("Current"));
				acctbal.appendChild(baltype);
						
				Element curamt = doc.createElement("CurAmt");
				acctbal.appendChild(curamt);
				
				Element amountCA = doc.createElement("Amt");
				amountCA.appendChild(doc.createTextNode("-25114787.35"));
				curamt.appendChild(amountCA);
				
				Element curcodeCA = doc.createElement("CurCode");
				curcodeCA.appendChild(doc.createTextNode("SGD"));
				curamt.appendChild(curcodeCA);
				
				Element acctbal2 = doc.createElement("AcctBal");
				acctinfo.appendChild(acctbal2);
				
				Element baltype2 = doc.createElement("BalType");
				baltype2.appendChild(doc.createTextNode("Avail"));
				acctbal2.appendChild(baltype2);
						
				Element curamt2 = doc.createElement("CurAmt");
				acctbal2.appendChild(curamt2);
				
				Element amountCA2 = doc.createElement("Amt");
				amountCA2.appendChild(doc.createTextNode("-23454696.35"));
				curamt2.appendChild(amountCA2);
				
				Element curcodeCA2 = doc.createElement("CurCode");
				curcodeCA2.appendChild(doc.createTextNode("SGD"));
				curamt2.appendChild(curcodeCA2);
				
				Element acctbal3 = doc.createElement("AcctBal");
				acctinfo.appendChild(acctbal3);
				
				Element baltype3 = doc.createElement("BalType");
				baltype3.appendChild(doc.createTextNode("CreditLimit"));
				acctbal3.appendChild(baltype3);
						
				Element curamt3 = doc.createElement("CurAmt");
				acctbal3.appendChild(curamt3);
				
				Element amountCA3 = doc.createElement("Amt");
				amountCA3.appendChild(doc.createTextNode("0.00"));
				curamt3.appendChild(amountCA3);
				
				Element curcodeCA3 = doc.createElement("CurCode");
				curcodeCA3.appendChild(doc.createTextNode("SGD"));
				curamt3.appendChild(curcodeCA3);
				
				Element acctbal4 = doc.createElement("AcctBal");
				acctinfo.appendChild(acctbal4);
				
				Element baltype4 = doc.createElement("BalType");
				baltype4.appendChild(doc.createTextNode("Ledger"));
				acctbal4.appendChild(baltype4);
						
				Element curamt4 = doc.createElement("CurAmt");
				acctbal4.appendChild(curamt4);
				
				Element amountCA4 = doc.createElement("Amt");
				amountCA4.appendChild(doc.createTextNode("0.00"));
				curamt4.appendChild(amountCA4);
				
				Element curcodeCA4 = doc.createElement("CurCode");
				curcodeCA4.appendChild(doc.createTextNode("SGD"));
				curamt4.appendChild(curcodeCA4);
				
				Element acctbal5 = doc.createElement("AcctBal");
				acctinfo.appendChild(acctbal5);
				
				Element baltype5 = doc.createElement("BalType");
				baltype5.appendChild(doc.createTextNode("OpeningBalance"));
				acctbal5.appendChild(baltype5);
						
				Element curamt5 = doc.createElement("CurAmt");
				acctbal5.appendChild(curamt5);
				
				Element amountCA5 = doc.createElement("Amt");
				amountCA5.appendChild(doc.createTextNode("0.00"));
				curamt5.appendChild(amountCA5);
				
				Element curcodeCA5 = doc.createElement("CurCode");
				curcodeCA5.appendChild(doc.createTextNode("SGD"));
				curamt5.appendChild(curcodeCA5);
				
				Element acctbal6 = doc.createElement("AcctBal");
				acctinfo.appendChild(acctbal6);
				
				Element baltype6 = doc.createElement("BalType");
				baltype6.appendChild(doc.createTextNode("com.anz.UnpaidAccruedInterest"));
				acctbal6.appendChild(baltype6);
						
				Element curamt6 = doc.createElement("CurAmt");
				acctbal6.appendChild(curamt6);
				
				Element amountCA6 = doc.createElement("Amt");
				amountCA6.appendChild(doc.createTextNode("0.00"));
				curamt6.appendChild(amountCA6);
				
				Element curcodeCA6 = doc.createElement("CurCode");
				curcodeCA6.appendChild(doc.createTextNode("SGD"));
				curamt6.appendChild(curcodeCA6);
				
				Element acctbal7 = doc.createElement("AcctBal");
				acctinfo.appendChild(acctbal7);
				
				Element baltype7 = doc.createElement("BalType");
				acctbal7.appendChild(baltype7);
						
				Element curamt7 = doc.createElement("CurAmt");
				acctbal7.appendChild(curamt7);
				
				Element amountCA7 = doc.createElement("Amt");
				amountCA7.appendChild(doc.createTextNode("0.00"));
				curamt7.appendChild(amountCA7);
				
				Element curcodeCA7 = doc.createElement("CurCode");
				curamt7.appendChild(curcodeCA7);
				
				Element acctbal8 = doc.createElement("AcctBal");
				acctinfo.appendChild(acctbal8);
				
				Element baltype8 = doc.createElement("BalType");
				acctbal8.appendChild(baltype8);
						
				Element curamt8 = doc.createElement("CurAmt");
				acctbal8.appendChild(curamt8);
				
				Element amountCA8 = doc.createElement("Amt");
				amountCA8.appendChild(doc.createTextNode("0.00"));
				curamt8.appendChild(amountCA8);
				
				Element curcodeCA8 = doc.createElement("CurCode");
				curamt8.appendChild(curcodeCA8);
				
				Element acctbal9 = doc.createElement("AcctBal");
				acctinfo.appendChild(acctbal9);
				
				Element baltype9 = doc.createElement("BalType");
				acctbal9.appendChild(baltype9);
						
				Element curamt9 = doc.createElement("CurAmt");
				acctbal9.appendChild(curamt9);
				
				Element amountCA9 = doc.createElement("Amt");
				amountCA9.appendChild(doc.createTextNode("0.00"));
				curamt9.appendChild(amountCA9);
				
				Element curcodeCA9 = doc.createElement("CurCode");
				curamt9.appendChild(curcodeCA9);
				
				Element acctbal10 = doc.createElement("AcctBal");
				acctinfo.appendChild(acctbal10);
				
				Element baltype10 = doc.createElement("BalType");
				acctbal10.appendChild(baltype10);
						
				Element curamt10 = doc.createElement("CurAmt");
				acctbal10.appendChild(curamt10);
				
				Element amountCA10 = doc.createElement("Amt");
				amountCA10.appendChild(doc.createTextNode("0.00"));
				curamt10.appendChild(amountCA10);
				
				Element curcodeCA10 = doc.createElement("CurCode");
				curamt10.appendChild(curcodeCA10);
				
				
				Element acctbal11 = doc.createElement("AcctBal");
				acctinfo.appendChild(acctbal11);
				
				Element baltype11 = doc.createElement("BalType");
				baltype11.appendChild(doc.createTextNode("com.anz.InterestBalance"));
				acctbal11.appendChild(baltype11);
						
				Element curamt11 = doc.createElement("CurAmt");
				acctbal11.appendChild(curamt11);
				
				Element amountCA11 = doc.createElement("Amt");
				amountCA11.appendChild(doc.createTextNode("-25222222.55"));
				curamt11.appendChild(amountCA11);
				
				
				Element accttrnlimit = doc.createElement("AcctTrnLimit");
				acctinfo.appendChild(accttrnlimit);
				
				Element trntype = doc.createElement("TrnType");
				accttrnlimit.appendChild(trntype);
				
				Element limittype = doc.createElement("LimitType");
				accttrnlimit.appendChild(limittype);
				
				Element curamtTRN = doc.createElement("CurAmt");
				accttrnlimit.appendChild(curamtTRN);
				
				Element amtTRN = doc.createElement("Amt");
				amtTRN.appendChild(doc.createTextNode("0.00"));
				curamtTRN.appendChild(amtTRN);
				
				Element curcodeTRN = doc.createElement("CurCode");
				curamtTRN.appendChild(curcodeTRN);
				
				Element accttrnlimit2 = doc.createElement("AcctTrnLimit");
				acctinfo.appendChild(accttrnlimit2);
				
				Element trntype2 = doc.createElement("TrnType");
				accttrnlimit2.appendChild(trntype2);
				
				Element limittype2 = doc.createElement("LimitType");
				accttrnlimit2.appendChild(limittype2);
				
				Element curamtTRN2 = doc.createElement("CurAmt");
				accttrnlimit2.appendChild(curamtTRN2);
				
				Element amtTRN2 = doc.createElement("Amt");
				amtTRN2.appendChild(doc.createTextNode("0.00"));
				curamtTRN2.appendChild(amtTRN2);
				
				Element curcodeTRN2 = doc.createElement("CurCode");
				curamtTRN2.appendChild(curcodeTRN2);
				
				Element accttrnlimit3 = doc.createElement("AcctTrnLimit");
				acctinfo.appendChild(accttrnlimit3);
				
				Element trntype3 = doc.createElement("TrnType");
				accttrnlimit3.appendChild(trntype3);
				
				Element limittype3 = doc.createElement("LimitType");
				accttrnlimit3.appendChild(limittype3);
				
				Element curamtTRN3 = doc.createElement("CurAmt");
				accttrnlimit3.appendChild(curamtTRN3);
				
				Element amtTRN3 = doc.createElement("Amt");
				amtTRN3.appendChild(doc.createTextNode("0.00"));
				curamtTRN3.appendChild(amtTRN3);
				
				Element curcodeTRN3 = doc.createElement("CurCode");
				curamtTRN3.appendChild(curcodeTRN3);
				
				Element accttrnlimit4 = doc.createElement("AcctTrnLimit");
				acctinfo.appendChild(accttrnlimit4);
				
				Element trntype4 = doc.createElement("TrnType");
				accttrnlimit4.appendChild(trntype4);
				
				Element limittype4 = doc.createElement("LimitType");
				accttrnlimit4.appendChild(limittype4);
				
				Element curamtTRN4 = doc.createElement("CurAmt");
				accttrnlimit4.appendChild(curamtTRN4);
				
				Element amtTRN4 = doc.createElement("Amt");
				amtTRN4.appendChild(doc.createTextNode("0.00"));
				curamtTRN4.appendChild(amtTRN4);
				
				Element curcodeTRN4 = doc.createElement("CurCode");
				curamtTRN4.appendChild(curcodeTRN4);
				
			
				Element accttrnlimit5 = doc.createElement("AcctTrnLimit");
				acctinfo.appendChild(accttrnlimit5);
				
				Element trntype5 = doc.createElement("TrnType");
				accttrnlimit5.appendChild(trntype5);
				
				Element limittype5 = doc.createElement("LimitType");
				accttrnlimit5.appendChild(limittype5);
				
				Element curamtTRN5 = doc.createElement("CurAmt");
				accttrnlimit5.appendChild(curamtTRN5);
				
				Element amtTRN5 = doc.createElement("Amt");
				amtTRN5.appendChild(doc.createTextNode("0.00"));
				curamtTRN5.appendChild(amtTRN5);
				
				Element curcodeTRN5 = doc.createElement("CurCode");
				curamtTRN5.appendChild(curcodeTRN5);
				
			
				Element creditacctData = doc.createElement("CreditAcctData");
				acctinfo.appendChild(creditacctData);
				
				Element OriginationDt = doc.createElement("CreditAcctData");
				OriginationDt.appendChild(doc.createTextNode("2015-02-12"));
				creditacctData.appendChild(OriginationDt);
				
				Element freqCAD = doc.createElement("Freq");
				creditacctData.appendChild(freqCAD);
				
				Element regpmt = doc.createElement("RegPmt");
				creditacctData.appendChild(regpmt);
				
				Element amtRP = doc.createElement("Amt");
				amtRP.appendChild(doc.createTextNode("0.00"));
				regpmt.appendChild(amtRP);
				
				Element curcodeRP = doc.createElement("CurCode");
				regpmt.appendChild(curcodeRP);
				
				Element stmttimeframe = doc.createElement("StmtTimeFrame");
				acctinfo.appendChild(stmttimeframe);
				
				Element recurrencerule = doc.createElement("RecurrenceRule");
				stmttimeframe.appendChild(recurrencerule);
				
				Element recurrencetype = doc.createElement("RecurrenceType");
				recurrencetype.appendChild(doc.createTextNode("Monthly"));
				recurrencerule.appendChild(recurrencetype);
				
				Element interval = doc.createElement("Interval");
				interval.appendChild(doc.createTextNode("1"));
				recurrencerule.appendChild(interval);
				
				Element instance = doc.createElement("Instance");
				instance.appendChild(doc.createTextNode("0"));
				recurrencerule.appendChild(instance);
				
				Element dayofweek = doc.createElement("DayOfWeek");
				recurrencerule.appendChild(dayofweek);
				
				Element dayofmonth = doc.createElement("DayOfMonth");
				dayofmonth.appendChild(doc.createTextNode("31"));
				recurrencerule.appendChild(dayofmonth);
				
				Element acctstatus = doc.createElement("AcctStatus");
				acctinfo.appendChild(acctstatus);
				
				Element acctstatuscode = doc.createElement("AcctStatusCode");
				acctstatuscode.appendChild(doc.createTextNode("Positive"));
				acctstatus.appendChild(acctstatuscode);
				
				Element statusmodby = doc.createElement("StatusModBy");
				statusmodby.appendChild(doc.createTextNode("Customer"));
				acctstatus.appendChild(statusmodby);
	
	}

public void createMDZNegativeResponse(String respStatus, String temps)
{
	
		 System.out.println(respStatus);	
         if (respStatus.equals("UNAVAILABLE-ACCT"))
 	     {		
  			   createMDZUnvAccResponse(temps);
  		  }
         else if (respStatus.equals("CLOSED-ACCT"))
 		  {		
 			  createMDZCloAccResponse(temps);
 		  }
 		 else 
		  {		
        	  System.out.println("No response defined in the rules");
              createMDZPositiveResp(temps);
	 	  }
         
    	 
}	
    	 	
public void createMDZUnvAccResponse(String temps)
{
	
			Element acctrec = doc.createElement("AcctRec");
			acctbatchinqrs.appendChild(acctrec);
			
			Element acctid = doc.createElement("AcctId");
			acctid.appendChild(doc.createTextNode(temps));
			acctrec.appendChild(acctid);
	 
			Element acctinfo = doc.createElement("AcctInfo");
			acctrec.appendChild(acctinfo);
			
			Element curcode = doc.createElement("CurCode");
			curcode.appendChild(doc.createTextNode("SGD"));
			acctinfo.appendChild(curcode);
			
			Element desc = doc.createElement("Desc");
			acctinfo.appendChild(desc);
			
			Element fidata = doc.createElement("FIData");
			acctinfo.appendChild(fidata);
			
			Element branchiden = doc.createElement("BranchIden");
			branchiden.appendChild(doc.createTextNode("SGB"));
			fidata.appendChild(branchiden);
		
			Element country = doc.createElement("Country");
			country.appendChild(doc.createTextNode("SG"));
			fidata.appendChild(country);
		
			Element acctuse = doc.createElement("AcctUse");
			acctinfo.appendChild(acctuse);
			
			Element intratedata = doc.createElement("IntRateData");
			acctinfo.appendChild(intratedata);
	
			Element rate = doc.createElement("Rate");
			rate.appendChild(doc.createTextNode("0.00000000"));
			intratedata.appendChild(rate);
			
			Element freq = doc.createElement("Freq");
			intratedata.appendChild(freq);
			
			Element productiden = doc.createElement("ProductIdent");
			acctinfo.appendChild(productiden);
			
			Element initialamount = doc.createElement("InitialAmount");
			acctinfo.appendChild(initialamount);
			
			Element amt = doc.createElement("Amount");
			amt.appendChild(doc.createTextNode("0.00"));
			initialamount.appendChild(amt);
			
			Element curcodeIA = doc.createElement("CurCode");
			initialamount.appendChild(curcodeIA);
	
			Element acctype = doc.createElement("AcctType");
			acctinfo.appendChild(acctype);
			
			Element acctitle = doc.createElement("AcctTitle");
			acctinfo.appendChild(acctitle);
			
				
			Element postaddr = doc.createElement("PostAddr");
			acctinfo.appendChild(postaddr);
			
			Element city = doc.createElement("City");
			postaddr.appendChild(city);
			
			Element stateprov = doc.createElement("StateProv");
			postaddr.appendChild(stateprov);
			
			Element postalcode = doc.createElement("PostalCode");
			postaddr.appendChild(postalcode);
			
			Element countryPA = doc.createElement("Country");
			postaddr.appendChild(countryPA);
			
			Element addrnonstruct = doc.createElement("AddrNonStruct");
			postaddr.appendChild(addrnonstruct);
			
			Element addr1 = doc.createElement("Addr1");
			addrnonstruct.appendChild(addr1);
			
			Element addr2 = doc.createElement("Addr2");
			addrnonstruct.appendChild(addr2);
			
			Element addr3 = doc.createElement("Add3");
			addrnonstruct.appendChild(addr3);
			
			Element addr4 = doc.createElement("Addr4");
			addrnonstruct.appendChild(addr4);
			
			Element addr5 = doc.createElement("Addr5");
			addrnonstruct.appendChild(addr5);
			
			Element addr6 = doc.createElement("Addr6");
			addrnonstruct.appendChild(addr6);
			
			Element acctbal = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal);
			
			Element baltype = doc.createElement("BalType");
			acctbal.appendChild(baltype);
					
			Element curamt = doc.createElement("CurAmt");
			acctbal.appendChild(curamt);
			
			Element amountCA = doc.createElement("Amt");
			amountCA.appendChild(doc.createTextNode("0.00"));
			curamt.appendChild(amountCA);
			
			Element curcodeCA = doc.createElement("CurCode");
			curamt.appendChild(curcodeCA);
			
			Element acctbal2 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal2);
			
			Element baltype2 = doc.createElement("BalType");
			acctbal2.appendChild(baltype2);
					
			Element curamt2 = doc.createElement("CurAmt");
			acctbal2.appendChild(curamt2);
			
			Element amountCA2 = doc.createElement("Amt");
			amountCA2.appendChild(doc.createTextNode("0.00"));
			curamt2.appendChild(amountCA2);
			
			Element curcodeCA2 = doc.createElement("CurCode");
			curamt2.appendChild(curcodeCA2);
			
			Element acctbal3 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal3);
			
			Element baltype3 = doc.createElement("BalType");
			acctbal3.appendChild(baltype3);
					
			Element curamt3 = doc.createElement("CurAmt");
			acctbal3.appendChild(curamt3);
			
			Element amountCA3 = doc.createElement("Amt");
			amountCA3.appendChild(doc.createTextNode("0.00"));
			curamt3.appendChild(amountCA3);
			
			Element curcodeCA3 = doc.createElement("CurCode");
			curamt3.appendChild(curcodeCA3);
			
			Element acctbal4 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal4);
			
			Element baltype4 = doc.createElement("BalType");
			acctbal4.appendChild(baltype4);
					
			Element curamt4 = doc.createElement("CurAmt");
			acctbal4.appendChild(curamt4);
			
			Element amountCA4 = doc.createElement("Amt");
			amountCA4.appendChild(doc.createTextNode("0.00"));
			curamt4.appendChild(amountCA4);
			
			Element curcodeCA4 = doc.createElement("CurCode");
			curamt4.appendChild(curcodeCA4);
			
			Element acctbal5 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal5);
			
			Element baltype5 = doc.createElement("BalType");
			acctbal5.appendChild(baltype5);
					
			Element curamt5 = doc.createElement("CurAmt");
			acctbal5.appendChild(curamt5);
			
			Element amountCA5 = doc.createElement("Amt");
			amountCA5.appendChild(doc.createTextNode("0.00"));
			curamt5.appendChild(amountCA5);
			
			Element curcodeCA5 = doc.createElement("CurCode");
			curamt5.appendChild(curcodeCA5);
			
			Element acctbal6 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal6);
			
			Element baltype6 = doc.createElement("BalType");
			acctbal6.appendChild(baltype6);
					
			Element curamt6 = doc.createElement("CurAmt");
			acctbal6.appendChild(curamt6);
			
			Element amountCA6 = doc.createElement("Amt");
			amountCA6.appendChild(doc.createTextNode("0.00"));
			curamt6.appendChild(amountCA6);
			
			Element curcodeCA6 = doc.createElement("CurCode");
			curamt6.appendChild(curcodeCA6);
			
			Element acctbal7 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal7);
			
			Element baltype7 = doc.createElement("BalType");
			acctbal7.appendChild(baltype7);
					
			Element curamt7 = doc.createElement("CurAmt");
			acctbal7.appendChild(curamt7);
			
			Element amountCA7 = doc.createElement("Amt");
			amountCA7.appendChild(doc.createTextNode("0.00"));
			curamt7.appendChild(amountCA7);
			
			Element curcodeCA7 = doc.createElement("CurCode");
			curamt7.appendChild(curcodeCA7);
			
			Element acctbal8 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal8);
			
			Element baltype8 = doc.createElement("BalType");
			acctbal8.appendChild(baltype8);
					
			Element curamt8 = doc.createElement("CurAmt");
			acctbal8.appendChild(curamt8);
			
			Element amountCA8 = doc.createElement("Amt");
			amountCA8.appendChild(doc.createTextNode("0.00"));
			curamt8.appendChild(amountCA8);
			
			Element curcodeCA8 = doc.createElement("CurCode");
			curamt8.appendChild(curcodeCA8);
			
			Element acctbal9 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal9);
			
			Element baltype9 = doc.createElement("BalType");
			acctbal9.appendChild(baltype9);
					
			Element curamt9 = doc.createElement("CurAmt");
			acctbal9.appendChild(curamt9);
			
			Element amountCA9 = doc.createElement("Amt");
			amountCA9.appendChild(doc.createTextNode("0.00"));
			curamt9.appendChild(amountCA9);
			
			Element curcodeCA9 = doc.createElement("CurCode");
			curamt9.appendChild(curcodeCA9);
			
			Element acctbal10 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal10);
			
			Element baltype10 = doc.createElement("BalType");
			acctbal10.appendChild(baltype10);
					
			Element curamt10 = doc.createElement("CurAmt");
			acctbal10.appendChild(curamt10);
			
			Element amountCA10 = doc.createElement("Amt");
			amountCA10.appendChild(doc.createTextNode("0.00"));
			curamt10.appendChild(amountCA10);
			
			Element curcodeCA10 = doc.createElement("CurCode");
			curamt10.appendChild(curcodeCA10);
			
			
			Element acctbal11 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal11);
			
			Element baltype11 = doc.createElement("BalType");
			baltype11.appendChild(doc.createTextNode("com.anz.InterestBalance"));
			acctbal11.appendChild(baltype11);
					
			Element curamt11 = doc.createElement("CurAmt");
			acctbal11.appendChild(curamt11);
			
			Element amountCA11 = doc.createElement("Amt");
			amountCA11.appendChild(doc.createTextNode("0.00"));
			curamt11.appendChild(amountCA11);
			
			
			Element accttrnlimit = doc.createElement("AcctTrnLimit");
			acctinfo.appendChild(accttrnlimit);
			
			Element trntype = doc.createElement("TrnType");
			accttrnlimit.appendChild(trntype);
			
			Element limittype = doc.createElement("LimitType");
			accttrnlimit.appendChild(limittype);
			
			Element curamtTRN = doc.createElement("CurAmt");
			accttrnlimit.appendChild(curamtTRN);
			
			Element amtTRN = doc.createElement("Amt");
			amtTRN.appendChild(doc.createTextNode("0.00"));
			curamtTRN.appendChild(amtTRN);
			
			Element curcodeTRN = doc.createElement("CurCode");
			curamtTRN.appendChild(curcodeTRN);
			
			Element accttrnlimit2 = doc.createElement("AcctTrnLimit");
			acctinfo.appendChild(accttrnlimit2);
			
			Element trntype2 = doc.createElement("TrnType");
			accttrnlimit2.appendChild(trntype2);
			
			Element limittype2 = doc.createElement("LimitType");
			accttrnlimit2.appendChild(limittype2);
			
			Element curamtTRN2 = doc.createElement("CurAmt");
			accttrnlimit2.appendChild(curamtTRN2);
			
			Element amtTRN2 = doc.createElement("Amt");
			amtTRN2.appendChild(doc.createTextNode("0.00"));
			curamtTRN2.appendChild(amtTRN2);
			
			Element curcodeTRN2 = doc.createElement("CurCode");
			curamtTRN2.appendChild(curcodeTRN2);
			
			Element accttrnlimit3 = doc.createElement("AcctTrnLimit");
			acctinfo.appendChild(accttrnlimit3);
			
			Element trntype3 = doc.createElement("TrnType");
			accttrnlimit3.appendChild(trntype3);
			
			Element limittype3 = doc.createElement("LimitType");
			accttrnlimit3.appendChild(limittype3);
			
			Element curamtTRN3 = doc.createElement("CurAmt");
			accttrnlimit3.appendChild(curamtTRN3);
			
			Element amtTRN3 = doc.createElement("Amt");
			amtTRN3.appendChild(doc.createTextNode("0.00"));
			curamtTRN3.appendChild(amtTRN3);
			
			Element curcodeTRN3 = doc.createElement("CurCode");
			curamtTRN3.appendChild(curcodeTRN3);
			
			Element accttrnlimit4 = doc.createElement("AcctTrnLimit");
			acctinfo.appendChild(accttrnlimit4);
			
			Element trntype4 = doc.createElement("TrnType");
			accttrnlimit4.appendChild(trntype4);
			
			Element limittype4 = doc.createElement("LimitType");
			accttrnlimit4.appendChild(limittype4);
			
			Element curamtTRN4 = doc.createElement("CurAmt");
			accttrnlimit4.appendChild(curamtTRN4);
			
			Element amtTRN4 = doc.createElement("Amt");
			amtTRN4.appendChild(doc.createTextNode("0.00"));
			curamtTRN4.appendChild(amtTRN4);
			
			Element curcodeTRN4 = doc.createElement("CurCode");
			curamtTRN4.appendChild(curcodeTRN4);
			
	
			Element accttrnlimit5 = doc.createElement("AcctTrnLimit");
			acctinfo.appendChild(accttrnlimit5);
			
			Element trntype5 = doc.createElement("TrnType");
			accttrnlimit5.appendChild(trntype5);
			
			Element limittype5 = doc.createElement("LimitType");
			accttrnlimit5.appendChild(limittype5);
			
			Element curamtTRN5 = doc.createElement("CurAmt");
			accttrnlimit5.appendChild(curamtTRN5);
			
			Element amtTRN5 = doc.createElement("Amt");
			amtTRN5.appendChild(doc.createTextNode("0.00"));
			curamtTRN5.appendChild(amtTRN5);
			
			Element curcodeTRN5 = doc.createElement("CurCode");
			curamtTRN5.appendChild(curcodeTRN5);
			
	
			Element creditacctData = doc.createElement("CreditAcctData");
			acctinfo.appendChild(creditacctData);
			
			Element OriginationDt = doc.createElement("CreditAcctData");
			creditacctData.appendChild(OriginationDt);
			
			Element freqCAD = doc.createElement("Freq");
			creditacctData.appendChild(freqCAD);
			
			Element regpmt = doc.createElement("RegPmt");
			creditacctData.appendChild(regpmt);
			
			Element amtRP = doc.createElement("Amt");
			amtRP.appendChild(doc.createTextNode("0.00"));
			regpmt.appendChild(amtRP);
			
			Element curcodeRP = doc.createElement("CurCode");
			regpmt.appendChild(curcodeRP);
			
			Element stmttimeframe = doc.createElement("StmtTimeFrame");
			acctinfo.appendChild(stmttimeframe);
			
			Element recurrencerule = doc.createElement("RecurrenceRule");
			stmttimeframe.appendChild(recurrencerule);
			
			Element recurrencetype = doc.createElement("RecurrenceType");
			recurrencerule.appendChild(recurrencetype);
			
			Element interval = doc.createElement("Interval");
			interval.appendChild(doc.createTextNode("0"));
			recurrencerule.appendChild(interval);
			
			Element instance = doc.createElement("Instance");
			instance.appendChild(doc.createTextNode("0"));
			recurrencerule.appendChild(instance);
			
			Element dayofweek = doc.createElement("DayOfWeek");
			recurrencerule.appendChild(dayofweek);
			
			Element dayofmonth = doc.createElement("DayOfMonth");
			dayofmonth.appendChild(doc.createTextNode("0"));
			recurrencerule.appendChild(dayofmonth);
			
			Element acctstatus = doc.createElement("AcctStatus");
			acctrec.appendChild(acctstatus);
			
			Element acctstatuscode = doc.createElement("AcctStatusCode");
			acctstatuscode.appendChild(doc.createTextNode("NotAvail"));
			acctstatus.appendChild(acctstatuscode);
			
			Element statusmodby = doc.createElement("StatusModBy");
			statusmodby.appendChild(doc.createTextNode("Customer"));
			acctstatus.appendChild(statusmodby);
			
	}


public void createMDZCloAccResponse(String temps)
{
	
			Element acctrec = doc.createElement("AcctRec");
			acctbatchinqrs.appendChild(acctrec);
			
			Element acctid = doc.createElement("AcctId");
			acctid.appendChild(doc.createTextNode(temps));
			acctrec.appendChild(acctid);
	 
			Element acctinfo = doc.createElement("AcctInfo");
			acctrec.appendChild(acctinfo);
			
			Element curcode = doc.createElement("CurCode");
			curcode.appendChild(doc.createTextNode("SGD"));
			acctinfo.appendChild(curcode);
			
			Element desc = doc.createElement("Desc");
			desc.appendChild(doc.createTextNode("CURRENT A/C NO.3"));
			acctinfo.appendChild(desc);
			
			Element fidata = doc.createElement("FIData");
			acctinfo.appendChild(fidata);
			
			Element branchiden = doc.createElement("BranchIden");
			branchiden.appendChild(doc.createTextNode("SGB"));
			fidata.appendChild(branchiden);
		
			Element country = doc.createElement("Country");
			country.appendChild(doc.createTextNode("SG"));
			fidata.appendChild(country);
		
			Element acctuse = doc.createElement("AcctUse");
			acctuse.appendChild(doc.createTextNode("Business"));
			acctinfo.appendChild(acctuse);
			
			Element intratedata = doc.createElement("IntRateData");
			acctinfo.appendChild(intratedata);
	
			Element rate = doc.createElement("Rate");
			rate.appendChild(doc.createTextNode("0.00000000"));
			intratedata.appendChild(rate);
			
			Element freq = doc.createElement("Freq");
			intratedata.appendChild(freq);
			
			Element productiden = doc.createElement("ProductIdent");
			productiden.appendChild(doc.createTextNode("00013"));
			acctinfo.appendChild(productiden);
			
			Element initialamount = doc.createElement("InitialAmount");
			acctinfo.appendChild(initialamount);
			
			Element amt = doc.createElement("Amount");
			amt.appendChild(doc.createTextNode("0.00"));
			initialamount.appendChild(amt);
			
			Element curcodeIA = doc.createElement("CurCode");
			initialamount.appendChild(curcodeIA);
	
			Element acctype = doc.createElement("AcctType");
			acctype.appendChild(doc.createTextNode("SDA"));
			acctinfo.appendChild(acctype);
			
			Element acctitle = doc.createElement("AcctTitle");
			acctitle.appendChild(doc.createTextNode("Bank"));
			acctinfo.appendChild(acctitle);
			
			Element opendt = doc.createElement("OpenDt");
			opendt.appendChild(doc.createTextNode("2015-02-12T00:00:00.000"));
			acctinfo.appendChild(opendt);
			
			Element postaddr = doc.createElement("PostAddr");
			acctinfo.appendChild(postaddr);
			
			Element city = doc.createElement("City");
			postaddr.appendChild(city);
			
			Element stateprov = doc.createElement("StateProv");
			postaddr.appendChild(stateprov);
			
			Element postalcode = doc.createElement("PostalCode");
			postaddr.appendChild(postalcode);
			
			Element countryPA = doc.createElement("Country");
			postaddr.appendChild(countryPA);
			
			Element addrnonstruct = doc.createElement("AddrNonStruct");
			postaddr.appendChild(addrnonstruct);
			
			Element addr1 = doc.createElement("Addr1");
			addr1.appendChild(doc.createTextNode("BANK"));
			addrnonstruct.appendChild(addr1);
			
			Element addr2 = doc.createElement("Addr2");
			addr2.appendChild(doc.createTextNode("ADDRESS1"));
			addrnonstruct.appendChild(addr2);
			
			Element addr3 = doc.createElement("Add3");
			addr3.appendChild(doc.createTextNode("ADDRESS1"));
			addrnonstruct.appendChild(addr3);
			
			Element addr4 = doc.createElement("Addr4");
			addr4.appendChild(doc.createTextNode("ADDRESS1"));
			addrnonstruct.appendChild(addr4);
			
			Element addr5 = doc.createElement("Addr5");
			addr5.appendChild(doc.createTextNode("ADDRESS1"));
			addrnonstruct.appendChild(addr5);
			
			Element addr6 = doc.createElement("Addr6");
			addr6.appendChild(doc.createTextNode("ADDRESS1"));
			addrnonstruct.appendChild(addr6);
			
			Element acctbal = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal);
			
			Element baltype = doc.createElement("BalType");
			baltype.appendChild(doc.createTextNode("Current"));
			acctbal.appendChild(baltype);
					
			Element curamt = doc.createElement("CurAmt");
			acctbal.appendChild(curamt);
			
			Element amountCA = doc.createElement("Amt");
			amountCA.appendChild(doc.createTextNode("-25114787.35"));
			curamt.appendChild(amountCA);            
			
			Element curcodeCA = doc.createElement("CurCode");
			curcodeCA.appendChild(doc.createTextNode("SGD"));
			curamt.appendChild(curcodeCA);
			
			Element acctbal2 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal2);
			
			Element baltype2 = doc.createElement("BalType");
			baltype2.appendChild(doc.createTextNode("Avail"));
			acctbal2.appendChild(baltype2);
					
			Element curamt2 = doc.createElement("CurAmt");
			acctbal2.appendChild(curamt2);
			
			Element amountCA2 = doc.createElement("Amt");
			amountCA2.appendChild(doc.createTextNode("-23454696.35"));
			curamt2.appendChild(amountCA2);
			
			Element curcodeCA2 = doc.createElement("CurCode");
			curcodeCA2.appendChild(doc.createTextNode("SGD"));
			curamt2.appendChild(curcodeCA2);
			
			Element acctbal3 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal3);
			
			Element baltype3 = doc.createElement("BalType");
			baltype3.appendChild(doc.createTextNode("CreditLimit"));
			acctbal3.appendChild(baltype3);
					
			Element curamt3 = doc.createElement("CurAmt");
			acctbal3.appendChild(curamt3);
			
			Element amountCA3 = doc.createElement("Amt");
			amountCA3.appendChild(doc.createTextNode("0.00"));
			curamt3.appendChild(amountCA3);
			
			Element curcodeCA3 = doc.createElement("CurCode");
			curcodeCA3.appendChild(doc.createTextNode("SGD"));
			curamt3.appendChild(curcodeCA3);
			
			Element acctbal4 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal4);
			
			Element baltype4 = doc.createElement("BalType");
			baltype4.appendChild(doc.createTextNode("Ledger"));
			acctbal4.appendChild(baltype4);
					
			Element curamt4 = doc.createElement("CurAmt");
			acctbal4.appendChild(curamt4);
			
			Element amountCA4 = doc.createElement("Amt");
			amountCA4.appendChild(doc.createTextNode("0.00"));
			curamt4.appendChild(amountCA4);
			
			Element curcodeCA4 = doc.createElement("CurCode");
			curcodeCA4.appendChild(doc.createTextNode("SGD"));
			curamt4.appendChild(curcodeCA4);
			
			Element acctbal5 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal5);
			
			Element baltype5 = doc.createElement("BalType");
			baltype5.appendChild(doc.createTextNode("OpeningBalance"));
			acctbal5.appendChild(baltype5);
					
			Element curamt5 = doc.createElement("CurAmt");
			acctbal5.appendChild(curamt5);
			
			Element amountCA5 = doc.createElement("Amt");
			amountCA5.appendChild(doc.createTextNode("0.00"));
			curamt5.appendChild(amountCA5);
			
			Element curcodeCA5 = doc.createElement("CurCode");
			curcodeCA5.appendChild(doc.createTextNode("SGD"));
			curamt5.appendChild(curcodeCA5);
			
			Element acctbal6 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal6);
			
			Element baltype6 = doc.createElement("BalType");
			baltype6.appendChild(doc.createTextNode("com.anz.UnpaidAccruedInterest"));
			acctbal6.appendChild(baltype6);
					
			Element curamt6 = doc.createElement("CurAmt");
			acctbal6.appendChild(curamt6);
			
			Element amountCA6 = doc.createElement("Amt");
			amountCA6.appendChild(doc.createTextNode("0.00"));
			curamt6.appendChild(amountCA6);
			
			Element curcodeCA6 = doc.createElement("CurCode");
			curcodeCA6.appendChild(doc.createTextNode("SGD"));
			curamt6.appendChild(curcodeCA6);
			
			Element acctbal7 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal7);
			
			Element baltype7 = doc.createElement("BalType");
			acctbal7.appendChild(baltype7);
					
			Element curamt7 = doc.createElement("CurAmt");
			acctbal7.appendChild(curamt7);
			
			Element amountCA7 = doc.createElement("Amt");
			amountCA7.appendChild(doc.createTextNode("0.00"));
			curamt7.appendChild(amountCA7);
			
			Element curcodeCA7 = doc.createElement("CurCode");
			curamt7.appendChild(curcodeCA7);
			
			Element acctbal8 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal8);
			
			Element baltype8 = doc.createElement("BalType");
			acctbal8.appendChild(baltype8);
					
			Element curamt8 = doc.createElement("CurAmt");
			acctbal8.appendChild(curamt8);
			
			Element amountCA8 = doc.createElement("Amt");
			amountCA8.appendChild(doc.createTextNode("0.00"));
			curamt8.appendChild(amountCA8);
			
			Element curcodeCA8 = doc.createElement("CurCode");
			curamt8.appendChild(curcodeCA8);
			
			Element acctbal9 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal9);
			
			Element baltype9 = doc.createElement("BalType");
			acctbal9.appendChild(baltype9);
					
			Element curamt9 = doc.createElement("CurAmt");
			acctbal9.appendChild(curamt9);
			
			Element amountCA9 = doc.createElement("Amt");
			amountCA9.appendChild(doc.createTextNode("0.00"));
			curamt9.appendChild(amountCA9);
			
			Element curcodeCA9 = doc.createElement("CurCode");
			curamt9.appendChild(curcodeCA9);
			
			Element acctbal10 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal10);
			
			Element baltype10 = doc.createElement("BalType");
			acctbal10.appendChild(baltype10);
					
			Element curamt10 = doc.createElement("CurAmt");
			acctbal10.appendChild(curamt10);
			
			Element amountCA10 = doc.createElement("Amt");
			amountCA10.appendChild(doc.createTextNode("0.00"));
			curamt10.appendChild(amountCA10);
			
			Element curcodeCA10 = doc.createElement("CurCode");
			curamt10.appendChild(curcodeCA10);
			
			
			Element acctbal11 = doc.createElement("AcctBal");
			acctinfo.appendChild(acctbal11);
			
			Element baltype11 = doc.createElement("BalType");
			baltype11.appendChild(doc.createTextNode("com.anz.InterestBalance"));
			acctbal11.appendChild(baltype11);
					
			Element curamt11 = doc.createElement("CurAmt");
			acctbal11.appendChild(curamt11);
			
			Element amountCA11 = doc.createElement("Amt");
			amountCA11.appendChild(doc.createTextNode("-25222222.55"));
			curamt11.appendChild(amountCA11);
			
			
			Element accttrnlimit = doc.createElement("AcctTrnLimit");
			acctinfo.appendChild(accttrnlimit);
			
			Element trntype = doc.createElement("TrnType");
			accttrnlimit.appendChild(trntype);
			
			Element limittype = doc.createElement("LimitType");
			accttrnlimit.appendChild(limittype);
			
			Element curamtTRN = doc.createElement("CurAmt");
			accttrnlimit.appendChild(curamtTRN);
			
			Element amtTRN = doc.createElement("Amt");
			amtTRN.appendChild(doc.createTextNode("0.00"));
			curamtTRN.appendChild(amtTRN);
			
			Element curcodeTRN = doc.createElement("CurCode");
			curamtTRN.appendChild(curcodeTRN);
			
			Element accttrnlimit2 = doc.createElement("AcctTrnLimit");
			acctinfo.appendChild(accttrnlimit2);
			
			Element trntype2 = doc.createElement("TrnType");
			accttrnlimit2.appendChild(trntype2);
			
			Element limittype2 = doc.createElement("LimitType");
			accttrnlimit2.appendChild(limittype2);
			
			Element curamtTRN2 = doc.createElement("CurAmt");
			accttrnlimit2.appendChild(curamtTRN2);
			
			Element amtTRN2 = doc.createElement("Amt");
			amtTRN2.appendChild(doc.createTextNode("0.00"));
			curamtTRN2.appendChild(amtTRN2);
			
			Element curcodeTRN2 = doc.createElement("CurCode");
			curamtTRN2.appendChild(curcodeTRN2);
			
			Element accttrnlimit3 = doc.createElement("AcctTrnLimit");
			acctinfo.appendChild(accttrnlimit3);
			
			Element trntype3 = doc.createElement("TrnType");
			accttrnlimit3.appendChild(trntype3);
			
			Element limittype3 = doc.createElement("LimitType");
			accttrnlimit3.appendChild(limittype3);
			
			Element curamtTRN3 = doc.createElement("CurAmt");
			accttrnlimit3.appendChild(curamtTRN3);
			
			Element amtTRN3 = doc.createElement("Amt");
			amtTRN3.appendChild(doc.createTextNode("0.00"));
			curamtTRN3.appendChild(amtTRN3);
			
			Element curcodeTRN3 = doc.createElement("CurCode");
			curamtTRN3.appendChild(curcodeTRN3);
			
			Element accttrnlimit4 = doc.createElement("AcctTrnLimit");
			acctinfo.appendChild(accttrnlimit4);
			
			Element trntype4 = doc.createElement("TrnType");
			accttrnlimit4.appendChild(trntype4);
			
			Element limittype4 = doc.createElement("LimitType");
			accttrnlimit4.appendChild(limittype4);
			
			Element curamtTRN4 = doc.createElement("CurAmt");
			accttrnlimit4.appendChild(curamtTRN4);
			
			Element amtTRN4 = doc.createElement("Amt");
			amtTRN4.appendChild(doc.createTextNode("0.00"));
			curamtTRN4.appendChild(amtTRN4);
			
			Element curcodeTRN4 = doc.createElement("CurCode");
			curamtTRN4.appendChild(curcodeTRN4);
			
	
			Element accttrnlimit5 = doc.createElement("AcctTrnLimit");
			acctinfo.appendChild(accttrnlimit5);
			
			Element trntype5 = doc.createElement("TrnType");
			accttrnlimit5.appendChild(trntype5);
			
			Element limittype5 = doc.createElement("LimitType");
			accttrnlimit5.appendChild(limittype5);
			
			Element curamtTRN5 = doc.createElement("CurAmt");
			accttrnlimit5.appendChild(curamtTRN5);
			
			Element amtTRN5 = doc.createElement("Amt");
			amtTRN5.appendChild(doc.createTextNode("0.00"));
			curamtTRN5.appendChild(amtTRN5);
			
			Element curcodeTRN5 = doc.createElement("CurCode");
			curamtTRN5.appendChild(curcodeTRN5);
			
	
			Element creditacctData = doc.createElement("CreditAcctData");
			acctinfo.appendChild(creditacctData);
			
			Element OriginationDt = doc.createElement("CreditAcctData");
			OriginationDt.appendChild(doc.createTextNode("2015-02-12"));
			creditacctData.appendChild(OriginationDt);
			
			Element freqCAD = doc.createElement("Freq");
			creditacctData.appendChild(freqCAD);
			
			Element regpmt = doc.createElement("RegPmt");
			creditacctData.appendChild(regpmt);
			
			Element amtRP = doc.createElement("Amt");
			amtRP.appendChild(doc.createTextNode("0.00"));
			regpmt.appendChild(amtRP);
			
			Element curcodeRP = doc.createElement("CurCode");
			regpmt.appendChild(curcodeRP);
			
			Element stmttimeframe = doc.createElement("StmtTimeFrame");
			acctinfo.appendChild(stmttimeframe);
			
			Element recurrencerule = doc.createElement("RecurrenceRule");
			stmttimeframe.appendChild(recurrencerule);
			
			Element recurrencetype = doc.createElement("RecurrenceType");
			recurrencetype.appendChild(doc.createTextNode("Monthly"));
			recurrencerule.appendChild(recurrencetype);
			
			Element interval = doc.createElement("Interval");
			interval.appendChild(doc.createTextNode("1"));
			recurrencerule.appendChild(interval);
			
			Element instance = doc.createElement("Instance");
			instance.appendChild(doc.createTextNode("0"));
			recurrencerule.appendChild(instance);
			
			Element dayofweek = doc.createElement("DayOfWeek");
			recurrencerule.appendChild(dayofweek);
			
			Element dayofmonth = doc.createElement("DayOfMonth");
			dayofmonth.appendChild(doc.createTextNode("31"));
			recurrencerule.appendChild(dayofmonth);
			
			Element acctstatus = doc.createElement("AcctStatus");
			acctinfo.appendChild(acctstatus);
			
			Element acctstatuscode = doc.createElement("AcctStatusCode");
			acctstatuscode.appendChild(doc.createTextNode("Closed"));
			acctstatus.appendChild(acctstatuscode);
			
			Element statusmodby = doc.createElement("StatusModBy");
			statusmodby.appendChild(doc.createTextNode("Customer"));
			acctstatus.appendChild(statusmodby);
			
	}
		
public void createMDZNotAvlResponse(String temps)
{
	
	Element acctrec = doc.createElement("AcctRec");
	acctbatchinqrs.appendChild(acctrec);
	
	Element acctid = doc.createElement("AcctId");
	acctid.appendChild(doc.createTextNode(temps));
	acctrec.appendChild(acctid);

	Element acctinfo = doc.createElement("AcctInfo");
	acctrec.appendChild(acctinfo);
	
	Element curcode = doc.createElement("CurCode");
	curcode.appendChild(doc.createTextNode("SGD"));
	acctinfo.appendChild(curcode);
	
	Element desc = doc.createElement("Desc");
	acctinfo.appendChild(desc);
	
	Element fidata = doc.createElement("FIData");
	acctinfo.appendChild(fidata);
	
	Element branchiden = doc.createElement("BranchIden");
	branchiden.appendChild(doc.createTextNode("SGB"));
	fidata.appendChild(branchiden);

	Element country = doc.createElement("Country");
	country.appendChild(doc.createTextNode("SG"));
	fidata.appendChild(country);

	Element acctuse = doc.createElement("AcctUse");
	acctinfo.appendChild(acctuse);
	
	Element intratedata = doc.createElement("IntRateData");
	acctinfo.appendChild(intratedata);

	Element rate = doc.createElement("Rate");
	rate.appendChild(doc.createTextNode("0.00000000"));
	intratedata.appendChild(rate);
	
	Element freq = doc.createElement("Freq");
	intratedata.appendChild(freq);
	
	Element productiden = doc.createElement("ProductIdent");
	acctinfo.appendChild(productiden);
	
	Element initialamount = doc.createElement("InitialAmount");
	acctinfo.appendChild(initialamount);
	
	Element amt = doc.createElement("Amount");
	initialamount.appendChild(amt);
	
	Element curcodeIA = doc.createElement("CurCode");
	initialamount.appendChild(curcodeIA);

	Element acctype = doc.createElement("AcctType");
	acctinfo.appendChild(acctype);
	
	Element acctitle = doc.createElement("AcctTitle");
	acctinfo.appendChild(acctitle);
		
	Element postaddr = doc.createElement("PostAddr");
	acctinfo.appendChild(postaddr);
	
	Element city = doc.createElement("City");
	postaddr.appendChild(city);
	
	Element stateprov = doc.createElement("StateProv");
	postaddr.appendChild(stateprov);
	
	Element postalcode = doc.createElement("PostalCode");
	postaddr.appendChild(postalcode);
	
	Element countryPA = doc.createElement("Country");
	postaddr.appendChild(countryPA);
	
	Element addrnonstruct = doc.createElement("AddrNonStruct");
	postaddr.appendChild(addrnonstruct);
	
	Element addr1 = doc.createElement("Addr1");
	addrnonstruct.appendChild(addr1);
	
	Element addr2 = doc.createElement("Addr2");
	addrnonstruct.appendChild(addr2);
	
	Element addr3 = doc.createElement("Add3");
	addrnonstruct.appendChild(addr3);
	
	Element addr4 = doc.createElement("Addr4");
	addrnonstruct.appendChild(addr4);
	
	Element addr5 = doc.createElement("Addr5");
	addrnonstruct.appendChild(addr5);
	
	Element addr6 = doc.createElement("Addr6");
	addrnonstruct.appendChild(addr6);
	
	Element acctbal = doc.createElement("AcctBal");
	acctinfo.appendChild(acctbal);
	
	Element baltype = doc.createElement("BalType");
	acctbal.appendChild(baltype);
			
	Element curamt = doc.createElement("CurAmt");
	acctbal.appendChild(curamt);
	
	Element amountCA = doc.createElement("Amt");
	amountCA.appendChild(doc.createTextNode("0.00"));
	curamt.appendChild(amountCA);
	
	Element curcodeCA = doc.createElement("CurCode");
	curamt.appendChild(curcodeCA);
	
	Element acctbal2 = doc.createElement("AcctBal");
	acctinfo.appendChild(acctbal2);
	
	Element baltype2 = doc.createElement("BalType");
	acctbal2.appendChild(baltype2);
			
	Element curamt2 = doc.createElement("CurAmt");
	acctbal2.appendChild(curamt2);
	
	Element amountCA2 = doc.createElement("Amt");
	amountCA2.appendChild(doc.createTextNode("0.00"));
	curamt2.appendChild(amountCA2);
	
	Element curcodeCA2 = doc.createElement("CurCode");
	curamt2.appendChild(curcodeCA2);
	
	Element acctbal3 = doc.createElement("AcctBal");
	acctinfo.appendChild(acctbal3);
	
	Element baltype3 = doc.createElement("BalType");
	acctbal3.appendChild(baltype3);
			
	Element curamt3 = doc.createElement("CurAmt");
	acctbal3.appendChild(curamt3);
	
	Element amountCA3 = doc.createElement("Amt");
	amountCA3.appendChild(doc.createTextNode("0.00"));
	curamt3.appendChild(amountCA3);
	
	Element curcodeCA3 = doc.createElement("CurCode");
	curamt3.appendChild(curcodeCA3);
	
	Element acctbal4 = doc.createElement("AcctBal");
	acctinfo.appendChild(acctbal4);
	
	Element baltype4 = doc.createElement("BalType");
	acctbal4.appendChild(baltype4);
			
	Element curamt4 = doc.createElement("CurAmt");
	acctbal4.appendChild(curamt4);
	
	Element amountCA4 = doc.createElement("Amt");
	amountCA4.appendChild(doc.createTextNode("0.00"));
	curamt4.appendChild(amountCA4);
	
	Element curcodeCA4 = doc.createElement("CurCode");
	curamt4.appendChild(curcodeCA4);
	
	Element acctbal5 = doc.createElement("AcctBal");
	acctinfo.appendChild(acctbal5);
	
	Element baltype5 = doc.createElement("BalType");
	acctbal5.appendChild(baltype5);
			
	Element curamt5 = doc.createElement("CurAmt");
	acctbal5.appendChild(curamt5);
	
	Element amountCA5 = doc.createElement("Amt");
	amountCA5.appendChild(doc.createTextNode("0.00"));
	curamt5.appendChild(amountCA5);
	
	Element curcodeCA5 = doc.createElement("CurCode");
	curamt5.appendChild(curcodeCA5);
	
	Element acctbal6 = doc.createElement("AcctBal");
	acctinfo.appendChild(acctbal6);
	
	Element baltype11 = doc.createElement("BalType");
	baltype11.appendChild(doc.createTextNode("com.anz.InterestBalance"));
	acctbal6.appendChild(baltype11);
			
	Element curamt11 = doc.createElement("CurAmt");
	acctbal6.appendChild(curamt11);
	
	Element amountCA11 = doc.createElement("Amt");
	amountCA11.appendChild(doc.createTextNode("0.00"));
	curamt11.appendChild(amountCA11);
	
	
	Element accttrnlimit = doc.createElement("AcctTrnLimit");
	acctinfo.appendChild(accttrnlimit);
	
	Element trntype = doc.createElement("TrnType");
	accttrnlimit.appendChild(trntype);
	
	Element limittype = doc.createElement("LimitType");
	accttrnlimit.appendChild(limittype);
	
	Element curamtTRN = doc.createElement("CurAmt");
	accttrnlimit.appendChild(curamtTRN);
	
	Element amtTRN = doc.createElement("Amt");
	amtTRN.appendChild(doc.createTextNode("0.00"));
	curamtTRN.appendChild(amtTRN);
	
	Element curcodeTRN = doc.createElement("CurCode");
	curamtTRN.appendChild(curcodeTRN);
	
	Element accttrnlimit2 = doc.createElement("AcctTrnLimit");
	acctinfo.appendChild(accttrnlimit2);
	
	Element trntype2 = doc.createElement("TrnType");
	accttrnlimit2.appendChild(trntype2);
	
	Element limittype2 = doc.createElement("LimitType");
	accttrnlimit2.appendChild(limittype2);
	
	Element curamtTRN2 = doc.createElement("CurAmt");
	accttrnlimit2.appendChild(curamtTRN2);
	
	Element amtTRN2 = doc.createElement("Amt");
	amtTRN2.appendChild(doc.createTextNode("0.00"));
	curamtTRN2.appendChild(amtTRN2);
	
	Element curcodeTRN2 = doc.createElement("CurCode");
	curamtTRN2.appendChild(curcodeTRN2);
	
	Element accttrnlimit3 = doc.createElement("AcctTrnLimit");
	acctinfo.appendChild(accttrnlimit3);
	
	Element trntype3 = doc.createElement("TrnType");
	accttrnlimit3.appendChild(trntype3);
	
	Element limittype3 = doc.createElement("LimitType");
	accttrnlimit3.appendChild(limittype3);
	
	Element curamtTRN3 = doc.createElement("CurAmt");
	accttrnlimit3.appendChild(curamtTRN3);
	
	Element amtTRN3 = doc.createElement("Amt");
	amtTRN3.appendChild(doc.createTextNode("0.00"));
	curamtTRN3.appendChild(amtTRN3);
	
	Element curcodeTRN3 = doc.createElement("CurCode");
	curamtTRN3.appendChild(curcodeTRN3);
	
	Element accttrnlimit4 = doc.createElement("AcctTrnLimit");
	acctinfo.appendChild(accttrnlimit4);
	
	Element trntype4 = doc.createElement("TrnType");
	accttrnlimit4.appendChild(trntype4);
	
	Element limittype4 = doc.createElement("LimitType");
	accttrnlimit4.appendChild(limittype4);
	
	Element curamtTRN4 = doc.createElement("CurAmt");
	accttrnlimit4.appendChild(curamtTRN4);
	
	Element amtTRN4 = doc.createElement("Amt");
	amtTRN4.appendChild(doc.createTextNode("0.00"));
	curamtTRN4.appendChild(amtTRN4);
	
	Element curcodeTRN4 = doc.createElement("CurCode");
	curamtTRN4.appendChild(curcodeTRN4);
	

	Element accttrnlimit5 = doc.createElement("AcctTrnLimit");
	acctinfo.appendChild(accttrnlimit5);
	
	Element trntype5 = doc.createElement("TrnType");
	accttrnlimit5.appendChild(trntype5);
	
	Element limittype5 = doc.createElement("LimitType");
	accttrnlimit5.appendChild(limittype5);
	
	Element curamtTRN5 = doc.createElement("CurAmt");
	accttrnlimit5.appendChild(curamtTRN5);
	
	Element amtTRN5 = doc.createElement("Amt");
	amtTRN5.appendChild(doc.createTextNode("0.00"));
	curamtTRN5.appendChild(amtTRN5);
	
	Element curcodeTRN5 = doc.createElement("CurCode");
	curamtTRN5.appendChild(curcodeTRN5);
	

	Element creditacctData = doc.createElement("CreditAcctData");
	acctinfo.appendChild(creditacctData);
	
	Element OriginationDt = doc.createElement("CreditAcctData");
	creditacctData.appendChild(OriginationDt);
	
	Element freqCAD = doc.createElement("Freq");
	creditacctData.appendChild(freqCAD);
	
	Element regpmt = doc.createElement("RegPmt");
	creditacctData.appendChild(regpmt);
	
	Element amtRP = doc.createElement("Amt");
	amtRP.appendChild(doc.createTextNode("0.00"));
	regpmt.appendChild(amtRP);
	
	Element curcodeRP = doc.createElement("CurCode");
	regpmt.appendChild(curcodeRP);
	
	Element stmttimeframe = doc.createElement("StmtTimeFrame");
	acctinfo.appendChild(stmttimeframe);
	
	Element recurrencerule = doc.createElement("RecurrenceRule");
	stmttimeframe.appendChild(recurrencerule);
	
	Element recurrencetype = doc.createElement("RecurrenceType");
	recurrencetype.appendChild(doc.createTextNode("Monthly"));
	recurrencerule.appendChild(recurrencetype);
	
	Element interval = doc.createElement("Interval");
	interval.appendChild(doc.createTextNode("1"));
	recurrencerule.appendChild(interval);
	
	Element instance = doc.createElement("Instance");
	instance.appendChild(doc.createTextNode("0"));
	recurrencerule.appendChild(instance);
	
	Element dayofweek = doc.createElement("DayOfWeek");
	recurrencerule.appendChild(dayofweek);
	
	Element dayofmonth = doc.createElement("DayOfMonth");
	dayofmonth.appendChild(doc.createTextNode("0"));
	recurrencerule.appendChild(dayofmonth);
	
	Element acctstatus = doc.createElement("AcctStatus");
	acctinfo.appendChild(acctstatus);
	
	Element acctstatuscode = doc.createElement("AcctStatusCode");
	acctstatuscode.appendChild(doc.createTextNode("NotAvail"));
	acctstatus.appendChild(acctstatuscode);
	
	Element statusmodby = doc.createElement("StatusModBy");
	statusmodby.appendChild(doc.createTextNode("Customer"));
	acctstatus.appendChild(statusmodby);	

}



}



