package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Romania ArcGIS Pro | ArcGIS for Desktop Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Romania_ArcGISProPage extends ESRIWrappers {
	public Dist_Romania_ArcGISProPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("ArcGIS Pro | ArcGIS for Desktop")) {
			Reporter.reportStep("This is not a ArcGIS Pro | ArcGIS for Desktop (Romania) page.", "FAIL");
		} else
			System.out.println("Romania ArcGIS Pro | ArcGIS for Desktop page Launched Successfully");
	}

	// click back button in browser
	public Dist_Romania_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Romania_HomePage();
	}

	// verify ArcGIS Pro label
	public Dist_Romania_ArcGISProPage verifyArcGISProlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRomaniasPro.ArcGISProLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
