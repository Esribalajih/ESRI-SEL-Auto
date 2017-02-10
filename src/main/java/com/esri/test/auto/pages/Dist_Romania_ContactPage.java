package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Romania Contact - Esri Romania Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Romania_ContactPage extends ESRIWrappers {
	public Dist_Romania_ContactPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Contact - Esri Romania")) {
			Reporter.reportStep("This is not a Contact - Esri Romania (Romania) page.", "FAIL");
		} else
			System.out.println("Romania Contact - Esri Romania page Launched Successfully");
	}

	// click back button in browser
	public Dist_Romania_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Romania_HomePage();
	}

	// verify Contactati-ne label
	public Dist_Romania_ContactPage verifyContactatinelbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRomaniasCont.ContactLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
