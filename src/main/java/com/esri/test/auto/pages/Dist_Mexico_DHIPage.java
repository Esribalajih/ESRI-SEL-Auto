package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Mexico DHI Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Mexico_DHIPage extends ESRIWrappers {
	public Dist_Mexico_DHIPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("DHI")) {
			Reporter.reportStep("This is not a DHI (Mexico) page.", "FAIL");
		} else
			System.out.println("Mexico DHI page Launched Successfully");
	}

	// click back button in browser
	public Dist_Mexico_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Mexico_HomePage();
	}

	// verify DHI label
	public Dist_Mexico_DHIPage verifyDHIlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disMexicoDHI.dhiLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
