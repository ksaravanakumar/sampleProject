package com.qa.stub;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.w3c.dom.Element;

public class CreateNZMResponse_RCDT extends WriteResponse_RCDT {
	public void createNZMHeader_RCDT()
	{
		
		accttrninqrs = doc.createElement("AcctTrnInqRs");
		doc.appendChild(accttrninqrs);	
		
		Element rquid = doc.createElement("RqUID");
		rquid.appendChild(doc.createTextNode(destReqId));
		accttrninqrs.appendChild(rquid);
		
	}
	
	
	public void createNZMPositiveResp_RCDT(String tempw)
	{
		String postedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String formatTime = new SimpleDateFormat("hh:mm:ss").format(new Date()); 
		
		Element anzacctiD = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzacctiD);

		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(tempw));
		anzacctiD.appendChild(acctid);

		Element acctcurcode = doc.createElement("AcctCurCode");
		acctcurcode.appendChild(doc.createTextNode("AUD"));
		anzacctiD.appendChild(acctcurcode);
		
		Element spname = doc.createElement("SPName");
		spname.appendChild(doc.createTextNode("nz.co.nbnz/markets"));
		anzacctiD.appendChild(spname);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankInfo);
		
		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("NZ"));
		bankInfo.appendChild(country);
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		incdetail.appendChild(doc.createTextNode("1"));
		accttrninqrs.appendChild(incdetail);
		
		Element acctbal = doc.createElement("AcctBal");
		accttrninqrs.appendChild(acctbal);
		
			
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("Opening Balance"));
		acctbal.appendChild(baltype);
		
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
	
		Element amt = doc.createElement("Amt");
		amt.appendChild(doc.createTextNode("97159.64"));
		curamt.appendChild(amt);		
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		curamt.appendChild(curcode);
		
		Element acctbal2 = doc.createElement("AcctBal");
		accttrninqrs.appendChild(acctbal2);

		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Closing Balance"));
		acctbal2.appendChild(baltype2);
		
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
	
		Element amt2 = doc.createElement("Amt");
		amt2.appendChild(doc.createTextNode("97159.64"));
		curamt2.appendChild(amt2);		
		
		Element curcode2 = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		curamt.appendChild(curcode2);
		
		
		
				
	}
	
	
	public void createNZMNegativeHeader_RCDT(String tempo)
	{
		
		String postedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String formatTime = new SimpleDateFormat("hh:mm:ss").format(new Date()); 
		
		Element anzacctiD = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzacctiD);

		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(tempo));
		anzacctiD.appendChild(acctid);

		Element acctcurcode = doc.createElement("AcctCurCode");
		acctcurcode.appendChild(doc.createTextNode("AUD"));
		anzacctiD.appendChild(acctcurcode);
		
		Element spname = doc.createElement("SPName");
		spname.appendChild(doc.createTextNode("nz.co.nbnz/markets"));
		anzacctiD.appendChild(spname);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankInfo);
		
		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("NZ"));
		bankInfo.appendChild(country);
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		incdetail.appendChild(doc.createTextNode("1"));
		accttrninqrs.appendChild(incdetail);
		
		Element acctbal = doc.createElement("AcctBal");
		accttrninqrs.appendChild(acctbal);
		
			
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("Opening Balance"));
		acctbal.appendChild(baltype);
		
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
	
		Element amt = doc.createElement("Amt");
		amt.appendChild(doc.createTextNode("97159.64"));
		curamt.appendChild(amt);		
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		curamt.appendChild(curcode);
		
		Element acctbal2 = doc.createElement("AcctBal");
		accttrninqrs.appendChild(acctbal2);

		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Closing Balance"));
		acctbal2.appendChild(baltype2);
		
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
	
		Element amt2 = doc.createElement("Amt");
		amt2.appendChild(doc.createTextNode("97159.64"));
		curamt2.appendChild(amt2);		
		
		Element curcode2 = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		curamt.appendChild(curcode2);
		
		
		
	}
	
	public void createNZMNegativeResp_RCDT(String respStatus, String tempw)
	{
		 System.out.println(respStatus);	
	     if (respStatus.equals("INVALID-ACCT"))
		     {		
				   createNZMInvAccResponse_RCDT(tempw);
			  }
	     else if (respStatus.equals("CLOSED-ACCT"))
			  {		
				  createNZMCloAccResponse_RCDT(tempw);
			  }
	     else if (respStatus.equals("999-TRAN"))
		  {		
			  createNZM999TranResponse_RCDT(tempw);
		  }
	      else 
		  {		
	    	  System.out.println("No response defined in the rules");
	          createNZMPositiveResp_RCDT(tempw);
	 	  }
	}
	
	public void createNZMCloAccResponse_RCDT(String tempw){
		
		String postedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String formatTime = new SimpleDateFormat("hh:mm:ss").format(new Date()); 
		
		Element anzacctiD = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzacctiD);

		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(tempw));
		anzacctiD.appendChild(acctid);

		Element acctcurcode = doc.createElement("AcctCurCode");
		acctcurcode.appendChild(doc.createTextNode("AUD"));
		anzacctiD.appendChild(acctcurcode);
		
		Element spname = doc.createElement("SPName");
		spname.appendChild(doc.createTextNode("nz.co.nbnz/markets"));
		anzacctiD.appendChild(spname);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankInfo);
		
		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("NZ"));
		bankInfo.appendChild(country);
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		incdetail.appendChild(doc.createTextNode("1"));
		accttrninqrs.appendChild(incdetail);
		
		Element acctbal = doc.createElement("AcctBal");
		accttrninqrs.appendChild(acctbal);
		
			
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("Opening Balance"));
		acctbal.appendChild(baltype);
		
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
	
		Element amt = doc.createElement("Amt");
		amt.appendChild(doc.createTextNode("97159.64"));
		curamt.appendChild(amt);		
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		curamt.appendChild(curcode);
		
		Element acctbal2 = doc.createElement("AcctBal");
		accttrninqrs.appendChild(acctbal2);

		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Closing Balance"));
		acctbal2.appendChild(baltype2);
		
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
	
		Element amt2 = doc.createElement("Amt");
		amt2.appendChild(doc.createTextNode("97159.64"));
		curamt2.appendChild(amt2);		
		
		Element curcode2 = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		curamt.appendChild(curcode2);
		
		
		
		
	}
	
	
	public void createNZMUnvAccResponse_RCDT(String tempo){
		String postedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String formatTime = new SimpleDateFormat("hh:mm:ss").format(new Date()); 
		
		Element anzacctiD = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzacctiD);

		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(tempo));
		anzacctiD.appendChild(acctid);

		Element acctcurcode = doc.createElement("AcctCurCode");
		acctcurcode.appendChild(doc.createTextNode("AUD"));
		anzacctiD.appendChild(acctcurcode);
		
		Element spname = doc.createElement("SPName");
		spname.appendChild(doc.createTextNode("nz.co.nbnz/markets"));
		anzacctiD.appendChild(spname);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankInfo);
		
		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("NZ"));
		bankInfo.appendChild(country);
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		incdetail.appendChild(doc.createTextNode("1"));
		accttrninqrs.appendChild(incdetail);
		
		Element acctbal = doc.createElement("AcctBal");
		accttrninqrs.appendChild(acctbal);
		
			
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("Opening Balance"));
		acctbal.appendChild(baltype);
		
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
	
		Element amt = doc.createElement("Amt");
		amt.appendChild(doc.createTextNode("97159.64"));
		curamt.appendChild(amt);		
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		curamt.appendChild(curcode);
		
		Element acctbal2 = doc.createElement("AcctBal");
		accttrninqrs.appendChild(acctbal2);

		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Closing Balance"));
		acctbal2.appendChild(baltype2);
		
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
	
		Element amt2 = doc.createElement("Amt");
		amt2.appendChild(doc.createTextNode("97159.64"));
		curamt2.appendChild(amt2);		
		
		Element curcode2 = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		curamt.appendChild(curcode2);
		
		
		
	
	}
	


	public void createNZMInvAccResponse_RCDT(String tempw)
	{
		String postedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String formatTime = new SimpleDateFormat("hh:mm:ss").format(new Date()); 
		
		Element anzacctiD = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzacctiD);

		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(tempw));
		anzacctiD.appendChild(acctid);

		Element acctcurcode = doc.createElement("AcctCurCode");
		acctcurcode.appendChild(doc.createTextNode("AUD"));
		anzacctiD.appendChild(acctcurcode);
		
		Element spname = doc.createElement("SPName");
		spname.appendChild(doc.createTextNode("nz.co.nbnz/markets"));
		anzacctiD.appendChild(spname);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankInfo);
		
		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("NZ"));
		bankInfo.appendChild(country);
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		incdetail.appendChild(doc.createTextNode("1"));
		accttrninqrs.appendChild(incdetail);
		
		Element acctbal = doc.createElement("AcctBal");
		accttrninqrs.appendChild(acctbal);
		
			
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("Opening Balance"));
		acctbal.appendChild(baltype);
		
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
	
		Element amt = doc.createElement("Amt");
		amt.appendChild(doc.createTextNode("97159.64"));
		curamt.appendChild(amt);		
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		curamt.appendChild(curcode);
		
		Element acctbal2 = doc.createElement("AcctBal");
		accttrninqrs.appendChild(acctbal2);

		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Closing Balance"));
		acctbal2.appendChild(baltype2);
		
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
	
		Element amt2 = doc.createElement("Amt");
		amt2.appendChild(doc.createTextNode("97159.64"));
		curamt2.appendChild(amt2);		
		
		Element curcode2 = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		curamt.appendChild(curcode2);
		
		
	}
	
	
	public void createNZM999TranResponse_RCDT(String tempw)
	{
		
		String postedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String formatTime = new SimpleDateFormat("hh:mm:ss").format(new Date()); 
		
		Element anzacctiD = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzacctiD);

		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(tempw));
		anzacctiD.appendChild(acctid);

		Element acctcurcode = doc.createElement("AcctCurCode");
		acctcurcode.appendChild(doc.createTextNode("AUD"));
		anzacctiD.appendChild(acctcurcode);
		
		Element spname = doc.createElement("SPName");
		spname.appendChild(doc.createTextNode("nz.co.nbnz/markets"));
		anzacctiD.appendChild(spname);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankInfo);
		
		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("NZ"));
		bankInfo.appendChild(country);
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		incdetail.appendChild(doc.createTextNode("1"));
		accttrninqrs.appendChild(incdetail);
		
		Element acctbal = doc.createElement("AcctBal");
		accttrninqrs.appendChild(acctbal);
		
			
		
		Element baltype = doc.createElement("BalType");
		baltype.appendChild(doc.createTextNode("Opening Balance"));
		acctbal.appendChild(baltype);
		
		Element curamt = doc.createElement("CurAmt");
		acctbal.appendChild(curamt);
		
	
		Element amt = doc.createElement("Amt");
		amt.appendChild(doc.createTextNode("97159.64"));
		curamt.appendChild(amt);		
		
		Element curcode = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		curamt.appendChild(curcode);
		
		Element acctbal2 = doc.createElement("AcctBal");
		accttrninqrs.appendChild(acctbal2);

		Element baltype2 = doc.createElement("BalType");
		baltype2.appendChild(doc.createTextNode("Closing Balance"));
		acctbal2.appendChild(baltype2);
		
		Element curamt2 = doc.createElement("CurAmt");
		acctbal2.appendChild(curamt2);
		
	
		Element amt2 = doc.createElement("Amt");
		amt2.appendChild(doc.createTextNode("97159.64"));
		curamt2.appendChild(amt2);		
		
		Element curcode2 = doc.createElement("CurCode");
		curcode.appendChild(doc.createTextNode("AUD"));
		curamt.appendChild(curcode2);
		
		
		
		}
		
		
		
	}


