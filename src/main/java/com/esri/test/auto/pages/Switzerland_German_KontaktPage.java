package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Switzerland Kontakt | Esri Schweiz Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Switzerland_German_KontaktPage extends ESRIWrappers {
	public Switzerland_German_KontaktPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Kontakt | Esri Schweiz")) {
			Reporter.reportStep("This is not a Kontakt | Esri Schweiz (Switzerland) page.", "FAIL");
		} else
			System.out.println("Switzerland Kontakt | Esri Schweiz page Launched Successfully");
	}

	// click back button in browser
	public Switzerland_German_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Switzerland_German_HomePage();
	}

	// verify Kontakt label
	public Switzerland_German_KontaktPage verifyKontaktlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("diswitzGerKontakt.KontaktLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
