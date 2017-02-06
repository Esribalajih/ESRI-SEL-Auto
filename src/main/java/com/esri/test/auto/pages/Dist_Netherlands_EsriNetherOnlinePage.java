package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Netherlands Esri Nederland Online leeromgeving: Op de site inloggen Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Netherlands_EsriNetherOnlinePage extends ESRIWrappers {
	public Dist_Netherlands_EsriNetherOnlinePage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Esri Nederland Online leeromgeving: Op de site inloggen")) {
			Reporter.reportStep("This is not a Esri Nederland Online leeromgeving: Op de site inloggen (Netherlands) page.", "FAIL");
		} else
			System.out.println("Netherlands Esri Nederland Online leeromgeving: Op de site inloggen page Launched Successfully");
	}

	// click back button in browser
	public Dist_Netherlands_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Netherlands_HomePage();
	}

	// verify ESRI online label
	public Dist_Netherlands_EsriNetherOnlinePage verifyEsriOnlinelbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsOnline.onlineLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
