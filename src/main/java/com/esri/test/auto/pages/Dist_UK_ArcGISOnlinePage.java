package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the UK ArcGIS Online Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_UK_ArcGISOnlinePage extends ESRIWrappers {
	public Dist_UK_ArcGISOnlinePage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("ArcGIS Online");
		if (!VerifyTitle("ArcGIS Online")) {
			Reporter.reportStep("This is not a ArcGIS Online (UK) page.", "FAIL");
		} else
			System.out.println("UK ArcGIS Online page Launched Successfully");
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

	// verify ArcGIS online banner label
	public Dist_UK_ArcGISOnlinePage verifyArcGISOnlinelbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disUKOnline.ArcGISOnlineLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
