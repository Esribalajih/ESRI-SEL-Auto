package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is a Esri Cherwell SelfService Portal
 * @author Thenmozhi
 */

public class CherwellBeta_DashboardPage extends ESRIWrappers{
	
	public CherwellBeta_DashboardPage() throws Throwable{
		waitForPageLoad(5);
		if(!VerifyTitle("Self-Service"))
			Reporter.reportStep("This is not a Esri Cherwell Self Service Dashboard Page", "FAIL");
		else
			System.out.println("Esri Cherwell Self Service Dashboard Page Launched Successfully!");
	}
	
	public CherwellBeta_DashboardPage verifyDashBoardHeader(String header) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CherwellDashboardPage.VerifyDashBoardPageHeader.xpath"),header);
		return this;
	}

	public CherwellBeta_DashboardPage clickIncidentTab(String tab) throws Throwable{
		waitForPageLoad(3);
		clickButtonByXpath(prop.getProperty("CherwellDashboardPage.IncidentTab.xpath"),tab);
		return this;
	}
	
	public Cherwell_SS_IncidentPage SelectReportANewIncidentOption(String option) throws Throwable{
		waitForPageLoad(3);
		clickButtonByXpath(prop.getProperty("CherwellDashboardPage.ReportANewIncidentButton.xpath"),option);
		return new Cherwell_SS_IncidentPage();
	}
	
	public CherwellBeta_DashboardPage ClickSearchTypeMenu(String data) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellDashboardPage.SearchTypeMenuButton.xpath"),data);
		return this;
	}
	
	public CherwellBeta_DashboardPage SelectQuickSearch(String QuickSearch) throws Throwable{
		selectByXpathWithText(prop.getProperty("CherwellDashboardPage.QuickSearch.xpath"),QuickSearch);
		return this;
	}
	
	public CherwellBeta_DashboardPage SelectSearchIncident(String Incident) throws Throwable{
		selectByXpathWithText(prop.getProperty("CherwellDashboardPage.SearchIncident.xpath"),Incident);
		return this;
	}
	
	public CherwellBeta_DashboardPage SelectSearchChangeRequest(String ChangeRequest) throws Throwable{
		selectByXpathWithText(prop.getProperty("CherwellDashboardPage.SearchChangeRequest.xpath"),ChangeRequest);
		return this;
	}
	
	public CherwellBeta_DashboardPage SelectSearchComputerRequest(String ComputerRequest) throws Throwable{
		selectByXpathWithText(prop.getProperty("CherwellDashboardPage.SearchComputerRequest.xpath"),ComputerRequest);
		return this;
	}
	
	public CherwellBeta_DashboardPage enterSearchText(String keyword) throws Throwable{
		enterByXpath(prop.getProperty("CherwellDashboardPage.SearchTextBox.xpath"), keyword);
		return this;
	}
	
	//Keyword=Computer Requests
	public Cherwell_SS_ComputerRequest VerifyCRHeader(String keyword) throws Throwable{
		VerifyTextByCssSelector(prop.getProperty("CherwellDashboardPage.CRSearchResultHeader.CssSelector"), keyword);
		return new Cherwell_SS_ComputerRequest();
	}
	
	public CherwellBeta_DashboardPage ClickGo(String GoButton) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellDashboardPage.GoButton.xpath"),GoButton);
		return this;
	}
	
}
