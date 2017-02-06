package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India Legal Information | Privacy Policy Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_PrivacyPage extends ESRIWrappers {
	public Dist_India_PrivacyPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Legal Information | Privacy Policy")) {
			Reporter.reportStep("This is not a Legal Information | Privacy Policy (India) page.", "FAIL");
		} else
			System.out.println("India Legal Information | Privacy Policy page Launched Successfully");
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

	// verify Privacy Policy label
	public Dist_India_PrivacyPage verifyPrivacylbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaPriv.privacyLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
