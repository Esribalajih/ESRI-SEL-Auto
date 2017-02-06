package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India Support Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_EsriIndTechSupportPage extends ESRIWrappers {
	public Dist_India_EsriIndTechSupportPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Esri India Technical Support")) {
			Reporter.reportStep("This is not a Esri India Technical Support (India) page.", "FAIL");
		} else
			System.out.println("India Esri India Technical Support page Launched Successfully");
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

	// verify support label
	public Dist_India_EsriIndTechSupportPage verifysupportlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaSup.supportLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
