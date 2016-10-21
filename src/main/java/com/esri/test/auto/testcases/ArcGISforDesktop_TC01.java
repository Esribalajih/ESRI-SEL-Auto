package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.ArcGISforDesktopMainPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author balajih
 *
 */
public class ArcGISforDesktop_TC01 extends ESRIWrappers{
	@Parameters({"browsers"})
	@BeforeClass
	public void startTestcase(){
		dataSheetName="ArcGISDesktop_TC01";
		testCaseName="ArcGIS for Desktop Page_TC01";
		testDescription="This is the testcase for Testing ArcGIS Desktop module - Positive Test scenario";
	}
	
	@Test(dataProvider="fetchdata")
	public void arcgisforDesktop (String ArcGISURL, String mainHdr, String Mtopic2, String Mtopic3, String Mtopic4,
			String Mtopic5, String Mtopic6, String FHdr, String FTopic2, String FTopic3, String KeyFHdr, String KeyTopic1, 
			String KeyTopic2, String KeyTopic3, String KeyTopic4, String KeyTopic5, String KeyTopic6,
			String KeyTopic7, String KeyTopic8, String FmdLink, String ExtnHdr, String SysReqHdr,
			String PricingHdr, String ProELAHdr, String FreeTrialHdr, String fName, String lName, 
			String emailId, String ConfirmemailId, String IndustryDpDwn, String cmNotify) throws Throwable{
		openbrowser(ArcGISURL);
		new ArcGISforDesktopMainPage()
		.verifyMainHeader(mainHdr)
		.verifyMainTopic2(Mtopic2)
		.verifyMainTopic3(Mtopic3)
		.verifyMainTopic4(Mtopic4)
		.verifyMainTopic5(Mtopic5)
		.verifyMainTopic6(Mtopic6)
		.clickFeaturesTab()
		.verifyFeaturesHdr(FHdr)
		.verifyFeaturesTopic2(FTopic2)
		.verifyFeaturesTopic3(FTopic3)
		.verifyFeaturesKeyHdr(KeyFHdr)
		.verifyFeaturesKeyTopic1(KeyTopic1)
		.verifyFeaturesKeyTopic2(KeyTopic2)
		.verifyFeaturesKeyTopic3(KeyTopic3)
		.verifyFeaturesKeyTopic4(KeyTopic4)
		.verifyFeaturesKeyTopic5(KeyTopic5)
		.verifyFeaturesKeyTopic6(KeyTopic6)
		.verifyFeaturesKeyTopic7(KeyTopic7)
		.verifyFeaturesKeyTopic8(KeyTopic8)
		.verifyFeaturesMoreDetailsLink(FmdLink)
		.clickFeaturesMoreDetailsLink()
		.clickBrowBackButton()
		.clickExtensionsTab()
		.verifyExtenHeader(ExtnHdr)
		.clickAdvAnalysPlus()
		.clickAdvAnalysHdr()
		.clickAdvAnalysKeyBenefit()
		.clickDataWFPlus()
		.clickDataWFHdr()
		.clickDataWFKeyBenefit()
		.clickIndustryFocusedPlus()
		.clickIndustryfocusedHdr()
		.clickIndustryfocusedKeyBenefit()
		.clickNoCostAddonPlus()
		.clickNoCostAddonHdr()
		.clickNoCostAddonKeyBenefit()
		.clickArcGISforDesktopExtnPDF()
		.clickDesktopSysReTab()
		.clickSystemRequirementTab()
		.verifySysReqHdr(SysReqHdr)
		.clickArcmapSysReqLink()
		.clickBrowBackButton()
		.clickArcGISProSysReqLink()
		.clickBrowBackButton()
		.clickPricingTab()
		.verifyPricingHdr(PricingHdr)
		.clickShowHideAllLink()
		.clickBMEGILink()
		.clickMEADMLink()
		.clickAADCLink()
		.clickWhitePaperDWNPDF()
		.verifyProgramsandELAHdr(ProELAHdr)
		.clickFreeTrialLink()
		.verifyFreeTrialHdr(FreeTrialHdr)
		.navigateToFrame()
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterEmailId(emailId)
		.enterConfirmEmailId(ConfirmemailId)
		.selectIndustryDpDwn(IndustryDpDwn)
		.clickStartTrial();
		//.verifyConfirmationTxt(cmNotify);
		
	}

}
