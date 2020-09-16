package com.qa.stub;

import org.w3c.dom.Element;

public class CreateNZMResponse extends RB_Mantec_WriteResponse {
	
	public void createNZMHeader()
	{
		//acctbatchinqrs = doc.createElement("AcctBatchInqRs");
		acctbatchinqrs = doc.createElement("AcctInqRs");
		doc.appendChild(acctbatchinqrs);

			
		Element rquid = doc.createElement("RqUID");
		rquid.appendChild(doc.createTextNode(destReqId));
		acctbatchinqrs.appendChild(rquid);
				
	}
	

	public void createNZMPositiveResp(String temps)

	{
		Element acctrec = doc.createElement("AcctRec");
		acctbatchinqrs.appendChild(acctrec);
		
		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(temps));
		acctrec.appendChild(acctid);

		Element acctinfo = doc.createElement("AcctInfo");
		acctrec.appendChild(acctinfo);
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("USD"));
		acctinfo.appendChild(curcode);
		
		Element accttype = doc.createElement("AcctType");
		accttype.appendChild(doc.createTextNode("fca"));
		acctinfo.appendChild(accttype);
		
		
		
		Element postaddr = doc.createElement("PostAddr");
		acctinfo.appendChild(postaddr);
	
		Element country = doc.createElement("Country");
		postaddr.appendChild(country);
		
		Element addrnonstruct = doc.createElement("AddrNonStruct");
		postaddr.appendChild(addrnonstruct);

		Element addr1 = doc.createElement("Addr1");
		addrnonstruct.appendChild(addr1);
		
		Element addr2 = doc.createElement("Addr2");
		addrnonstruct.appendChild(addr2);
		
		Element addr3 = doc.createElement("Addr3");
		addrnonstruct.appendChild(addr3);
		
		Element addr4 = doc.createElement("Addr4");
		addrnonstruct.appendChild(addr4);
		
		Element addr5 = doc.createElement("Addr5");
		addrnonstruct.appendChild(addr5);
		
		
		
		Element acctbal = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal);
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("Current"));
		acctbal.appendChild(baltype);
				
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
		Element amountCA = doc.createElement("Amt");
		amountCA.appendChild(doc.createTextNode("2381588.70"));
		curamt.appendChild(amountCA);
		
		Element CurCode = doc.createElement("CurCode");
		CurCode.appendChild(doc.createTextNode("USD"));
		curamt.appendChild(CurCode);
			
		Element acctbal2 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal2);

		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Avail"));
		acctbal2.appendChild(baltype2);
				
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
		Element amountCA2 = doc.createElement("Amt");
		amountCA2.appendChild(doc.createTextNode("2381588.70"));
		curamt2.appendChild(amountCA2);
		
		Element CurCode2 = doc.createElement("CurCode");
		CurCode2.appendChild(doc.createTextNode("USD"));
		curamt2.appendChild(CurCode2);
		
	
		Element acctbal3 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal3);
		
		Element baltype3 = doc.createElement("BalType");
		baltype3.appendChild(doc.createTextNode("Ledger"));
		acctbal3.appendChild(baltype3);
				
		Element curamt3 = doc.createElement("CurAmt");
		acctbal3.appendChild(curamt3);
		
		Element amountCA3 = doc.createElement("Amt");
		amountCA3.appendChild(doc.createTextNode("2381588.70"));
		curamt3.appendChild(amountCA3);
		
		Element CurCode3 = doc.createElement("CurCode");
		CurCode3.appendChild(doc.createTextNode("USD"));
		curamt3.appendChild(CurCode3);
		
		
		Element acctstatus = doc.createElement("AcctStatus");
		acctrec.appendChild(acctstatus);
		
		
		Element AcctStatusCode = doc.createElement("AcctStatusCode");
		AcctStatusCode.appendChild(doc.createTextNode("0"));
		acctstatus.appendChild(AcctStatusCode);
		
	
	
		}

	
	
	public void createNZMNegativeResponse(String respStatus, String temps)
	{		
		 System.out.println(respStatus);	
         if (respStatus.equals("INVALID-ACCT"))
 	     {		
        	 createNZMInvAccResponse(temps);
  		  }
         else if (respStatus.equals("CLOSED-ACCT"))
 		  {		
        	 createNZMCloAccResponse(temps);
 		  }
         else if (respStatus.equals("UNAVAILABLE-ACCT"))
		  {		
        	 createNZMNotAvlResponse(temps);
		  }
          else 
		  {		
        	  System.out.println("No response defined in the rules");
        	  createNZMInvAccResponse(temps);
	 	  }
		
	}
	
	
	public void createNZMInvAccResponse(String temps)
	{
		Element acctrec = doc.createElement("AcctRec");
		acctbatchinqrs.appendChild(acctrec);
		
		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(temps));
		acctrec.appendChild(acctid);

		Element acctinfo = doc.createElement("AcctInfo");
		acctrec.appendChild(acctinfo);
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("USD"));
		acctinfo.appendChild(curcode);
		
		Element accttype = doc.createElement("AcctType");
		accttype.appendChild(doc.createTextNode("fca"));
		acctinfo.appendChild(accttype);
		
		Element postaddr = doc.createElement("PostAddr");
		acctinfo.appendChild(postaddr);
	
		Element country = doc.createElement("Country");
		postaddr.appendChild(country);
		
		Element addrnonstruct = doc.createElement("AddrNonStruct");
		postaddr.appendChild(addrnonstruct);

		Element addr1 = doc.createElement("Addr1");
		addrnonstruct.appendChild(addr1);
		
		Element addr2 = doc.createElement("Addr2");
		addrnonstruct.appendChild(addr2);
		
		Element addr3 = doc.createElement("Addr3");
		addrnonstruct.appendChild(addr3);
		
		Element addr4 = doc.createElement("Addr4");
		addrnonstruct.appendChild(addr4);
		
		Element addr5 = doc.createElement("Addr5");
		addrnonstruct.appendChild(addr5);
		
		
		
		Element acctbal = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal);
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("Current"));
		acctbal.appendChild(baltype);
				
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
		Element amountCA = doc.createElement("Amt");
		amountCA.appendChild(doc.createTextNode("2381588.70"));
		curamt.appendChild(amountCA);
		
		Element CurCode = doc.createElement("CurCode");
		CurCode.appendChild(doc.createTextNode("USD"));
		curamt.appendChild(CurCode);
			
		Element acctbal2 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal2);

		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Avail"));
		acctbal2.appendChild(baltype2);
				
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
		Element amountCA2 = doc.createElement("Amt");
		amountCA2.appendChild(doc.createTextNode("2381588.70"));
		curamt2.appendChild(amountCA2);
		
		Element CurCode2 = doc.createElement("CurCode");
		CurCode2.appendChild(doc.createTextNode("USD"));
		curamt2.appendChild(CurCode2);
		
	
		Element acctbal3 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal3);
		
		Element baltype3 = doc.createElement("BalType");
		baltype3.appendChild(doc.createTextNode("Ledger"));
		acctbal3.appendChild(baltype3);
				
		Element curamt3 = doc.createElement("CurAmt");
		acctbal3.appendChild(curamt3);
		
		Element amountCA3 = doc.createElement("Amt");
		amountCA3.appendChild(doc.createTextNode("2381588.70"));
		curamt3.appendChild(amountCA3);
		
		Element CurCode3 = doc.createElement("CurCode");
		CurCode3.appendChild(doc.createTextNode("USD"));
		curamt3.appendChild(CurCode3);
		
		
		Element acctstatus = doc.createElement("AcctStatus");
		acctrec.appendChild(acctstatus);
		
		
		Element AcctStatusCode = doc.createElement("AcctStatusCode");
		AcctStatusCode.appendChild(doc.createTextNode("0"));
		acctstatus.appendChild(AcctStatusCode);
		
		
	

	}
	
	public void createNZMCloAccResponse(String temps)
	{
		Element acctrec = doc.createElement("AcctRec");
		acctbatchinqrs.appendChild(acctrec);
		
		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(temps));
		acctrec.appendChild(acctid);

		Element acctinfo = doc.createElement("AcctInfo");
		acctrec.appendChild(acctinfo);
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("USD"));
		acctinfo.appendChild(curcode);
		
		Element accttype = doc.createElement("AcctType");
		accttype.appendChild(doc.createTextNode("fca"));
		acctinfo.appendChild(accttype);
		
		Element postaddr = doc.createElement("PostAddr");
		acctinfo.appendChild(postaddr);
	
		Element country = doc.createElement("Country");
		postaddr.appendChild(country);
		
		Element addrnonstruct = doc.createElement("AddrNonStruct");
		postaddr.appendChild(addrnonstruct);

		Element addr1 = doc.createElement("Addr1");
		addrnonstruct.appendChild(addr1);
		
		Element addr2 = doc.createElement("Addr2");
		addrnonstruct.appendChild(addr2);
		
		Element addr3 = doc.createElement("Addr3");
		addrnonstruct.appendChild(addr3);
		
		Element addr4 = doc.createElement("Addr4");
		addrnonstruct.appendChild(addr4);
		
		Element addr5 = doc.createElement("Addr5");
		addrnonstruct.appendChild(addr5);
		
		
		
		Element acctbal = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal);
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("Current"));
		acctbal.appendChild(baltype);
				
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
		Element amountCA = doc.createElement("Amt");
		amountCA.appendChild(doc.createTextNode("2381588.70"));
		curamt.appendChild(amountCA);
		
		Element CurCode = doc.createElement("CurCode");
		CurCode.appendChild(doc.createTextNode("USD"));
		curamt.appendChild(CurCode);
			
		Element acctbal2 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal2);

		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Avail"));
		acctbal2.appendChild(baltype2);
				
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
		Element amountCA2 = doc.createElement("Amt");
		amountCA2.appendChild(doc.createTextNode("2381588.70"));
		curamt2.appendChild(amountCA2);
		
		Element CurCode2 = doc.createElement("CurCode");
		CurCode2.appendChild(doc.createTextNode("USD"));
		curamt2.appendChild(CurCode2);
		
	
		Element acctbal3 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal3);
		
		Element baltype3 = doc.createElement("BalType");
		baltype3.appendChild(doc.createTextNode("Ledger"));
		acctbal3.appendChild(baltype3);
				
		Element curamt3 = doc.createElement("CurAmt");
		acctbal3.appendChild(curamt3);
		
		Element amountCA3 = doc.createElement("Amt");
		amountCA3.appendChild(doc.createTextNode("2381588.70"));
		curamt3.appendChild(amountCA3);
		
		Element CurCode3 = doc.createElement("CurCode");
		CurCode3.appendChild(doc.createTextNode("USD"));
		curamt3.appendChild(CurCode3);
		
		
		Element acctstatus = doc.createElement("AcctStatus");
		acctrec.appendChild(acctstatus);
		
		
		Element AcctStatusCode = doc.createElement("AcctStatusCode");
		AcctStatusCode.appendChild(doc.createTextNode("0"));
		acctstatus.appendChild(AcctStatusCode);
		
		
	}
	
	public void createNZMNotAvlResponse(String temps)
	{
		
		Element acctrec = doc.createElement("AcctRec");
		acctbatchinqrs.appendChild(acctrec);
		
		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(temps));
		acctrec.appendChild(acctid);

		Element acctinfo = doc.createElement("AcctInfo");
		acctrec.appendChild(acctinfo);
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("USD"));
		acctinfo.appendChild(curcode);
		
		Element accttype = doc.createElement("AcctType");
		accttype.appendChild(doc.createTextNode("fca"));
		acctinfo.appendChild(accttype);
		
		Element postaddr = doc.createElement("PostAddr");
		acctinfo.appendChild(postaddr);
	
		Element country = doc.createElement("Country");
		postaddr.appendChild(country);
		
		Element addrnonstruct = doc.createElement("AddrNonStruct");
		postaddr.appendChild(addrnonstruct);

		Element addr1 = doc.createElement("Addr1");
		addrnonstruct.appendChild(addr1);
		
		Element addr2 = doc.createElement("Addr2");
		addrnonstruct.appendChild(addr2);
		
		Element addr3 = doc.createElement("Addr3");
		addrnonstruct.appendChild(addr3);
		
		Element addr4 = doc.createElement("Addr4");
		addrnonstruct.appendChild(addr4);
		
		Element addr5 = doc.createElement("Addr5");
		addrnonstruct.appendChild(addr5);
		
		
		
		Element acctbal = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal);
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("Current"));
		acctbal.appendChild(baltype);
				
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
		Element amountCA = doc.createElement("Amt");
		amountCA.appendChild(doc.createTextNode("2381588.70"));
		curamt.appendChild(amountCA);
		
		Element CurCode = doc.createElement("CurCode");
		CurCode.appendChild(doc.createTextNode("USD"));
		curamt.appendChild(CurCode);
			
		Element acctbal2 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal2);

		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Avail"));
		acctbal2.appendChild(baltype2);
				
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
		Element amountCA2 = doc.createElement("Amt");
		amountCA2.appendChild(doc.createTextNode("2381588.70"));
		curamt2.appendChild(amountCA2);
		
		Element CurCode2 = doc.createElement("CurCode");
		CurCode2.appendChild(doc.createTextNode("USD"));
		curamt2.appendChild(CurCode2);
		
	
		Element acctbal3 = doc.createElement("AcctBal");
		acctinfo.appendChild(acctbal3);
		
		Element baltype3 = doc.createElement("BalType");
		baltype3.appendChild(doc.createTextNode("Ledger"));
		acctbal3.appendChild(baltype3);
				
		Element curamt3 = doc.createElement("CurAmt");
		acctbal3.appendChild(curamt3);
		
		Element amountCA3 = doc.createElement("Amt");
		amountCA3.appendChild(doc.createTextNode("2381588.70"));
		curamt3.appendChild(amountCA3);
		
		Element CurCode3 = doc.createElement("CurCode");
		CurCode3.appendChild(doc.createTextNode("USD"));
		curamt3.appendChild(CurCode3);
		
		
		Element acctstatus = doc.createElement("AcctStatus");
		acctrec.appendChild(acctstatus);
		
		
		Element AcctStatusCode = doc.createElement("AcctStatusCode");
		AcctStatusCode.appendChild(doc.createTextNode("0"));
		acctstatus.appendChild(AcctStatusCode);
		
	}

	
	
	}

