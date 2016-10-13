package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Ireland Terms and conditions Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Ireland_LegalTermsAndCondPage extends ESRIWrappers {
	public Ireland_LegalTermsAndCondPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Terms and conditions")) {
			Reporter.reportStep("This is not a Terms and conditions (Ireland) page.", "FAIL");
		} else
			System.out.println("Ireland Terms and conditions page Launched Successfully");
	}

	// click back button in browser
	public Ireland_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Ireland_HomePage();
	}

	// verify Legat Terms & Condition label
	public Ireland_LegalTermsAndCondPage verifyLegalTermCondlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIrelandLegal.legalTermsAndConditionLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
