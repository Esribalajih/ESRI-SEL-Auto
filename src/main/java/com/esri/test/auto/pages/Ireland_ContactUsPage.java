package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Ireland Office and Contact Information Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Ireland_ContactUsPage extends ESRIWrappers {
	public Ireland_ContactUsPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Office and Contact Information")) {
			Reporter.reportStep("This is not a Office and Contact Information (Ireland) page.", "FAIL");
		} else
			System.out.println("Ireland Office and Contact Information page Launched Successfully");
	}

	// click back button in browser
	public Ireland_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Ireland_HomePage();
	}

	// verify contact us label
	public Ireland_ContactUsPage verifyContactUslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIrelandContUS.contactUsLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
