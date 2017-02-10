package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Romania Esri Maps for Location Analytics Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Romania_LocationAnalyticsPage extends ESRIWrappers {
	public Dist_Romania_LocationAnalyticsPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Esri Maps for Location Analytics")) {
			Reporter.reportStep("This is not a Esri Maps for Location Analytics (Romania) page.", "FAIL");
		} else
			System.out.println("Romania Esri Maps for Location Analytics page Launched Successfully");
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

	// verify Location Analytics label
	public Dist_Romania_LocationAnalyticsPage verifyLocationAnalyticslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRomaniasLoc.LocationAnalyticsLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
