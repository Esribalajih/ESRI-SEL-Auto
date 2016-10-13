package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Mexico Aviso de Privacidad Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Mexico_PrivacidadPage extends ESRIWrappers {
	public Mexico_PrivacidadPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Aviso de Privacidad")) {
			Reporter.reportStep("This is not a Aviso de Privacidad (Mexico) page.", "FAIL");
		} else
			System.out.println("Mexico Aviso de Privacidad page Launched Successfully");
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

	// verify Aviso de Privacidad label
	public Mexico_PrivacidadPage verifyAvisodePrivacidadlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disMexicoPrivacidad.avisodePrivacidadLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
