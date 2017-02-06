package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the UK Cookies Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class UK_CookiesPage extends ESRIWrappers {
	public UK_CookiesPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Cookies")) {
			Reporter.reportStep("This is not a Cookies (UK) page.", "FAIL");
		} else
			System.out.println("UK Cookies page Launched Successfully");
	}

	// click back button in browser
	public UK_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new UK_HomePage();
	}

	// verify Cookies label
	public UK_CookiesPage verifyCookieslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disUKCookies.CookiesLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
