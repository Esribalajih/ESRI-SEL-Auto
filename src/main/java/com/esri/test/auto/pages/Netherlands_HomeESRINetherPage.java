package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Netherlands Home - Esri Nederland Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Netherlands_HomeESRINetherPage extends ESRIWrappers {
	public Netherlands_HomeESRINetherPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Home - Esri Nederland")) {
			Reporter.reportStep("This is not a Home - Esri Nederland (Netherlands) page.", "FAIL");
		} else
			System.out.println("Netherlands Home - Esri Nederland page Launched Successfully");
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

	// verify Mijn Esri Tab label
	public Netherlands_HomeESRINetherPage verifyMijnEsriTab(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsHomeNet.MijnEsriLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
