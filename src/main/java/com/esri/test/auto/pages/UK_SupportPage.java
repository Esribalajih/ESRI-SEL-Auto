package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the UK Technical Support | Esri UK Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class UK_SupportPage extends ESRIWrappers {
	public UK_SupportPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Technical Support | Esri UK")) {
			Reporter.reportStep("This is not a Technical Support | Esri UK (UK) page.", "FAIL");
		} else
			System.out.println("UK Technical Support | Esri UK page Launched Successfully");
	}

	// click back button in browser
	public UK_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new UK_HomePage();
	}

	// verify Welcome to Esri UK Support label
	public UK_SupportPage verifySupportlbl(String data) throws Throwable {
		try {
			verifyValueWithNewLineByXpath(prop.getProperty("disUKSupport.SupportLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
