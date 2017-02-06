package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Switzerland Centre de support Esri | Esri Suisse Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Switzerland_French_SupportPage extends ESRIWrappers {
	public Switzerland_French_SupportPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Centre de support Esri | Esri Suisse")) {
			Reporter.reportStep("This is not a Centre de support Esri | Esri Suisse (Switzerland) page.", "FAIL");
		} else
			System.out.println("Switzerland Centre de support Esri | Esri Suisse page Launched Successfully");
	}

	// click back button in browser
	public Switzerland_French_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Switzerland_French_HomePage();
	}

	// verify Support label
	public Switzerland_French_SupportPage verifySupportlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("diswitzFreSupport.SupportLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
