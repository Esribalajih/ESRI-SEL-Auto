package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Switzerland Contact | Esri Suisse Page of ESRI
 * Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Switzerland_French_ContactPage extends ESRIWrappers {
	public Dist_Switzerland_French_ContactPage() throws Throwable {
		waitForPageLoad(10);

		if (!VerifyTitle("Contact | Esri Suisse")) {
			Reporter.reportStep("This is not a Contact | Esri Suisse (Switzerland) page.", "FAIL");
		} else
			System.out.println("Switzerland	Contact | Esri Suisse page Launched Successfully");
	}

	// click back button in browser
	public Dist_Switzerland_French_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Switzerland_French_HomePage();
	}

	// verify Contact label
	public Dist_Switzerland_French_ContactPage verifyContactlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("diswitzFreContact.ContactLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

}
