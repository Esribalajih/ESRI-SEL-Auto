package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.NewEsriHomePage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Testcase to test New ESRI Home Page
 * @author Rizwan
 *
 */
public class NewEsriHome_TC01 extends ESRIWrappers {
	@Parameters({"browsers"})
	@BeforeClass
	public void startTestCase() {
		dataSheetName="NewESRIHomePage";
		testCaseName="NewEsriHome_TC01";
		testDescription="This is the New ESRI Home Page module - Positive Test scenario";
	}

	@Test(dataProvider="fetchdata")
	public void NewEsriHomePage(String NewEsriSiteCoreURL, String Image1Header, String Image2Header,
			String Image3Header, String Image4Header, String Quote1, String Quote2, String Quote3) throws Throwable{
		openbrowser(NewEsriSiteCoreURL);
		new NewEsriHomePage()
		.verify1stImageHeader(Image1Header)
		.clickImage1Link()
		.click2ndImage()
		.verify2ndImageHeader(Image2Header)
		.clickImage2Link()
		.click3rdImage()
		.verify3rdImageHeader(Image3Header)
		.clickImage3Link()
		.click4thImage()
		.verify4thImageHeader(Image4Header)
		.clickImage4Link()
		.clickArcGis()
		.clickProductHighlightimage()
		.clickProductHighlightlink()
		.clickIndustry()
		.clickInitiativesmartcommunitiesimage()
		.clickInitiativesmartcommunitieslink()
		.clickInnovation()
		.clickThoughtleadershipimage()
		.clickThoughtleadershiplink()
		.clickNews()
		.clickInthenewsimage()
		.clickInthenewslink()
		.clickEvents()
		.clickEventspotlightimage()
		.clickEventspotlightlink()
		.clickGreatWorks()
		.clickUserMadeContentimage()
		.clickUserMadeContentlink()
		.clickQuote1()
		.verifyQuoteText1(Quote1)
		.clickQuote2()
		//.verifyQuoteText2(Quote2)
		.clickQuote3()
		//.verifyQuoteText3(Quote3)
		.clickAboutesri()
		.clickWhatisGIS()
		.clickEsriHomelink()
		.clickBrowserBcktoNewEsriHomePage()
		.clickEmail()
		.clickBrowserBcktoNewEsriHomePage()
		.clickInstagram()
		.clickBwrBckBtnNewHomePage()
		.clickTwitter()
		.clickBwrBckBtn()
		.clickfacebook()
		.clickBwrBckBtn()
		.clickLinkedin()
		.clickBwrBckBtn()
		.clickGoogleplus()
		.clickBwrBckBtntoNewEsriHomePage()
		//.clickPinterest()
		//.clickBwrBckBtn()
		.clickRSS()
		.clickBrowserBcktoNewEsriHomePage();				
		}
}
