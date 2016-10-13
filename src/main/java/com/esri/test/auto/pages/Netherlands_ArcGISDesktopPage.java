package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Netherlands 	ArcGIS for Desktop | Esri Nederland Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Netherlands_ArcGISDesktopPage extends ESRIWrappers {
	public Netherlands_ArcGISDesktopPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("ArcGIS for Desktop | Esri Nederland")) {
			Reporter.reportStep("This is not a	ArcGIS for Desktop | Esri Nederland (Netherlands) page.", "FAIL");
		} else
			System.out.println("Netherlands	ArcGIS for Desktop | Esri Nederland page Launched Successfully");
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

	// verify ArcGIS Desktop label
	public Netherlands_ArcGISDesktopPage verifyArcGISDesktoplbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsArcGISDesktop.arcGISDesktopLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
