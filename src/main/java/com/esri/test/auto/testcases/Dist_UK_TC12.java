package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.esri.test.auto.pages.Dist_UK_HomePage;
import com.esri.test.auto.pages.Dist_UK_SupportPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to validating the UK ESRI happy path
 * 
 * @author udhayasundar
 *
 */
public class Dist_UK_TC12 extends ESRIWrappers {
	@BeforeClass
	@Parameters({ "browser" })
	public void startTestCase(String browser) {
		browserName = browser;
		dataSheetName = "Dist_UK_TC12";
		testCaseName = "Dist_UK_TC12 (POM)";
		testDescription = "Distributor UK (United Kingdom) Test cases validating happy path";
	}

	@Test(dataProvider = "fetchdata")
	public void loginforSuccess(String UKHomeURL, String UKSearchURL, String UKSupportURL, String Industries,
			String Products, String SupportServices, String About, String Community, String Shop, String Search,
			String Support, String ArcGISPlatform, String ArcGISOnline, String ArcGISDesktop, String ArcGISServer,
			String ArcGISDevelopers, String ArcGISSolutions, String Marketplace, String ContactUS, String Cookies, String Privacy, String Legal) throws Throwable {

		openbrowser(UKHomeURL);
		new Dist_UK_HomePage()
		.clickIndustriesTab().verifyCommercialLink(Industries)
		.clickProductsTab().verifyArcGISPlatformLink(Products)
		.clickSupportServicesTab().verifyTrainingLink(SupportServices)
		.clickAboutTab().verifyAboutEsriUKLink(About)
		.clickCommunityTab().verifyCommunityHubLink(Community)
		.clickShopTab().verifyStoreLink(Shop)
		.enterSearchTextBox(Search).clickSearchIcon().clickbsrBackBtn()
		.verifyArcGISPlatformLabel(ArcGISPlatform)
		.clickArcGISOnlineLink().verifyArcGISOnlinelbl(ArcGISOnline).clickbsrBackBtn()
		.clickArcGISDesktopLink().verifyArcGISDesktoplbl(ArcGISDesktop).clickbsrBackBtn()
		.clickArcGISServersLink().verifyArcGISServerslbl(ArcGISServer).clickbsrBackBtn()
		.clickArcGISDevelopersLink().verifyArcGISDeveloperslbl(ArcGISDevelopers).clickbsrBackBtn()
		.clickArcGISSolutionsLink().verifyArcGISSolutionslbl(ArcGISSolutions).clickbsrBackBtn()
		.clickArcGISMarketplaceLink().verifyMarketplacelbl(Marketplace).clickbsrBackBtn()
		.clickContactUSFooterlink().verifyContactUSlbl(ContactUS).clickbsrBackBtn()
		.clickCookiesFooterlink().verifyCookieslbl(Cookies).clickbsrBackBtn()
		.clickPrivacyFooterlink().verifyPrivacylbl(Privacy).clickbsrBackBtn()
		.clickLegalFooterlink().verifyLegallbl(Legal).clickbsrBackBtn();
		
		
		openbrowser(UKSupportURL);
		new Dist_UK_SupportPage().verifySupportlbl(Support);
		
	}

}
