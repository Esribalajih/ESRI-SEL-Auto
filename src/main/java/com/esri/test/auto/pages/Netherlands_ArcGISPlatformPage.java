package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Netherlands ArcGIS Platform Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Netherlands_ArcGISPlatformPage extends ESRIWrappers {
	public Netherlands_ArcGISPlatformPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("ArcGIS-platform | Esri Nederland")) {
			Reporter.reportStep("This is not a ArcGIS-platform | Esri Nederland (Netherlands) page.", "FAIL");
		} else
			System.out.println("Netherlands ArcGIS-platform | Esri Nederland  page Launched Successfully");
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

	// verify ArcGIS Platform label
	public Netherlands_ArcGISPlatformPage verifyArcGISPlatformlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsArcGISP.arcGISPlatformLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
