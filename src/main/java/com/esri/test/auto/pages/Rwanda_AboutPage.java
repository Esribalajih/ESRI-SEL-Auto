package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Rwanda About | Esri Rwanda Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Rwanda_AboutPage extends ESRIWrappers {
	public Rwanda_AboutPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("About | Esri Rwanda")) {
			Reporter.reportStep("This is not a About | Esri Rwanda (Rwanda) page.", "FAIL");
		} else
			System.out.println("Rwanda About | Esri Rwanda page Launched Successfully");
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

	// verify About label
	public Rwanda_AboutPage verifyAboutlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRwandaAbt.AboutLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	// click Home Tab
		public Rwanda_HomePage clickHomeTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRwandaHome.HomeTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Rwanda_HomePage();
		}
	
}
