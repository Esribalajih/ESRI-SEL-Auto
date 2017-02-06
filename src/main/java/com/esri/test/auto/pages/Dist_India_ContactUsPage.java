package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India Contact Us Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_ContactUsPage extends ESRIWrappers {
	public Dist_India_ContactUsPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Contact Us")) {
			Reporter.reportStep("This is not a Contact Us (India) page.", "FAIL");
		} else
			System.out.println("India Contact Us page Launched Successfully");
	}

	// click back button in browser
	public Dist_India_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_HomePage();
	}

	// verify Contact Us label
	public Dist_India_ContactUsPage verifyContactUslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaCont.contactUsLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
