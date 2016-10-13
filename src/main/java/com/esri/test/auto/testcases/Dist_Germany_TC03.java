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
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to validating the Germany ESRI happy path
 * 
 * @author udhayasundar
 *
 */
public class Dist_Germany_TC03 extends ESRIWrappers {
	@BeforeClass
	@Parameters({ "browser" })
	public void startTestCase(String browser) {
		browserName = browser;
		dataSheetName = "Dist_Germany_TC03";
		testCaseName = "Dist_Germany_TC03 (POM)";
		testDescription = "Distributor Germany Test cases validating happy path";
	}

	@Test(dataProvider = "fetchdata")
	public void loginforSuccess(String GermanyHomeURL, String GermanySupportURL, String Branchen, String Produkte, String Services, String GISCommunity, String Uberuns,
				String SearchText, String Kontakt, String Rechtliches, String Impressum, String Datenschutz, String Support) throws Throwable {
		
		openbrowser(GermanyHomeURL);
		new Germany_HomePage()
		.clickBranchen()
		.verifyTelekommunikationList(Branchen)
		.clickProdukte()
		.verifyArcGIS_PlattformList(Produkte)
		.clickServices()
		.verifySchulungList(Services)
		.clickGIS_Community()
		.verifyGeoNetList(GISCommunity)
		.clickUberuns()
		.verifyJobsList(Uberuns)
		.enterSearchTextBox(SearchText)
		.clickSearchIcon()
		.verifyResultsDisplaying()
		.clickbsrBackBtn()
		.clickKontaktFooter()
		.verifyKontaktlbl(Kontakt)
		.clickbsrBackBtn()
		.clickRechtlichesFooter()
		.verifyEsriLizenzbedingungenlbl(Rechtliches)
		.clickbsrBackBtn()
		.clickImpressumFooter()
		.verifyImpressumlbl(Impressum)
		.clickbsrBackBtn()
		.clickDatenschutzFooter()
		.verifyDatenschutzlbl(Datenschutz)
		.clickHomeFooterLink()
		.verifyBranchenTabDisplaying();
		
		openbrowser(GermanySupportURL);
		new Germany_SupportPage()
		.verifySupportlbl(Support);
		
		
	}

}
