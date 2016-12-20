package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.EsriCareerHomePage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author balajih
 *
 */
public class EsriCareerHome_TC01 extends ESRIWrappers {
	@Parameters({"browsers"})
	@BeforeClass
	public void startTestcase(){
		dataSheetName="EsriCareer_TC01";
		testCaseName="Esri Career Page_TC01";
		testDescription="This is the testcase for Testing Esri Career module - Positive Test scenario";
	}
	
	@Test(dataProvider="fetchdata")
	public void esriCareerHome(String EsriCareerURL, String careerMHdr, String JDHdr, String Inputdata, 
			String jobCategory, String Location, String LHdr) throws Throwable{
		openbrowser(EsriCareerURL);
		new EsriCareerHomePage()
		.verifyCareerMainHdr(careerMHdr)
		.clickLogIn()
		.clickBwrBckBtn()
		.clickComeJoinUS()
		.verifyJobDetailsHdr(JDHdr)
		.enterTextSearch(Inputdata)
		.clickBySearchBtn()
		.clickJobCategory()
		.selectJobCategory(jobCategory)
		.clickLocation()
		.selectLocation(Location)
		.clickMoreAboutEsrilink()
		.clickBwrBckBtn()
		.clickBwrBckBtn()
		.clickBlogButton()
		.clickBwrBckBtn()
		.clickInstagramButton()
		.clickBwrBckBtn()
		.clickFacebookButton()
		.clickBwrBckBtn()
		.clickTwitterButton()
		.clickBwrBckBtn()
		.clickLinkedInButton()
		.clickBwrBckBtn()
		.clickScrolltoExplore()
		.clickrightsideButton()
		.clickleftsideButton()
		.clickFooterInstagramButton()
		.clickBwrBckBtn()
		.clickFooterFacebookButton()
		.clickBwrBckBtn()
		.clickFooterTwitterButton()
		.clickBwrBckBtn()
		.clickFooterLinkedInButton()
		.clickBwrBckBtn()
		.clickEsripolicyEEOlink()
		.clickAccomlink()
		.clickPrivacylink()
		.verifyLegalinfoHdr(LHdr)
		.clickBwrBckBtn()
		.clickComeJoinUSFooter()
		.
		
		
	}
}
