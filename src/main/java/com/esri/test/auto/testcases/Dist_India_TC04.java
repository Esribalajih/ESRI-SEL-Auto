package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.esri.test.auto.pages.Dist_Brazil_HomePage;
import com.esri.test.auto.pages.Dist_Brazil_SuporteImagemPage;
import com.esri.test.auto.pages.Dist_Finland_HomePage;
import com.esri.test.auto.pages.Dist_Finland_TukiPage;
import com.esri.test.auto.pages.Dist_Germany_HomePage;
import com.esri.test.auto.pages.Dist_Germany_SupportPage;
import com.esri.test.auto.pages.Dist_India_EsriIndTechSupportPage;
import com.esri.test.auto.pages.Dist_India_HomePage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to validating the India ESRI happy path
 * 
 * @author udhayasundar
 *
 */
public class Dist_India_TC04 extends ESRIWrappers {
	@BeforeClass
	@Parameters({ "browser" })
	public void startTestCase(String browser) {
		browserName = browser;
		dataSheetName = "Dist_India_TC04";
		testCaseName = "Dist_India_TC04 (POM)";
		testDescription = "Distributor India Test cases validating happy path";
	}

	@Test(dataProvider = "fetchdata")
	public void loginforSuccess(String IndiaHomeURL, String IndiaSupportURL, String Home, String Industries, String Products, String Training, String Support, String Services, String Events, String News
			, String About, String OnlineHelpdesk, String ContactUs, String Careers, String Privacy, String Legal, String ArcGISMain, String ArcGISPlatform,
			String ArcGISPro, String LocationAnalytics, String MarketingPlace ,String ArcGISDevelopers) throws Throwable {
		
		openbrowser(IndiaHomeURL);
		new Dist_India_HomePage()
		.clickIndustriesTab()
		.verifyIndustrieslbl(Industries)
		.clickbsrBackBtn()
		.clickProductsTab()
		.verifyProductslbl(Products)
		.clickbsrBackBtn()
		.clickTrainingTab()
		.verifyCustEduServlbl(Training)
		.clickbsrBackBtn()
		.clickSupportTab()
		.verifysupportlbl(Support)
		.clickbsrBackBtn()
		.clickServicesTab()
		.verifyServiceslbl(Services)
		.clickbsrBackBtn()
		.clickEventsTab()
		.verifyEventslbl(Events)
		.clickbsrBackBtn()
		.clickNewsTab()
		.verifyNewslbl(News)
		.clickbsrBackBtn()
		.clickAboutTab()
		.verifyAboutLabel(About)
		.clickHomeTabLink()
		.clickonlineHelpdeskHeaderLink()
		.verifyOnlineTechSuplbl(OnlineHelpdesk)
		.clickbsrBackBtn()
		.clickContactUsHeaderLink()
		.verifyContactUslbl(ContactUs)
		.clickbsrBackBtn()
		.clickCareersHeaderLink()
		.verifyCareerslbl(Careers)
		.clickbsrBackBtn()
		.clickContactUSFooterlink()
		.verifyContactUslbl(ContactUs)
		.clickbsrBackBtn()
		.clickPrivacyFooterlink()
		.verifyPrivacylbl(Privacy)
		.clickbsrBackBtn()
		.clickLegalFooterlink()
		.verifyLegallbl(Legal)
		.clickbsrBackBtn()
		.verifyArcGISPlatformLabel(ArcGISPlatform)
		.clickArcGISMainLink()
		.verifyArcGISMainBannerlbl(ArcGISMain)
		.clickbsrBackBtn()
		.clickArcGISProLink()
		.verifyarcGISLabel(ArcGISPro)
		.clickbsrBackBtn()
		.clickLocalAnalyticsLink()
		.verifyLocalAnalyticsllbl(LocationAnalytics)
		.clickbsrBackBtn()
		.clickMarketingPlaceLink()
		.verifyMarketingPlacelbl(MarketingPlace)
		.clickbsrBackBtn()
		.clickArcGISDevelopersLink()
		.verifyArcGISforDeveloperslbl(ArcGISDevelopers)
		.clickbsrBackBtn();
		
		openbrowser(IndiaSupportURL);
		new Dist_India_EsriIndTechSupportPage()
		.verifysupportlbl(Support);
		
		
		
		
	}

}
