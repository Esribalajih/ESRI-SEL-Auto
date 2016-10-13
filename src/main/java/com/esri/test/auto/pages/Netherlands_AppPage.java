package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Netherlands 	Apps | Esri Nederland Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Netherlands_AppPage extends ESRIWrappers {
	public Netherlands_AppPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Apps | Esri Nederland")) {
			Reporter.reportStep("This is not a Apps | Esri Nederland (Netherlands) page.", "FAIL");
		} else
			System.out.println("Netherlands Apps | Esri Nederland  page Launched Successfully");
	}

	// click back button in browser
	public Netherlands_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Netherlands_HomePage();
	}

	// verify Apps Voor iedereen label
	public Netherlands_AppPage verifyAppslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsApps.AppsLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
