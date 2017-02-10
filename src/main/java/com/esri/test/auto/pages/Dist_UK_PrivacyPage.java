package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the UK Privacy Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_UK_PrivacyPage extends ESRIWrappers {
	public Dist_UK_PrivacyPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Privacy")) {
			Reporter.reportStep("This is not a Privacy (UK) page.", "FAIL");
		} else
			System.out.println("UK Privacy page Launched Successfully");
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

	// verify Privacy label
	public Dist_UK_PrivacyPage verifyPrivacylbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disUKPrivacy.PrivacyLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
