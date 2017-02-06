package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Switzerland Conditions de licences | Esri Suisse Page of ESRI Distributor
 * Application
 * 
 * @author Udhayasundar S
 *
 */
public class Switzerland_French_CondLicencePage extends ESRIWrappers {
	public Switzerland_French_CondLicencePage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Conditions de licences | Esri Suisse")) {
			Reporter.reportStep("This is not a Conditions de licences | Esri Suisse (Switzerland) page.", "FAIL");
		} else
			System.out.println("Switzerland Conditions de licences | Esri Suisse page Launched Successfully");
	}

	// click back button in browser
	public Switzerland_French_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Switzerland_French_HomePage();
	}

	// verify Informations juridiques label
	public Switzerland_French_CondLicencePage verifyInformationsjuridiqueslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("diswitzFreInformations.InformationsjuridiquesLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

}
