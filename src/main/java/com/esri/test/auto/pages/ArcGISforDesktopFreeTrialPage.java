package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is a ArcGISDesktop Free Trial Page
 * @author balajih
 *
 */
public class ArcGISforDesktopFreeTrialPage extends ESRIWrappers{
	
	public ArcGISforDesktopFreeTrialPage() throws Throwable{
		if(!VerifyTitle("ArcGIS for Desktop | Free Trial"))
		Reporter.reportStep("This is not a ArcGISDesktop Free Trial Page", "FAIL");
	}
	
	public ArcGISforDesktopFreeTrialPage clickFreeTrialTab() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopFreeTrialPage.subMenuFreeTriallink.xpath"));
		return this;
	}
	
	public ArcGISforDesktopFreeTrialPage verifyFreeTrialHdr(String FreeTrialHdr) throws Throwable{
		verifyValueWithNewLineByXpath(prop.getProperty("arcGISDesktopFreeTrialPage.freeTrialHdr.xpath"), FreeTrialHdr);
		return this;
	}
	
	/*public ArcGISforDesktopFreeTrialPage navigateToFrame() throws Throwable{
		int iFrameSize = driver.findElementsByTagName("iframe").size();
		for (int i=0;i<=iFrameSize;i++){
			driver.switchTo().frame(i);
		}
		return this;
	}*/
	
	public ArcGISforDesktopFreeTrialPage navigateToFrame() throws Throwable{
		switchToFrameByIndex(0);
		System.out.println("We are inside the Frame");
		return this;
	}
	
	public ArcGISforDesktopFreeTrialPage enterFirstName(String fName) throws Throwable {
		enterById(prop.getProperty("arcGISDesktopFreeTrialPage.freeTrialFirstname.id"), fName);
		return this;
	}
	
	public ArcGISforDesktopFreeTrialPage enterLastName(String lName) throws Throwable {
		enterById(prop.getProperty("arcGISDesktopFreeTrialPage.freeTrialLastname.id"), lName);
		return this;
	}
	
	public ArcGISforDesktopFreeTrialPage enterEmailId(String emailId) throws Throwable {
		enterById(prop.getProperty("arcGISDesktopFreeTrialPage.freeTrialEmail.id"), emailId);
		return this;
	}
	
	public ArcGISforDesktopFreeTrialPage enterConfirmEmailId(String ConfirmemailId) throws Throwable {
		enterById(prop.getProperty("arcGISDesktopFreeTrialPage.freeTrialConfirmEmail.id"), ConfirmemailId);
		return this;
	}
	
	public ArcGISforDesktopFreeTrialPage selectIndustryDpDwn(String IndustryDpDwn) throws Throwable {
		selectByIdWithText(prop.getProperty("arcGISDesktopFreeTrialPage.freeTrialIndustryDropDown.id"), IndustryDpDwn);
		return this;
	}
	
	public ArcGISforDesktopFreeTrialPage clickStartTrial() throws Throwable {
		clickById(prop.getProperty("arcGISDesktopFreeTrialPage.freeTrialStartTrialbtn.id"));
		return this;
	}
	
	public ArcGISforDesktopFreeTrialPage verifyConfirmationTxt(String cmNotify) throws Throwable{
		VerifyTextById(prop.getProperty("arcGISDesktopFreeTrialPage.ConfirmationEmailNf.id"), cmNotify);
		return this;
	}

}
