package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Ireland ArcGIS for Developers Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Ireland_ArcGISDeveloperPage extends ESRIWrappers {
	public Ireland_ArcGISDeveloperPage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("ArcGIS for Developers");
		if (!VerifyTitle("ArcGIS for Developers")) {
			Reporter.reportStep("This is not aArcGIS for Developers (Ireland) page.", "FAIL");
		} else
			System.out.println("Ireland ArcGIS for Developers page Launched Successfully");
	}

	// click back button in browser
	public Ireland_HomePage clickbsrBackBtn() throws Throwable {
		try {
			//clickBrowserBackButton();
			switchWindowByTitle("Esri Ireland | Home");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Ireland_HomePage();
	}

	// verify ArcGIS Developer label
	public Ireland_ArcGISDeveloperPage verifyArcGISDeveloperlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIrelandArcDev.arcGISDevelopersLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
