package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the ETC time card Home page for Exempt User View
 * @author balajih
 *
 */
public class ETCTimeCardExemptViewPage extends ESRIWrappers{
	
	public ETCTimeCardExemptViewPage() throws Throwable{
		System.out.println("ETCTimeCardViewPage");
		waitForPageLoad(10);
		if(!VerifyTitle("Esri Timecard")){
			Reporter.reportStep("Esri Timecard Page is not launched successfully", "FAIL");
		}
		else
			System.out.println("Esri Timecard Page is launched successfully");
	}
	
	public ETCTimeCardExemptViewPage verifyETCTimeCardHeader(String displayName) throws Throwable{
		waitForPageLoad(10);
		System.out.println("verifyETCTimeCardView");
		VerifyTextByXpath(prop.getProperty("ETCTimeCardExemptViewPage.TimecardHeader.xpath"), displayName);
		return this;
	}
	
	public ETCTimeCardExemptViewPage verifyETCUsername(String displayName) throws Throwable{
		VerifyTextByXpath(prop.getProperty("ETCTimeCardExemptViewPage.UserDisplayName.xpath"), displayName);
		return this;
	}
	
	public ETCTimeCardExemptViewPage clickTimesheetTab(String tab) throws Throwable{
		if(checkElementIsEnabledByXpath(prop.getProperty("ETCTimeCardExemptViewPage.TimesheetTab.linktext")))
			clickButtonByXpath(prop.getProperty("ETCTimeCardExemptViewPage.TimesheetTab.linktext"), tab);
		else
			System.out.println("Timesheet tab is already selected");
		return this;
	}
	
	public ETCTimeCardExemptViewPage clickQueryTab(String tab) throws Throwable{
		if(!checkElementIsEnabledByXpath(prop.getProperty("ETCTimeCardExemptViewPage.QueryTab.linktext")))
			clickButtonByXpath(prop.getProperty("ETCTimeCardExemptViewPage.QueryTab.linktext"), tab);
		else
			System.out.println("Query tab is already selected");
		return this;
	}
	
	public ETCTimeCardExemptViewPage clickNextPeriodPickerButton(String button) throws Throwable{
		if(VerifyTextByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.TimeSheetStatus.xpath"), "Submitted")){
			clickButtonByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.Selectnext.xpath"), button);
			System.out.println("Timesheet is Submitted already. Click Next Button.");
		}
		else
			System.out.println("Timesheet status is Open");
		return this;
	}
	
	public ETCTimeCardExemptViewPage clickPreviousPeriodPickerButton(String button) throws Throwable{
			clickButtonByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.Selectprevious.xpath"), button);
		return this;
	}	
	
	public ETCTimeCardExemptUserOverViewPage clickOverviewtab(String toggle) throws Throwable{
		System.out.println("------"+checkElementIsEnabledByXpath(prop.getProperty("ETCTimeCardExemptUserOverViewPage.Overviewtab.xpath")));
		if(!checkElementIsEnabledByXpath(prop.getProperty("ETCTimeCardExemptUserOverViewPage.Overviewtab.xpath")))
			clickButtonByXpath(prop.getProperty("ETCTimeCardExemptUserOverViewPage.Overviewtab.xpath"), toggle);
		else
			System.out.println("Overview tab is already selected");
		return new ETCTimeCardExemptUserOverViewPage();
	}
	
	public ETCTimeCardExemptDailyViewPage clickDailytab(String toggle) throws Throwable{
		if(!checkElementIsEnabledByXpath(prop.getProperty("ETCTimeCardExemptViewPage.Dailytab.xpath")))
			clickButtonByXpath(prop.getProperty("ETCTimeCardExemptViewPage.Dailytab.xpath"), toggle);
		else
			System.out.println("Daily tab is already selected");
		return new ETCTimeCardExemptDailyViewPage();
	}
	

}
