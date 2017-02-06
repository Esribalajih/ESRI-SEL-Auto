package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.esri.test.auto.pages.Rwanda_HomePage;
import com.esri.test.auto.pages.Rwanda_SupportServPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to validating the Rwanda ESRI happy path
 * 
 * @author udhayasundar
 *
 */
public class Dist_Rwanda_TC09 extends ESRIWrappers {
	@BeforeClass
	@Parameters({ "browser" })
	public void startTestCase(String browser) {
		browserName = browser;
		dataSheetName = "Dist_Rwanda_TC09";
		testCaseName = "Dist_Rwanda_TC09 (POM)";
		testDescription = "Distributor Rwanda Test cases validating happy path";
	}

	@Test(dataProvider = "fetchdata")
	public void loginforSuccess(String RwandaHomeURL,String RwandaSupportURL, String Home, String Software, String Training, String Support,
			String News, String About, String Softwarelbl, String ArcGISOnline, String ArcGISDesktop,
			String ArcGISServer, String ArcGISMobile,String ContactUs,String Privacy) throws Throwable {

		openbrowser(RwandaHomeURL);
		new Rwanda_HomePage()
		.clickSoftwareLink()
		.verifySoftwarelbl(Software)
		.clickbsrBackBtn()
		.clickTrainingTab().verifyTraininglbl(Training).clickbsrBackBtn()
		.clickSupportResourcesTab().verifySupportlbl(Support).clickbsrBackBtn()
		.clickNewsTab().verifyNewslbl(News).clickbsrBackBtn()
		.clickAboutTab().verifyAboutlbl(About).clickHomeTab()
		.verifySoftwareLink(Software)
		.clickSoftwareLink().verifyArcGISlbl(Softwarelbl).clickbsrBackBtn()
		.clickArcGISOnlineLink().verifyArcGISOnlinelbl(ArcGISOnline).clickbsrBackBtn()
		.clickArcGISDesktopLink().verifyArcGISDesktoplbl(ArcGISDesktop).clickbsrBackBtn()
		.clickArcGISServersLink().verifyArcGISServerslbl(ArcGISServer).clickbsrBackBtn()
		.clickArcGISMobileLink().verifyArcGISMobilelbl(ArcGISMobile).clickbsrBackBtn()
		.clickContactUsFooterlink().verifyContactUslbl(ContactUs).clickHomeFooterlink()
		.verifySoftwareLink(Software).clickPrivcacyFooterlink().verifyPrivacylbl(Privacy).clickbsrBackBtn();
		
		
		openbrowser(RwandaSupportURL);
		new Rwanda_SupportServPage()
		.verifySupportlbl(Support);
	}

}
