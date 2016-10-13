package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Netherlands Contact | Over ons | Esri Nederland Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Netherlands_ContactPage extends ESRIWrappers {
	public Netherlands_ContactPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Contact | Over ons | Esri Nederland")) {
			Reporter.reportStep("This is not a Contact | Over ons | Esri Nederland (Netherlands) page.", "FAIL");
		} else
			System.out.println("Netherlands Contact | Over ons | Esri Nederland page Launched Successfully");
	}

	// click back button in browser
	public Netherlands_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Netherlands_HomePage();
	}

	// verify Contact label
	public Netherlands_ContactPage verifyContactlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsContact.contactLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
