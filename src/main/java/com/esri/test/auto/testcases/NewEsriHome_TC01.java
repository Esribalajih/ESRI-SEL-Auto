package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.ESRINewHomePage;
import com.esri.test.auto.pages.SigninPage;
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
		//For IE
		testDescription="This is the New ESRI Home Page module - Positive Test scenario."+"\r\n"+"URL ---> http://uat.esri.com"+"\r\n"+"ENV ---> Staging"+"\r\n"+"BROWSER & VERSION ---> Chrome V56";
	}

	@Test(dataProvider="fetchdata")
	public void NewEsriHomePage(
			String EsriAccountsUrl,String Username,String Password,String SignInBtn,String NewEsriSiteCoreURL,
			String Image1Header, String Image1Link,String Image2Btn,String Image2Header, String Image2Link,
			String Image3Btn, String Image3Header, String Image3Link, String Image4Btn, String Image4Header,
			String Image4Link, String Quote1Btn, String Quote1, String Quote2Btn,String Quote2,String Quote3Btn,String Quote3, 
			String AboutESRIHeader, String LocationStrategyHeader,String DevSummitHeader, String GeoAppsHeader,
			String ArcGISLink,String ProdHignLigImg,String ProdHignLigLink,
			String IndustryLink,String IndIniImg,String IndIniLink,String NewsLink,String LatNewsImg,
			String LatNewsLink,String EventsLink,String UpEventsImg,String UpEventsLink,String MapWeLoveLink,
			String FeaturedMapImg,String FeaturedMapLink,String AboutESRILink,String WhatsGISLink,String EsriHomeLink,
			String EventsHeader,String userconferenceHeader,String MapsWeLoveHeader,String MinneapolisSolarHeader,String EmailBtn,
			String InstaBtn,String TwitterBtn,String FbBtn,String LinkedInBtn,String GooglePlusBtn,
			String RssBtn,String IndustriesHeader,String OperationalIntelligenceHeader,String ESRINewsHeader,String GIS_IONHeader
			,String ArcGISWhatsNewHeader) throws Throwable{
		openbrowser(EsriAccountsUrl);
		new SigninPage()
		.enterUserName(Username)
		.enterPassword(Password)
		.clickSigninAccounts(SignInBtn);
		openbrowser(NewEsriSiteCoreURL);
		new ESRINewHomePage()
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.verify1stImageHeader(Image1Header)
		.clickImage1Link(Image1Link)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifyAboutESRIHeader(AboutESRIHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.click2ndImage(Image2Btn)
		.verify2ndImageHeader(Image2Header)
		.clickImage2Link(Image2Link)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifyLocationStrategyHeader(LocationStrategyHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.click3rdImage(Image3Btn)
		.verify3rdImageHeader(Image3Header)
		.clickImage3Link(Image3Link)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifyDevSummitHeaderHeader(DevSummitHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.click4thImage(Image4Btn)
		.verify4thImageHeader(Image4Header)
		.clickImage4Link(Image4Link)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifyGeoAppsHeader(GeoAppsHeader)
		.clickBrowserBcktoNewEsriHomePage()
		//.clickArcGis()
		.ScrollDownArrow()
		.clickArcGisLink(ArcGISLink)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.clickBrowserBcktoNewEsriHomePage()
		.clickProductHighlightimage(ProdHignLigImg)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifyArcGISWhatsNewHeader(ArcGISWhatsNewHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickProductHighlightlink(ProdHignLigLink)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifyArcGISWhatsNewHeader(ArcGISWhatsNewHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickIndustrylink(IndustryLink)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifyIndustriesHeader(IndustriesHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickIndustryInitiativeimage(IndIniImg)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifyOperationalIntelligenceHeader(OperationalIntelligenceHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickInduatryInitiativelink(IndIniLink)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifyOperationalIntelligenceHeader(OperationalIntelligenceHeader)
		.clickBrowserBcktoNewEsriHomePage()		
		.clickNewsLink(NewsLink)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifynewsHeader(ESRINewsHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickImprovingournationimage(LatNewsImg)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifyIONHeader(GIS_IONHeader)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.clickBrowserBcktoNewEsriHomePage()
		.clickImprovingournationlink(LatNewsLink)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifyIONHeader(GIS_IONHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickEventsLink(EventsLink)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifyEventsHeader(EventsHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.ClickUpcomingEventsimage(UpEventsImg)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifyuserconfirenceHeader(userconferenceHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickUpcomingEventslink(UpEventsLink)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.clickBrowserBcktoNewEsriHomePage()
		.clickMapsWeLove(MapWeLoveLink)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifyMapsWeLoveHeader(MapsWeLoveHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickFuturedMapimage(FeaturedMapImg)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.VerifyMinneapolisSolarHeader(MinneapolisSolarHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickFuturedMaplink(FeaturedMapLink)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.clickBrowserBcktoNewEsriHomePage()
		.clickQuote2btn(Quote2Btn)
		.verifyQuoteText2(Quote2)
		.clickQuote1btn(Quote1Btn)
		.verifyQuoteText1(Quote1)
		.clickQuote3btn(Quote3Btn)
		.verifyQuoteText3(Quote3)
		.clickAboutesriLink(AboutESRILink)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.clickBrowserBcktoNewEsriHomePage()	
		.clickWhatisGISLink(WhatsGISLink)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.clickBrowserBcktoNewEsriHomePage()
		.clickEsriHomelink(EsriHomeLink)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.clickEmailWidget(EmailBtn)
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.clickBrowserBcktoNewEsriHomePage()
		.clickInstagramWidget(InstaBtn)
		.clickBrowserBcktoNewEsriHomePage()
		.clickTwitterWidget(TwitterBtn)
		.clickBrowserBcktoNewEsriHomePage()
		.clickfacebookWidget(FbBtn)
		.clickBrowserBcktoNewEsriHomePage()
		.clickLinkedinWidget(LinkedInBtn)
		.clickBrowserBcktoNewEsriHomePage()
		.clickGoogleplusWidget(GooglePlusBtn)
		.clickBrowserBcktoNewEsriHomePage()
		.clickRSSWidget(RssBtn)
		.clickBrowserBcktoNewEsriHomePage();		
	}
}