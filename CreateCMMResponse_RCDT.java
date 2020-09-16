package com.qa.stub;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.w3c.dom.Element;

public class CreateCMMResponse_RCDT extends WriteResponse_RCDT {
	public void createCMMHeader_RCDT()
	{
		
		accttrninqrs = doc.createElement("AcctTrnInqRs");
		doc.appendChild(accttrninqrs);	
		
		Element rquid = doc.createElement("RqUID");
		rquid.appendChild(doc.createTextNode(destReqId));
		accttrninqrs.appendChild(rquid);
		
	}
	
	
	public void createCMMPositiveResp_RCDT(String tempw)
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
		spname.appendChild(doc.createTextNode("au.com.anz/retail"));
		anzacctiD.appendChild(spname);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankInfo);
		
		Element branchId = doc.createElement("BranchId");
		branchId.appendChild(doc.createTextNode("012345"));
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("AU"));
		bankInfo.appendChild(country);
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		accttrninqrs.appendChild(incdetail);
		
		Element recctrlout = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recctrlout);
		
			
		
		Element moretxnavail = doc.createElement("MoreTxnAvail");
		moretxnavail.appendChild(doc.createTextNode("N"));
		recctrlout.appendChild(moretxnavail);
		
		Element sentrec = doc.createElement("SentRec");
		sentrec.appendChild(doc.createTextNode("0"));
		recctrlout.appendChild(sentrec);
		
		Element Cursor = doc.createElement("Cursor");		
		recctrlout.appendChild(Cursor);
		
		Element binlength = doc.createElement("BinLength");
		binlength.appendChild(doc.createTextNode("0"));
		Cursor.appendChild(binlength);		
		
		Element BinData = doc.createElement("BinData");
		Cursor.appendChild(BinData);
		
		
		
				
	}
	
	
	public void createCMMNegativeHeader_RCDT(String tempo)
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
		spname.appendChild(doc.createTextNode("au.com.anz/retail"));
		anzacctiD.appendChild(spname);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankInfo);
		
		Element branchId = doc.createElement("BranchId");
		branchId.appendChild(doc.createTextNode("012345"));
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("AU"));
		bankInfo.appendChild(country);
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		accttrninqrs.appendChild(incdetail);
		
		Element recctrlout = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recctrlout);
		
			
		
		Element moretxnavail = doc.createElement("MoreTxnAvail");
		moretxnavail.appendChild(doc.createTextNode("N"));
		recctrlout.appendChild(moretxnavail);
		
		Element sentrec = doc.createElement("SentRec");
		sentrec.appendChild(doc.createTextNode("0"));
		recctrlout.appendChild(sentrec);
		
		Element Cursor = doc.createElement("Cursor");		
		recctrlout.appendChild(Cursor);
		
		Element binlength = doc.createElement("BinLength");
		binlength.appendChild(doc.createTextNode("0"));
		Cursor.appendChild(binlength);		
		
		Element BinData = doc.createElement("BinData");
		Cursor.appendChild(BinData);
		
		
		
		
	}
	
	public void createCMMNegativeResp_RCDT(String respStatus, String tempw)
	{
		 System.out.println(respStatus);	
	     if (respStatus.equals("INVALID-ACCT"))
		     {		
				   createCMMInvAccResponse_RCDT(tempw);
			  }
	     else if (respStatus.equals("CLOSED-ACCT"))
			  {		
				  createCMMCloAccResponse_RCDT(tempw);
			  }
	     else if (respStatus.equals("999-TRAN"))
		  {		
			  createCMM999TranResponse_RCDT(tempw);
		  }
	      else 
		  {		
	    	  System.out.println("No response defined in the rules");
	          createCMMPositiveResp_RCDT(tempw);
	 	  }
	}
	
	public void createCMMUnvAccResponse_RCDT(String tempo){
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
		spname.appendChild(doc.createTextNode("au.com.anz/retail"));
		anzacctiD.appendChild(spname);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankInfo);
		
		Element branchId = doc.createElement("BranchId");
		branchId.appendChild(doc.createTextNode("012345"));
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("AU"));
		bankInfo.appendChild(country);
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		accttrninqrs.appendChild(incdetail);
		
		Element recctrlout = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recctrlout);
		
			
		
		Element moretxnavail = doc.createElement("MoreTxnAvail");
		moretxnavail.appendChild(doc.createTextNode("N"));
		recctrlout.appendChild(moretxnavail);
		
		Element sentrec = doc.createElement("SentRec");
		sentrec.appendChild(doc.createTextNode("0"));
		recctrlout.appendChild(sentrec);
		
		Element Cursor = doc.createElement("Cursor");		
		recctrlout.appendChild(Cursor);
		
		Element binlength = doc.createElement("BinLength");
		binlength.appendChild(doc.createTextNode("0"));
		Cursor.appendChild(binlength);		
		
		Element BinData = doc.createElement("BinData");
		Cursor.appendChild(BinData);
		
				
	
	}
	


	public void createCMMInvAccResponse_RCDT(String tempw)
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
		spname.appendChild(doc.createTextNode("au.com.anz/retail"));
		anzacctiD.appendChild(spname);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankInfo);
		
		Element branchId = doc.createElement("BranchId");
		branchId.appendChild(doc.createTextNode("012345"));
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("AU"));
		bankInfo.appendChild(country);
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		accttrninqrs.appendChild(incdetail);
		
		Element recctrlout = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recctrlout);
		
			
		
		Element moretxnavail = doc.createElement("MoreTxnAvail");
		moretxnavail.appendChild(doc.createTextNode("N"));
		recctrlout.appendChild(moretxnavail);
		
		Element sentrec = doc.createElement("SentRec");
		sentrec.appendChild(doc.createTextNode("0"));
		recctrlout.appendChild(sentrec);
		
		Element Cursor = doc.createElement("Cursor");		
		recctrlout.appendChild(Cursor);
		
		Element binlength = doc.createElement("BinLength");
		binlength.appendChild(doc.createTextNode("0"));
		Cursor.appendChild(binlength);		
		
		Element BinData = doc.createElement("BinData");
		Cursor.appendChild(BinData);
		
		
		
	}

	public void  createCMMCloAccResponse_RCDT(String tempw)
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
		spname.appendChild(doc.createTextNode("au.com.anz/retail"));
		anzacctiD.appendChild(spname);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankInfo);
		
		Element branchId = doc.createElement("BranchId");
		branchId.appendChild(doc.createTextNode("012345"));
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("AU"));
		bankInfo.appendChild(country);
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		accttrninqrs.appendChild(incdetail);
		
		Element recctrlout = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recctrlout);
		
			
		
		Element moretxnavail = doc.createElement("MoreTxnAvail");
		moretxnavail.appendChild(doc.createTextNode("N"));
		recctrlout.appendChild(moretxnavail);
		
		Element sentrec = doc.createElement("SentRec");
		sentrec.appendChild(doc.createTextNode("0"));
		recctrlout.appendChild(sentrec);
		
		Element Cursor = doc.createElement("Cursor");		
		recctrlout.appendChild(Cursor);
		
		Element binlength = doc.createElement("BinLength");
		binlength.appendChild(doc.createTextNode("0"));
		Cursor.appendChild(binlength);		
		
		Element BinData = doc.createElement("BinData");
		Cursor.appendChild(BinData);
		
		
		

	}
	
	
	public void createCMM999TranResponse_RCDT(String tempw)
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
		spname.appendChild(doc.createTextNode("au.com.anz/retail"));
		anzacctiD.appendChild(spname);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzacctiD.appendChild(bankInfo);
		
		Element branchId = doc.createElement("BranchId");
		branchId.appendChild(doc.createTextNode("012345"));
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("AU"));
		bankInfo.appendChild(country);
		
		Element selrangedt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selrangedt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selrangedt.appendChild(today);
		
		
		Element incdetail = doc.createElement("IncDetail");
		accttrninqrs.appendChild(incdetail);
		
		Element recctrlout = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recctrlout);
		
			
		
		Element moretxnavail = doc.createElement("MoreTxnAvail");
		moretxnavail.appendChild(doc.createTextNode("N"));
		recctrlout.appendChild(moretxnavail);
		
		Element sentrec = doc.createElement("SentRec");
		sentrec.appendChild(doc.createTextNode("0"));
		recctrlout.appendChild(sentrec);
		
		Element Cursor = doc.createElement("Cursor");		
		recctrlout.appendChild(Cursor);
		
		Element binlength = doc.createElement("BinLength");
		binlength.appendChild(doc.createTextNode("0"));
		Cursor.appendChild(binlength);		
		
		Element BinData = doc.createElement("BinData");
		Cursor.appendChild(BinData);
		
		}
		
		
		
	}


