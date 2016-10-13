package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Netherlands ArcGIS for Server | Esri NederlandPage of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Netherlands_ArcGISServerPage extends ESRIWrappers {
	public Netherlands_ArcGISServerPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("ArcGIS for Server | Esri Nederland")) {
			Reporter.reportStep("This is not a	ArcGIS for Server | Esri Nederland (Netherlands) page.", "FAIL");
		} else
			System.out.println("Netherlands	ArcGIS for Server | Esri Nederland page Launched Successfully");
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

	// verify ArcGIS Server label
	public Netherlands_ArcGISServerPage verifyArcGISserverlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsArcGISS.arcGISServerLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
