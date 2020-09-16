package com.qa.stub;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.w3c.dom.Element;

public class CreateSYSResponse_RCDT extends WriteResponse_RCDT {
	public void createSYSHeader_RCDT()
	{
		
		accttrninqrs = doc.createElement("AcctTrnInqRs");
		doc.appendChild(accttrninqrs);	
		
		Element rquid = doc.createElement("RqUID");
		rquid.appendChild(doc.createTextNode(destReqId));
		accttrninqrs.appendChild(rquid);
		
	}
	
	
	public void createSYSPositiveResp_RCDT(String tempw)
	{
		String postedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String formatTime = new SimpleDateFormat("hh:mm:ss").format(new Date()); 
		
		Element anzacctiD = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzacctiD);

		Element acctid = doc.createElement("AcctId");
		acctid.appendChild(doc.createTextNode(tempw));
		anzacctiD.appendChild(acctid);

		Element acctcurcode = doc.createElement("AcctCurCode");
		acctcurcode.appendChild(doc.createTextNode("NZD"));
		anzacctiD.appendChild(acctcurcode);
		
		Element spname = doc.createElement("SPName");
		spname.appendChild(doc.createTextNode("nz.co.nbnz/retail"));
		anzacctiD.appendChild(spname);
		
		Element bankinfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankinfo);
		
		Element bankidtype = doc.createElement("BankIdType");
		bankidtype.appendChild(doc.createTextNode("B"));
		bankinfo.appendChild(bankidtype);

		Element bankid = doc.createElement("BankId");
		bankid.appendChild(doc.createTextNode("06"));
		bankinfo.appendChild(bankid);
		
		Element branchid = doc.createElement("BranchId");
		branchid.appendChild(doc.createTextNode("0081"));
		bankinfo.appendChild(branchid);
		
		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("NZ"));
		bankinfo.appendChild(country);
		
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		incdetail.appendChild(doc.createTextNode("1"));
		accttrninqrs.appendChild(incdetail);
		
	
		
		
		
				
	}
	
	
	public void createSYSNegativeHeader_RCDT(String tempo)
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
		spname.appendChild(doc.createTextNode("nz.co.nbnz/retail"));
		anzacctiD.appendChild(spname);
		
		Element bankinfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankinfo);
		
		Element bankidtype = doc.createElement("BankIdType");
		bankidtype.appendChild(doc.createTextNode("B"));
		bankinfo.appendChild(bankidtype);

		Element bankid = doc.createElement("BankId");
		bankid.appendChild(doc.createTextNode("06"));
		bankinfo.appendChild(bankid);
		
		Element branchid = doc.createElement("BranchId");
		branchid.appendChild(doc.createTextNode("0081"));
		bankinfo.appendChild(branchid);
		
		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("NZ"));
		bankinfo.appendChild(country);
		
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		incdetail.appendChild(doc.createTextNode("1"));
		accttrninqrs.appendChild(incdetail);
		
		
		
	}
	
	public void createSYSNegativeResp_RCDT(String respStatus, String tempw)
	{
		 System.out.println(respStatus);	
	     if (respStatus.equals("INVALID-ACCT"))
		     {		
				   createSYSInvAccResponse_RCDT(tempw);
			  }
	     else if (respStatus.equals("CLOSED-ACCT"))
			  {		
				  createSYSCloAccResponse_RCDT(tempw);
			  }
	     else if (respStatus.equals("999-TRAN"))
		  {		
			  createSYS999TranResponse_RCDT(tempw);
		  }
	      else 
		  {		
	    	  System.out.println("No response defined in the rules");
	          createSYSPositiveResp_RCDT(tempw);
	 	  }
	}
	
	public void createSYSUnvAccResponse_RCDT(String tempo){
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
		spname.appendChild(doc.createTextNode("nz.co.nbnz/retail"));
		anzacctiD.appendChild(spname);
		
		Element bankinfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankinfo);
		
		Element bankidtype = doc.createElement("BankIdType");
		bankidtype.appendChild(doc.createTextNode("B"));
		bankinfo.appendChild(bankidtype);

		Element bankid = doc.createElement("BankId");
		bankid.appendChild(doc.createTextNode("06"));
		bankinfo.appendChild(bankid);
		
		Element branchid = doc.createElement("BranchId");
		branchid.appendChild(doc.createTextNode("0081"));
		bankinfo.appendChild(branchid);
		
		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("NZ"));
		bankinfo.appendChild(country);
		
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		incdetail.appendChild(doc.createTextNode("1"));
		accttrninqrs.appendChild(incdetail);
	
	}
	


	public void createSYSInvAccResponse_RCDT(String tempw)
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
		spname.appendChild(doc.createTextNode("nz.co.nbnz/retail"));
		anzacctiD.appendChild(spname);
		
		Element bankinfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankinfo);
		
		Element bankidtype = doc.createElement("BankIdType");
		bankidtype.appendChild(doc.createTextNode("B"));
		bankinfo.appendChild(bankidtype);

		Element bankid = doc.createElement("BankId");
		bankid.appendChild(doc.createTextNode("06"));
		bankinfo.appendChild(bankid);
		
		Element branchid = doc.createElement("BranchId");
		branchid.appendChild(doc.createTextNode("0081"));
		bankinfo.appendChild(branchid);
		
		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("NZ"));
		bankinfo.appendChild(country);
		
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		incdetail.appendChild(doc.createTextNode("1"));
		accttrninqrs.appendChild(incdetail);
		
		
	}

	public void  createSYSCloAccResponse_RCDT(String tempw)
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
		spname.appendChild(doc.createTextNode("nz.co.nbnz/retail"));
		anzacctiD.appendChild(spname);
		
		Element bankinfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankinfo);
		
		Element bankidtype = doc.createElement("BankIdType");
		bankidtype.appendChild(doc.createTextNode("B"));
		bankinfo.appendChild(bankidtype);

		Element bankid = doc.createElement("BankId");
		bankid.appendChild(doc.createTextNode("06"));
		bankinfo.appendChild(bankid);
		
		Element branchid = doc.createElement("BranchId");
		branchid.appendChild(doc.createTextNode("0081"));
		bankinfo.appendChild(branchid);
		
		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("NZ"));
		bankinfo.appendChild(country);
		
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		incdetail.appendChild(doc.createTextNode("1"));
		accttrninqrs.appendChild(incdetail);
		

	}
	
	
	public void createSYS999TranResponse_RCDT(String tempw)
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
		spname.appendChild(doc.createTextNode("nz.co.nbnz/retail"));
		anzacctiD.appendChild(spname);
		
		Element bankinfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankinfo);
		
		Element bankidtype = doc.createElement("BankIdType");
		bankidtype.appendChild(doc.createTextNode("B"));
		bankinfo.appendChild(bankidtype);

		Element bankid = doc.createElement("BankId");
		bankid.appendChild(doc.createTextNode("06"));
		bankinfo.appendChild(bankid);
		
		Element branchid = doc.createElement("BranchId");
		branchid.appendChild(doc.createTextNode("0081"));
		bankinfo.appendChild(branchid);
		
		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("NZ"));
		bankinfo.appendChild(country);
		
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		incdetail.appendChild(doc.createTextNode("1"));
		accttrninqrs.appendChild(incdetail);
		
		}
		
		
		
	}


