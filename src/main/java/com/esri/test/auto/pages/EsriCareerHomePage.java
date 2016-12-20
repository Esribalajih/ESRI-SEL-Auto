package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Main Page
 * @author balajih
 *
 */
public class EsriCareerHomePage extends ESRIWrappers {

	public EsriCareerHomePage() throws Throwable{
		if(!VerifyTitle("Careers at Esri")){
			Reporter.reportStep("this is not a Esri Career Page", "FAIL");
		}
	}

	public EsriCareerHomePage verifyCareerMainHdr(String careerMHdr){
		try {
			VerifyTextByXpath(prop.getProperty("CareerHomePage.mainHdr.xpath"), careerMHdr);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public EsriCareerJobDetailsPage clickComeJoinUS() throws Throwable{
		clickByLinkText(prop.getProperty("CareerHomePage.ComeJoinHdr.linktext"));
		return new EsriCareerJobDetailsPage();
	}

	public EsriCareerStudLoginPage clickLogIn() throws Throwable{
		clickByClassName(prop.getProperty("CareerHomePage.Login.classname"));
		return new EsriCareerStudLoginPage();
	}
	public EsriCareerHomePage clickScrolltoExplore() throws Throwable{
		clickByClassName(prop.getProperty("CareerHomePage.Scrolldown.classname"));
		return this;
	}
	//Navigation between the Photo slides

	public EsriCareerHomePage clickleftsideButton() throws Throwable{
		clickByClassName(prop.getProperty("CareerHomePage.leftslidebutton.classname"));
		return this;
	}

	public EsriCareerHomePage clickrightsideButton() throws Throwable{
		clickByClassName(prop.getProperty("CareerHomePage.rightslidebutton.classname"));
		return this;
	}
	//Footer Menu Functionalities

	public EsriCareerHomePage clickEsripolicyEEOlink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerHomePage.footerpolicy.linktext"));
		return this;
	}
	
	public EsriCareerHomePage clickAccomlink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerHomePage.footeraccom.linktext"));
		return this;
	}
	
	public EsriCareerPrivacyStatePage clickPrivacylink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerHomePage.footerprivacy.linktext"));
		return new EsriCareerPrivacyStatePage();
	}
	
	public EsriCareerHomePage clickLawPosterlink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerHomePage.footerlawposter.linktext"));
		return this;
	}
	
	public EsriCareerInstagramPage clickFooterInstagramButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerHomePage.footerInstagramlink.xpath"));
		return new EsriCareerInstagramPage();
	}

	public EsriCareerFacebookPage clickFooterFacebookButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerHomePage.footerFacebooklink.xpath"));
		return new EsriCareerFacebookPage();
	}

	public EsriCareerTwitterPage clickFooterTwitterButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerHomePage.footerTwitterlink.xpath"));
		return new EsriCareerTwitterPage();
	}

	public EsriCareerLinkedInPage clickFooterLinkedInButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerHomePage.footerLinkedInlink.xpath"));
		return new EsriCareerLinkedInPage();
	}

	//Click Come Join Us Footer button

	public EsriCareerJobDetailsPage clickComeJoinUSFooter() throws Throwable{
		clickByLinkText(prop.getProperty("CareerHomePage.ComeJoinUsFooterbtn.classname"));
		return new EsriCareerJobDetailsPage();
	}
	//Accessing Widgets Buttons
	public EsriCareerBlogPage clickBlogButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerHomePage.bloglink.xpath"));
		return new EsriCareerBlogPage();
	}

	public EsriCareerInstagramPage clickInstagramButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerHomePage.instagramlink.xpath"));
		return new EsriCareerInstagramPage();
	}

	public EsriCareerFacebookPage clickFacebookButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerHomePage.facebooklink.xpath"));
		return new EsriCareerFacebookPage();
	}

	public EsriCareerTwitterPage clickTwitterButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerHomePage.twitterlink.xpath"));
		return new EsriCareerTwitterPage();
	}

	public EsriCareerLinkedInPage clickLinkedInButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerHomePage.linkedinLink.xpath"));
		return new EsriCareerLinkedInPage();
	}

	





}
