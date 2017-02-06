package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Romania Legal Information | Esri Privacy Statement Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Romania_LegalPrivacyInfoPage extends ESRIWrappers {
	public Romania_LegalPrivacyInfoPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Legal Information | Esri Privacy Statement")) {
			Reporter.reportStep("This is not a Legal Information | Esri Privacy Statement (Romania) page.", "FAIL");
		} else
			System.out.println("Romania Legal Information | Esri Privacy Statement page Launched Successfully");
	}

	// click back button in browser
	public Romania_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Romania_HomePage();
	}

	// verify Esri Privacy Statement label
	public Romania_LegalPrivacyInfoPage verifyEsriPrivacyStatementlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRomaniasLegP.LegalPrivacyLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
