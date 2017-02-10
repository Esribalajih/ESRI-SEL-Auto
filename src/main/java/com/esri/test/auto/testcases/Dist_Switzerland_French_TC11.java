package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.Dist_Switzerland_French_HomePage;
import com.esri.test.auto.pages.Dist_Switzerland_French_SupportPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to validating the Switzerland ESRI happy path
 * 
 * @author udhayasundar
 *
 */
public class Dist_Switzerland_French_TC11 extends ESRIWrappers {
	@BeforeClass
	@Parameters({ "browser" })
	public void startTestCase(String browser) {
		browserName = browser;
		dataSheetName = "Dist_Switzerland_French_TC11";
		testCaseName = "Dist_Switzerland_French_TC11 (POM)";
		testDescription = "Distributor Switzerland French Test cases validating happy path";
	}

	@Test(dataProvider = "fetchdata")
	public void loginforSuccess(String SwitzFrHomeURL, String SwitzFrSearchURL, String SwitzFrSupportURL,
			String Secteurs, String Produits, String Services, String CommunauteSIG, String Aproposdenous,
			String Language, String Search, String Support, String Contact, String Informationsjuridiques,
			String Mentionslegales, String Protectiondesdonnees) throws Throwable {
		
		openbrowser(SwitzFrHomeURL);
		new Dist_Switzerland_French_HomePage()
		.clickSecteursTab().verifyTelecommunicationLink(Secteurs)
		.clickProduitsTab().verifyPlateformeArcGISLink(Produits)
		.clickServicesTab().verifyFormationLink(Services)
		.clickCommunauteSIGTab().verifyGeoNetLink(CommunauteSIG)
		.clickAproposdenousTab().verifyPostesLink(Aproposdenous)
		.verifyFrancaisLink(Language)
		.enterSearchTextBox(Search).clickSearchIcon().verifyResultsDisplaying().clickbsrBackBtn()
		.clickContactFooterlink().verifyContactlbl(Contact).clickbsrBackBtn()
		.clickInformationsjuridiquesFooterlink().verifyInformationsjuridiqueslbl(Informationsjuridiques).clickbsrBackBtn()
		.clickMentionslegalesFooterlink().verifyMentionslegaleslbl(Mentionslegales).clickbsrBackBtn()
		.clickProtectiondesdonneesFooterlink().verifyProtectiondesdonneeslbl(Protectiondesdonnees)
		.clickAccueilFooterlink().verifyFrancaisLink(Language);
		
		openbrowser(SwitzFrSupportURL);
		new Dist_Switzerland_French_SupportPage()
		.verifySupportlbl(Support);
		
	}

}
