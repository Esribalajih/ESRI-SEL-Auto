package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Germany Support Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Germany_SupportPage extends ESRIWrappers {
	public Germany_SupportPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Support | Esri Deutschland")) {
			Reporter.reportStep("This is not a Support | Esri Deutschland (Germany) page.", "FAIL");
		} else
			System.out.println("Germany Support | Esri Deutschland page Launched Successfully");
	}

	// verify Support label
	public Germany_SupportPage verifySupportlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disGermanyDat.SupportLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
