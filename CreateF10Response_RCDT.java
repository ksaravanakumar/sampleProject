package com.qa.stub;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.w3c.dom.Element;

public class CreateF10Response_RCDT extends WriteResponse_RCDT {
	public void createF10Header_RCDT()
	{
		
		accttrninqrs = doc.createElement("AcctTrnInqRs");
		doc.appendChild(accttrninqrs);	
		
		Element rquid = doc.createElement("RqUID");
		rquid.appendChild(doc.createTextNode(destReqId));
		accttrninqrs.appendChild(rquid);
		
	}
	
	
	public void createF10PositiveResp_RCDT(String tempw)
	{
		String postedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String formatTime = new SimpleDateFormat("hh:mm:ss").format(new Date()); 
		
		Element anzAcctID = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzAcctID);

		Element acctId = doc.createElement("AcctId");
		acctId.appendChild(doc.createTextNode(tempw));
		anzAcctID.appendChild(acctId);

		Element acctCurCode = doc.createElement("AcctCurCode");
		acctCurCode.appendChild(doc.createTextNode("VND"));
		anzAcctID.appendChild(acctCurCode);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzAcctID.appendChild(bankInfo);
		
		Element branchId = doc.createElement("BranchId");
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("HK"));
		bankInfo.appendChild(country);
		
		Element recCtrlOut = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recCtrlOut);
		
		Element sentRec = doc.createElement("SentRec");
		sentRec.appendChild(doc.createTextNode("1"));
		recCtrlOut.appendChild(sentRec);
		
		
		Element bankAcctTrnRec = doc.createElement("BankAcctTrnRec");
		accttrninqrs.appendChild(bankAcctTrnRec);
		
		Element postedDtTm = doc.createElement("PostedDtTm");
		postedDtTm.appendChild(doc.createTextNode(postedDate+"T"+formatTime));
		bankAcctTrnRec.appendChild(postedDtTm);		
		
		Element postedDt = doc.createElement("PostedDt");
		postedDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(postedDt);
		
		Element trnDt = doc.createElement("TrnDt");
		trnDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(trnDt);
		
		Element trnId = doc.createElement("TrnId");
		trnId.appendChild(doc.createTextNode("HK133"));
		bankAcctTrnRec.appendChild(trnId);
		
		Element trnCode = doc.createElement("TrnCode");
		trnCode.appendChild(doc.createTextNode("DCHG"));
		bankAcctTrnRec.appendChild(trnCode);		
		
		Element desc1 = doc.createElement("Desc1");
		desc1.appendChild(doc.createTextNode("CHG+DATAENTRY+HKPITTUSD+004071932"));
		bankAcctTrnRec.appendChild(desc1);
		
		Element desc2 = doc.createElement("Desc2");
		bankAcctTrnRec.appendChild(desc2);
		
		Element desc3 = doc.createElement("Desc3");
		bankAcctTrnRec.appendChild(desc3);
		
		Element amt = doc.createElement("Amt");
		amt.appendChild(doc.createTextNode("-73"));
		bankAcctTrnRec.appendChild(amt);
		
		Element runningBal = doc.createElement("RunningBal");
		runningBal.appendChild(doc.createTextNode("9995505533.879999"));
		bankAcctTrnRec.appendChild(runningBal);
		
		Element refNum = doc.createElement("RefNum");
		refNum.appendChild(doc.createTextNode("045752865"));
		bankAcctTrnRec.appendChild(refNum);
		
		
				
	}
	
	
	public void createF10NegativeHeader_RCDT(String tempo)
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
	
	public void createF10NegativeResp_RCDT(String respStatus, String tempw)
	{
		 System.out.println(respStatus);	
	     if (respStatus.equals("INVALID-ACCT"))
		     {		
				   createF10InvAccResponse_RCDT(tempw);
			  }
	     else if (respStatus.equals("CLOSED-ACCT"))
			  {		
				  createF10CloAccResponse_RCDT(tempw);
			  }
	     else if (respStatus.equals("999-TRAN"))
		  {		
			  createMDZ999TranResponse_RCDT(tempw);
		  }
	      else 
		  {		
	    	  System.out.println("No response defined in the rules");
	          createF10PositiveResp_RCDT(tempw);
	 	  }
	}
	
	public void createF10UnvAccResponse_RCDT(String tempo){
		Element anzAcctID = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzAcctID);

		Element acctId = doc.createElement("AcctId");
		acctId.appendChild(doc.createTextNode(tempo));
		anzAcctID.appendChild(acctId);

		Element acctCurCode = doc.createElement("AcctCurCode");
		acctCurCode.appendChild(doc.createTextNode("HKY"));
		anzAcctID.appendChild(acctCurCode);
		
		Element sPName = doc.createElement("SPName");
		sPName.appendChild(doc.createTextNode("hk.com.anz/markets"));
		anzAcctID.appendChild(sPName);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzAcctID.appendChild(bankInfo);
		
		Element branchId = doc.createElement("BranchId");
		branchId.appendChild(doc.createTextNode("HKR"));
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("HK"));
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
	


	public void createF10InvAccResponse_RCDT(String tempw)
	{
		String postedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String formatTime = new SimpleDateFormat("hh:mm:ss").format(new Date()); 
		
		Element anzAcctID = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzAcctID);

		Element acctId = doc.createElement("AcctId");
		acctId.appendChild(doc.createTextNode(tempw));
		anzAcctID.appendChild(acctId);

		Element acctCurCode = doc.createElement("AcctCurCode");
		acctCurCode.appendChild(doc.createTextNode("VND"));
		anzAcctID.appendChild(acctCurCode);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzAcctID.appendChild(bankInfo);
		
		Element branchId = doc.createElement("BranchId");
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("HK"));
		bankInfo.appendChild(country);
		
		Element recCtrlOut = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recCtrlOut);
		
		Element sentRec = doc.createElement("SentRec");
		sentRec.appendChild(doc.createTextNode("1"));
		recCtrlOut.appendChild(sentRec);
		
		
		Element bankAcctTrnRec = doc.createElement("BankAcctTrnRec");
		accttrninqrs.appendChild(bankAcctTrnRec);
		
		Element postedDtTm = doc.createElement("PostedDtTm");
		postedDtTm.appendChild(doc.createTextNode(postedDate+"T"+formatTime));
		bankAcctTrnRec.appendChild(postedDtTm);		
		
		Element postedDt = doc.createElement("PostedDt");
		postedDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(postedDt);
		
		Element trnDt = doc.createElement("TrnDt");
		trnDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(trnDt);
		
		Element trnId = doc.createElement("TrnId");
		trnId.appendChild(doc.createTextNode("HK133"));
		bankAcctTrnRec.appendChild(trnId);
		
		Element trnCode = doc.createElement("TrnCode");
		trnCode.appendChild(doc.createTextNode("DCHG"));
		bankAcctTrnRec.appendChild(trnCode);		
		
		Element desc1 = doc.createElement("Desc1");
		desc1.appendChild(doc.createTextNode("CHG+DATAENTRY+HKPITTUSD+004071932"));
		bankAcctTrnRec.appendChild(desc1);
		
		Element desc2 = doc.createElement("Desc2");
		bankAcctTrnRec.appendChild(desc2);
		
		Element desc3 = doc.createElement("Desc3");
		bankAcctTrnRec.appendChild(desc3);
		
		Element amt = doc.createElement("Amt");
		amt.appendChild(doc.createTextNode("-73"));
		bankAcctTrnRec.appendChild(amt);
		
		Element runningBal = doc.createElement("RunningBal");
		runningBal.appendChild(doc.createTextNode("9995505533.879999"));
		bankAcctTrnRec.appendChild(runningBal);
		
		Element refNum = doc.createElement("RefNum");
		refNum.appendChild(doc.createTextNode("045752865"));
		bankAcctTrnRec.appendChild(refNum);
		
		
	}

	public void  createF10CloAccResponse_RCDT(String tempw)
	{
		String postedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String formatTime = new SimpleDateFormat("hh:mm:ss").format(new Date()); 
		
		Element anzAcctID = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzAcctID);

		Element acctId = doc.createElement("AcctId");
		acctId.appendChild(doc.createTextNode(tempw));
		anzAcctID.appendChild(acctId);

		Element acctCurCode = doc.createElement("AcctCurCode");
		acctCurCode.appendChild(doc.createTextNode("VND"));
		anzAcctID.appendChild(acctCurCode);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzAcctID.appendChild(bankInfo);
		
		Element branchId = doc.createElement("BranchId");
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("HK"));
		bankInfo.appendChild(country);
		
		Element recCtrlOut = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recCtrlOut);
		
		Element sentRec = doc.createElement("SentRec");
		sentRec.appendChild(doc.createTextNode("3"));
		recCtrlOut.appendChild(sentRec);
		
		
		Element bankAcctTrnRec = doc.createElement("BankAcctTrnRec");
		accttrninqrs.appendChild(bankAcctTrnRec);
		
		Element postedDtTm = doc.createElement("PostedDtTm");
		postedDtTm.appendChild(doc.createTextNode(postedDate+"T"+formatTime));
		bankAcctTrnRec.appendChild(postedDtTm);		
		
		Element postedDt = doc.createElement("PostedDt");
		postedDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(postedDt);
		
		Element trnDt = doc.createElement("TrnDt");
		trnDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(trnDt);
		
		Element trnId = doc.createElement("TrnId");
		trnId.appendChild(doc.createTextNode("HK133"));
		bankAcctTrnRec.appendChild(trnId);
		
		Element trnCode = doc.createElement("TrnCode");
		trnCode.appendChild(doc.createTextNode("DCHG"));
		bankAcctTrnRec.appendChild(trnCode);		
		
		Element desc1 = doc.createElement("Desc1");
		desc1.appendChild(doc.createTextNode("CHG+DATAENTRY+HKPITTUSD+004071932"));
		bankAcctTrnRec.appendChild(desc1);
		
		Element desc2 = doc.createElement("Desc2");
		bankAcctTrnRec.appendChild(desc2);
		
		Element desc3 = doc.createElement("Desc3");
		bankAcctTrnRec.appendChild(desc3);
		
		Element amt = doc.createElement("Amt");
		amt.appendChild(doc.createTextNode("-73"));
		bankAcctTrnRec.appendChild(amt);
		
		Element runningBal = doc.createElement("RunningBal");
		runningBal.appendChild(doc.createTextNode("9995505533.879999"));
		bankAcctTrnRec.appendChild(runningBal);
		
		Element refNum = doc.createElement("RefNum");
		refNum.appendChild(doc.createTextNode("045752865"));
		bankAcctTrnRec.appendChild(refNum);
		
		

	}
	
	
	public void createMDZ999TranResponse_RCDT(String tempw)
	{
		
		System.out.println(spnameCountry+acctCurrentCode+acctCurrentCode+branchidName+serviceCountry);
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
		matchedRec.appendChild(doc.createTextNode("999"));
		recCtrlOut.appendChild(matchedRec);
		
		Element sentRec = doc.createElement("SentRec");
		sentRec.appendChild(doc.createTextNode("999"));
		recCtrlOut.appendChild(sentRec);
				
	
		for(int i=0;i<999;i++)
		{
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

}
