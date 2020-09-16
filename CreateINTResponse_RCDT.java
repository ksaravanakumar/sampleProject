package com.qa.stub;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.w3c.dom.Element;

public class CreateINTResponse_RCDT extends WriteResponse_RCDT {
	
	public void createINTHeader_RCDT()
	{
		accttrninqrs = doc.createElement("AcctTrnInqRs");
		doc.appendChild(accttrninqrs);		
		
		Element rquid = doc.createElement("RqUID");
		rquid.appendChild(doc.createTextNode(destReqId));
		accttrninqrs.appendChild(rquid);
		
		
		
	}
	
	
	public void createINTPositiveResp_RCDT(String tempw)
	{
		String postedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String postedTime = new SimpleDateFormat("hh:mm:ss.SS").format(new Date());
			
		
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
		branchId.appendChild(doc.createTextNode("00001"));
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("VN"));
		bankInfo.appendChild(country);
		
		Element recCtrlOut = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recCtrlOut);
		
		Element sentRec = doc.createElement("SentRec");
		sentRec.appendChild(doc.createTextNode("1"));
		recCtrlOut.appendChild(sentRec);
		
		
		Element bankAcctTrnRec = doc.createElement("BankAcctTrnRec");
		accttrninqrs.appendChild(bankAcctTrnRec);
		
		Element postedDt = doc.createElement("PostedDt");
		postedDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(postedDt);
		
		Element postedTm = doc.createElement("PostedTm");
		postedTm.appendChild(doc.createTextNode(postedTime));
		bankAcctTrnRec.appendChild(postedTm);
		
		Element trnDt = doc.createElement("TrnDt");
		trnDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(trnDt);
		
		Element trnId = doc.createElement("TrnId");
		trnId.appendChild(doc.createTextNode("0807201511003123100015"));
		bankAcctTrnRec.appendChild(trnId);
		
		Element desc1 = doc.createElement("Desc1");
		desc1.appendChild(doc.createTextNode("PAY+15070803UDCW+SIPAYRLCR973"));
		bankAcctTrnRec.appendChild(desc1);
		
		Element desc2 = doc.createElement("Desc2");
		bankAcctTrnRec.appendChild(desc2);
		
		Element desc3 = doc.createElement("Desc3");
		bankAcctTrnRec.appendChild(desc3);
		
		Element amt = doc.createElement("Amt");
		amt.appendChild(doc.createTextNode("-8801.00"));
		bankAcctTrnRec.appendChild(amt);
		
		Element runningBal = doc.createElement("RunningBal");
		runningBal.appendChild(doc.createTextNode("28331757598910.00"));
		bankAcctTrnRec.appendChild(runningBal);
		
		Element refNum = doc.createElement("RefNum");
		refNum.appendChild(doc.createTextNode("15070802QASK"));
		bankAcctTrnRec.appendChild(refNum);
		

	}
	
	public void createINTNegativeHeader_RCDT(String tempo)
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
	
	
	public void createINTNegativeResp_RCDT(String respStatus, String tempw)
	{
		 System.out.println(respStatus);	
	     if (respStatus.equals("INVALID-ACCT"))
		     {		
				   createINTInvAccResponse_RCDT(tempw);
			  }
	     else if (respStatus.equals("CLOSED-ACCT"))
			  {		
				  createINTCloAccResponse_RCDT(tempw);
			  }
	      else 
		  {		
	    	  System.out.println("No response defined in the rules");
	          createINTPositiveResp_RCDT(tempw);
	 	  }
	}

	public void createINTUnvAccResponse_RCDT(String tempo){
		Element anzAcctID = doc.createElement("ANZAcctId");
		accttrninqrs.appendChild(anzAcctID);

		Element acctId = doc.createElement("AcctId");
		acctId.appendChild(doc.createTextNode(tempo));
		anzAcctID.appendChild(acctId);

		Element acctCurCode = doc.createElement("AcctCurCode");
		acctCurCode.appendChild(doc.createTextNode("VNY"));
		anzAcctID.appendChild(acctCurCode);
		
		Element sPName = doc.createElement("SPName");
		sPName.appendChild(doc.createTextNode("vn.com.anz/markets"));
		anzAcctID.appendChild(sPName);
		
		Element bankInfo = doc.createElement("BankInfo");
		anzAcctID.appendChild(bankInfo);
		
		Element branchId = doc.createElement("BranchId");
		branchId.appendChild(doc.createTextNode("VNR"));
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("VN"));
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
	
	
	
	public void createINTInvAccResponse_RCDT(String tempw)
	{
		String postedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String postedTime = new SimpleDateFormat("hh:mm:ss.SS").format(new Date());
			
		
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
		branchId.appendChild(doc.createTextNode("00001"));
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("VN"));
		bankInfo.appendChild(country);
		
		Element recCtrlOut = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recCtrlOut);
		
		Element sentRec = doc.createElement("SentRec");
		sentRec.appendChild(doc.createTextNode("1"));
		recCtrlOut.appendChild(sentRec);
		
		
		Element bankAcctTrnRec = doc.createElement("BankAcctTrnRec");
		accttrninqrs.appendChild(bankAcctTrnRec);
		
		Element postedDt = doc.createElement("PostedDt");
		postedDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(postedDt);
		
		Element postedTm = doc.createElement("PostedTm");
		postedTm.appendChild(doc.createTextNode(postedTime));
		bankAcctTrnRec.appendChild(postedTm);
		
		Element trnDt = doc.createElement("TrnDt");
		trnDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(trnDt);
		
		Element trnId = doc.createElement("TrnId");
		trnId.appendChild(doc.createTextNode("0807201511003123100015"));
		bankAcctTrnRec.appendChild(trnId);
		
		Element desc1 = doc.createElement("Desc1");
		desc1.appendChild(doc.createTextNode("PAY+15070803UDCW+SIPAYRLCR973"));
		bankAcctTrnRec.appendChild(desc1);
		
		Element desc2 = doc.createElement("Desc2");
		bankAcctTrnRec.appendChild(desc2);
		
		Element desc3 = doc.createElement("Desc3");
		bankAcctTrnRec.appendChild(desc3);
		
		Element amt = doc.createElement("Amt");
		amt.appendChild(doc.createTextNode("-8801.00"));
		bankAcctTrnRec.appendChild(amt);
		
		Element runningBal = doc.createElement("RunningBal");
		runningBal.appendChild(doc.createTextNode("28331757598910.00"));
		bankAcctTrnRec.appendChild(runningBal);
		
		Element refNum = doc.createElement("RefNum");
		refNum.appendChild(doc.createTextNode("15070802QASK"));
		bankAcctTrnRec.appendChild(refNum);
		
		
	}

	public void  createINTCloAccResponse_RCDT(String tempw)
	{
		String postedDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String postedTime = new SimpleDateFormat("hh:mm:ss.SS").format(new Date());
			
		
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
		branchId.appendChild(doc.createTextNode("00001"));
		bankInfo.appendChild(branchId);

		Element country = doc.createElement("Country");
		country.appendChild(doc.createTextNode("VN"));
		bankInfo.appendChild(country);
		
		Element recCtrlOut = doc.createElement("RecCtrlOut");
		accttrninqrs.appendChild(recCtrlOut);
		
		Element sentRec = doc.createElement("SentRec");
		sentRec.appendChild(doc.createTextNode("1"));
		recCtrlOut.appendChild(sentRec);
		
		
		Element bankAcctTrnRec = doc.createElement("BankAcctTrnRec");
		accttrninqrs.appendChild(bankAcctTrnRec);
		
		Element postedDt = doc.createElement("PostedDt");
		postedDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(postedDt);
		
		Element postedTm = doc.createElement("PostedTm");
		postedTm.appendChild(doc.createTextNode(postedTime));
		bankAcctTrnRec.appendChild(postedTm);
		
		Element trnDt = doc.createElement("TrnDt");
		trnDt.appendChild(doc.createTextNode(postedDate));
		bankAcctTrnRec.appendChild(trnDt);
		
		Element trnId = doc.createElement("TrnId");
		trnId.appendChild(doc.createTextNode("0807201511003123100015"));
		bankAcctTrnRec.appendChild(trnId);
		
		Element desc1 = doc.createElement("Desc1");
		desc1.appendChild(doc.createTextNode("PAY+15070803UDCW+SIPAYRLCR973"));
		bankAcctTrnRec.appendChild(desc1);
		
		Element desc2 = doc.createElement("Desc2");
		bankAcctTrnRec.appendChild(desc2);
		
		Element desc3 = doc.createElement("Desc3");
		bankAcctTrnRec.appendChild(desc3);
		
		Element amt = doc.createElement("Amt");
		amt.appendChild(doc.createTextNode("-8801.00"));
		bankAcctTrnRec.appendChild(amt);
		
		Element runningBal = doc.createElement("RunningBal");
		runningBal.appendChild(doc.createTextNode("28331757598910.00"));
		bankAcctTrnRec.appendChild(runningBal);
		
		Element refNum = doc.createElement("RefNum");
		refNum.appendChild(doc.createTextNode("15070802QASK"));
		bankAcctTrnRec.appendChild(refNum);
		
		
	}

}
