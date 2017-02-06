package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the UK ArcGIS for Desktop Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class UK_ArcGISDesktopPage extends ESRIWrappers {
	public UK_ArcGISDesktopPage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("ArcGIS for Desktop");
		if (!VerifyTitle("ArcGIS for Desktop")) {
			Reporter.reportStep("This is not a ArcGIS for Desktop (UK) page.", "FAIL");
		} else
			System.out.println("UK ArcGIS for Desktop page Launched Successfully");
	}

	// click back button in browser
	public UK_HomePage clickbsrBackBtn() throws Throwable {
		try {
			//clickBrowserBackButton();
			switchWindowByTitle("Esri UK - GIS Mapping Software, Solutions, Services, Map Apps and Data");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new UK_HomePage();
	}

	// verify ArcGIS for Desktop banner label
	public UK_ArcGISDesktopPage verifyArcGISDesktoplbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disUKDesktop.ArcGISDesktopLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
