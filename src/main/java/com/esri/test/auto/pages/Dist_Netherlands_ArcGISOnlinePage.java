package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Netherlands ArcGIS Online | Esri Nederland Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Netherlands_ArcGISOnlinePage extends ESRIWrappers {
	public Dist_Netherlands_ArcGISOnlinePage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("ArcGIS Online | Esri Nederland")) {
			Reporter.reportStep("This is not a ArcGIS Online | Esri Nederland (Netherlands) page.", "FAIL");
		} else
			System.out.println("Netherlands ArcGIS Online | Esri Nederland  page Launched Successfully");
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

	// verify ArcGIS online label
	public Dist_Netherlands_ArcGISOnlinePage verifyArcGISOnlinelbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsArcGISO.arcGISOnlineLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
