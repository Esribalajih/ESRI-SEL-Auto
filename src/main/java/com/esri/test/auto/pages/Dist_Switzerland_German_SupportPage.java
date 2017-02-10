package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Switzerland Support | Esri Schweiz Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Switzerland_German_SupportPage extends ESRIWrappers {
	public Dist_Switzerland_German_SupportPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Support | Esri Schweiz")) {
			Reporter.reportStep("This is not a Support | Esri Schweiz (Switzerland) page.", "FAIL");
		} else
			System.out.println("Switzerland Support | Esri Schweiz page Launched Successfully");
	}

	// click back button in browser
	public Dist_Switzerland_German_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Switzerland_German_HomePage();
	}

	// verify Support label
	public Dist_Switzerland_German_SupportPage verifySupportlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("diswitzGerSupport.SupportLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
