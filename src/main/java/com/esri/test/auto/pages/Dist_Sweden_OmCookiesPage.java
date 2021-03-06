package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Sweden Om Cookies Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Sweden_OmCookiesPage extends ESRIWrappers {
	public Dist_Sweden_OmCookiesPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Om Cookies")) {
			Reporter.reportStep("This is not a Om Cookies (Sweden) page.", "FAIL");
		} else
			System.out.println("Sweden Om Cookies page Launched Successfully");
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

	// verify Om Cookies label
	public Dist_Sweden_OmCookiesPage verifyOmCookieslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwedenOmCookies.OmCookiesLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
