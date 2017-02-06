package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Brazil Esri Developer Network Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Brazil_ESRIDevNtwkPage extends ESRIWrappers {
	public Dist_Brazil_ESRIDevNtwkPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Esri Developer Network")) {
			Reporter.reportStep("This is not a 	Esri Developer Network (Brazil) page.", "FAIL");
		} else
			System.out.println("Brazil Esri Developer Network page Launched Successfully");
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

	// verify Esri Developer Network label
	public Dist_Brazil_ESRIDevNtwkPage verifyEsriDevNtwklbl(String data) throws Throwable {
		try {
			verifyValueWithNewLineByXpath(prop.getProperty("disBzlArcGIS.EsriDevNetworkLbl.xpath"),data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
