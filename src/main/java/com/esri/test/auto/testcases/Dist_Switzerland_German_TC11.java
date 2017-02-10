package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.Dist_Switzerland_German_HomePage;
import com.esri.test.auto.pages.Dist_Switzerland_German_SupportPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to validating the Switzerland ESRI happy path
 * 
 * @author udhayasundar
 *
 */
public class Dist_Switzerland_German_TC11 extends ESRIWrappers {
	@BeforeClass
	@Parameters({ "browser" })
	public void startTestCase(String browser) {
		browserName = browser;
		dataSheetName = "Dist_Switzerland_German_TC11";
		testCaseName = "Dist_Switzerland_German_TC11 (POM)";
		testDescription = "Distributor Switzerland Test cases validating happy path";
	}

	@Test(dataProvider = "fetchdata")
	public void loginforSuccess(String SwitzHomeURL, String	SwitzSearchURL, String SwitzSupportURL, String Branchen, String Produkte, 
			String Services, String GISCommunity, String Uberuns, String Language, String Search, String Support,
			String Kontakt, String Lizenzbedingungen, String Impressum, String Datenschutz) throws Throwable {

		openbrowser(SwitzHomeURL);
		new Dist_Switzerland_German_HomePage()
		.clickBranchenTab().verifyTelekommunikationLink(Branchen)
		.clickProdukteTab().verifyArcGISPlattformLink(Produkte)
		.clickServicesTab().verifySchulungLink(Services)
		.clickGISCommunityTab().verifyGeoNetLink(GISCommunity)
		.clickUberunsTab().verifyJobsLink(Uberuns)
		.verifyDeutschLink(Language)
		.enterSearchTextBox(Search).clickSearchIcon()
		.verifyResultsDisplaying().clickbsrBackBtn()
		.clickKontaktFooterlink().verifyKontaktlbl(Kontakt).clickbsrBackBtn()
		.clickRechtlichesFooterlink().verifyLizenzbedingungenlbl(Lizenzbedingungen).clickbsrBackBtn()
		.clickImpressumFooterlink().verifyImpressumlbl(Impressum).clickbsrBackBtn()
		.clickDatenschutzFooterlink().verifyDatenschutzlbl(Datenschutz).clickHomeFooterlink()
		.verifyDeutschLink(Language);
		
		openbrowser(SwitzSupportURL);
		new Dist_Switzerland_German_SupportPage()
		.verifySupportlbl(Support);
		
		
		
	}

}
