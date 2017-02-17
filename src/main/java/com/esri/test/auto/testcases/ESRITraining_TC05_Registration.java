package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.EsriTrainingNewCourseRegistrationPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to check regular signup of a course
 * 
 * @author Sivaprakash
 *
 */
public class ESRITraining_TC05_Registration extends ESRIWrappers {
	@BeforeClass
	public void startTestCase() {
		dataSheetName = "ESRITraining_TC05_Registration";
		testCaseName = "ESRITraining_TC05_Registration";
		testDescription = "Go through with a regular signup,Credit Card Works,Emails are Sent,Log Looks Correct for User";
	}

	@Test(dataProvider="fetchdata")
	public void loginforSuccess(String url,String username, String password, String URL, String OrganizationName, String Address, String City, String State, String Country, String Zipcode, String filterSelect, String Notes) throws Throwable {
		
		openbrowser("https://www.esri.com/training/");
		new EsriTrainingNewCourseRegistrationPage()
			.login()
			.username(username)
			.password(password)
			.signIn()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.navigateToUrl(URL)
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.clickNext()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.enterOrganizationInfo(OrganizationName, Address, City, State, Country, Zipcode)
			.billingInfo()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.selectPayment(filterSelect)
			.billingInfo(Notes)
			.clickSummary()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.clickTerms()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.clickSubmit()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.verifyTick()
			.clickLink()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode();
			
			
			
			
		
		//neglect ESRITraining_CourseRegistration_TC04 and add it as separate testcase.
					
	}

}
