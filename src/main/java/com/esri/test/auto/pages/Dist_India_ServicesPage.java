package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India Services Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_ServicesPage extends ESRIWrappers {
	public Dist_India_ServicesPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Services")) {
			Reporter.reportStep("This is not a Services (India) page.", "FAIL");
		} else
			System.out.println("India Services page Launched Successfully");
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

	// verify Services label
	public Dist_India_ServicesPage verifyServiceslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaServ.servicesLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
