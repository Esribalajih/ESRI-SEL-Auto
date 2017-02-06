package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Ireland Technical Support Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Ireland_TechSupportPage extends ESRIWrappers {
	public Dist_Ireland_TechSupportPage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("Technical Support");
		if (!VerifyTitle("Technical Support")) {
			Reporter.reportStep("This is not a Technical Support (Ireland) page.", "FAIL");
		} else
			System.out.println("Ireland Technical Support page Launched Successfully");
	}

	// click back button in browser
	public Dist_Ireland_HomePage clickbsrBackBtn() throws Throwable {
		try {
			//clickBrowserBackButton();
			switchWindowByTitle("Esri Ireland | Home");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Ireland_HomePage();
	}

	// verify Technical support label
	public Dist_Ireland_TechSupportPage verifyTechnicalSupportlbl(String data) throws Throwable {
		try {
			verifyValueWithNewLineByXpath(prop.getProperty("disIrelandTechSupport.technicalSupportLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
