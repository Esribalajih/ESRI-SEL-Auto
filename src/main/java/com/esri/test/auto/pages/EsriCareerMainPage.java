package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Main Page
 * @author balajih
 *
 */
public class EsriCareerMainPage extends ESRIWrappers {

	public EsriCareerMainPage() throws Throwable{
		if(!VerifyTitle("Careers at Esri")){
			Reporter.reportStep("this is not a Esri Career Page", "FAIL");
		}
	}

	public EsriCareerMainPage verifyCareerMainHdr(String careerMHdr){
		try {
			VerifyTextByXpath(prop.getProperty("CareerMainPage.mainHdr.xpath"), careerMHdr);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public EsriCareerJobDetailsPage clickComeJoinUS() throws Throwable{
		clickByLinkText(prop.getProperty("CareerMainPage.ComeJoinHdr.linktext"));
		return new EsriCareerJobDetailsPage();
	}

	public EsriCareerMainPage clickLogIn() throws Throwable{
		clickByClassName(prop.getProperty("CareerMainPage.Login.classname"));
		return this;
	}
	public EsriCareerMainPage clickScrolltoExplore() throws Throwable{
		clickByClassName(prop.getProperty("CareerMainPage.Scrolldown.classname"));
		return this;
	}
	//Navigation between the Photo slides

	public EsriCareerMainPage clickleftsideButton() throws Throwable{
		clickByClassName(prop.getProperty("CareerMainPage.leftslidebutton.classname"));
		return this;
	}

	public EsriCareerMainPage clickrightsideButton() throws Throwable{
		clickByClassName(prop.getProperty("CareerMainPage.rightslidebutton.classname"));
		return this;
	}
	//Footer Menu Functionalities

	public EsriCareerMainPage clickEsripolicyEEOlink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerMainPage.footerpolicy.linktext"));
		return this;
	}
	
	public EsriCareerMainPage clickAccomlink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerMainPage.footeraccom.linktext"));
		return this;
	}
	
	public EsriCareerPrivacyStatePage clickPrivacylink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerMainPage.footerprivacy.linktext"));
		return new EsriCareerPrivacyStatePage();
	}
	
	public EsriCareerMainPage clickLawPosterlink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerMainPage.footerlawposter.linktext"));
		return this;
	}

	//Click Come Join Us Footer button

	public EsriCareerJobDetailsPage clickComeJoinUSFooter() throws Throwable{
		clickByLinkText(prop.getProperty("CareerMainPage.ComeJoinUsFooterbtn.classname"));
		return new EsriCareerJobDetailsPage();
	}
	//Accessing Widgets Buttons
	public EsriCareerBlogPage clickBlogButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerMainPage.bloglink.xpath"));
		return new EsriCareerBlogPage();
	}

	public EsriCareerInstagramPage clickInstagramButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerMainPage.instagramlink.xpath"));
		return new EsriCareerInstagramPage();
	}

	public EsriCareerFacebookPage clickFacebookButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerMainPage.facebooklink.xpath"));
		return new EsriCareerFacebookPage();
	}

	public EsriCareerTwitterPage clickTwitterButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerMainPage.twitterlink.xpath"));
		return new EsriCareerTwitterPage();
	}

	public EsriCareerLinkedInPage clickLinkedInButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerMainPage.linkedinLink.xpath"));
		return new EsriCareerLinkedInPage();
	}

	





}
