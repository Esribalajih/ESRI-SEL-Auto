package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Romania ArcGIS | Main Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Romania_ArcGISMainPage extends ESRIWrappers {
	public Romania_ArcGISMainPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("ArcGIS | Main")) {
			Reporter.reportStep("This is not a ArcGIS | Main (Romania) page.", "FAIL");
		} else
			System.out.println("Romania ArcGIS | Main page Launched Successfully");
	}

	// click back button in browser
	public Romania_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Romania_HomePage();
	}

	// verify ArcGIS main banner label
	public Romania_ArcGISMainPage verifyArcGISMainBannerlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRomaniasMain.ArcGISMainLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
