package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Germany Kontakt Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Germany_KontaktPage extends ESRIWrappers {
	public Dist_Germany_KontaktPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Kontakt | Esri Deutschland")) {
			Reporter.reportStep("This is not a Kontakt | Esri Deutschland (Germany) page.", "FAIL");
		} else
			System.out.println("Germany Kontakt | Esri Deutschland page Launched Successfully");
	}

	// click back button in browser
	public Dist_Germany_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Germany_HomePage();
	}

	// verify Kontakt label
	public Dist_Germany_KontaktPage verifyKontaktlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disGermanyKont.KontaktLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
