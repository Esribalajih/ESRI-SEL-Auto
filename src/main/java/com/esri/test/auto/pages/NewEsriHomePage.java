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
		if(!VerifyTitle("Esri - GIS Mapping Software, Solutions, Services, Map Apps, and Data"))
		Reporter.reportStep("This is not a New Esri Home Page", "FAIL");
	}
	
	public NewEsriHomePage verify1stImageHeader(String Image1Header) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewEsriHomePage.ArcGISImageryBasemapimage1heading.xpath"), Image1Header);
		return this;
	}
	
	public NewEsriHomePage click2ndImage() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.PortofLosAngelesimage1button.xpath"));
		return this;
	}
	

	public NewEsriHomePage verify2ndImageHeader(String Image2Header) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewEsriHomePage.PortofLosAngelesimage1heading.xpath"), Image2Header);
		return this;
	}
	
	public NewEsriHomePage click3rdImage() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.ArcGISImageryBasemapimage2button.xpath"));
		return this;
	}
	
	public NewEsriHomePage verify3rdImageHeader(String Image3Header) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewEsriHomePage.ArcGISImageryBasemapimage2heading.xpath"), Image3Header);
		return this;
	}
	
	public NewEsriHomePage click4thImage() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.PortofLosAngelesimage2button.xpath"));
		return this;
	}
	
	public NewEsriHomePage verify4thImageHeader (String Image4Header) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewEsriHomePage.PortofLosAngelesimage2heading.xpath"), Image4Header);
		return this;
	}
	
	public NewEsriHomePage verifyQuoteText1(String Quote1) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewEsriHomePage.QuoteText1.xpath"), Quote1);
		return this;
	}
	
	public NewEsriHomePage clickQuote1() throws Throwable{
		//waitTillElementVisibleByXpath("NewEsriHomePage.Quote1.xpath");
		clickByXpath(prop.getProperty("NewEsriHomePage.Quote1.xpath"));
		return this;
	}
	
	public NewEsriHomePage clickQuote2() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Quote2.xpath"));
		return this;
	}
	
	public NewEsriHomePage verifyQuoteText2(String Quote2) throws Throwable{
		waitForPageLoad(3);
		VerifyTextByXpath(prop.getProperty("NewEsriHomePage.QuoteText1.xpath"), Quote2);
		return this;
	}
	
	public NewEsriHomePage clickQuote3() throws Throwable{
     	clickByXpath(prop.getProperty("NewEsriHomePage.Quote3.xpath"));
		return this;
	}
	
	public NewEsriHomePage verifyQuoteText3(String Quote3) throws Throwable{
		waitForPageLoad(3);
		VerifyTextByXpath(prop.getProperty("NewEsriHomePage.QuoteText1.xpath"), Quote3);
		return this;
	}
	
	public EsriHomePage clickEsriHomelink() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Esrihome.xpath"));
		return new EsriHomePage();	
	}
	//----------------------
	public EsriEmailPage clickEmail() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Email.xpath"));
		return new EsriEmailPage();	
	}
	
	public EsriInstagramPage clickInstagram() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Instagram.xpath"));
		return new EsriInstagramPage();	
	}

	public EsriTwitterPage clickTwitter() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Twitter.xpath"));
		return new EsriTwitterPage();	
	}
	
	public EsriFacebookPage clickfacebook() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Facebook.xpath"));
		return new EsriFacebookPage();	
	}
	
	public EsriLinkedInPage clickLinkedin() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.LinkedIn.xpath"));
		return new EsriLinkedInPage();	
	}
	
	public EsriGooglePlusPage clickGoogleplus() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.googleplus.xpath"));
		return new EsriGooglePlusPage();	
	}
	
	//This field has been removed
	public EsriPinterestPage clickPinterest() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Pinterest.xpath"));
		return new EsriPinterestPage();	
	}
	
	public EsriRSSHomePage clickRSS() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.RSS.xpath"));
		return new EsriRSSHomePage();	
	}
	
	public NewEsriHomePage clickImage1Link() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Image1seethenewcollection.xpath"));
		return this;	
	}
	
	public NewEsriHomePage clickImage2Link() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Image2seehowtheydoit.xpath"));
		return this;
	}
	
	public NewEsriHomePage clickImage3Link() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Image3seehowtheydoit.xpath"));
		return this;	
	}
	
	public NewEsriHomePage clickImage4Link() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Image4seehowtheydoit.xpath"));
		return this;	
	}
	
	public NewEsriHomePage clickArcGis() throws Throwable{
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("NewEsriHomePage.ArcGIS.xpath"));
		return this;	
	}
	public NewEsriHomePage clickProductHighlightimage() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.ArcGISPronowAvailable.xpath"));
		return this;	
	}
	public NewEsriHomePage clickProductHighlightlink() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.ArcGISPronowAvailable.xpath"));
		return this;	
	}
	
	public NewEsriHomePage clickIndustry() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Industrylocation.xpath"));
		return this;	
	}
	public NewEsriHomePage clickInitiativesmartcommunitiesimage() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.IndustryInitiativesmartcommunities.xpath"));
		return this;	
	}
	public NewEsriHomePage clickInitiativesmartcommunitieslink() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.IndustryInitiativesmartcommunities.xpath"));
		return this;	
	}	
	public NewEsriHomePage clickInnovation() throws Throwable{
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
	}	
	public NewEsriHomePage clickNews() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.news.xpath"));
		return this;	
	}
	public NewEsriHomePage clickInthenewsimage() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Inthenews.xpath"));
		return this;	
	}
	public NewEsriHomePage clickInthenewslink() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Inthenews.xpath"));
		return this;	
	}
	
	public NewEsriHomePage clickEvents() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Events.xpath"));
		return this;	
	}
	public NewEsriHomePage clickEventspotlightimage() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Eventspotlight.xpath"));
		return this;	
	}
	public NewEsriHomePage clickEventspotlightlink() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Eventspotlight.xpath"));
		return this;	
	}
	
	public NewEsriHomePage clickGreatWorks() throws Throwable{
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
	}

	public NewEsriHomePage clickAboutesri() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Aboutesri.xpath"));
		return this;	
	}
	public NewEsriHomePage clickWhatisGIS() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.WhatisGIS.xpath"));
		return this;	
	}
	
}
	