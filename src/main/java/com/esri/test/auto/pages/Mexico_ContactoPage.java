package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Mexico Contacto Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Mexico_ContactoPage extends ESRIWrappers {
	public Mexico_ContactoPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Contacto")) {
			Reporter.reportStep("This is not a Contacto (Mexico) page.", "FAIL");
		} else
			System.out.println("Mexico Contacto page Launched Successfully");
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

	// verify Contacto label
	public Mexico_ContactoPage verifyContactolbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disMexicoContacto.contactoLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
