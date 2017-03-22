/**
 * 
 */
package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author thenmozhis
 *
 */
public class Cherwell_SS_ComputerRequest extends ESRIWrappers{
	
	public Cherwell_SS_ComputerRequest() throws Throwable{
		if(!VerifyTitle("Self-Service"))
			Reporter.reportStep("This is not a Esri Cherwell SelfService Computer Request Page", "FAIL");
		else
			System.out.println("SelfService Computer Request Page Launched Successfully!");
	}
	
	public Cherwell_SS_ComputerRequest clickRequest(String tab) throws Throwable{
		clickButtonByXpath(prop.getProperty("Cherwell_SS_ComputerRequest.RequestTab.xpath"),tab);
		return this;
	}
	
	public Cherwell_SS_ComputerRequest clickComputerRequest(String option) throws Throwable{
		clickButtonByXpath(prop.getProperty("Cherwell_SS_ComputerRequest.SelectComputerRequestOption.xpath"),option);
		return this;
	}
	
	//keyword=R12323, Approved, Thiruvannamee Thenmozhi, Owned By Angie Sanchez
	public Cherwell_SS_ComputerRequest VerifyCRSearchResult(String keyword) throws Throwable{
		VerifyTextByXpath(prop.getProperty("Cherwell_SS_ComputerRequest.CRSearchResultValue.xpath"), keyword);
		return this;
	}
	
	public Cherwell_SS_ComputerRequest ClickComputerRequest(String link) throws Throwable{
		clickButtonByXpath(prop.getProperty("Cherwell_SS_ComputerRequest.CRSearchResultValue.xpath"), link);
		return this;
	}
	
	public Cherwell_SS_ComputerRequest ClickExpandPrev(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("Cherwell_SS_ComputerRequest.ExpandPrev.xpath"), Btn);
		return this;
	}

	public Cherwell_SS_ComputerRequest ClickEmailOrNotes(String tab) throws Throwable{
		clickButtonByXpath(prop.getProperty("Cherwell_SS_ComputerRequest.EmailOrNotes.xpath"), tab);
		return this;
	}
	
	//data=Email / Notes
	public Cherwell_SS_ComputerRequest VerifyEmailOrNotes(String data) throws Throwable{
		VerifyTextByXpath(prop.getProperty("Cherwell_SS_ComputerRequest.EmailOrNotes.xpath"), data);
		return this;
	}
	
	public Cherwell_SS_ComputerRequest ClickJournals(String tab) throws Throwable{
		clickButtonByXpath(prop.getProperty("Cherwell_SS_ComputerRequest.Journals.xpath"), tab);
		return this;
	}
	
	//data=Journals
	public Cherwell_SS_ComputerRequest VerifyJournals(String data) throws Throwable{
		VerifyTextByXpath(prop.getProperty("Cherwell_SS_ComputerRequest.Journals.xpath"), data);
		return this;
	}
	
	public Cherwell_SS_ComputerRequest ClickCollapseDown(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("Cherwell_SS_ComputerRequest.CollapseDown.xpath"), Btn);
		return this;
	}

}
