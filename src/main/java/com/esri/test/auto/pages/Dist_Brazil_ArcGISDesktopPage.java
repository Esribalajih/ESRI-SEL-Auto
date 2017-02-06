package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Brazil ArcGIS Desktop Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Brazil_ArcGISDesktopPage extends ESRIWrappers {
	public Dist_Brazil_ArcGISDesktopPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("ArcGIS Desktop")) {
			Reporter.reportStep("This is not a  ArcGIS Desktop (Brazil) page.", "FAIL");
		} else
			System.out.println("Brazil ArcGIS Desktop page Launched Successfully");
	}

	// click back button in browser
	public Dist_Brazil_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Brazil_HomePage();
	}

	// verify ArcGIS desktop label
	public Dist_Brazil_ArcGISDesktopPage verifyArcGISDesktoplbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disBzlArcGIS.ArcGISDesktopLbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
