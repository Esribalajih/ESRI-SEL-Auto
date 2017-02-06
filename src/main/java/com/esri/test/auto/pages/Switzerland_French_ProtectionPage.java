package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Switzerland Protection des données | Esri Suisse Page of ESRI
 * Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Switzerland_French_ProtectionPage extends ESRIWrappers {
	public Switzerland_French_ProtectionPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Protection des données | Esri Suisse")) {
			Reporter.reportStep("This is not a Protection des données | Esri Suisse (Switzerland) page.", "FAIL");
		} else
			System.out.println("Switzerland Protection des données | Esri Suisse page Launched Successfully");
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

	// verify Protection des données label
	public Switzerland_French_ProtectionPage verifyProtectiondesdonneeslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("diswitzFreProtection.ProtectiondesdonneesLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Accueil footer link
	public Switzerland_French_HomePage clickAccueilFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzFreHome.AccueilFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Switzerland_French_HomePage();
	}

}
