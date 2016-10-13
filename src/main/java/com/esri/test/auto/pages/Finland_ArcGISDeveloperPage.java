package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Finland ArcGIS for Developers Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Finland_ArcGISDeveloperPage extends ESRIWrappers {
	public Finland_ArcGISDeveloperPage() throws Throwable {
		waitForPageLoad(15);
		switchToWindow();
		if (!VerifyTitle("ArcGIS for Developers")) {
			Reporter.reportStep("This is not a  ArcGIS for Developers (Finland) page.", "FAIL");
		} else
			System.out.println("Finland ArcGIS for Developers page Launched Successfully");
	}

	// click back button in browser
	public Finland_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Finland_HomePage();
	}

	// verify ArcGIS desktop label
	public Finland_ArcGISDeveloperPage verifyArcGISDeveloperlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disFinlandHome.ArcGISDeveloperLbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
