package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Sweden Support Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Sweden_SupportPage extends ESRIWrappers {
	public Dist_Sweden_SupportPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Support")) {
			Reporter.reportStep("This is not a Support (Sweden) page.", "FAIL");
		} else
			System.out.println("Sweden Support page Launched Successfully");
	}

	// click back button in browser
	public Dist_Sweden_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Sweden_HomePage();
	}

	// verify Support label
	public Dist_Sweden_SupportPage verifySupportlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwedenSupport.SupportLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
