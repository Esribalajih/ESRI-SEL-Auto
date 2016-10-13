package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India Legal Information | Privacy Policy Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class India_PrivacyPage extends ESRIWrappers {
	public India_PrivacyPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Legal Information | Privacy Policy")) {
			Reporter.reportStep("This is not a Legal Information | Privacy Policy (India) page.", "FAIL");
		} else
			System.out.println("India Legal Information | Privacy Policy page Launched Successfully");
	}

	// click back button in browser
	public India_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_HomePage();
	}

	// verify Privacy Policy label
	public India_PrivacyPage verifyPrivacylbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaPriv.privacyLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
