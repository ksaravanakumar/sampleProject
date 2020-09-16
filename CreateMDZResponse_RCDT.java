package com.qa.stub;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.w3c.dom.Element;

public class CreateMDZResponse_RCDT extends WriteResponse_RCDT {
	
	public void createMDZHeader_RCDT()
	{
		
		accttrninqrs = doc.createElement("AcctTrnInqRs");
		doc.appendChild(accttrninqrs);
		
		Element status = doc.createElement("Status");
		accttrninqrs.appendChild(status);
		
		Element statusCode = doc.createElement("StatusCode");
		statusCode.appendChild(doc.createTextNode("0"));
		status.appendChild(statusCode);
				
		Element serverstatusCode = doc.createElement("ServerStatusCode");
		status.appendChild(serverstatusCode);
		
		Element severity = doc.createElement("Severity");
		severity.appendChild(doc.createTextNode("Info"));
		status.appendChild(severity);
		
		Element statusdesc = doc.createElement("StatusDesc");
		statusdesc.appendChild(doc.createTextNode("Success"));
		status.appendChild(statusdesc);
		
		Element rquid = doc.createElement("RqUID");
		rquid.appendChild(doc.createTextNode("df44c1a0-7c45-4537-9fa5-220df33f"));
		accttrninqrs.appendChild(rquid);
		
	}


	public void createMDZPositiveResp_RCDT(String tempw)
	{
		
		String postedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
				
		Element anzAcctID = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzAcctID);

		Element acctId = doc.createElement("AcctId");
		acctId.appendChild(doc.createTextNode(tempw));
		anzAcctID.appendChild(acctId);

		Element acctCurCode = doc.createElement("AcctCurCode");
		acctCurCode.appendChild(doc.createTextNode(acctCurrentCode));
		anzAcctID.appendChild(acctCurCode);
		
		Element sPName = doc.createElement("SPName");
		sPName.appendChild(doc.createTextNode(spnameCountry+".com.anz/markets"));
		anzAcctID.appendChild(sPName);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzAcctID.appendChild(bankInfo);
		
		Element branchId = doc.createElement("BranchId");
		branchId.appendChild(doc.createTextNode(branchidName));
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode(serviceCountry));
		bankInfo.appendChild(country);
		
		Element selRangeDt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selRangeDt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selRangeDt.appendChild(today);
		
		Element incDetail = doc.createElement("IncDetail");
		accttrninqrs.appendChild(incDetail);
		
		Element recCtrlOut = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recCtrlOut);
		
		Element matchedRec = doc.createElement("MatchedRec");
		matchedRec.appendChild(doc.createTextNode("1"));
		recCtrlOut.appendChild(matchedRec);
		
		Element sentRec = doc.createElement("SentRec");
		sentRec.appendChild(doc.createTextNode("1"));
		recCtrlOut.appendChild(sentRec);
				
	
		Element bankAcctTrnRec = doc.createElement("BankAcctTrnRec");
		accttrninqrs.appendChild(bankAcctTrnRec);
		
		Element postedDt = doc.createElement("PostedDt");
		postedDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(postedDt);
		
		Element trnDt = doc.createElement("TrnDt");
		trnDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(trnDt);
				
		Element desc1 = doc.createElement("Desc1");
		desc1.appendChild(doc.createTextNode("BKT+004921637+BENE10009BKTa+MDZTEST003"));
		bankAcctTrnRec.appendChild(desc1);
		
		Element amt = doc.createElement("Amt");
		amt.appendChild(doc.createTextNode("-431.03"));
		bankAcctTrnRec.appendChild(amt);
		
		Element runningBal = doc.createElement("RunningBal");
		runningBal.appendChild(doc.createTextNode("100237253.88"));
		bankAcctTrnRec.appendChild(runningBal);
		
		Element refNum = doc.createElement("RefNum");
		bankAcctTrnRec.appendChild(refNum);
		
		
		
		
	}
	
	
	public void createMDZNegativeHeader_RCDT(String tempo)
	{
		
		accttrninqrs = doc.createElement("AcctTrnInqRs");
		doc.appendChild(accttrninqrs);
		
		Element status = doc.createElement("Status");
		accttrninqrs.appendChild(status);
		
		Element statusCode = doc.createElement("StatusCode");
		statusCode.appendChild(doc.createTextNode("2300"));
		status.appendChild(statusCode);
				
		Element serverstatusCode = doc.createElement("ServerStatusCode");
		status.appendChild(serverstatusCode);
		
		Element severity = doc.createElement("Severity");
		severity.appendChild(doc.createTextNode("Error"));
		status.appendChild(severity);
		
		Element statusdesc = doc.createElement("StatusDesc");
		statusdesc.appendChild(doc.createTextNode("Invalid Source Account"+tempo));
		status.appendChild(statusdesc);
		
		Element rquid = doc.createElement("RqUID");
		rquid.appendChild(doc.createTextNode("df44c1a0-7c45-4537-9fa5-220df33f"));
		accttrninqrs.appendChild(rquid);
		
	}


	public void createMDZNegativeResp_RCDT(String respStatus, String tempw)
	{
		 System.out.println(respStatus);	
	     if (respStatus.equals("INVALID-ACCT"))
		     {		
				   createMDZInvAccResponse_RCDT(tempw);
			  }
	     else if (respStatus.equals("CLOSED-ACCT"))
			  {		
				  createMDZCloAccResponse_RCDT(tempw);
			  }
	    
	     else if (respStatus.equals("NO-TRAN"))
		  {		
	    	 createMDZInvAccResponse_RCDT(tempw);
		  }
		  
		  
	      else 
		  {		
	    	  System.out.println("No response defined in the rules");
	          createMDZPositiveResp_RCDT(tempw);
	 	  }
	}


	public void createMDZInvAccResponse_RCDT(String tempw)
	{
		
		
			
		
		Element anzAcctID = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzAcctID);

		Element acctId = doc.createElement("AcctId");
		acctId.appendChild(doc.createTextNode(tempw));
		anzAcctID.appendChild(acctId);

		Element acctCurCode = doc.createElement("AcctCurCode");
		acctCurCode.appendChild(doc.createTextNode("CNY"));
		anzAcctID.appendChild(acctCurCode);
		
		Element sPName = doc.createElement("SPName");
		sPName.appendChild(doc.createTextNode("CNY"));
		anzAcctID.appendChild(sPName);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzAcctID.appendChild(bankInfo);
		
		Element branchId = doc.createElement("BranchId");
		branchId.appendChild(doc.createTextNode("CNR"));
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("CN"));
		bankInfo.appendChild(country);
		
		Element selRangeDt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selRangeDt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selRangeDt.appendChild(today);
		
		Element incDetail = doc.createElement("IncDetail");
		accttrninqrs.appendChild(incDetail);
		
		Element recCtrlOut = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recCtrlOut);
		
		Element matchedRec = doc.createElement("MatchedRec");
		matchedRec.appendChild(doc.createTextNode("0"));
		recCtrlOut.appendChild(matchedRec);
		
		Element sentRec = doc.createElement("SentRec");
		sentRec.appendChild(doc.createTextNode("0"));
		recCtrlOut.appendChild(sentRec);
				
	
		
	}
	
	
	public void createMDZUnvAccResponse_RCDT(String tempz){
		Element anzAcctID = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzAcctID);

		Element acctId = doc.createElement("AcctId");
		acctId.appendChild(doc.createTextNode(tempz));
		anzAcctID.appendChild(acctId);

		Element acctCurCode = doc.createElement("AcctCurCode");
		acctCurCode.appendChild(doc.createTextNode("SGD"));
		anzAcctID.appendChild(acctCurCode);
		
		Element sPName = doc.createElement("SPName");
		sPName.appendChild(doc.createTextNode("sg.com.anz/markets"));
		anzAcctID.appendChild(sPName);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzAcctID.appendChild(bankInfo);
		
		Element branchId = doc.createElement("BranchId");
		branchId.appendChild(doc.createTextNode("SGB"));
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("SG"));
		bankInfo.appendChild(country);
		
		Element selRangeDt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selRangeDt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selRangeDt.appendChild(today);
		
		Element incDetail = doc.createElement("IncDetail");
		accttrninqrs.appendChild(incDetail);
		
		Element recCtrlOut = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recCtrlOut);
		
		Element matchedRec = doc.createElement("MatchedRec");
		matchedRec.appendChild(doc.createTextNode("0"));
		recCtrlOut.appendChild(matchedRec);
		
		Element sentRec = doc.createElement("SentRec");
		sentRec.appendChild(doc.createTextNode("0"));
		recCtrlOut.appendChild(sentRec);
				
	
	}

	public void  createMDZCloAccResponse_RCDT(String tempw)
	{
		String postedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		
			
		
		Element anzAcctID = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzAcctID);

		Element acctId = doc.createElement("AcctId");
		acctId.appendChild(doc.createTextNode(tempw));
		anzAcctID.appendChild(acctId);

		Element acctCurCode = doc.createElement("AcctCurCode");
		acctCurCode.appendChild(doc.createTextNode("CNY"));
		anzAcctID.appendChild(acctCurCode);
		
		Element sPName = doc.createElement("SPName");
		sPName.appendChild(doc.createTextNode("cn.com.anz/markets"));
		anzAcctID.appendChild(sPName);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzAcctID.appendChild(bankInfo);
		
		Element branchId = doc.createElement("BranchId");
		branchId.appendChild(doc.createTextNode("CNR"));
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("CN"));
		bankInfo.appendChild(country);
		
		Element selRangeDt = doc.createElement("SelRangeDt");
		accttrninqrs.appendChild(selRangeDt);
		
		Element today = doc.createElement("Today");
		today.appendChild(doc.createTextNode("1"));
		selRangeDt.appendChild(today);
		
		Element incDetail = doc.createElement("IncDetail");
		accttrninqrs.appendChild(incDetail);
		
		Element recCtrlOut = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recCtrlOut);
		
		Element matchedRec = doc.createElement("MatchedRec");
		matchedRec.appendChild(doc.createTextNode("1"));
		recCtrlOut.appendChild(matchedRec);
		
		Element sentRec = doc.createElement("SentRec");
		sentRec.appendChild(doc.createTextNode("1"));
		recCtrlOut.appendChild(sentRec);
				
	
		Element bankAcctTrnRec = doc.createElement("BankAcctTrnRec");
		accttrninqrs.appendChild(bankAcctTrnRec);
		
		Element postedDt = doc.createElement("PostedDt");
		postedDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(postedDt);
		
		Element trnDt = doc.createElement("TrnDt");
		trnDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(trnDt);
				
		Element desc1 = doc.createElement("Desc1");
		desc1.appendChild(doc.createTextNode("BKT+004921637+BENE10009BKTa+MDZTEST003"));
		bankAcctTrnRec.appendChild(desc1);
		
		Element amt = doc.createElement("Amt");
		amt.appendChild(doc.createTextNode("-431.03"));
		bankAcctTrnRec.appendChild(amt);
		
		Element runningBal = doc.createElement("RunningBal");
		runningBal.appendChild(doc.createTextNode("100237253.88"));
		bankAcctTrnRec.appendChild(runningBal);
		
		Element refNum = doc.createElement("RefNum");
		bankAcctTrnRec.appendChild(refNum);
		
	
	}
	
	


	
	
	
	
	}




