package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Brazil Contato Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Brazil_ContatoPage extends ESRIWrappers {
	public Dist_Brazil_ContatoPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Contato")) {
			Reporter.reportStep("This is not a Contato  (Brazil contact) page.", "FAIL");
		} else
			System.out.println("Brazil Contato page Launched Successfully");
	}

	// click click back button in browser
	public Dist_Brazil_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Brazil_HomePage();
	}

	// Verify Contato label 
	public Dist_Brazil_ContatoPage verifyContatoPage(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disBrazilcont.contatolabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	 

}
