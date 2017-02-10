package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Romania ArcGIS for Developers Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Romania_ArcGISDevelopersPage extends ESRIWrappers {
	public Dist_Romania_ArcGISDevelopersPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("ArcGIS for Developers")) {
			Reporter.reportStep("This is not a ArcGIS for Developers (Romania) page.", "FAIL");
		} else
			System.out.println("Romania ArcGIS for Developers page Launched Successfully");
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

	// verify ArcGIS for Developers banner label
	public Dist_Romania_ArcGISDevelopersPage verifyArcGISDeveloperslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRomaniasDev.ArcGISDevelopersLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
