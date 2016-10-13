package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Mexico High Resolution Satellite Images & Photos | DigitalGlobe Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Mexico_DigitalGlobePage extends ESRIWrappers {
	public Mexico_DigitalGlobePage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("High Resolution Satellite Images & Photos | DigitalGlobe")) {
			Reporter.reportStep("This is not a High Resolution Satellite Images & Photos | DigitalGlobe (Mexico) page.", "FAIL");
		} else
			System.out.println("Mexico High Resolution Satellite Images & Photos | DigitalGlobe page Launched Successfully");
	}

	// click back button in browser
	public Mexico_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Mexico_HomePage();
	}

	// verify Digital Globe label
	public Mexico_DigitalGlobePage verifyDigitalGlobelbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disMexicoDigiGlobe.digitalGlobeLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
