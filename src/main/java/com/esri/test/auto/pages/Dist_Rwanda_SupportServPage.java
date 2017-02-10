package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Rwanda Support & Resources | Esri Rwanda Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Rwanda_SupportServPage extends ESRIWrappers {
	public Dist_Rwanda_SupportServPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Support & Resources | Esri Rwanda")) {
			Reporter.reportStep("This is not a Support & Resources | Esri Rwanda (Rwanda) page.", "FAIL");
		} else
			System.out.println("Rwanda Support & Resources | Esri Rwanda page Launched Successfully");
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

	// verify Support & Resources label
	public Dist_Rwanda_SupportServPage verifySupportlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRwandaSupport.SupportLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
