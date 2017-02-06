package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Ireland ArcGIS Solutions Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Ireland_ArcGISSolutionsPage extends ESRIWrappers {
	public Dist_Ireland_ArcGISSolutionsPage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("ArcGIS Solutions");
		if (!VerifyTitle("ArcGIS Solutions")) {
			Reporter.reportStep("This is not a ArcGIS Solutions (Ireland) page.", "FAIL");
		} else
			System.out.println("Ireland ArcGIS Solutions page Launched Successfully");
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

	// verify ArcGIS Solution page label
	public Dist_Ireland_ArcGISSolutionsPage verifyArcGISSolutionlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIrelandArcSol.arcGISSolutionsLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
