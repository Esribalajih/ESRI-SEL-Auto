package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Rwanda 	Contact Us | Esri Rwanda Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Rwanda_ContactUsPage extends ESRIWrappers {
	public Rwanda_ContactUsPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Contact Us | Esri Rwanda")) {
			Reporter.reportStep("This is not a Contact Us | Esri Rwanda (Rwanda) page.", "FAIL");
		} else
			System.out.println("Rwanda Contact Us | Esri Rwanda page Launched Successfully");
	}

	// click back button in browser
	public Rwanda_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Rwanda_HomePage();
	}

	// verify Contact Us Label
	public Rwanda_ContactUsPage verifyContactUslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRwandaCont.ContactUsLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	// click Home link
		public Rwanda_HomePage clickHomeFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRwandaHome.HomeFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Rwanda_HomePage();
		}
	
	
}
