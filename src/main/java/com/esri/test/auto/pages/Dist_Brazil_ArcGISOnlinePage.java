package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Brazil ArcGIS Online Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Brazil_ArcGISOnlinePage extends ESRIWrappers {
	public Dist_Brazil_ArcGISOnlinePage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("ArcGIS Online")) {
			Reporter.reportStep("This is not a ArcGIS Online (Brazil) page.", "FAIL");
		} else
			System.out.println("Brazil ArcGIS Online  page Launched Successfully");
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

	// verify ArcGIS online label
	public Dist_Brazil_ArcGISOnlinePage verifyArcGISOnlinelbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disBzlArcGIS.ArcGISDesktopLbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
