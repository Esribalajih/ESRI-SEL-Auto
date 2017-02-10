package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the UK ArcGIS Solutions Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_UK_ArcGISSolutionsPage extends ESRIWrappers {
	public Dist_UK_ArcGISSolutionsPage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("ArcGIS Solutions");
		if (!VerifyTitle("ArcGIS Solutions")) {
			Reporter.reportStep("This is not a ArcGIS Solutions (UK) page.", "FAIL");
		} else
			System.out.println("UK ArcGIS Solutions page Launched Successfully");
	}

	// click back button in browser
	public Dist_UK_HomePage clickbsrBackBtn() throws Throwable {
		try {
			switchWindowByTitle("Esri UK - GIS Mapping Software, Solutions, Services, Map Apps and Data");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_UK_HomePage();
	}

	// verify ArcGIS Solutions banner label
	public Dist_UK_ArcGISSolutionsPage verifyArcGISSolutionslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disUKSolutions.ArcGISSolutionsLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
