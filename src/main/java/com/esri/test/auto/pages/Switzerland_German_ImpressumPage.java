package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Switzerland Impressum | Esri Schweiz Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Switzerland_German_ImpressumPage extends ESRIWrappers {
	public Switzerland_German_ImpressumPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Impressum | Esri Schweiz")) {
			Reporter.reportStep("This is not a Impressum | Esri Schweiz (Switzerland) page.", "FAIL");
		} else
			System.out.println("Switzerland Impressum | Esri Schweiz page Launched Successfully");
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

	// verify Impressum label
	public Switzerland_German_ImpressumPage verifyImpressumlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("diswitzGerImpressum.ImpressumLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
