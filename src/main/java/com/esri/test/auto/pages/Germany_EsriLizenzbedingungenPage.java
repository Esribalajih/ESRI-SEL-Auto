package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Germany Esri Lizenzbedingungen Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Germany_EsriLizenzbedingungenPage extends ESRIWrappers {
	public Germany_EsriLizenzbedingungenPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Esri Lizenzbedingungen | Esri Deutschland")) {
			Reporter.reportStep("This is not a Esri Lizenzbedingungen | Esri Deutschland (Germany) page.", "FAIL");
		} else
			System.out.println("Germany Esri Lizenzbedingungen | Esri Deutschland page Launched Successfully");
	}

	// click back button in browser
	public Germany_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Germany_HomePage();
	}

	// verify Esri Lizenzbedingungen label
	public Germany_EsriLizenzbedingungenPage verifyEsriLizenzbedingungenlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disGermanyLiz.EsriLizenzbedingungenLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
