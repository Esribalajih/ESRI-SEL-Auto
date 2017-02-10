package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.esri.test.auto.pages.Dist_Sweden_HomePage;
import com.esri.test.auto.pages.Dist_Sweden_SupportPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to validating the Sweden ESRI happy path
 * 
 * @author udhayasundar
 *
 */
public class Dist_Sweden_TC10 extends ESRIWrappers {
	@BeforeClass
	@Parameters({ "browser" })
	public void startTestCase(String browser) {
		browserName = browser;
		dataSheetName = "Dist_Sweden_TC10";
		testCaseName = "Dist_Sweden_TC10 (POM)";
		testDescription = "Distributor Sweden Test cases validating happy path";
	}

	@Test(dataProvider = "fetchdata")
	public void loginforSuccess(String SwedenHomeURL, String SwedenSearchURL, String SwedenSupportURL, String OmOss,
			String KunskapInsikt, String Branscher, String Produkter, String Tjanstersupport, String Kontakt,
			String Search, String Omcookies, String Kontaktaoss, String Support) throws Throwable {

		openbrowser(SwedenHomeURL);
		new Dist_Sweden_HomePage()
		.clickOmOssTab()
		.verifyOmEsriSverigeLink(OmOss)
		.clickKunskapInsiktTab()
		.verifyOmGISLink(KunskapInsikt)
		.clickBranscherTab().verifyBranscherLink(Branscher)
		.clickProdukterTab().verifyArcGISPlattformenLink(Produkter)
		.clickTjansterSupportTab().verifyKonsulttjansterLink(Tjanstersupport)
		.clickKontaktTab().verifyKontaktaOssLink(Kontakt)
		.enterSearchTextBox(Search).clickSearchIcon().verifyResultsDisplaying().clickbsrBackBtn()
		.clickOmCookiesFooterlink().verifyOmCookieslbl(Omcookies).clickbsrBackBtn()
		.clickKontaktaOssFooterlink().verifyKontaktaOsslbl(Kontaktaoss).clickbsrBackBtn();
		
		openbrowser(SwedenSupportURL);
		new Dist_Sweden_SupportPage()
		.verifySupportlbl(Support);
		
		
	}

}
