package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Netherlands Disclaimer | Esri Nederland Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Netherlands_DisclaimerPage extends ESRIWrappers {
	public Netherlands_DisclaimerPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Disclaimer | Esri Nederland")) {
			Reporter.reportStep("This is not a Disclaimer | Esri Nederland (Netherlands) page.", "FAIL");
		} else
			System.out.println("Netherlands Disclaimer | Esri Nederland page Launched Successfully");
	}

	// click back button in browser
	public Netherlands_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Netherlands_HomePage();
	}

	// verify Disclaimer label
	public Netherlands_DisclaimerPage verifyDisclaimerlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsDis.DisclaimerLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
