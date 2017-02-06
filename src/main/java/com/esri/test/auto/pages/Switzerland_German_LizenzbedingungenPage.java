package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Switzerland Esri Lizenzbedingungen | Esri Schweiz Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Switzerland_German_LizenzbedingungenPage extends ESRIWrappers {
	public Switzerland_German_LizenzbedingungenPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Esri Lizenzbedingungen | Esri Schweiz")) {
			Reporter.reportStep("This is not a Esri Lizenzbedingungen | Esri Schweiz (Switzerland) page.", "FAIL");
		} else
			System.out.println("Switzerland Esri Lizenzbedingungen | Esri Schweiz page Launched Successfully");
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

	// verify Lizenzbedingungen label
	public Switzerland_German_LizenzbedingungenPage verifyLizenzbedingungenlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("diswitzGerLizenzbedingungen.LizenzbedingungenLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
