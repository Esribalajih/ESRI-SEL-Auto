package com.esri.test.auto.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.esri.test.auto.pages.TestYourInsightAppMainPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Positive testcase for Test Your Insight App
 * @author balajih
 *
 */
public class TestYourInsightApp_TC01 extends ESRIWrappers {
	@Parameters({"browsers"})
	@BeforeClass
	public void startTestcase(){
		dataSheetName="InsightApp_TC01";
		testCaseName="Test Your Insight App_TC01";
		testDescription="This is the testcase for Testing Insights Application module - Positive Test scenario";
	}
	
	@Test(dataProvider="fetchdata")
	public void insightapp(String TestYourInsightAppURL, String popupHdr, String zipcodeLabel, String ZipCode, 
			String ContactUSHdr, String ContactUSFname, String ContactUSLname, String ContactUSEmail, String ContactUSComp,
			Integer compSel, String Tyou) throws Throwable{
		openbrowser(TestYourInsightAppURL);
		new TestYourInsightAppMainPage()
		.clickExplorePopupDialog()
		.verifyExplorePopupHeader(popupHdr)
		.clickStartExploring()
		.verifyZipcodeLabel(zipcodeLabel)
		.enterZipcode(ZipCode)
		//.selectPopulationDensity()
		//.selectMediaAge()
		.clickSeeResultsButton()
		.clickDriveTime()
		.clickRingBuffer()
		.clickFacebookbutton()
		.clickTwitterbutton()
		.clickLinkedINbutton()
		.mousehoverEmailIcon()
		.clickEmailCloseIcon()
		.clickExploreEsriDatalink()
		.clickBrowserBckBtntoInsightsPage()
		.clickContactUsButton()
		.switchtoContactUs()
		.verifyContactUsHeader(ContactUSHdr)
		.enterContactUSFirstName(ContactUSFname)
		.enterContactUSLastName(ContactUSLname)
		.enterContactUSEmail(ContactUSEmail)
		.enterContactUSCompanyinput(ContactUSComp)
		//.selectContactUSCompany(compSel)
		.clickSubmitBtn()
		.verifyContactUSThankyou(Tyou)
		.clickContactUSPrivacyPolicylink()
		.clickContactUsInsightAppBwrBckBtn()
		.clickContactUSCloseBtn();
		
		
		
		
		
		
		
	}
}
