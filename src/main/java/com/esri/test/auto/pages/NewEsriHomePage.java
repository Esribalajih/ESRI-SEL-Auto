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
		waitForPageLoad(10);
		if(!VerifyTitle("Esri - GIS Mapping Software, Solutions, Services, Map Apps, and Data"))
		Reporter.reportStep("This is not a New Esri Home Page", "FAIL");
	}
	
	public NewEsriHomePage verify1stImageHeader(String Image1Header) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewEsriHomePage.ArcGISImageryBasemapimage1heading.xpath"), Image1Header);
		return this;
	}
	
	public NewEsriHomePage verify2ndImageHeader(String Image2Header) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewEsriHomePage.PortofLosAngelesimage1heading.xpath"), Image2Header);
		return this;
	}
	
	public NewEsriHomePage verify3rdImageHeader(String Image3Header) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewEsriHomePage.ArcGISImageryBasemapimage2heading.xpath"), Image3Header);
		return this;
	}
	
	public NewEsriHomePage verify4thImageHeader (String Image4Header) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewEsriHomePage.PortofLosAngelesimage2heading.xpath"), Image4Header);
		return this;
	}
	
	public NewEsriHomePage clickQuote1() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Quote1.xpath"));
		return this;
	}
	
	public NewEsriHomePage clickQuote2() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Quote2.xpath"));
		return this;
	}
	
	public NewEsriHomePage clickQuote3() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Quote3.xpath"));
		return this;
	}
	
	public EsriHomePage clickEsriHomelink() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Esrihome"));
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
		clickByXpath(prop.getProperty("NewEsriHomePage.LinkedIn.xpath"));
		return new EsriGooglePlusPage();	
	}
	
	public EsriPinterestPage clickPinterest() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.LinkedIn.xpath"));
		return new EsriPinterestPage();	
	}
	
	public EsriRSSHomePage clickRSS() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.LinkedIn.xpath"));
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
		clickByXpath(prop.getProperty("NewEsriHomePage.Image4sseehowtheydoit.xpaths"));
		return this;	
	}
	
	public NewEsriHomePage clickArcGis() throws Throwable{
		clickByLinkText(prop.getProperty("NewEsriHomePage.ArcGIS.linktext"));
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
		clickByLinkText(prop.getProperty("NewEsriHomePage.Industrylocation.linktext"));
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
		clickByLinkText(prop.getProperty("NewEsriHomePage.Innovationstories.linktext"));
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
		clickByLinkText(prop.getProperty("NewEsriHomePage.Events.linktext"));
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

	public NewEsriHomePage clickAboutesri() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.Aboutesri.xpath"));
		return this;	
	}
	public NewEsriHomePage clickWhatisGIS() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriHomePage.WhatisGIS.xpath"));
		return this;	
	}
	
}
	