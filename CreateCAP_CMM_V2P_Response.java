package com.qa.stub;

import org.w3c.dom.Element;

public class CreateCAP_CMM_V2P_Response extends WriteResponse {
	
	public void createCAP_CMM_V2PHeader()
	{
		
		acctbatchinqrs = doc.createElement("AcctBatchInqRs");
		doc.appendChild(acctbatchinqrs);

	
		Element status = doc.createElement("Status");
		acctbatchinqrs.appendChild(status);

		Element statuscode = doc.createElement("StatusCode");
		statuscode.appendChild(doc.createTextNode("0"));
		status.appendChild(statuscode);

		Element serverstatuscode = doc.createElement("ServerStatusCode");
		
		
		serverstatuscode.appendChild(doc.createTextNode("CTM"));
		status.appendChild(serverstatuscode);

		
		Element severity = doc.createElement("Severity");
		severity.appendChild(doc.createTextNode("Warning"));
		status.appendChild(severity);

		
		Element statusdesc = doc.createElement("StatusDesc");
		statusdesc.appendChild(doc.createTextNode("The service provider partially processed the request."));
		status.appendChild(statusdesc);
		
		Element rquid = doc.createElement("RqUID");
		rquid.appendChild(doc.createTextNode(destReqId));
		acctbatchinqrs.appendChild(rquid);  
				
	}
	
	public void createCAP_CMM_V2PHeaderPostive()
	{
		
		Element status = doc.createElement("Status");
		acctbatchinqrs.appendChild(status);
		
		Element statuscode = doc.createElement("StatusCode");
		statuscode.appendChild(doc.createTextNode("0"));
		status.appendChild(statuscode);

		Element serverstatuscode = doc.createElement("ServerStatusCode");
		
		
		serverstatuscode.appendChild(doc.createTextNode("CTM"));
		status.appendChild(serverstatuscode);

		
		Element severity = doc.createElement("Severity");
		severity.appendChild(doc.createTextNode("Warning"));
		status.appendChild(severity);

		
		Element statusdesc = doc.createElement("StatusDesc");
		statusdesc.appendChild(doc.createTextNode("The service provider partially processed the request."));
		status.appendChild(statusdesc);
		
		Element rquid = doc.createElement("RqUID");
		rquid.appendChild(doc.createTextNode(destReqId));
		acctbatchinqrs.appendChild(rquid);
				
		
	}
	

	public void createCAP_CMM_V2PPositiveResp(String temps)

	{
		Element acctrec = doc.createElement("AcctRec");
		acctbatchinqrs.appendChild(acctrec);
		
		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(temps));
		acctrec.appendChild(acctid);

		Element acctinfo = doc.createElement("AcctInfo");
		acctrec.appendChild(acctinfo);
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		acctinfo.appendChild(curcode);
	
	
		Element acctbal = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal);
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("Ledger"));
		acctbal.appendChild(baltype);
				
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
		Element amountCA = doc.createElement("Amt");
		amountCA.appendChild(doc.createTextNode("16173.69"));
		curamt.appendChild(amountCA);
		
	
			

		Element acctbal2 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal2);
		
		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Current"));
		acctbal2.appendChild(baltype2);
				
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
		Element amountCA2 = doc.createElement("Amt");
		amountCA2.appendChild(doc.createTextNode("16173.69"));
		curamt2.appendChild(amountCA2);
		
		
		
			
		Element acctbal3 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal3);
		
		Element baltype3 = doc.createElement("BalType");
		baltype3.appendChild(doc.createTextNode("Avail"));
		acctbal3.appendChild(baltype3);
				
		Element curamt3 = doc.createElement("CurAmt");
		acctbal3.appendChild(curamt3);
		
		Element amountCA3 = doc.createElement("Amt");
		amountCA3.appendChild(doc.createTextNode("16173.69"));
		curamt3.appendChild(amountCA3);
		
	
		
		
		Element acctbal4 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal4);
		
		Element baltype4 = doc.createElement("BalType");
		baltype4.appendChild(doc.createTextNode("CreditLimit"));
		acctbal4.appendChild(baltype4);
				
		Element curamt4 = doc.createElement("CurAmt");
		acctbal4.appendChild(curamt4);
		
		Element amountCA4 = doc.createElement("Amt");
		amountCA4.appendChild(doc.createTextNode("0.00"));
		curamt4.appendChild(amountCA4);
		
	
		
		
		Element acctbal5 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal5);
		
		Element baltype5 = doc.createElement("BalType");
		baltype5.appendChild(doc.createTextNode("TotalHeld"));
		acctbal5.appendChild(baltype5);
				
		Element curamt5 = doc.createElement("CurAmt");
		acctbal5.appendChild(curamt5);
		
		Element amountCA5 = doc.createElement("Amt");
		amountCA5.appendChild(doc.createTextNode("0.00"));
		curamt5.appendChild(amountCA5);
		
	
	
		
		Element acctbal6 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal6);
		
		Element baltype6 = doc.createElement("BalType");
		baltype6.appendChild(doc.createTextNode("com.anz.CashDepToday"));
		acctbal6.appendChild(baltype6);
				
		Element curamt6 = doc.createElement("CurAmt");
		acctbal6.appendChild(curamt6);
		
		Element amountCA6 = doc.createElement("Amt");
		amountCA6.appendChild(doc.createTextNode("0.00"));
		curamt6.appendChild(amountCA6);
		
		Element effDT6 = doc.createElement("EffDt");
		effDT6.appendChild(doc.createTextNode("2015-10-15T12:22:56Z"));
		acctbal6.appendChild(effDT6);
		
	
		Element acctbal7 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal7);
		
		Element baltype7 = doc.createElement("BalType");
		baltype7.appendChild(doc.createTextNode("com.anz.ChkDepToday"));
		acctbal7.appendChild(baltype7);
				
		Element curamt7 = doc.createElement("CurAmt");
		acctbal7.appendChild(curamt7);
		
		Element amountCA7 = doc.createElement("Amt");
		amountCA7.appendChild(doc.createTextNode("0.00"));
		curamt7.appendChild(amountCA7);
		
		Element effDT7 = doc.createElement("EffDt");
		effDT7.appendChild(doc.createTextNode("2015-10-15T12:22:56Z"));
		acctbal7.appendChild(effDT7);
		
		
		Element acctbal8 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal8);
		
		Element baltype8 = doc.createElement("BalType");
		baltype8.appendChild(doc.createTextNode("com.anz.DebitToday"));
		acctbal8.appendChild(baltype8);
				
		Element curamt8 = doc.createElement("CurAmt");
		acctbal8.appendChild(curamt8);
		
		Element amountCA8 = doc.createElement("Amt");
		amountCA8.appendChild(doc.createTextNode("0.00"));
		curamt8.appendChild(amountCA8);
		
		Element effDT8 = doc.createElement("EffDt");
		effDT8.appendChild(doc.createTextNode("2015-10-15T12:22:56Z"));
		acctbal8.appendChild(effDT8);
		
		
		Element acctbal9 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal9);
		
		Element baltype9 = doc.createElement("BalType");
		baltype9.appendChild(doc.createTextNode("AvailCredit"));
		acctbal9.appendChild(baltype9);
				
		Element curamt9 = doc.createElement("CurAmt");
		acctbal9.appendChild(curamt9);
		
		Element amountCA9 = doc.createElement("Amt");
		amountCA9.appendChild(doc.createTextNode("0.00"));
		curamt9.appendChild(amountCA9);
		
		
		
		Element acctbal10 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal10);
		
		Element baltype10 = doc.createElement("BalType");
		baltype10.appendChild(doc.createTextNode("com.anz.LatestLedger"));
		acctbal10.appendChild(baltype10);
				
		Element curamt10 = doc.createElement("CurAmt");
		acctbal10.appendChild(curamt10);
		
		Element amountCA10 = doc.createElement("Amt");
		amountCA10.appendChild(doc.createTextNode("16173.69"));
		curamt10.appendChild(amountCA10);
		
		
		
		
		Element acctbal11 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal11);
		
		Element baltype11 = doc.createElement("BalType");
		baltype11.appendChild(doc.createTextNode("com.anz.LedgerFloat"));
		acctbal11.appendChild(baltype11);
				
		Element curamt11 = doc.createElement("CurAmt");
		acctbal11.appendChild(curamt11);
		
		Element amountCA11 = doc.createElement("Amt");
		amountCA11.appendChild(doc.createTextNode("0.00"));
		curamt11.appendChild(amountCA11);
		
		
	
		Element acctbal12 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal12);
		
		Element baltype12 = doc.createElement("BalType");
		baltype12.appendChild(doc.createTextNode("com.anz.UnclearedChkDepToday"));
		acctbal12.appendChild(baltype12);
				
		Element curamt12 = doc.createElement("CurAmt");
		acctbal12.appendChild(curamt12);
		
		Element amountCA12 = doc.createElement("Amt");
		amountCA12.appendChild(doc.createTextNode("0.00"));
		curamt12.appendChild(amountCA12);
		
		
		Element acctbal13 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal13);
		
		Element baltype13 = doc.createElement("BalType");
		baltype13.appendChild(doc.createTextNode("com.anz.FloatDay1"));
		acctbal13.appendChild(baltype13);
				
		Element curamt13 = doc.createElement("CurAmt");
		acctbal13.appendChild(curamt13);
		
		Element amountCA13 = doc.createElement("Amt");
		amountCA13.appendChild(doc.createTextNode("0.00"));
		curamt13.appendChild(amountCA13);
		
		
		
		Element acctbal14 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal14);
		
		Element baltype14 = doc.createElement("BalType");
		baltype14.appendChild(doc.createTextNode("com.anz.FloatDay2"));
		acctbal14.appendChild(baltype14);
				
		Element curamt14 = doc.createElement("CurAmt");
		acctbal14.appendChild(curamt14);
		
		Element amountCA14 = doc.createElement("Amt");
		amountCA14.appendChild(doc.createTextNode("0.00"));
		curamt14.appendChild(amountCA14);
		
		
		
		Element acctbal15 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal15);
		
		Element baltype15 = doc.createElement("BalType");
		baltype15.appendChild(doc.createTextNode("com.anz.FloatDay3"));
		acctbal15.appendChild(baltype15);
				
		Element curamt15 = doc.createElement("CurAmt");
		acctbal15.appendChild(curamt15);
		
		Element amountCA15 = doc.createElement("Amt");
		amountCA15.appendChild(doc.createTextNode("0.00"));
		curamt15.appendChild(amountCA15);
		
		
		
		Element acctbal16 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal16);
		
		Element baltype16 = doc.createElement("BalType");
		baltype16.appendChild(doc.createTextNode("com.anz.FloatDay4"));
		acctbal16.appendChild(baltype16);
				
		Element curamt16 = doc.createElement("CurAmt");
		acctbal16.appendChild(curamt16);
		
		Element amountCA16 = doc.createElement("Amt");
		amountCA16.appendChild(doc.createTextNode("0.00"));
		curamt16.appendChild(amountCA16);
		
		
		Element acctbal17 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal17);
		
		Element baltype17 = doc.createElement("BalType");
		baltype17.appendChild(doc.createTextNode("com.anz.FloatDay5"));
		acctbal17.appendChild(baltype17);
				
		Element curamt17 = doc.createElement("CurAmt");
		acctbal17.appendChild(curamt17);
		
		Element amountCA17 = doc.createElement("Amt");
		amountCA17.appendChild(doc.createTextNode("0.00"));
		curamt17.appendChild(amountCA17);
		
		
		
		Element acctbal18 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal18);
		
		Element baltype18 = doc.createElement("BalType");
		baltype18.appendChild(doc.createTextNode("com.anz.UnclearedFundsModifier"));
		acctbal18.appendChild(baltype18);
				
		Element curamt18 = doc.createElement("CurAmt");
		acctbal18.appendChild(curamt18);
		
		Element amountCA18 = doc.createElement("Amt");
		amountCA18.appendChild(doc.createTextNode("0.00"));
		curamt18.appendChild(amountCA18);
		
		Element acctshortname = doc.createElement("AcctShortName");
		acctshortname.appendChild(doc.createTextNode("108 FLINDERS P/L"));
		acctinfo.appendChild(acctshortname);
		
		
		
		
		Element acctstatus = doc.createElement("AcctStatus");
		acctrec.appendChild(acctstatus);
		
		Element acctstatuscode = doc.createElement("AcctStatusCode");
		acctstatuscode.appendChild(doc.createTextNode("Open"));
		acctstatus.appendChild(acctstatuscode);
		
		Element StatusDesc = doc.createElement("StatusDesc");
		StatusDesc.appendChild(doc.createTextNode("Open"));
		acctstatus.appendChild(StatusDesc);
		
		Element statusmodby = doc.createElement("StatusModBy");
		statusmodby.appendChild(doc.createTextNode("Open"));
		acctstatus.appendChild(statusmodby);
		
		
	
	
		}

	public void createCAP_CMM_V2PHeaderNegative(String tempo)
	{
		
		
		Element status = doc.createElement("Status");
		acctbatchinqrs.appendChild(status);

		Element statuscode = doc.createElement("StatusCode");
		statuscode.appendChild(doc.createTextNode("2300"));
		status.appendChild(statuscode);

		Element serverstatuscode = doc.createElement("ServerStatusCode");
		
		
		serverstatuscode.appendChild(doc.createTextNode("CTM"));
		status.appendChild(serverstatuscode);

		
		Element severity = doc.createElement("Severity");
		severity.appendChild(doc.createTextNode("Error"));
		status.appendChild(severity);

		
		Element statusdesc = doc.createElement("StatusDesc");
		statusdesc.appendChild(doc.createTextNode("Invalid Source Account"+tempo));
		status.appendChild(statusdesc);
		
		Element rquid = doc.createElement("RqUID");
		rquid.appendChild(doc.createTextNode(destReqId));
		acctbatchinqrs.appendChild(rquid);
				
	}
	
	
	public void createCAP_CMM_V2PNegativeResponse(String respStatus, String temps)
	{		
		 System.out.println(respStatus);	
         if (respStatus.equals("INVALID-ACCT"))
 	     {		
        	 createCAP_CMM_V2PInvAccResponse(temps);
  		  }
         else if (respStatus.equals("CLOSED-ACCT"))
 		  {		
        	 createCAP_CMM_V2PCloAccResponse(temps);
 		  }
         else if (respStatus.equals("UNAVAILABLE-ACCT"))
		  {		
        	 createCAP_CMM_V2PNotAvlResponse(temps);
		  }
          else 
		  {		
        	  System.out.println("No response defined in the rules");
        	  createCAP_CMM_V2PInvAccResponse(temps);
	 	  }
		
         
         
	}
	
	
	public void createCAP_CMM_V2PInvAccResponse(String temps)
	{
		Element acctrec = doc.createElement("AcctRec");
		acctbatchinqrs.appendChild(acctrec);
		
		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(temps));
		acctrec.appendChild(acctid);

		Element acctinfo = doc.createElement("AcctInfo");
		acctrec.appendChild(acctinfo);
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		acctinfo.appendChild(curcode);
	
	
		Element acctbal = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal);
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("Ledger"));
		acctbal.appendChild(baltype);
				
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
		Element amountCA = doc.createElement("Amt");
		amountCA.appendChild(doc.createTextNode("16173.69"));
		curamt.appendChild(amountCA);
		
	
			

		Element acctbal2 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal2);
		
		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Current"));
		acctbal2.appendChild(baltype2);
				
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
		Element amountCA2 = doc.createElement("Amt");
		amountCA2.appendChild(doc.createTextNode("16173.69"));
		curamt2.appendChild(amountCA2);
		
		
		
			
		Element acctbal3 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal3);
		
		Element baltype3 = doc.createElement("BalType");
		baltype3.appendChild(doc.createTextNode("Avail"));
		acctbal3.appendChild(baltype3);
				
		Element curamt3 = doc.createElement("CurAmt");
		acctbal3.appendChild(curamt3);
		
		Element amountCA3 = doc.createElement("Amt");
		amountCA3.appendChild(doc.createTextNode("16173.69"));
		curamt3.appendChild(amountCA3);
		
	
		
		
		Element acctbal4 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal4);
		
		Element baltype4 = doc.createElement("BalType");
		baltype4.appendChild(doc.createTextNode("CreditLimit"));
		acctbal4.appendChild(baltype4);
				
		Element curamt4 = doc.createElement("CurAmt");
		acctbal4.appendChild(curamt4);
		
		Element amountCA4 = doc.createElement("Amt");
		amountCA4.appendChild(doc.createTextNode("0.00"));
		curamt4.appendChild(amountCA4);
		
	
		
		
		Element acctbal5 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal5);
		
		Element baltype5 = doc.createElement("BalType");
		baltype5.appendChild(doc.createTextNode("TotalHeld"));
		acctbal5.appendChild(baltype5);
				
		Element curamt5 = doc.createElement("CurAmt");
		acctbal5.appendChild(curamt5);
		
		Element amountCA5 = doc.createElement("Amt");
		amountCA5.appendChild(doc.createTextNode("0.00"));
		curamt5.appendChild(amountCA5);
		
	
	
		
		Element acctbal6 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal6);
		
		Element baltype6 = doc.createElement("BalType");
		baltype6.appendChild(doc.createTextNode("com.anz.CashDepToday"));
		acctbal6.appendChild(baltype6);
				
		Element curamt6 = doc.createElement("CurAmt");
		acctbal6.appendChild(curamt6);
		
		Element amountCA6 = doc.createElement("Amt");
		amountCA6.appendChild(doc.createTextNode("0.00"));
		curamt6.appendChild(amountCA6);
		
		Element effDT6 = doc.createElement("EffDt");
		effDT6.appendChild(doc.createTextNode("2015-10-15T12:22:56Z"));
		acctbal6.appendChild(effDT6);
		
	
		Element acctbal7 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal7);
		
		Element baltype7 = doc.createElement("BalType");
		baltype7.appendChild(doc.createTextNode("com.anz.ChkDepToday"));
		acctbal7.appendChild(baltype7);
				
		Element curamt7 = doc.createElement("CurAmt");
		acctbal7.appendChild(curamt7);
		
		Element amountCA7 = doc.createElement("Amt");
		amountCA7.appendChild(doc.createTextNode("0.00"));
		curamt7.appendChild(amountCA7);
		
		Element effDT7 = doc.createElement("EffDt");
		effDT7.appendChild(doc.createTextNode("2015-10-15T12:22:56Z"));
		acctbal7.appendChild(effDT7);
		
		
		Element acctbal8 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal8);
		
		Element baltype8 = doc.createElement("BalType");
		baltype8.appendChild(doc.createTextNode("com.anz.DebitToday"));
		acctbal8.appendChild(baltype8);
				
		Element curamt8 = doc.createElement("CurAmt");
		acctbal8.appendChild(curamt8);
		
		Element amountCA8 = doc.createElement("Amt");
		amountCA8.appendChild(doc.createTextNode("0.00"));
		curamt8.appendChild(amountCA8);
		
		Element effDT8 = doc.createElement("EffDt");
		effDT8.appendChild(doc.createTextNode("2015-10-15T12:22:56Z"));
		acctbal8.appendChild(effDT8);
		
		
		Element acctbal9 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal9);
		
		Element baltype9 = doc.createElement("BalType");
		baltype9.appendChild(doc.createTextNode("AvailCredit"));
		acctbal9.appendChild(baltype9);
				
		Element curamt9 = doc.createElement("CurAmt");
		acctbal9.appendChild(curamt9);
		
		Element amountCA9 = doc.createElement("Amt");
		amountCA9.appendChild(doc.createTextNode("0.00"));
		curamt9.appendChild(amountCA9);
		
		
		
		Element acctbal10 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal10);
		
		Element baltype10 = doc.createElement("BalType");
		baltype10.appendChild(doc.createTextNode("com.anz.LatestLedger"));
		acctbal10.appendChild(baltype10);
				
		Element curamt10 = doc.createElement("CurAmt");
		acctbal10.appendChild(curamt10);
		
		Element amountCA10 = doc.createElement("Amt");
		amountCA10.appendChild(doc.createTextNode("16173.69"));
		curamt10.appendChild(amountCA10);
		
		
		
		
		Element acctbal11 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal11);
		
		Element baltype11 = doc.createElement("BalType");
		baltype11.appendChild(doc.createTextNode("com.anz.LedgerFloat"));
		acctbal11.appendChild(baltype11);
				
		Element curamt11 = doc.createElement("CurAmt");
		acctbal11.appendChild(curamt11);
		
		Element amountCA11 = doc.createElement("Amt");
		amountCA11.appendChild(doc.createTextNode("0.00"));
		curamt11.appendChild(amountCA11);
		
		
	
		Element acctbal12 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal12);
		
		Element baltype12 = doc.createElement("BalType");
		baltype12.appendChild(doc.createTextNode("com.anz.UnclearedChkDepToday"));
		acctbal12.appendChild(baltype12);
				
		Element curamt12 = doc.createElement("CurAmt");
		acctbal11.appendChild(curamt12);
		
		Element amountCA12 = doc.createElement("Amt");
		amountCA12.appendChild(doc.createTextNode("0.00"));
		curamt12.appendChild(amountCA12);
		
		
		Element acctbal13 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal13);
		
		Element baltype13 = doc.createElement("BalType");
		baltype13.appendChild(doc.createTextNode("com.anz.FloatDay1"));
		acctbal13.appendChild(baltype13);
				
		Element curamt13 = doc.createElement("CurAmt");
		acctbal13.appendChild(curamt13);
		
		Element amountCA13 = doc.createElement("Amt");
		amountCA13.appendChild(doc.createTextNode("0.00"));
		curamt13.appendChild(amountCA13);
		
		
		
		Element acctbal14 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal14);
		
		Element baltype14 = doc.createElement("BalType");
		baltype14.appendChild(doc.createTextNode("com.anz.FloatDay2"));
		acctbal14.appendChild(baltype14);
				
		Element curamt14 = doc.createElement("CurAmt");
		acctbal14.appendChild(curamt14);
		
		Element amountCA14 = doc.createElement("Amt");
		amountCA14.appendChild(doc.createTextNode("0.00"));
		curamt14.appendChild(amountCA14);
		
		
		
		Element acctbal15 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal15);
		
		Element baltype15 = doc.createElement("BalType");
		baltype15.appendChild(doc.createTextNode("com.anz.FloatDay3"));
		acctbal15.appendChild(baltype15);
				
		Element curamt15 = doc.createElement("CurAmt");
		acctbal15.appendChild(curamt15);
		
		Element amountCA15 = doc.createElement("Amt");
		amountCA15.appendChild(doc.createTextNode("0.00"));
		curamt15.appendChild(amountCA15);
		
		
		
		Element acctbal16 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal16);
		
		Element baltype16 = doc.createElement("BalType");
		baltype16.appendChild(doc.createTextNode("com.anz.FloatDay4"));
		acctbal16.appendChild(baltype16);
				
		Element curamt16 = doc.createElement("CurAmt");
		acctbal16.appendChild(curamt16);
		
		Element amountCA16 = doc.createElement("Amt");
		amountCA16.appendChild(doc.createTextNode("0.00"));
		curamt16.appendChild(amountCA16);
		
		
		Element acctbal17 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal17);
		
		Element baltype17 = doc.createElement("BalType");
		baltype17.appendChild(doc.createTextNode("com.anz.FloatDay5"));
		acctbal17.appendChild(baltype17);
				
		Element curamt17 = doc.createElement("CurAmt");
		acctbal17.appendChild(curamt17);
		
		Element amountCA17 = doc.createElement("Amt");
		amountCA17.appendChild(doc.createTextNode("0.00"));
		curamt17.appendChild(amountCA17);
		
		
		
		Element acctbal18 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal18);
		
		Element baltype18 = doc.createElement("BalType");
		baltype18.appendChild(doc.createTextNode("com.anz.UnclearedFundsModifier"));
		acctbal18.appendChild(baltype18);
				
		Element curamt18 = doc.createElement("CurAmt");
		acctbal18.appendChild(curamt18);
		
		Element amountCA18 = doc.createElement("Amt");
		amountCA18.appendChild(doc.createTextNode("0.00"));
		curamt18.appendChild(amountCA18);
		
		Element acctshortname = doc.createElement("AcctShortName");
		acctshortname.appendChild(doc.createTextNode("108 FLINDERS P/L"));
		acctinfo.appendChild(acctshortname);
		
		
		
		
		Element acctstatus = doc.createElement("AcctStatus");
		acctrec.appendChild(acctstatus);
		
		Element acctstatuscode = doc.createElement("AcctStatusCode");
		acctstatuscode.appendChild(doc.createTextNode("Open"));
		acctstatus.appendChild(acctstatuscode);
		
		Element StatusDesc = doc.createElement("StatusDesc");
		StatusDesc.appendChild(doc.createTextNode("Open"));
		acctstatus.appendChild(StatusDesc);
		
		Element statusmodby = doc.createElement("StatusModBy");
		statusmodby.appendChild(doc.createTextNode("Open"));
		acctstatus.appendChild(statusmodby);
		
	

	}
	
	public void createCAP_CMM_V2PCloAccResponse(String temps)
	{
		Element acctrec = doc.createElement("AcctRec");
		acctbatchinqrs.appendChild(acctrec);
		
		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(temps));
		acctrec.appendChild(acctid);

		Element acctinfo = doc.createElement("AcctInfo");
		acctrec.appendChild(acctinfo);
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		acctinfo.appendChild(curcode);
	
	
		Element acctbal = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal);
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("Ledger"));
		acctbal.appendChild(baltype);
				
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
		Element amountCA = doc.createElement("Amt");
		amountCA.appendChild(doc.createTextNode("16173.69"));
		curamt.appendChild(amountCA);
		
	
			

		Element acctbal2 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal2);
		
		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Current"));
		acctbal2.appendChild(baltype2);
				
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
		Element amountCA2 = doc.createElement("Amt");
		amountCA2.appendChild(doc.createTextNode("16173.69"));
		curamt2.appendChild(amountCA2);
		
		
		
			
		Element acctbal3 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal3);
		
		Element baltype3 = doc.createElement("BalType");
		baltype3.appendChild(doc.createTextNode("Avail"));
		acctbal3.appendChild(baltype3);
				
		Element curamt3 = doc.createElement("CurAmt");
		acctbal3.appendChild(curamt3);
		
		Element amountCA3 = doc.createElement("Amt");
		amountCA3.appendChild(doc.createTextNode("16173.69"));
		curamt3.appendChild(amountCA3);
		
	
		
		
		Element acctbal4 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal4);
		
		Element baltype4 = doc.createElement("BalType");
		baltype4.appendChild(doc.createTextNode("CreditLimit"));
		acctbal4.appendChild(baltype4);
				
		Element curamt4 = doc.createElement("CurAmt");
		acctbal4.appendChild(curamt4);
		
		Element amountCA4 = doc.createElement("Amt");
		amountCA4.appendChild(doc.createTextNode("0.00"));
		curamt4.appendChild(amountCA4);
		
	
		
		
		Element acctbal5 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal5);
		
		Element baltype5 = doc.createElement("BalType");
		baltype5.appendChild(doc.createTextNode("TotalHeld"));
		acctbal5.appendChild(baltype5);
				
		Element curamt5 = doc.createElement("CurAmt");
		acctbal5.appendChild(curamt5);
		
		Element amountCA5 = doc.createElement("Amt");
		amountCA5.appendChild(doc.createTextNode("0.00"));
		curamt5.appendChild(amountCA5);
		
	
	
		
		Element acctbal6 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal6);
		
		Element baltype6 = doc.createElement("BalType");
		baltype6.appendChild(doc.createTextNode("com.anz.CashDepToday"));
		acctbal6.appendChild(baltype6);
				
		Element curamt6 = doc.createElement("CurAmt");
		acctbal6.appendChild(curamt6);
		
		Element amountCA6 = doc.createElement("Amt");
		amountCA6.appendChild(doc.createTextNode("0.00"));
		curamt6.appendChild(amountCA6);
		
		Element effDT6 = doc.createElement("EffDt");
		effDT6.appendChild(doc.createTextNode("2015-10-15T12:22:56Z"));
		acctbal6.appendChild(effDT6);
		
	
		Element acctbal7 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal7);
		
		Element baltype7 = doc.createElement("BalType");
		baltype7.appendChild(doc.createTextNode("com.anz.ChkDepToday"));
		acctbal7.appendChild(baltype7);
				
		Element curamt7 = doc.createElement("CurAmt");
		acctbal7.appendChild(curamt7);
		
		Element amountCA7 = doc.createElement("Amt");
		amountCA7.appendChild(doc.createTextNode("0.00"));
		curamt7.appendChild(amountCA7);
		
		Element effDT7 = doc.createElement("EffDt");
		effDT7.appendChild(doc.createTextNode("2015-10-15T12:22:56Z"));
		acctbal7.appendChild(effDT7);
		
		
		Element acctbal8 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal8);
		
		Element baltype8 = doc.createElement("BalType");
		baltype8.appendChild(doc.createTextNode("com.anz.DebitToday"));
		acctbal8.appendChild(baltype8);
				
		Element curamt8 = doc.createElement("CurAmt");
		acctbal8.appendChild(curamt8);
		
		Element amountCA8 = doc.createElement("Amt");
		amountCA8.appendChild(doc.createTextNode("0.00"));
		curamt8.appendChild(amountCA8);
		
		Element effDT8 = doc.createElement("EffDt");
		effDT8.appendChild(doc.createTextNode("2015-10-15T12:22:56Z"));
		acctbal8.appendChild(effDT8);
		
		
		Element acctbal9 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal9);
		
		Element baltype9 = doc.createElement("BalType");
		baltype9.appendChild(doc.createTextNode("AvailCredit"));
		acctbal9.appendChild(baltype9);
				
		Element curamt9 = doc.createElement("CurAmt");
		acctbal9.appendChild(curamt9);
		
		Element amountCA9 = doc.createElement("Amt");
		amountCA9.appendChild(doc.createTextNode("0.00"));
		curamt9.appendChild(amountCA9);
		
		
		
		Element acctbal10 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal10);
		
		Element baltype10 = doc.createElement("BalType");
		baltype10.appendChild(doc.createTextNode("com.anz.LatestLedger"));
		acctbal10.appendChild(baltype10);
				
		Element curamt10 = doc.createElement("CurAmt");
		acctbal10.appendChild(curamt10);
		
		Element amountCA10 = doc.createElement("Amt");
		amountCA10.appendChild(doc.createTextNode("16173.69"));
		curamt10.appendChild(amountCA10);
		
		
		
		
		Element acctbal11 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal11);
		
		Element baltype11 = doc.createElement("BalType");
		baltype11.appendChild(doc.createTextNode("com.anz.LedgerFloat"));
		acctbal11.appendChild(baltype11);
				
		Element curamt11 = doc.createElement("CurAmt");
		acctbal11.appendChild(curamt11);
		
		Element amountCA11 = doc.createElement("Amt");
		amountCA11.appendChild(doc.createTextNode("0.00"));
		curamt11.appendChild(amountCA11);
		
		
	
		Element acctbal12 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal12);
		
		Element baltype12 = doc.createElement("BalType");
		baltype12.appendChild(doc.createTextNode("com.anz.UnclearedChkDepToday"));
		acctbal12.appendChild(baltype12);
				
		Element curamt12 = doc.createElement("CurAmt");
		acctbal11.appendChild(curamt12);
		
		Element amountCA12 = doc.createElement("Amt");
		amountCA12.appendChild(doc.createTextNode("0.00"));
		curamt12.appendChild(amountCA12);
		
		
		Element acctbal13 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal13);
		
		Element baltype13 = doc.createElement("BalType");
		baltype13.appendChild(doc.createTextNode("com.anz.FloatDay1"));
		acctbal13.appendChild(baltype13);
				
		Element curamt13 = doc.createElement("CurAmt");
		acctbal13.appendChild(curamt13);
		
		Element amountCA13 = doc.createElement("Amt");
		amountCA13.appendChild(doc.createTextNode("0.00"));
		curamt13.appendChild(amountCA13);
		
		
		
		Element acctbal14 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal14);
		
		Element baltype14 = doc.createElement("BalType");
		baltype14.appendChild(doc.createTextNode("com.anz.FloatDay2"));
		acctbal14.appendChild(baltype14);
				
		Element curamt14 = doc.createElement("CurAmt");
		acctbal14.appendChild(curamt14);
		
		Element amountCA14 = doc.createElement("Amt");
		amountCA14.appendChild(doc.createTextNode("0.00"));
		curamt14.appendChild(amountCA14);
		
		
		
		Element acctbal15 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal15);
		
		Element baltype15 = doc.createElement("BalType");
		baltype15.appendChild(doc.createTextNode("com.anz.FloatDay3"));
		acctbal15.appendChild(baltype15);
				
		Element curamt15 = doc.createElement("CurAmt");
		acctbal15.appendChild(curamt15);
		
		Element amountCA15 = doc.createElement("Amt");
		amountCA15.appendChild(doc.createTextNode("0.00"));
		curamt15.appendChild(amountCA15);
		
		
		
		Element acctbal16 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal16);
		
		Element baltype16 = doc.createElement("BalType");
		baltype16.appendChild(doc.createTextNode("com.anz.FloatDay4"));
		acctbal16.appendChild(baltype16);
				
		Element curamt16 = doc.createElement("CurAmt");
		acctbal16.appendChild(curamt16);
		
		Element amountCA16 = doc.createElement("Amt");
		amountCA16.appendChild(doc.createTextNode("0.00"));
		curamt16.appendChild(amountCA16);
		
		
		Element acctbal17 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal17);
		
		Element baltype17 = doc.createElement("BalType");
		baltype17.appendChild(doc.createTextNode("com.anz.FloatDay5"));
		acctbal17.appendChild(baltype17);
				
		Element curamt17 = doc.createElement("CurAmt");
		acctbal17.appendChild(curamt17);
		
		Element amountCA17 = doc.createElement("Amt");
		amountCA17.appendChild(doc.createTextNode("0.00"));
		curamt17.appendChild(amountCA17);
		
		
		
		Element acctbal18 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal18);
		
		Element baltype18 = doc.createElement("BalType");
		baltype18.appendChild(doc.createTextNode("com.anz.UnclearedFundsModifier"));
		acctbal18.appendChild(baltype18);
				
		Element curamt18 = doc.createElement("CurAmt");
		acctbal18.appendChild(curamt18);
		
		Element amountCA18 = doc.createElement("Amt");
		amountCA18.appendChild(doc.createTextNode("0.00"));
		curamt18.appendChild(amountCA18);
		
		Element acctshortname = doc.createElement("AcctShortName");
		acctshortname.appendChild(doc.createTextNode("108 FLINDERS P/L"));
		acctinfo.appendChild(acctshortname);
		
		
		
		
		Element acctstatus = doc.createElement("AcctStatus");
		acctrec.appendChild(acctstatus);
		
		Element acctstatuscode = doc.createElement("AcctStatusCode");
		acctstatuscode.appendChild(doc.createTextNode("Open"));
		acctstatus.appendChild(acctstatuscode);
		
		Element StatusDesc = doc.createElement("StatusDesc");
		StatusDesc.appendChild(doc.createTextNode("Open"));
		acctstatus.appendChild(StatusDesc);
		
		Element statusmodby = doc.createElement("StatusModBy");
		statusmodby.appendChild(doc.createTextNode("Open"));
		acctstatus.appendChild(statusmodby);
		
	}
	
	public void createCAP_CMM_V2PNotAvlResponse(String temps)
	{
		
		Element acctrec = doc.createElement("AcctRec");
		acctbatchinqrs.appendChild(acctrec);
		
		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(temps));
		acctrec.appendChild(acctid);

		Element acctinfo = doc.createElement("AcctInfo");
		acctrec.appendChild(acctinfo);
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		acctinfo.appendChild(curcode);
	
	
		Element acctbal = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal);
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("Ledger"));
		acctbal.appendChild(baltype);
				
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
		Element amountCA = doc.createElement("Amt");
		amountCA.appendChild(doc.createTextNode("16173.69"));
		curamt.appendChild(amountCA);
		
	
			

		Element acctbal2 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal2);
		
		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Current"));
		acctbal2.appendChild(baltype2);
				
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
		Element amountCA2 = doc.createElement("Amt");
		amountCA2.appendChild(doc.createTextNode("16173.69"));
		curamt2.appendChild(amountCA2);
		
		
		
			
		Element acctbal3 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal3);
		
		Element baltype3 = doc.createElement("BalType");
		baltype3.appendChild(doc.createTextNode("Avail"));
		acctbal3.appendChild(baltype3);
				
		Element curamt3 = doc.createElement("CurAmt");
		acctbal3.appendChild(curamt3);
		
		Element amountCA3 = doc.createElement("Amt");
		amountCA3.appendChild(doc.createTextNode("16173.69"));
		curamt3.appendChild(amountCA3);
		
	
		
		
		Element acctbal4 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal4);
		
		Element baltype4 = doc.createElement("BalType");
		baltype4.appendChild(doc.createTextNode("CreditLimit"));
		acctbal4.appendChild(baltype4);
				
		Element curamt4 = doc.createElement("CurAmt");
		acctbal4.appendChild(curamt4);
		
		Element amountCA4 = doc.createElement("Amt");
		amountCA4.appendChild(doc.createTextNode("0.00"));
		curamt4.appendChild(amountCA4);
		
	
		
		
		Element acctbal5 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal5);
		
		Element baltype5 = doc.createElement("BalType");
		baltype5.appendChild(doc.createTextNode("TotalHeld"));
		acctbal5.appendChild(baltype5);
				
		Element curamt5 = doc.createElement("CurAmt");
		acctbal5.appendChild(curamt5);
		
		Element amountCA5 = doc.createElement("Amt");
		amountCA5.appendChild(doc.createTextNode("0.00"));
		curamt5.appendChild(amountCA5);
		
	
	
		
		Element acctbal6 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal6);
		
		Element baltype6 = doc.createElement("BalType");
		baltype6.appendChild(doc.createTextNode("com.anz.CashDepToday"));
		acctbal6.appendChild(baltype6);
				
		Element curamt6 = doc.createElement("CurAmt");
		acctbal6.appendChild(curamt6);
		
		Element amountCA6 = doc.createElement("Amt");
		amountCA6.appendChild(doc.createTextNode("0.00"));
		curamt6.appendChild(amountCA6);
		
		Element effDT6 = doc.createElement("EffDt");
		effDT6.appendChild(doc.createTextNode("2015-10-15T12:22:56Z"));
		acctbal6.appendChild(effDT6);
		
	
		Element acctbal7 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal7);
		
		Element baltype7 = doc.createElement("BalType");
		baltype7.appendChild(doc.createTextNode("com.anz.ChkDepToday"));
		acctbal7.appendChild(baltype7);
				
		Element curamt7 = doc.createElement("CurAmt");
		acctbal7.appendChild(curamt7);
		
		Element amountCA7 = doc.createElement("Amt");
		amountCA7.appendChild(doc.createTextNode("0.00"));
		curamt7.appendChild(amountCA7);
		
		Element effDT7 = doc.createElement("EffDt");
		effDT7.appendChild(doc.createTextNode("2015-10-15T12:22:56Z"));
		acctbal7.appendChild(effDT7);
		
		
		Element acctbal8 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal8);
		
		Element baltype8 = doc.createElement("BalType");
		baltype8.appendChild(doc.createTextNode("com.anz.DebitToday"));
		acctbal8.appendChild(baltype8);
				
		Element curamt8 = doc.createElement("CurAmt");
		acctbal8.appendChild(curamt8);
		
		Element amountCA8 = doc.createElement("Amt");
		amountCA8.appendChild(doc.createTextNode("0.00"));
		curamt8.appendChild(amountCA8);
		
		Element effDT8 = doc.createElement("EffDt");
		effDT8.appendChild(doc.createTextNode("2015-10-15T12:22:56Z"));
		acctbal8.appendChild(effDT8);
		
		
		Element acctbal9 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal9);
		
		Element baltype9 = doc.createElement("BalType");
		baltype9.appendChild(doc.createTextNode("AvailCredit"));
		acctbal9.appendChild(baltype9);
				
		Element curamt9 = doc.createElement("CurAmt");
		acctbal9.appendChild(curamt9);
		
		Element amountCA9 = doc.createElement("Amt");
		amountCA9.appendChild(doc.createTextNode("0.00"));
		curamt9.appendChild(amountCA9);
		
		
		
		Element acctbal10 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal10);
		
		Element baltype10 = doc.createElement("BalType");
		baltype10.appendChild(doc.createTextNode("com.anz.LatestLedger"));
		acctbal10.appendChild(baltype10);
				
		Element curamt10 = doc.createElement("CurAmt");
		acctbal10.appendChild(curamt10);
		
		Element amountCA10 = doc.createElement("Amt");
		amountCA10.appendChild(doc.createTextNode("16173.69"));
		curamt10.appendChild(amountCA10);
		
		
		
		
		Element acctbal11 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal11);
		
		Element baltype11 = doc.createElement("BalType");
		baltype11.appendChild(doc.createTextNode("com.anz.LedgerFloat"));
		acctbal11.appendChild(baltype11);
				
		Element curamt11 = doc.createElement("CurAmt");
		acctbal11.appendChild(curamt11);
		
		Element amountCA11 = doc.createElement("Amt");
		amountCA11.appendChild(doc.createTextNode("0.00"));
		curamt11.appendChild(amountCA11);
		
		
	
		Element acctbal12 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal12);
		
		Element baltype12 = doc.createElement("BalType");
		baltype12.appendChild(doc.createTextNode("com.anz.UnclearedChkDepToday"));
		acctbal12.appendChild(baltype12);
				
		Element curamt12 = doc.createElement("CurAmt");
		acctbal11.appendChild(curamt12);
		
		Element amountCA12 = doc.createElement("Amt");
		amountCA12.appendChild(doc.createTextNode("0.00"));
		curamt12.appendChild(amountCA12);
		
		
		Element acctbal13 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal13);
		
		Element baltype13 = doc.createElement("BalType");
		baltype13.appendChild(doc.createTextNode("com.anz.FloatDay1"));
		acctbal13.appendChild(baltype13);
				
		Element curamt13 = doc.createElement("CurAmt");
		acctbal13.appendChild(curamt13);
		
		Element amountCA13 = doc.createElement("Amt");
		amountCA13.appendChild(doc.createTextNode("0.00"));
		curamt13.appendChild(amountCA13);
		
		
		
		Element acctbal14 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal14);
		
		Element baltype14 = doc.createElement("BalType");
		baltype14.appendChild(doc.createTextNode("com.anz.FloatDay2"));
		acctbal14.appendChild(baltype14);
				
		Element curamt14 = doc.createElement("CurAmt");
		acctbal14.appendChild(curamt14);
		
		Element amountCA14 = doc.createElement("Amt");
		amountCA14.appendChild(doc.createTextNode("0.00"));
		curamt14.appendChild(amountCA14);
		
		
		
		Element acctbal15 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal15);
		
		Element baltype15 = doc.createElement("BalType");
		baltype15.appendChild(doc.createTextNode("com.anz.FloatDay3"));
		acctbal15.appendChild(baltype15);
				
		Element curamt15 = doc.createElement("CurAmt");
		acctbal15.appendChild(curamt15);
		
		Element amountCA15 = doc.createElement("Amt");
		amountCA15.appendChild(doc.createTextNode("0.00"));
		curamt15.appendChild(amountCA15);
		
		
		
		Element acctbal16 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal16);
		
		Element baltype16 = doc.createElement("BalType");
		baltype16.appendChild(doc.createTextNode("com.anz.FloatDay4"));
		acctbal16.appendChild(baltype16);
				
		Element curamt16 = doc.createElement("CurAmt");
		acctbal16.appendChild(curamt16);
		
		Element amountCA16 = doc.createElement("Amt");
		amountCA16.appendChild(doc.createTextNode("0.00"));
		curamt16.appendChild(amountCA16);
		
		
		Element acctbal17 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal17);
		
		Element baltype17 = doc.createElement("BalType");
		baltype17.appendChild(doc.createTextNode("com.anz.FloatDay5"));
		acctbal17.appendChild(baltype17);
				
		Element curamt17 = doc.createElement("CurAmt");
		acctbal17.appendChild(curamt17);
		
		Element amountCA17 = doc.createElement("Amt");
		amountCA17.appendChild(doc.createTextNode("0.00"));
		curamt17.appendChild(amountCA17);
		
		
		
		Element acctbal18 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal18);
		
		Element baltype18 = doc.createElement("BalType");
		baltype18.appendChild(doc.createTextNode("com.anz.UnclearedFundsModifier"));
		acctbal18.appendChild(baltype18);
				
		Element curamt18 = doc.createElement("CurAmt");
		acctbal18.appendChild(curamt18);
		
		Element amountCA18 = doc.createElement("Amt");
		amountCA18.appendChild(doc.createTextNode("0.00"));
		curamt18.appendChild(amountCA18);
		
		Element acctshortname = doc.createElement("AcctShortName");
		acctshortname.appendChild(doc.createTextNode("108 FLINDERS P/L"));
		acctinfo.appendChild(acctshortname);
		
		
		
		
		Element acctstatus = doc.createElement("AcctStatus");
		acctrec.appendChild(acctstatus);
		
		Element acctstatuscode = doc.createElement("AcctStatusCode");
		acctstatuscode.appendChild(doc.createTextNode("NotAvail"));
		acctstatus.appendChild(acctstatuscode);
		
		Element StatusDesc = doc.createElement("StatusDesc");
		//StatusDesc.appendChild(doc.createTextNode("Open"));
		acctstatus.appendChild(StatusDesc);
		
		Element statusmodby = doc.createElement("StatusModBy");
		statusmodby.appendChild(doc.createTextNode("Customer"));
		acctstatus.appendChild(statusmodby);	

	}

	
	
	}

