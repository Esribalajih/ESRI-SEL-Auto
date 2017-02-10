package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Rwanda Privacy Policy | Esri Rwanda Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Rwanda_PrivacyPage extends ESRIWrappers {
	public Dist_Rwanda_PrivacyPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Privacy Policy | Esri Rwanda")) {
			Reporter.reportStep("This is not a 	Privacy Policy | Esri Rwanda (Rwanda) page.", "FAIL");
		} else
			System.out.println("Rwanda Privacy Policy | Esri Rwanda page Launched Successfully");
	}

	// click back button in browser
	public Dist_Rwanda_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Rwanda_HomePage();
	}

	// verify Privacy Label
	public Dist_Rwanda_PrivacyPage verifyPrivacylbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRwandaPriv.privacyLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
