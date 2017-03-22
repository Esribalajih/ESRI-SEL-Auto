package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Contact Us page
 * @author balajih
 *
 */
public class EsriCareerContactUsPage extends ESRIWrappers{
	
	public EsriCareerContactUsPage() throws Throwable{
		if (!VerifyTitle("Contact Us"))
			Reporter.reportStep("This is not a Esri Career Contact Us Page", "FAIL");
	}
	
	public EsriCareerContactUsPage verifyContactUsHeader(String CHeader) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CareerContactUsPage.ContactUsHeader.xpath"),CHeader);
		return this;
	}
	
	public EsriCareerContactUsPage clickMyAppRadiobtn(String data) throws Throwable{
		clickRadioBtnByXpath(prop.getProperty("CareerContactUsPage.MyAppRadiobutton.xpath"), data);
		return this;
	}
	
	public EsriCareerContactUsPage enterBriefText(String BText) throws Throwable{
		enterByXpath(prop.getProperty("CareerContactUsPage.TextArea.xpath"),BText);
		return this;
	}
	
	public EsriCareerContactUsPage enterFirstName(String FName) throws Throwable{
		enterById(prop.getProperty("CareerContactUsPage.EnterFirstName.id"),FName);
		return this;
	}
	
	public EsriCareerContactUsPage enterLastName(String LName) throws Throwable{
		enterById(prop.getProperty("CareerContactUsPage.EnterLastName.id"),LName);
		return this;
	}
	
	public EsriCareerContactUsPage enterEmailID(String EmailID) throws Throwable{
		enterById(prop.getProperty("CareerContactUsPage.EnterEmail.id"),EmailID);
		return this;
	}
	
	public EsriCareerContactUsPage enterPhoneNo(String PhoneNo) throws Throwable{
		enterById(prop.getProperty("CareerContactUsPage.EnterPhoneNo.id"),PhoneNo);
		return this;
	}
	
	public EsriCareerPrivacyStatePage clickPrivacyStatementlink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Careershomelink.linktext"));
		return new EsriCareerPrivacyStatePage();
	}
	
	public EsriCareerContactUsPage clickSendButton() throws Throwable{
		clickById(prop.getProperty("CareerContactUsPage.ClickSubmitButton.id"));
		return this;
	}
	
	public EsriCareerContactUsPage verifyConfirmationNotification(String VConfNotific) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CareerContactUsPage.SentNotification.xpath"),VConfNotific);
		return this;
	}
	
	public EsriCareerHomePage clickCareersHomeSubMenulink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Careershomelink.linktext"));
		return new EsriCareerHomePage();
	}
	
	public EsriCareerHomePage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerHomePage();
	}

}
