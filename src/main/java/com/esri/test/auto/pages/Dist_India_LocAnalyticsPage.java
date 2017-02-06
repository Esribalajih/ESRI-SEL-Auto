package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India Esri Maps for Location Analytics Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_LocAnalyticsPage extends ESRIWrappers {
	public Dist_India_LocAnalyticsPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Esri Maps for Location Analytics")) {
			Reporter.reportStep("This is not a Esri Maps for Location Analytics (India) page.", "FAIL");
		} else
			System.out.println("India Esri Maps for Location Analytics page Launched Successfully");
	}

	// click back button in browser
	public Dist_India_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_HomePage();
	}

	// verify Local Analytics label
	public Dist_India_LocAnalyticsPage verifyLocalAnalyticsllbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaLocA.localAnalyticsLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
