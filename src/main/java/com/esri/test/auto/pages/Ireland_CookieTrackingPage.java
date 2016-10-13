package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Ireland Cookies used by our website Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Ireland_CookieTrackingPage extends ESRIWrappers {
	public Ireland_CookieTrackingPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Cookies used by our website")) {
			Reporter.reportStep("This is not a Cookies used by our website (Ireland) page.", "FAIL");
		} else
			System.out.println("Ireland Cookies used by our website page Launched Successfully");
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

	// verify Cookie information page label
	public Ireland_CookieTrackingPage verifyCookieInfolabel(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIrelandCookie.cookieInformationLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
