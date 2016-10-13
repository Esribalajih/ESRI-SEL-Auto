package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Ireland ArcGIS for Server Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Ireland_ArcGISServerPage extends ESRIWrappers {
	public Ireland_ArcGISServerPage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("ArcGIS for Server");
		if (!VerifyTitle("ArcGIS for Server")) {
			Reporter.reportStep("This is not a ArcGIS for Server (Ireland) page.", "FAIL");
		} else
			System.out.println("Ireland ArcGIS for Server page Launched Successfully");
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

	// verify ArcGIS Server label
	public Ireland_ArcGISServerPage verifyArcGISServerlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIrelandArcServer.arcGISServerLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
