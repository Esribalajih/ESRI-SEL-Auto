package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Ireland Privacy Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Ireland_PrivacyPage extends ESRIWrappers {
	public Ireland_PrivacyPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Privacy")) {
			Reporter.reportStep("This is not a Privacy (Ireland) page.", "FAIL");
		} else
			System.out.println("Ireland Privacy page Launched Successfully");
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

	// verify privacy label
	public Ireland_PrivacyPage verifyPrivacylbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIrelandPriv.privacyLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
