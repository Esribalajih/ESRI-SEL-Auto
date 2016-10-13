package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India Legal Information | Overview Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class India_LegalPage extends ESRIWrappers {
	public India_LegalPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Legal Information | Overview")) {
			Reporter.reportStep("This is not a Legal Information | Overview (India) page.", "FAIL");
		} else
			System.out.println("India Legal Information | Overview page Launched Successfully");
	}

	// click back button in browser
	public India_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_HomePage();
	}

	// verify Esri India Legal Information label
	public India_LegalPage verifyLegallbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaLeg.legalLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
