package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.*;

import com.esri.test.auto.pages.ESRINewHomePage;
import com.esri.test.auto.pages.SigninPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Testcase to test New ESRI Home Page
 * @author Rizwan
 *
 */
public class ESRINewHome_TC01 extends ESRIWrappers {
	@Parameters({"browsers"})
	@BeforeClass
	public void startTestCase() {
		dataSheetName="NewESRIHomePage";
		testCaseName="NewEsriHome_TC01";
		//For IE
		testDescription= "This is the ESRI New Home Page Module - Positive Test scenario,\n"
						+" -> URL : 	http://uat.esri.com,\n"
						+" -> ENV : 	Staging,\n"
						+" -> BROWSER & VERSION: Chrome V_56.0.29.\n";
	}

	@Test(dataProvider="fetchdata")
	public void NewEsriHomePage(
			String EsriAccountsUrl,String Username,String Password,String SignInBtn,String NewEsriSiteCoreURL,
			String Image1Header, String Image1Link,String Image2Btn,String Image2Header, String Image2Link,
			String Image3Btn, String Image3Header, String Image3Link, String Image4Btn, String Image4Header,
			String Image4Link, String Quote1Btn, String Quote1, String Quote2Btn,String Quote2,
			String Quote3Btn,String Quote3,String AboutESRIHeader, String LocationStrategyHeader,String DevSummitHeader,
			String GeoAppsHeader,String ArcGISLink,String ProdHignLigImg,String ProdHignLigLink,String IndustryLink,
			String IndIniImg,String IndIniLink,String NewsLink,String LatNewsImg,String LatNewsLink,
			String EventsLink,String UpEventsImg,String UpEventsLink,String MapWeLoveLink,String FeaturedMapImg,
			String FeaturedMapLink,String AboutESRILink,String WhatsGISLink,String EsriHomeLink,String EventsHeader,
			String userconferenceHeader,String MapsWeLoveHeader,String MinneapolisSolarHeader,String EmailBtn,String InstaBtn,
			String TwitterBtn,String FbBtn,String LinkedInBtn,String GooglePlusBtn,String RssBtn,
			String IndustriesHeader,String OperationalIntelligenceHeader,String ESRINewsHeader,String GIS_IONHeader,String ArcGISWhatsNewHeader,
			String GoogleTagManagerNoScript,String GoogleTagManagerScript,String HeaderEmbedCode,String FooterEmbedCode,String PardotLayerCode) throws Throwable{
		openbrowser(EsriAccountsUrl);
		new SigninPage()
		.enterUserName(Username)
		.enterPassword(Password)
		.clickSigninAccounts(SignInBtn);
		openbrowser(NewEsriSiteCoreURL);
		new ESRINewHomePage()
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.verify1stImageHeader(Image1Header)
		.clickImage1Link(Image1Link)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.VerifyAboutESRIHeader(AboutESRIHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.click2ndImage(Image2Btn)
		.verify2ndImageHeader(Image2Header)
		.clickImage2Link(Image2Link)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.VerifyLocationStrategyHeader(LocationStrategyHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.click3rdImage(Image3Btn)
		.verify3rdImageHeader(Image3Header)
		.clickImage3Link(Image3Link)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.VerifyDevSummitHeaderHeader(DevSummitHeader)
		.clickBrowserBcktoNewEsriHomePage()
		//4th Image Removed From Site on 17-02-2016
		//.click4thImage(Image4Btn)
		//.verify4thImageHeader(Image4Header)
		//.clickImage4Link(Image4Link)
		//.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		//.VerifyGeoAppsHeader(GeoAppsHeader)
		//.clickBrowserBcktoNewEsriHomePage()
		//.clickArcGis()
		.ScrollDownArrow()
		.clickArcGisLink(ArcGISLink)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.clickBrowserBcktoNewEsriHomePage()
		.clickProductHighlightimage(ProdHignLigImg)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.VerifyArcGISWhatsNewHeader(ArcGISWhatsNewHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickProductHighlightlink(ProdHignLigLink)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.VerifyArcGISWhatsNewHeader(ArcGISWhatsNewHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickIndustrylink(IndustryLink)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.VerifyIndustriesHeader(IndustriesHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickIndustryInitiativeimage(IndIniImg)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.VerifyOperationalIntelligenceHeader(OperationalIntelligenceHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickInduatryInitiativelink(IndIniLink)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.VerifyOperationalIntelligenceHeader(OperationalIntelligenceHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickNewsLink(NewsLink)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.VerifynewsHeader(ESRINewsHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickImprovingournationimage(LatNewsImg)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.VerifyIONHeader(GIS_IONHeader)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.clickBrowserBcktoNewEsriHomePage()
		.clickImprovingournationlink(LatNewsLink)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.VerifyIONHeader(GIS_IONHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickEventsLink(EventsLink)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.VerifyEventsHeader(EventsHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.ClickUpcomingEventsimage(UpEventsImg)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.VerifyuserconfirenceHeader(userconferenceHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickUpcomingEventslink(UpEventsLink)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.clickBrowserBcktoNewEsriHomePage()
		.clickMapsWeLove(MapWeLoveLink)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.VerifyMapsWeLoveHeader(MapsWeLoveHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickFuturedMapimage(FeaturedMapImg)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.VerifyMinneapolisSolarHeader(MinneapolisSolarHeader)
		.clickBrowserBcktoNewEsriHomePage()
		.clickFuturedMaplink(FeaturedMapLink)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.clickBrowserBcktoNewEsriHomePage()
		.clickQuote2btn(Quote2Btn)
		.verifyQuoteText2(Quote2)
		.clickQuote1btn(Quote1Btn)
		.verifyQuoteText1(Quote1)
		.clickQuote3btn(Quote3Btn)
		.verifyQuoteText3(Quote3)
		.clickAboutesriLink(AboutESRILink)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.clickBrowserBcktoNewEsriHomePage()	
		.clickWhatisGISLink(WhatsGISLink)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.clickBrowserBcktoNewEsriHomePage()
		.clickEsriHomelink(EsriHomeLink)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
		.clickEmailWidget(EmailBtn)
		.headerEmbedCode(HeaderEmbedCode).googleTagManagerForNoScript(GoogleTagManagerNoScript).googleTagManagerForScript(GoogleTagManagerScript).footerEmbbedCode(FooterEmbedCode).pardotDataLayerCode(PardotLayerCode)
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
		.clickRSSWidget(RssBtn);
		//.clickBrowserBcktoNewEsriHomePage()		
	}
}