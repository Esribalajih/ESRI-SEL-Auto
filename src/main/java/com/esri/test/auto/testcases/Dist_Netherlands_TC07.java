package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.esri.test.auto.pages.Brazil_HomePage;
import com.esri.test.auto.pages.Brazil_SuporteImagemPage;
import com.esri.test.auto.pages.Finland_HomePage;
import com.esri.test.auto.pages.Finland_TukiPage;
import com.esri.test.auto.pages.Germany_HomePage;
import com.esri.test.auto.pages.Germany_SupportPage;
import com.esri.test.auto.pages.India_EsriIndTechSupportPage;
import com.esri.test.auto.pages.India_HomePage;
import com.esri.test.auto.pages.Ireland_HomePage;
import com.esri.test.auto.pages.Ireland_TechSupportPage;
import com.esri.test.auto.pages.Mexico_BuscarPage;
import com.esri.test.auto.pages.Mexico_HomePage;
import com.esri.test.auto.pages.Mexico_ServiciosPage;
import com.esri.test.auto.pages.Netherlands_HomePage;
import com.esri.test.auto.pages.Netherlands_SupportPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to validating the Netherlands ESRI happy path
 * 
 * @author udhayasundar
 *
 */
public class Dist_Netherlands_TC07 extends ESRIWrappers {
	@BeforeClass
	@Parameters({ "browser" })
	public void startTestCase(String browser) {
		browserName = browser;
		dataSheetName = "Dist_Netherlands_TC07";
		testCaseName = "Dist_Netherlands_TC07 (POM)";
		testDescription = "Distributor Netherlands Test cases validating happy path";
	}

	@Test(dataProvider = "fetchdata")
	public void loginforSuccess(String NetherlandsHomeURL, String NetherlandsSearchURL, String NetherlandsSupportURL,
			String Sectoren, String Producten, String SupportServices, String Opleidingen, String Nieuws,
			String Overons, String Search, String Support, String ArcGISPlatform, String ArcGISOnline,
			String ArcGISDesktop, String ArcGISServer, String ArcGISContent, String Apps, String Marketplace,
			String Disclaimer, String MijnEsri, String Online, String Blog, String Contact) throws Throwable {
	
		openbrowser(NetherlandsHomeURL);
		new Netherlands_HomePage()
		.clickISectorenTab()
		.verifyOverheidLink(Sectoren)
		.clickProductenTab()
		.verifyArcGISPlatformLink(Producten)
		.clickSupportServicesTab()
		.verifySupportLink(SupportServices)
		.clickOpleidingenTab()
		.verifyHomeLink(Opleidingen)
		.clickNieuwsEvenementenTab()
		.verifyPublicatiesLink(Nieuws)
		.clickOveronsTab()
		.verifyOveronsLink(Overons)
		.enterSearchTextBox(Search)
		.clickSearchIcon()
		.verifyResultsDisplaying()
		.clickbsrBackBtn()
		.clickArcGISPlatformLink()
		.verifyArcGISPlatformlbl(ArcGISPlatform)
		.clickbsrBackBtn()
		.clickArcGISOnlineLink()
		.verifyArcGISOnlinelbl(ArcGISOnline)
		.clickbsrBackBtn()
		.clickArcGISDesktopLink()
		.verifyArcGISDesktoplbl(ArcGISDesktop)
		.clickbsrBackBtn()
		.clickArcGISServerLink()
		.verifyArcGISserverlbl(ArcGISServer)
		.clickbsrBackBtn()
		.clickArcGISContentLink()
		.verifyArcGISContentlbl(ArcGISContent)
		.clickbsrBackBtn()
		.clickAppsLink()
		.verifyAppslbl(Apps)
		.clickbsrBackBtn()
		.clickArcGISMarketplaceLink()
		.verifyMarketplacelbl(Marketplace)
		.clickbsrBackBtn()
		.clickDisclaimerFooterlink()
		.verifyDisclaimerlbl(Disclaimer)
		.clickbsrBackBtn()
		.clickMijnEsriFooterlink()
		.verifyMijnEsriTab(MijnEsri)
		.clickbsrBackBtn()
		.clickMijnOpleidingFooterlink()
		.verifyEsriOnlinelbl(Online)
		.clickbsrBackBtn()
		.clickEsriblogFooterlink()
		.verifyEsriNederlandbloglbl(Blog)
		.clickbsrBackBtn()
		.clickContactFooterlink()
		.verifyContactlbl(Contact)
		.clickbsrBackBtn();
		
		openbrowser(NetherlandsSupportURL);
		new Netherlands_SupportPage()
		.verifySupportlbl(Support);
		
	}

}
