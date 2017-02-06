package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Ireland ArcGIS for Desktop Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Ireland_ArcGISDesktopPage extends ESRIWrappers {
	public Dist_Ireland_ArcGISDesktopPage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("ArcGIS for Desktop");
		if (!VerifyTitle("ArcGIS for Desktop")) {
			Reporter.reportStep("This is not a ArcGIS for Desktop (Ireland) page.", "FAIL");
		} else
			System.out.println("Ireland ArcGIS for Desktop page Launched Successfully");
	}

	// click back button in browser
	public Dist_Ireland_HomePage clickbsrBackBtn() throws Throwable {
		try {
			//clickBrowserBackButton();
			switchWindowByTitle("Esri Ireland | Home");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Ireland_HomePage();
	}

	// verify ArcGIS for Desktop label
	public Dist_Ireland_ArcGISDesktopPage verifyArcGISforDesktoplbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIrelandArcDesktop.arcGISDesktopLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
