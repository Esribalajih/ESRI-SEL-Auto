package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Ireland ArcGIS | Main Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Ireland_ArcGISMainPage extends ESRIWrappers {
	public Dist_Ireland_ArcGISMainPage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("ArcGIS | Main");
		if (!VerifyTitle("ArcGIS | Main")) {
			Reporter.reportStep("This is not a ArcGIS | Main (Ireland) page.", "FAIL");
		} else
			System.out.println("Ireland ArcGIS | Main page Launched Successfully");
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

	// verify ArcGIS Main page label
	public Dist_Ireland_ArcGISMainPage verifyArcGISMainlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIrelandArcMain.arcGISMainLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
