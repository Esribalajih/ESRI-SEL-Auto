package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Netherlands Contacto Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Netherlands_SupportPage extends ESRIWrappers {
	public Dist_Netherlands_SupportPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Support | Esri Nederland")) {
			Reporter.reportStep("This is not a Support | Esri Nederland (Nederland) page.", "FAIL");
		} else
			System.out.println("Nederland Support | Esri Nederland page Launched Successfully");
	}

	// click back button in browser
	public Dist_Netherlands_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Netherlands_HomePage();
	}

	// verify Support label
	public Dist_Netherlands_SupportPage verifySupportlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsSupport.supportLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
