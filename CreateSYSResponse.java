package com.qa.stub;

import org.w3c.dom.Element;

public class CreateSYSResponse extends WriteResponse {
	
	public void createSYSHeader()
	{
		
		acctbatchinqrs = doc.createElement("AcctBatchInqRs");
		doc.appendChild(acctbatchinqrs);

		
		Element rquid = doc.createElement("RqUID");
		rquid.appendChild(doc.createTextNode(destReqId));
		acctbatchinqrs.appendChild(rquid);
				
	}
	

	public void createSYSPositiveResp(String temps)

	{
		Element acctrec = doc.createElement("AcctRec");
		acctbatchinqrs.appendChild(acctrec);
		
		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(temps));
		acctrec.appendChild(acctid);

		Element acctinfo = doc.createElement("AcctInfo");
		acctrec.appendChild(acctinfo);
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("HKD"));
		acctinfo.appendChild(curcode);
	
		Element fidata = doc.createElement("FIData");
		acctinfo.appendChild(fidata);
				
		Element fiidenttype = doc.createElement("FIIdentType");
		fiidenttype.appendChild(doc.createTextNode("01"));
		fidata.appendChild(fiidenttype);

		Element branchiden = doc.createElement("BranchIdent");
		branchiden.appendChild(doc.createTextNode("2620"));
		fidata.appendChild(branchiden);
				

		Element acctbal = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal);
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("CreditLimit"));
		acctbal.appendChild(baltype);
				
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
		Element amountCA = doc.createElement("Amt");
		amountCA.appendChild(doc.createTextNode("0.0"));
		curamt.appendChild(amountCA);
		
				

		Element acctbal2 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal2);
		
		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Current"));
		acctbal2.appendChild(baltype2);
				
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
		Element amountCA2 = doc.createElement("Amt");
		amountCA2.appendChild(doc.createTextNode("0.0"));
		curamt2.appendChild(amountCA2);
		
					
		Element acctbal3 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal3);
		
		Element baltype3 = doc.createElement("BalType");
		baltype3.appendChild(doc.createTextNode("Avail"));
		acctbal3.appendChild(baltype3);
				
		Element curamt3 = doc.createElement("CurAmt");
		acctbal3.appendChild(curamt3);
		
		Element amountCA3 = doc.createElement("Amt");
		amountCA3.appendChild(doc.createTextNode("0.0"));
		curamt3.appendChild(amountCA3);
		
				
		
		Element acctbal4 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal4);
		
		Element baltype4 = doc.createElement("BalType");
		baltype4.appendChild(doc.createTextNode("Ledger"));
		acctbal4.appendChild(baltype4);
				
		Element curamt4 = doc.createElement("CurAmt");
		acctbal4.appendChild(curamt4);
		
		Element amountCA4 = doc.createElement("Amt");
		amountCA4.appendChild(doc.createTextNode("0.0"));
		curamt4.appendChild(amountCA4);
		
				
		Element acctbal5 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal5);
		
		Element baltype5 = doc.createElement("BalType");
		baltype5.appendChild(doc.createTextNode("com.anz.DebitToday"));
		acctbal5.appendChild(baltype5);
				
		Element curamt5 = doc.createElement("CurAmt");
		acctbal5.appendChild(curamt5);
		
		Element amountCA5 = doc.createElement("Amt");
		amountCA5.appendChild(doc.createTextNode("0.0"));
		curamt5.appendChild(amountCA5);
		
	
		
		Element acctbal6 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal6);
		
		Element baltype6 = doc.createElement("BalType");
		baltype6.appendChild(doc.createTextNode("com.anz.CreditToday"));
		acctbal6.appendChild(baltype6);
				
		Element curamt6 = doc.createElement("CurAmt");
		acctbal6.appendChild(curamt6);
		
		Element amountCA6 = doc.createElement("Amt");
		amountCA6.appendChild(doc.createTextNode("0.0"));
		curamt6.appendChild(amountCA6);
		
		
		
	
		Element acctbal7 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal7);
		
		Element baltype7 = doc.createElement("BalType");
		baltype7.appendChild(doc.createTextNode("TotalHeld"));
		acctbal7.appendChild(baltype7);
				
		Element curamt7 = doc.createElement("CurAmt");
		acctbal7.appendChild(curamt7);
		
		Element amountCA7 = doc.createElement("Amt");
		amountCA7.appendChild(doc.createTextNode("0.0"));
		curamt7.appendChild(amountCA7);
		
		Element acctshortname = doc.createElement("AcctShortName");
		acctinfo.appendChild(acctshortname);			
	
		
		Element acctstatus = doc.createElement("AcctStatus");
		acctrec.appendChild(acctstatus);
		
		Element acctstatuscode = doc.createElement("AcctStatusCode");
		acctstatus.appendChild(acctstatuscode);
		
		Element StatusDesc = doc.createElement("StatusDesc");
		acctstatus.appendChild(StatusDesc);
		
		Element StatusModBy = doc.createElement("StatusModBy");
		StatusModBy.appendChild(doc.createTextNode("Customer"));
		acctstatus.appendChild(StatusModBy);
		
		
		
		}

	
	
	public void createSYSNegativeResponse(String respStatus, String temps)
	{		
		 System.out.println(respStatus);	
         if (respStatus.equals("INVALID-ACCT"))
 	     {		
        	 createSYSInvAccResponse(temps);
  		  }
         else if (respStatus.equals("CLOSED-ACCT"))
 		  {		
        	 createSYSCloAccResponse(temps);
 		  }
         else if (respStatus.equals("UNAVAILABLE-ACCT"))
		  {		
        	 createSYSNotAvlResponse(temps);
		  }
          else 
		  {		
        	  System.out.println("No response defined in the rules");
        	  createSYSInvAccResponse(temps);
	 	  }
		
	}
	
	
	public void createSYSInvAccResponse(String temps)
	{
		Element acctrec = doc.createElement("AcctRec");
		acctbatchinqrs.appendChild(acctrec);
		
		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(temps));
		acctrec.appendChild(acctid);

		Element acctinfo = doc.createElement("AcctInfo");
		acctrec.appendChild(acctinfo);
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("HKD"));
		acctinfo.appendChild(curcode);
	
		Element fidata = doc.createElement("FIData");
		acctinfo.appendChild(fidata);
				
		Element fiidenttype = doc.createElement("FIIdentType");
		fiidenttype.appendChild(doc.createTextNode("01"));
		fidata.appendChild(fiidenttype);

		Element branchiden = doc.createElement("BranchIdent");
		branchiden.appendChild(doc.createTextNode("2620"));
		fidata.appendChild(branchiden);
				

		Element acctbal = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal);
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("CreditLimit"));
		acctbal.appendChild(baltype);
				
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
		Element amountCA = doc.createElement("Amt");
		amountCA.appendChild(doc.createTextNode("0.0"));
		curamt.appendChild(amountCA);
		
				

		Element acctbal2 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal2);
		
		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Current"));
		acctbal2.appendChild(baltype2);
				
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
		Element amountCA2 = doc.createElement("Amt");
		amountCA2.appendChild(doc.createTextNode("0.0"));
		curamt2.appendChild(amountCA2);
		
					
		Element acctbal3 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal3);
		
		Element baltype3 = doc.createElement("BalType");
		baltype3.appendChild(doc.createTextNode("Avail"));
		acctbal3.appendChild(baltype3);
				
		Element curamt3 = doc.createElement("CurAmt");
		acctbal3.appendChild(curamt3);
		
		Element amountCA3 = doc.createElement("Amt");
		amountCA3.appendChild(doc.createTextNode("0.0"));
		curamt3.appendChild(amountCA3);
		
				
		
		Element acctbal4 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal4);
		
		Element baltype4 = doc.createElement("BalType");
		baltype4.appendChild(doc.createTextNode("Ledger"));
		acctbal4.appendChild(baltype4);
				
		Element curamt4 = doc.createElement("CurAmt");
		acctbal4.appendChild(curamt4);
		
		Element amountCA4 = doc.createElement("Amt");
		amountCA4.appendChild(doc.createTextNode("0.0"));
		curamt4.appendChild(amountCA4);
		
				
		Element acctbal5 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal5);
		
		Element baltype5 = doc.createElement("BalType");
		baltype5.appendChild(doc.createTextNode("com.anz.DebitToday"));
		acctbal5.appendChild(baltype5);
				
		Element curamt5 = doc.createElement("CurAmt");
		acctbal5.appendChild(curamt5);
		
		Element amountCA5 = doc.createElement("Amt");
		amountCA5.appendChild(doc.createTextNode("0.0"));
		curamt5.appendChild(amountCA5);
		
	
		
		Element acctbal6 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal6);
		
		Element baltype6 = doc.createElement("BalType");
		baltype6.appendChild(doc.createTextNode("com.anz.CreditToday"));
		acctbal6.appendChild(baltype6);
				
		Element curamt6 = doc.createElement("CurAmt");
		acctbal6.appendChild(curamt6);
		
		Element amountCA6 = doc.createElement("Amt");
		amountCA6.appendChild(doc.createTextNode("0.0"));
		curamt6.appendChild(amountCA6);
		
		
		
	
		Element acctbal7 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal7);
		
		Element baltype7 = doc.createElement("BalType");
		baltype7.appendChild(doc.createTextNode("TotalHeld"));
		acctbal7.appendChild(baltype7);
				
		Element curamt7 = doc.createElement("CurAmt");
		acctbal7.appendChild(curamt7);
		
		Element amountCA7 = doc.createElement("Amt");
		amountCA7.appendChild(doc.createTextNode("0.0"));
		curamt7.appendChild(amountCA7);
		
		Element acctshortname = doc.createElement("AcctShortName");
		acctinfo.appendChild(acctshortname);			
	
		
		Element acctstatus = doc.createElement("AcctStatus");
		acctrec.appendChild(acctstatus);
		
		Element acctstatuscode = doc.createElement("AcctStatusCode");
		acctstatuscode.appendChild(doc.createTextNode("Open"));
		acctstatus.appendChild(acctstatuscode);
		
		Element StatusDesc = doc.createElement("StatusDesc");
		acctstatus.appendChild(StatusDesc);
		
		Element StatusModBy = doc.createElement("StatusModBy");
		acctstatus.appendChild(StatusModBy);
	

	}
	
	public void createSYSCloAccResponse(String temps)
	{
		Element acctrec = doc.createElement("AcctRec");
		acctbatchinqrs.appendChild(acctrec);
		
		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(temps));
		acctrec.appendChild(acctid);

		Element acctinfo = doc.createElement("AcctInfo");
		acctrec.appendChild(acctinfo);
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("HKD"));
		acctinfo.appendChild(curcode);
	
		Element fidata = doc.createElement("FIData");
		acctinfo.appendChild(fidata);
				
		Element fiidenttype = doc.createElement("FIIdentType");
		fiidenttype.appendChild(doc.createTextNode("01"));
		fidata.appendChild(fiidenttype);

		Element branchiden = doc.createElement("BranchIdent");
		branchiden.appendChild(doc.createTextNode("2620"));
		fidata.appendChild(branchiden);
				

		Element acctbal = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal);
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("CreditLimit"));
		acctbal.appendChild(baltype);
				
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
		Element amountCA = doc.createElement("Amt");
		amountCA.appendChild(doc.createTextNode("0.0"));
		curamt.appendChild(amountCA);
		
				

		Element acctbal2 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal2);
		
		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Current"));
		acctbal2.appendChild(baltype2);
				
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
		Element amountCA2 = doc.createElement("Amt");
		amountCA2.appendChild(doc.createTextNode("0.0"));
		curamt2.appendChild(amountCA2);
		
					
		Element acctbal3 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal3);
		
		Element baltype3 = doc.createElement("BalType");
		baltype3.appendChild(doc.createTextNode("Avail"));
		acctbal3.appendChild(baltype3);
				
		Element curamt3 = doc.createElement("CurAmt");
		acctbal3.appendChild(curamt3);
		
		Element amountCA3 = doc.createElement("Amt");
		amountCA3.appendChild(doc.createTextNode("0.0"));
		curamt3.appendChild(amountCA3);
		
				
		
		Element acctbal4 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal4);
		
		Element baltype4 = doc.createElement("BalType");
		baltype4.appendChild(doc.createTextNode("Ledger"));
		acctbal4.appendChild(baltype4);
				
		Element curamt4 = doc.createElement("CurAmt");
		acctbal4.appendChild(curamt4);
		
		Element amountCA4 = doc.createElement("Amt");
		amountCA4.appendChild(doc.createTextNode("0.0"));
		curamt4.appendChild(amountCA4);
		
				
		Element acctbal5 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal5);
		
		Element baltype5 = doc.createElement("BalType");
		baltype5.appendChild(doc.createTextNode("com.anz.DebitToday"));
		acctbal5.appendChild(baltype5);
				
		Element curamt5 = doc.createElement("CurAmt");
		acctbal5.appendChild(curamt5);
		
		Element amountCA5 = doc.createElement("Amt");
		amountCA5.appendChild(doc.createTextNode("0.0"));
		curamt5.appendChild(amountCA5);
		
	
		
		Element acctbal6 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal6);
		
		Element baltype6 = doc.createElement("BalType");
		baltype6.appendChild(doc.createTextNode("com.anz.CreditToday"));
		acctbal6.appendChild(baltype6);
				
		Element curamt6 = doc.createElement("CurAmt");
		acctbal6.appendChild(curamt6);
		
		Element amountCA6 = doc.createElement("Amt");
		amountCA6.appendChild(doc.createTextNode("0.0"));
		curamt6.appendChild(amountCA6);
		
		
		
	
		Element acctbal7 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal7);
		
		Element baltype7 = doc.createElement("BalType");
		baltype7.appendChild(doc.createTextNode("TotalHeld"));
		acctbal7.appendChild(baltype7);
				
		Element curamt7 = doc.createElement("CurAmt");
		acctbal7.appendChild(curamt7);
		
		Element amountCA7 = doc.createElement("Amt");
		amountCA7.appendChild(doc.createTextNode("0.0"));
		curamt7.appendChild(amountCA7);
		
		Element acctshortname = doc.createElement("AcctShortName");
		acctinfo.appendChild(acctshortname);			
	
		
		Element acctstatus = doc.createElement("AcctStatus");
		acctrec.appendChild(acctstatus);
		
		Element acctstatuscode = doc.createElement("AcctStatusCode");
		acctstatuscode.appendChild(doc.createTextNode("Closed"));
		acctstatus.appendChild(acctstatuscode);
		
		Element StatusDesc = doc.createElement("StatusDesc");
		acctstatus.appendChild(StatusDesc);
		
		Element StatusModBy = doc.createElement("StatusModBy");
		StatusModBy.appendChild(doc.createTextNode("Customer"));
		acctstatus.appendChild(StatusModBy);
		
	}
	
	public void createSYSNotAvlResponse(String temps)
	{
		
		Element acctrec = doc.createElement("AcctRec");
		acctbatchinqrs.appendChild(acctrec);
		
		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(temps));
		acctrec.appendChild(acctid);

		Element acctinfo = doc.createElement("AcctInfo");
		acctrec.appendChild(acctinfo);
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("HKD"));
		acctinfo.appendChild(curcode);
	
		Element fidata = doc.createElement("FIData");
		acctinfo.appendChild(fidata);
				
		Element fiidenttype = doc.createElement("FIIdentType");
		fiidenttype.appendChild(doc.createTextNode("01"));
		fidata.appendChild(fiidenttype);

		Element branchiden = doc.createElement("BranchIdent");
		branchiden.appendChild(doc.createTextNode("2620"));
		fidata.appendChild(branchiden);
				

		Element acctbal = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal);
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("CreditLimit"));
		acctbal.appendChild(baltype);
				
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
		Element amountCA = doc.createElement("Amt");
		amountCA.appendChild(doc.createTextNode("0.0"));
		curamt.appendChild(amountCA);
		
				

		Element acctbal2 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal2);
		
		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Current"));
		acctbal2.appendChild(baltype2);
				
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
		Element amountCA2 = doc.createElement("Amt");
		amountCA2.appendChild(doc.createTextNode("0.0"));
		curamt2.appendChild(amountCA2);
		
					
		Element acctbal3 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal3);
		
		Element baltype3 = doc.createElement("BalType");
		baltype3.appendChild(doc.createTextNode("Avail"));
		acctbal3.appendChild(baltype3);
				
		Element curamt3 = doc.createElement("CurAmt");
		acctbal3.appendChild(curamt3);
		
		Element amountCA3 = doc.createElement("Amt");
		amountCA3.appendChild(doc.createTextNode("0.0"));
		curamt3.appendChild(amountCA3);
		
				
		
		Element acctbal4 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal4);
		
		Element baltype4 = doc.createElement("BalType");
		baltype4.appendChild(doc.createTextNode("Ledger"));
		acctbal4.appendChild(baltype4);
				
		Element curamt4 = doc.createElement("CurAmt");
		acctbal4.appendChild(curamt4);
		
		Element amountCA4 = doc.createElement("Amt");
		amountCA4.appendChild(doc.createTextNode("0.0"));
		curamt4.appendChild(amountCA4);
		
				
		Element acctbal5 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal5);
		
		Element baltype5 = doc.createElement("BalType");
		baltype5.appendChild(doc.createTextNode("com.anz.DebitToday"));
		acctbal5.appendChild(baltype5);
				
		Element curamt5 = doc.createElement("CurAmt");
		acctbal5.appendChild(curamt5);
		
		Element amountCA5 = doc.createElement("Amt");
		amountCA5.appendChild(doc.createTextNode("0.0"));
		curamt5.appendChild(amountCA5);
		
	
		
		Element acctbal6 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal6);
		
		Element baltype6 = doc.createElement("BalType");
		baltype6.appendChild(doc.createTextNode("com.anz.CreditToday"));
		acctbal6.appendChild(baltype6);
				
		Element curamt6 = doc.createElement("CurAmt");
		acctbal6.appendChild(curamt6);
		
		Element amountCA6 = doc.createElement("Amt");
		amountCA6.appendChild(doc.createTextNode("0.0"));
		curamt6.appendChild(amountCA6);
		
		
		
	
		Element acctbal7 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal7);
		
		Element baltype7 = doc.createElement("BalType");
		baltype7.appendChild(doc.createTextNode("TotalHeld"));
		acctbal7.appendChild(baltype7);
				
		Element curamt7 = doc.createElement("CurAmt");
		acctbal7.appendChild(curamt7);
		
		Element amountCA7 = doc.createElement("Amt");
		amountCA7.appendChild(doc.createTextNode("0.0"));
		curamt7.appendChild(amountCA7);
		
		Element acctshortname = doc.createElement("AcctShortName");
		acctinfo.appendChild(acctshortname);			
	
		
		Element acctstatus = doc.createElement("AcctStatus");
		acctrec.appendChild(acctstatus);
		
		Element acctstatuscode = doc.createElement("AcctStatusCode");
		acctstatuscode.appendChild(doc.createTextNode("NotAvail"));
		acctstatus.appendChild(acctstatuscode);
		
		Element StatusDesc = doc.createElement("StatusDesc");
		acctstatus.appendChild(StatusDesc);
		
		Element StatusModBy = doc.createElement("StatusModBy");
		StatusModBy.appendChild(doc.createTextNode("Customer"));
		acctstatus.appendChild(StatusModBy);
	}

	
	
	}

