package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India ArcGIS | Main Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class India_ArcGISMainPage extends ESRIWrappers {
	public India_ArcGISMainPage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("ArcGIS | Main");
		if (!VerifyTitle("ArcGIS | Main")) {
			Reporter.reportStep("This is not a ArcGIS | Main (India) page.", "FAIL");
		} else
			System.out.println("India ArcGIS | Main page Launched Successfully");
	}

	// click back button in browser
	public India_HomePage clickbsrBackBtn() throws Throwable {
		try {
			//clickBrowserBackButton();
			switchWindowByTitle("Esri India | Your partner in GIS");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_HomePage();
	}

	// verify ArcGIS main banner label
	public India_ArcGISMainPage verifyArcGISMainBannerlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaArcM.arcGISMainLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
