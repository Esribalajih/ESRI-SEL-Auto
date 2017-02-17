package com.esri.test.auto.pages;

//import org.openqa.selenium.support.ui.WebDriverWait;
import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;
/**This is a New Esri Home Page
 * @author Rizwan
 *
 */
public class NewEsriHomePage extends ESRIWrappers{
	
	
	public NewEsriHomePage() throws Throwable{
		waitForPageLoad(3);
		if(!VerifyTitle("GIS Mapping Software, Spatial Data Analytics & Location Platform | Esri"))
		Reporter.reportStep("This is not a New Esri Home Page", "FAIL");
	}
	
	public NewEsriHomePage verify1stImageHeader(String Image1Header) throws Throwable{
		//VerifyTextByXpath(prop.getProperty("NewEsriHomePage.ArcGISImageryBasemapimage1heading.xpath"), Image1Header);
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.1imageheader.xpath"), Image1Header);
		return this;
	}
	
	public ESRINewHome_AboutESRIPage clickImage1Link() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriUATHomePage.SeeHowwithTheScienceofWhere.xpath"));
		return new ESRINewHome_AboutESRIPage();	
	}
	
	
	public NewEsriHomePage click2ndImage() throws Throwable{
		waitForPageLoad(3);
		//clickByXpath(prop.getProperty("NewEsriHomePage.PortofLosAngelesimage1button.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.LocationStrategyforBusinessbutton.xpath"));
		return this;
	}
	
	public NewEsriHomePage verify2ndImageHeader(String Image2Header) throws Throwable{
		waitForPageLoad(3);
		//VerifyTextByXpath(prop.getProperty("NewEsriHomePage.PortofLosAngelesimage1heading.xpath"), Image2Header);
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.2imageheader.xpath"), Image2Header);
		return this;
	}
			
	public ESRINewHome_LocationStrategyPage clickImage2Link() throws Throwable{
		waitForPageLoad(3);
		//clickByXpath(prop.getProperty("NewEsriHomePage.Image2seehowtheydoit.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.Uncoveractionableinsights.xpath"));
		return new ESRINewHome_LocationStrategyPage();
	}
	
	public NewEsriHomePage click3rdImage() throws Throwable{
		waitForPageLoad(3);
		//clickByXpath(prop.getProperty("NewEsriHomePage.ArcGISImageryBasemapimage2button.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.DevelopingGeospatialSciencebutton.xpath"));
		return this;
	}
	
	public NewEsriHomePage verify3rdImageHeader(String Image3Header) throws Throwable{
		waitForPageLoad(3);
		//VerifyTextByXpath(prop.getProperty("NewEsriHomePage.ArcGISImageryBasemapimage2heading.xpath"), Image3Header);
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.3imageheader.xpath"), Image3Header);
		return this;
	}
	
	public ESRINewHome_DevSummitPage clickImage3Link() throws Throwable{
		waitForPageLoad(3);
		//clickByXpath(prop.getProperty("NewEsriHomePage.Image3seehowtheydoit.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.TestdrivenewtechnologyatDevSummit.xpath"));
		return new ESRINewHome_DevSummitPage();	
	}
	
	public NewEsriHomePage click4thImage() throws Throwable{
		waitForPageLoad(3);
		//clickByXpath(prop.getProperty("NewEsriHomePage.PortofLosAngelesimage2button.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.DoItYourselfGeoAppsbutton.xpath"));
		return this;
	}
	
	public NewEsriHomePage verify4thImageHeader (String Image4Header) throws Throwable{
		waitForPageLoad(3);
		//VerifyTextByXpath(prop.getProperty("NewEsriHomePage.PortofLosAngelesimage2heading.xpath"), Image4Header);
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.4imageheader.xpath"), Image4Header);
		return this;
	}
	
	public ESRINewHome_DIYGeoAppsPage clickImage4Link() throws Throwable{
		waitForPageLoad(3);
		//clickByXpath(prop.getProperty("NewEsriHomePage.Image4seehowtheydoit.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.Registerforafreeonlinecourse.xpath"));
		return new ESRINewHome_DIYGeoAppsPage();	
	}
	
	public NewEsriHomePage ScrollDownArrow() throws Throwable{
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("NewEsriUATHomePage.ScrollDownArrow.xpath"));
		return this;	
	}
		
	public ESRINewHome_AboutArcgisPage clickArcGisLink() throws Throwable{
		waitForPageLoad(5);
		//clickByXpath(prop.getProperty("NewEsriHomePage.ArcGIS.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.ArcGISlink.xpath"));
		return new ESRINewHome_AboutArcgisPage();	
	}
		
	public ESRINewHome_WhatsNewPage clickProductHighlightimage() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.ArcGISPronowAvailable.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.ArcGIS10_5ishere.xpath"));
		return new ESRINewHome_WhatsNewPage();	
	}
	public ESRINewHome_WhatsNewPage clickProductHighlightlink() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.ArcGISPronowAvailable.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.ArcGIS10_5ishere.xpath"));
		return new ESRINewHome_WhatsNewPage();	
	}
	
	public ESRINewHome_IndustriesPage clickIndustrylink() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Industrylocation.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.Industrylocation.xpath"));
		return new ESRINewHome_IndustriesPage();	
	}
		
	public ESRINewHome_OperationalIntelligencePage clickIndustryInitiativeimage() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.IndustryInitiativesmartcommunities.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.MakeBetterOperationalDecisionsimagelink.xpath"));
		return new ESRINewHome_OperationalIntelligencePage();	
	}
	public ESRINewHome_OperationalIntelligencePage clickInduatryInitiativelink() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.IndustryInitiativesmartcommunities.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.MakeBetterOperationalDecisionsimagelink.xpath"));
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
	
	public ESRINewHome_ESRINewsPage clickNewsLink() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.news.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.newsLink.xpath"));
		return new ESRINewHome_ESRINewsPage();	
	}
	
	public ESRINewHome_GIS_IONPage clickImprovingournationimage() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Inthenews.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.ImprovingournationImageLink.xpath"));
		clickCancelAlertBox();
		return new ESRINewHome_GIS_IONPage();	
	}
	
	public ESRINewHome_GIS_IONPage clickImprovingournationlink() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Inthenews.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.ImprovingournationImageLink.xpath"));
		return new ESRINewHome_GIS_IONPage();	
	}
	
	public ESRINewHome_EventsPage clickEventsLink() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Events.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.EventsLink.xpath"));
		return new ESRINewHome_EventsPage();	
	}
	
	public ESRINewHome_UserConferencePage ClickUpcomingEventsimage() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Eventspotlight.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.UcomingEventsimageLink.xpath"));
		return new ESRINewHome_UserConferencePage();	
	}
	public ESRINewHome_UserConferencePage clickUpcomingEventslink() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Eventspotlight.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.UcomingEventsimageLink.xpath"));
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
	
	public ESRINewHome_MapsWeLovePage clickMapsWeLove() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriUATHomePage.MapsWeLoveLink.xpath"));
		return new ESRINewHome_MapsWeLovePage();	
	}
	
	public ESRINewHome_MinneapolisSolarPage clickFuturedMapimage() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriUATHomePage.FuturedMapImageLink.xpath"));
		return new ESRINewHome_MinneapolisSolarPage();	
	}
	
	public ESRINewHome_MinneapolisSolarPage clickFuturedMaplink() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriUATHomePage.FuturedMapImageLink.xpath"));
		return new ESRINewHome_MinneapolisSolarPage();
	}

	public NewEsriHomePage verifyQuoteText1(String Quote1) throws Throwable{
		//VerifyTextByXpath(prop.getProperty("NewEsriHomePage.QuoteText1.xpath"), Quote1);
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.QuoteText1.xpath"), Quote1);
		return this;
	}
	
	public NewEsriHomePage clickQuote1btn() throws Throwable{
		//waitTillElementVisibleByXpath("NewEsriHomePage.Quote1.xpath");
		clickByXpath(prop.getProperty("NNewEsriUATHomePage.Quote1btn.xpath"));
		return this;
	}
	
	public NewEsriHomePage clickQuote2btn() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Quote2.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.Quote2btn.xpath"));
		return this;
	}
	
	public NewEsriHomePage verifyQuoteText2(String Quote2) throws Throwable{
		waitForPageLoad(3);
		//VerifyTextByXpath(prop.getProperty("NewEsriHomePage.QuoteText1.xpath"), Quote2);
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.QuoteText2.xpath"), Quote2);
		return this;
	}
	
	public NewEsriHomePage clickQuote3btn() throws Throwable{
     	//clickByXpath(prop.getProperty("NewEsriHomePage.Quote3.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.Quote3btn.xpath"));
		return this;
	}
	
	public NewEsriHomePage verifyQuoteText3(String Quote3) throws Throwable{
		waitForPageLoad(3);
		//VerifyTextByXpath(prop.getProperty("NewEsriHomePage.QuoteText1.xpath"), Quote3);
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.QuoteText3.xpath"), Quote3);
		return this;
	}
	
	public ESRINewHome_AboutESRIPage clickAboutesriLink() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Aboutesri.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.AboutesriLink.xpath"));
		return new ESRINewHome_AboutESRIPage();	
	}
	
	public ESRINewHome_WhatisGISPage clickWhatisGISLink() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.WhatisGIS.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.WhatisGISLink.xpath"));
		return new ESRINewHome_WhatisGISPage();	
	}
	
	public EsriHomePage clickEsriHomelink() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Esrihome.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.EsrihomeLink.xpath"));
		return new EsriHomePage();	
	}
	//----------------------
	public EsriNewHome_EmailPage clickEmailWidget() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Email.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.Email.xpath"));
		return new EsriNewHome_EmailPage();	
	}
	
	public EsriNewHome_InstagramPage clickInstagramWidget() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Instagram.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.InstagramWidget.xpath"));
		return new EsriNewHome_InstagramPage();	
	}

	public EsriNewHome_TwitterPage clickTwitterWidget() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Twitter.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.TwitterWidget.xpath"));
		return new EsriNewHome_TwitterPage();	
	}
	
	public EsriNewHome_FacebookPage clickfacebookWidget() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.Facebook.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.FacebookWidget.xpath"));
		return new EsriNewHome_FacebookPage();	
	}
	
	public EsriNewHome_LinkedInPage clickLinkedinWidget() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.LinkedIn.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.LinkedInWidget.xpath"));
		return new EsriNewHome_LinkedInPage();	
	}
	
	public EsriNewHome_GooglePlusPage clickGoogleplusWidget() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.googleplus.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.googleplusWidget.xpath"));
		return new EsriNewHome_GooglePlusPage();	
	}
	
	//This field has been removed
	public EsriPinterestPage clickPinterest() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Pinterest.xpath"));
		return new EsriPinterestPage();	
	}
	
	public EsriNewHome_RSSPage clickRSSWidget() throws Throwable{
		//clickByXpath(prop.getProperty("NewEsriHomePage.RSS.xpath"));
		clickByXpath(prop.getProperty("NewEsriUATHomePage.RSSWidget.xpath"));
		return new EsriNewHome_RSSPage();	
	}
	
}
	