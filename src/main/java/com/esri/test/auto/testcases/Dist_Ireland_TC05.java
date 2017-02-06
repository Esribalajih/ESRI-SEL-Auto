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
import com.esri.test.auto.pages.Dist_Ireland_HomePage;
import com.esri.test.auto.pages.Dist_Ireland_TechSupportPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to validating the Ireland ESRI happy path
 * 
 * @author udhayasundar
 *
 */
public class Dist_Ireland_TC05 extends ESRIWrappers {
	@BeforeClass
	@Parameters({ "browser" })
	public void startTestCase(String browser) {
		browserName = browser;
		dataSheetName = "Dist_Ireland_TC05";
		testCaseName = "Dist_Ireland_TC05 (POM)";
		testDescription = "Distributor Ireland Test cases validating happy path";
	}

	@Test(dataProvider = "fetchdata")
	public void loginforSuccess(String IrelandHomeURL, String IrelandSupportURL, String Industries, String Products,
			String Services, String About, String Community, String ArcGISMain, String ArcGISDesktop,
			String ArcGISServer, String ArcGISDevelopers, String ArcGISSolutions, String MarketingPlace,
			String TechnicalSupport, String ContactUs, String Privacy, String LegalTermsCond, String Cookie)
			throws Throwable {
		
		openbrowser(IrelandHomeURL);
		new Dist_Ireland_HomePage()
		.clickIndustriesTab()
		.verifyGovernmentLabel(Industries)
		.clickProductsTab()
		.verifyProdArcGISPlatformLabel(Products)
		.clickServicesTab()
		.verifyTrainingLabel(Services)
		.clickAboutTab()
		.verifyAboutESRIIncLabel(About)
		.clickCommunityTab()
		.verifyCommunityHubLabel(Community)
		.verifyArcGISPlatformLabel(Products)
		.clickArcGISMainLink()
		.verifyArcGISMainlbl(ArcGISMain)
		.clickbsrBackBtn()
		.clickArcGISDesktopLink()
		.verifyArcGISforDesktoplbl(ArcGISDesktop)
		.clickbsrBackBtn()
		.clickArcGISServerLink()
		.verifyArcGISServerlbl(ArcGISServer)
		.clickbsrBackBtn()
		.clickArcGISDeveloperLink()
		.verifyArcGISDeveloperlbl(ArcGISDevelopers)
		.clickbsrBackBtn()
		.clickArcGISSolutionsLink()
		.verifyArcGISSolutionlbl(ArcGISSolutions)
		.clickbsrBackBtn()
		.clickMarketingPlaceLink()
		.verifyMarketingPlacelbl(MarketingPlace)
		.clickbsrBackBtn()
		.clickContactUSFooterlink()
		.verifyContactUslbl(ContactUs)
		.clickbsrBackBtn()
		.clickPrivacyFooterlink()
		.verifyPrivacylbl(Privacy)
		.clickbsrBackBtn()
		.clickLegalFooterlink()
		.verifyLegalTermCondlbl(LegalTermsCond)
		.clickbsrBackBtn()
		.clickCookieTrackingFooterlink()
		.verifyCookieInfolabel(Cookie)
		.clickbsrBackBtn();
		
		openbrowser(IrelandSupportURL);
		new Dist_Ireland_TechSupportPage()
		.verifyTechnicalSupportlbl(TechnicalSupport);
		
		
		
		
		
	}

}
