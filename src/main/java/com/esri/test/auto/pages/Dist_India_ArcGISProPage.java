package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India ArcGIS Pro | ArcGIS for Desktop Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_ArcGISProPage extends ESRIWrappers {
	public Dist_India_ArcGISProPage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("ArcGIS Pro | ArcGIS for Desktop");
		if (!VerifyTitle("ArcGIS Pro | ArcGIS for Desktop")) {
			Reporter.reportStep("This is not a ArcGIS Pro | ArcGIS for Desktop (India) page.", "FAIL");
		} else
			System.out.println("India ArcGIS Pro | ArcGIS for Desktop Launched Successfully");
	}

	// click back button in browser
	public Dist_India_HomePage clickbsrBackBtn() throws Throwable {
		try {
		//	clickBrowserBackButton();
			switchWindowByTitle("Esri India | Your partner in GIS");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_HomePage();
	}

	// verify ArcGIS pro label
	public Dist_India_ArcGISProPage verifyarcGISLabel(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaArcPro.arcGISProLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
