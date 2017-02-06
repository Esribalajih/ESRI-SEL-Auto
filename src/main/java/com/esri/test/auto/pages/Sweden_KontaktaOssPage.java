package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Sweden Kontakta oss Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Sweden_KontaktaOssPage extends ESRIWrappers {
	public Sweden_KontaktaOssPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Kontakta oss")) {
			Reporter.reportStep("This is not a Kontakta oss (Sweden) page.", "FAIL");
		} else
			System.out.println("Sweden Kontakta oss page Launched Successfully");
	}

	// click back button in browser
	public Sweden_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Sweden_HomePage();
	}

	// verify Kontakta oss label
	public Sweden_KontaktaOssPage verifyKontaktaOsslbl(String data) throws Throwable {
		try {
			verifyValueById(prop.getProperty("disSwedenKontakta.KontaktaOssLabel.id"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
