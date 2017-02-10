package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the UK Contact Us | Esri UK Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_UK_ContactUsPage extends ESRIWrappers {
	public Dist_UK_ContactUsPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Contact Us | Esri UK")) {
			Reporter.reportStep("This is not a Contact Us | Esri UK (UK) page.", "FAIL");
		} else
			System.out.println("UK Contact Us | Esri UK page Launched Successfully");
	}

	// click back button in browser
	public Dist_UK_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_UK_HomePage();
	}

	// verify Contact US label
	public Dist_UK_ContactUsPage verifyContactUSlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disUKContactUs.ContactUsLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
