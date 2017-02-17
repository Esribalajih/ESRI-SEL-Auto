package com.esri.test.auto.pages;

//import org.openqa.selenium.support.ui.WebDriverWait;
import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;
/**This is a New Esri Home Page
 * @author Rizwan
 *
 */
public class ESRINewHomePage extends ESRIWrappers{
	
	
	public ESRINewHomePage() throws Throwable{
		waitForPageLoad(3);
		if(!VerifyTitle("GIS Mapping Software, Spatial Data Analytics & Location Platform | Esri"))
		Reporter.reportStep("This is not a Esri Home Page", "FAIL");
	}
	
	public ESRINewHomePage verify1stImageHeader(String Image1Header) throws Throwable{
		//VerifyTextByXpath(prop.getProperty("NewEsriHomePage.ArcGISImageryBasemapimage1heading.xpath"), Image1Header);
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.1imageheader.xpath"), Image1Header);
		return this;
	}
	
	public ESRINewHome_AboutESRIPage clickImage1Link(String data) throws Throwable{
		waitForPageLoad(3);
		clickButtonByXpath(prop.getProperty("NewEsriUATHomePage.SeeHowwithTheScienceofWhere.xpath"),data);
		return new ESRINewHome_AboutESRIPage();	
	}
	
	
	public ESRINewHomePage click2ndImage(String data) throws Throwable{
		waitForPageLoad(3);
		//clickByXpath(prop.getProperty("NewEsriHomePage.PortofLosAngelesimage1button.xpath"));
		clickButtonByXpath(prop.getProperty("NewEsriUATHomePage.LocationStrategyforBusinessbutton.xpath"),data);
		return this;
	}
	
	public ESRINewHomePage verify2ndImageHeader(String Image2Header) throws Throwable{
		waitForPageLoad(3);
		//VerifyTextByXpath(prop.getProperty("NewEsriHomePage.PortofLosAngelesimage1heading.xpath"), Image2Header);
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.2imageheader.xpath"), Image2Header);
		return this;
	}
			
	public ESRINewHome_LocationStrategyPage clickImage2Link(String data) throws Throwable{
		waitForPageLoad(3);
		//clickByXpath(prop.getProperty("NewEsriHomePage.Image2seehowtheydoit.xpath"));
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.Uncoveractionableinsights.xpath"),data);
		return new ESRINewHome_LocationStrategyPage();
	}
	
	public ESRINewHomePage click3rdImage(String data) throws Throwable{
		waitForPageLoad(3);
		//clickByXpath(prop.getProperty("NewEsriHomePage.ArcGISImageryBasemapimage2button.xpath"));
		clickButtonByXpath(prop.getProperty("NewEsriUATHomePage.DevelopingGeospatialSciencebutton.xpath"),data);
		return this;
	}
	
	public ESRINewHomePage verify3rdImageHeader(String Image3Header) throws Throwable{
		waitForPageLoad(3);
		//VerifyTextByXpath(prop.getProperty("NewEsriHomePage.ArcGISImageryBasemapimage2heading.xpath"), Image3Header);
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.3imageheader.xpath"), Image3Header);
		return this;
	}
	
	public ESRINewHome_DevSummitPage clickImage3Link(String data) throws Throwable{
		waitForPageLoad(3);
		//clickByXpath(prop.getProperty("NewEsriHomePage.Image3seehowtheydoit.xpath"));
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.TestdrivenewtechnologyatDevSummit.xpath"),data);
		return new ESRINewHome_DevSummitPage();	
	}
	
	public ESRINewHomePage click4thImage(String data) throws Throwable{
		waitForPageLoad(3);
		//clickByXpath(prop.getProperty("NewEsriHomePage.PortofLosAngelesimage2button.xpath"));
		clickButtonByXpath(prop.getProperty("NewEsriUATHomePage.DoItYourselfGeoAppsbutton.xpath"),data);
		return this;
	}
	
	public ESRINewHomePage verify4thImageHeader (String Image4Header) throws Throwable{
		waitForPageLoad(3);
		//VerifyTextByXpath(prop.getProperty("NewEsriHomePage.PortofLosAngelesimage2heading.xpath"), Image4Header);
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.4imageheader.xpath"), Image4Header);
		return this;
	}
	
	public ESRINewHome_DIYGeoAppsPage clickImage4Link(String data) throws Throwable{
		waitForPageLoad(3);
		//clickByXpath(prop.getProperty("NewEsriHomePage.Image4seehowtheydoit.xpath"));
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.Registerforafreeonlinecourse.xpath"),data);
		return new ESRINewHome_DIYGeoAppsPage();	
	}
	
	public ESRINewHomePage ScrollDownArrow() throws Throwable{
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("NewEsriUATHomePage.ScrollDownArrow.xpath"));
		return this;	
	}
		
	public ESRINewHome_AboutArcgisPage clickArcGisLink(String data) throws Throwable{
		waitForPageLoad(3);
		//clickByXpath(prop.getProperty("NewEsriHomePage.ArcGIS.xpath"));
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.ArcGISlink.xpath"),data);
		return new ESRINewHome_AboutArcgisPage();	
	}
		
	public ESRINewHome_WhatsNewPage clickProductHighlightimage(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.ArcGISPronowAvailable.xpath"));
		clickImageByXpath(prop.getProperty("NewEsriUATHomePage.ArcGIS10_5ishere.xpath"),data);
		return new ESRINewHome_WhatsNewPage();	
	}
	public ESRINewHome_WhatsNewPage clickProductHighlightlink(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.ArcGISPronowAvailable.xpath"));
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.ArcGIS10_5ishere.xpath"),data);
		return new ESRINewHome_WhatsNewPage();	
	}
	
	public ESRINewHome_IndustriesPage clickIndustrylink(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Industrylocation.xpath"));
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.Industrylocation.xpath"),data);
		return new ESRINewHome_IndustriesPage();	
	}
		
	public ESRINewHome_OperationalIntelligencePage clickIndustryInitiativeimage(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.IndustryInitiativesmartcommunities.xpath"));
		clickImageByXpath(prop.getProperty("NewEsriUATHomePage.MakeBetterOperationalDecisionsimagelink.xpath"),data);
		return new ESRINewHome_OperationalIntelligencePage();	
	}
	public ESRINewHome_OperationalIntelligencePage clickInduatryInitiativelink(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.IndustryInitiativesmartcommunities.xpath"));
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.MakeBetterOperationalDecisionsimagelink.xpath"),data);
		return new ESRINewHome_OperationalIntelligencePage();	
	}	
	
	/*public NewEsriHomePage clickInnovationLink() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Innovationstories.xpath"));
		return this;	
	}
	
	public NewEsriHomePage clickThoughtleadershipimage() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Innovationthoughtleadership.xpath"));
		return this;	
	}
	public NewEsriHomePage clickThoughtleadershiplink() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Innovationthoughtleadership.xpath"));
		return this;	
	}*/
	
	public ESRINewHome_ESRINewsPage clickNewsLink(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.news.xpath"));
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.newsLink.xpath"),data);
		return new ESRINewHome_ESRINewsPage();	
	}
	
	public ESRINewHome_GIS_IONPage clickImprovingournationimage(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Inthenews.xpath"));
		clickImageByXpath(prop.getProperty("NewEsriUATHomePage.ImprovingournationImageLink.xpath"),data);
		return new ESRINewHome_GIS_IONPage();	
	}
	
	public ESRINewHome_GIS_IONPage clickImprovingournationlink(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Inthenews.xpath"));
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.ImprovingournationImageLink.xpath"),data);
		return new ESRINewHome_GIS_IONPage();	
	}
	
	public ESRINewHome_EventsPage clickEventsLink(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Events.xpath"));
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.EventsLink.xpath"),data);
		return new ESRINewHome_EventsPage();	
	}
	
	public ESRINewHome_UserConferencePage ClickUpcomingEventsimage(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Eventspotlight.xpath"));
		clickImageByXpath(prop.getProperty("NewEsriUATHomePage.UcomingEventsimageLink.xpath"),data);
		return new ESRINewHome_UserConferencePage();	
	}
	public ESRINewHome_UserConferencePage clickUpcomingEventslink(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Eventspotlight.xpath"));
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.UcomingEventsimageLink.xpath"),data);
		return new ESRINewHome_UserConferencePage();	
	}
	
	/*public NewEsriHomePage clickGreatWorks() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Greatwork.xpath"));
		return this;	
	}
	public NewEsriHomePage clickUserMadeContentimage() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.UserMadeContent.xpath"));
		return this;	
	}
	public NewEsriHomePage clickUserMadeContentlink() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.UserMadeContent.xpath"));
		return this;	
	}*/
	
	public ESRINewHome_MapsWeLovePage clickMapsWeLove(String data) throws Throwable{
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.MapsWeLoveLink.xpath"),data);
		return new ESRINewHome_MapsWeLovePage();	
	}
	
	public ESRINewHome_MinneapolisSolarPage clickFuturedMapimage(String data) throws Throwable{
		clickImageByXpath(prop.getProperty("NewEsriUATHomePage.FuturedMapImageLink.xpath"),data);
		return new ESRINewHome_MinneapolisSolarPage();	
	}
	
	public ESRINewHome_MinneapolisSolarPage clickFuturedMaplink(String data) throws Throwable{
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.FuturedMapImageLink.xpath"),data);
		return new ESRINewHome_MinneapolisSolarPage();
	}

	public ESRINewHomePage verifyQuoteText1(String Quote1) throws Throwable{
		waitForPageLoad(2);
		//waitTillElementVisibleByXpath("NewEsriUATHomePage.QuoteText1.xpath");
		//VerifyTextByXpath(prop.getProperty("NewEsriHomePage.QuoteText1.xpath"), Quote1);
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.QuoteText1.xpath"), Quote1);
		return this;
	}
	
	public ESRINewHomePage clickQuote1btn(String data) throws Throwable{
		waitForPageLoad(2);
		//waitTillElementVisibleByXpath("NewEsriUATHomePage.Quote1btn.xpath");
		clickButtonByXpath(prop.getProperty("NewEsriUATHomePage.Quote1btn.xpath"),data);
		return this;
	}
	
	public ESRINewHomePage clickQuote2btn(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Quote2.xpath"));
		clickButtonByXpath(prop.getProperty("NewEsriUATHomePage.Quote2btn.xpath"),data);
		return this;
	}
	
	public ESRINewHomePage verifyQuoteText2(String Quote2) throws Throwable{
		waitForPageLoad(2);
		//VerifyTextByXpath(prop.getProperty("NewEsriHomePage.QuoteText1.xpath"), Quote2);
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.QuoteText2.xpath"), Quote2);
		return this;
	}
	
	public ESRINewHomePage clickQuote3btn(String data) throws Throwable{
		waitForPageLoad(3);
     	//clickByXpath(prop.getProperty("NewEsriHomePage.Quote3.xpath"));
		clickButtonByXpath(prop.getProperty("NewEsriUATHomePage.Quote3btn.xpath"),data);
		return this;
	}
	
	public ESRINewHomePage verifyQuoteText3(String Quote3) throws Throwable{
		waitForPageLoad(3);
		//VerifyTextByXpath(prop.getProperty("NewEsriHomePage.QuoteText1.xpath"), Quote3);
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.QuoteText3.xpath"), Quote3);
		return this;
	}
	
	public ESRINewHome_AboutESRIPage clickAboutesriLink(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Aboutesri.xpath"));
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.AboutesriLink.xpath"),data);
		return new ESRINewHome_AboutESRIPage();	
	}
	
	public ESRINewHome_WhatisGISPage clickWhatisGISLink(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.WhatisGIS.xpath"));
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.WhatisGISLink.xpath"),data);
		return new ESRINewHome_WhatisGISPage();	
	}
	
	public ESRINewHomePage clickEsriHomelink(String data) throws Throwable{
		//waitTillElementVisibleByXpath("NewEsriUATHomePage.EsrihomeLink.xpath");
		//clickByXpath(prop.getProperty("NewEsriHomePage.Esrihome.xpath"));
		waitForPageLoad(3);
		clickLinkByXpath(prop.getProperty("NewEsriUATHomePage.EsrihomeLink.xpath"),data);
		return this;	
	}
	//----------------------
	public EsriNewHome_EmailPage clickEmailWidget(String data) throws Throwable{
		waitForPageLoad(3);
		//clickByXpath(prop.getProperty("NewEsriHomePage.Email.xpath"));
		clickButtonByXpath(prop.getProperty("NewEsriUATHomePage.EmailWidget.xpath"),data);
		return new EsriNewHome_EmailPage();	
	}
	
	public EsriNewHome_InstagramPage clickInstagramWidget(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Instagram.xpath"));
		clickButtonByXpath(prop.getProperty("NewEsriUATHomePage.InstagramWidget.xpath"),data);
		return new EsriNewHome_InstagramPage();	
	}

	public EsriNewHome_TwitterPage clickTwitterWidget(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Twitter.xpath"));
		clickButtonByXpath(prop.getProperty("NewEsriUATHomePage.TwitterWidget.xpath"),data);
		return new EsriNewHome_TwitterPage();	
	}
	
	public EsriNewHome_FacebookPage clickfacebookWidget(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Facebook.xpath"));
		clickButtonByXpath(prop.getProperty("NewEsriUATHomePage.FacebookWidget.xpath"),data);
		return new EsriNewHome_FacebookPage();	
	}
	
	public EsriNewHome_LinkedInPage clickLinkedinWidget(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.LinkedIn.xpath"));
		clickButtonByXpath(prop.getProperty("NewEsriUATHomePage.LinkedInWidget.xpath"),data);
		return new EsriNewHome_LinkedInPage();	
	}
	
	public EsriNewHome_GooglePlusPage clickGoogleplusWidget(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.googleplus.xpath"));
		clickButtonByXpath(prop.getProperty("NewEsriUATHomePage.googleplusWidget.xpath"),data);
		return new EsriNewHome_GooglePlusPage();	
	}
	
	//This field has been removed
	public EsriPinterestPage clickPinterest(String data) throws Throwable{
		clickButtonByXpath(prop.getProperty("NewEsriHomePage.Pinterest.xpath"),data);
		return new EsriPinterestPage();	
	}
	
	public EsriNewHome_RSSPage clickRSSWidget(String data) throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.RSS.xpath"));
		clickButtonByXpath(prop.getProperty("NewEsriUATHomePage.RSSWidget.xpath"),data);
		return new EsriNewHome_RSSPage();	
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public ESRINewHomePage headerEmbedCode() throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),prop.getProperty("Tag.HeaderEmbedCode.text"));
		return this;
	}
	public ESRINewHomePage googleTagManagerForScript() throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForScript.text"));
		return this;
	}	
	public ESRINewHomePage googleTagManagerForNoScript() throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForNoScript.text"));
		return this;
	}
	public ESRINewHomePage footerEmbbedCode() throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),prop.getProperty("Tag.FooterEmbbedCode.text"));
		return this;
	}
	public ESRINewHomePage pardotDataLayerCode() throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),prop.getProperty("Tag.PardotDataLayerCode.text"));
		return this;
	}
	
}
	