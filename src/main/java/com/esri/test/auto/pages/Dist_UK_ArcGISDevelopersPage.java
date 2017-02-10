package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the UK ArcGIS for Developers Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_UK_ArcGISDevelopersPage extends ESRIWrappers {
	public Dist_UK_ArcGISDevelopersPage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("ArcGIS for Developers");
		if (!VerifyTitle("ArcGIS for Developers")) {
			Reporter.reportStep("This is not a ArcGIS for Developers (UK) page.", "FAIL");
		} else
			System.out.println("UK ArcGIS for Developers page Launched Successfully");
	}

	// click back button in browser
	public Dist_UK_HomePage clickbsrBackBtn() throws Throwable {
		try {
			//clickBrowserBackButton();
			switchWindowByTitle("Esri UK - GIS Mapping Software, Solutions, Services, Map Apps and Data");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_UK_HomePage();
	}

	// verify ArcGIS for Developers banner label
	public Dist_UK_ArcGISDevelopersPage verifyArcGISDeveloperslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disUKDevelopers.ArcGISDevelopersLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
