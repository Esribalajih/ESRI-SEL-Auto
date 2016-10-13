package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Esri India Online Technical Support System Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class India_OnlineTechSupportPage extends ESRIWrappers {
	public India_OnlineTechSupportPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Esri India Online Technical Support System")) {
			Reporter.reportStep("This is not a Esri India Online Technical Support System (India) page.", "FAIL");
		} else
			System.out.println("India Esri India Online Technical Support System page Launched Successfully");
	}

	// click back button in browser
	public India_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_HomePage();
	}

	// verify Online Technical Support label
	public India_OnlineTechSupportPage verifyOnlineTechSuplbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaTecSup.onlineTechSupportLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
