package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Finland GEOSECMA for ArcGIS Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Finland_GEOSEMAArcGISPage extends ESRIWrappers {
	public Dist_Finland_GEOSEMAArcGISPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("GEOSECMA for ArcGIS")) {
			Reporter.reportStep("This is not a GEOSECMA for ArcGIS (Finland) page.", "FAIL");
		} else
			System.out.println("Finland GEOSECMA for ArcGIS page Launched Successfully");
	}

	// click back button in browser
	public Dist_Finland_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Finland_HomePage();
	}

	// verify GEOSEMA for ArcGIS label
	public Dist_Finland_GEOSEMAArcGISPage verifyGEOSEMAArcGISlbl(String data) throws Throwable {
		try {
			verifyValueWithNewLineByXpath(prop.getProperty("disFinlandHome.ArcGISGeoscemaLbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
