package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Netherlands ArcGIS Content | Esri Nederland Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Netherlands_ArcGISContentPage extends ESRIWrappers {
	public Dist_Netherlands_ArcGISContentPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("ArcGIS Content | Esri Nederland")) {
			Reporter.reportStep("This is not a ArcGIS Content | Esri Nederland (Netherlands) page.", "FAIL");
		} else
			System.out.println("Netherlands ArcGIS Content | Esri Nederland  page Launched Successfully");
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

	// verify ArcGIS Content label
	public Dist_Netherlands_ArcGISContentPage verifyArcGISContentlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsArcGISC.arcGISContentLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
