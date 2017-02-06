package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.esri.test.auto.pages.Romania_HomePage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to validating the Romania ESRI happy path
 * 
 * @author udhayasundar
 *
 */
public class Dist_Romania_TC08 extends ESRIWrappers {
	@BeforeClass
	@Parameters({ "browser" })
	public void startTestCase(String browser) {
		browserName = browser;
		dataSheetName = "Dist_Romania_TC08";
		testCaseName = "Dist_Romania_TC08 (POM)";
		testDescription = "Distributor Romania Test cases validating happy path";
	}

	@Test(dataProvider = "fetchdata")
	public void loginforSuccess(String RomaniaHomeURL, String Industrii, String Produse, String SuportServicii,
			String Noutati, String Despre, String Comunitate,String PlatformaArcGIS, String ArcGISMain, String ArcGISPro,
			String LocationAnalytics, String Marketplace, String ArcGISDevelopers, String Contact, String Privacy,
			String Legal ) throws Throwable {
		
		openbrowser(RomaniaHomeURL);
		new Romania_HomePage()
		.clickIndustriiTab()
		.verifyMediuLink(Industrii)
		.clickProduseTab()
		.verifyArcGISPlatformLabel(Produse)
		.clickSupportServicesTab()
		.verifyInstruireLink(SuportServicii)
		.clickNoutatiTab()
		.verifyNoutatiLink(Noutati)
		.clickDespreTab()
		.verifyDespreEsriRomaniaLink(Despre)
		.clickComunitateTab()
		.verifyGeoNetLink(Comunitate)
		.verifyArcGISPlatformLabel(PlatformaArcGIS)
		.clickArcGISComLink()
		.verifyArcGISMainBannerlbl(ArcGISMain)
		.clickbsrBackBtn()
		.clickArcGISProfessionalsLink()
		.verifyArcGISProlbl(ArcGISPro)
		.clickbsrBackBtn()
		.clickLocationAnalyticsLink()
		.verifyLocationAnalyticslbl(LocationAnalytics)
		.clickbsrBackBtn()
		.clickArcGISMarketplaceLink()
		.verifyArcGISMarketplacelbl(Marketplace)
		.clickbsrBackBtn()
		.clickArcGISDevelopersLink()
		.verifyArcGISDeveloperslbl(ArcGISDevelopers)
		.clickbsrBackBtn()
		.clickContactatineFooterlink()
		.verifyContactatinelbl(Contact)
		.clickbsrBackBtn()
		.clickConfidentialitateFooterlink()
		.verifyEsriPrivacyStatementlbl(Privacy)
		.clickbsrBackBtn()
		.clickCadrulLegalFooterlink()
		.verifyOverviewlbl(Legal)
		.clickbsrBackBtn();
		
	}

}
