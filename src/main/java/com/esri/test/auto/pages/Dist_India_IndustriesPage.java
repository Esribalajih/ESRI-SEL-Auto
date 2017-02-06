package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India Industries Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_IndustriesPage extends ESRIWrappers {
	public Dist_India_IndustriesPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Industries")) {
			Reporter.reportStep("This is not a Industries (India) page.", "FAIL");
		} else
			System.out.println("India Industries page Launched Successfully");
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

	// verify Industries label
	public Dist_India_IndustriesPage verifyIndustrieslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaInd.industriesLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}	
}
