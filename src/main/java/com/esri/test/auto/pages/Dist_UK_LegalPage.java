package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the UK Terms and conditions Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_UK_LegalPage extends ESRIWrappers {
	public Dist_UK_LegalPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Terms and conditions")) {
			Reporter.reportStep("This is not a Terms and conditions (UK) page.", "FAIL");
		} else
			System.out.println("UK Terms and conditions page Launched Successfully");
	}

	// click back button in browser
	public Dist_UK_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_UK_HomePage();
	}

	// verify Legal label
	public Dist_UK_LegalPage verifyLegallbl(String data) throws Throwable {
		try {
			verifyValueById(prop.getProperty("disUKLegal.LegalLabel.id"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
