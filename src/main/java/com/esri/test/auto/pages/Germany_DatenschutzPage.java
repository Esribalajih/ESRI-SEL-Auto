package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Germany Datenschutz Page Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Germany_DatenschutzPage extends ESRIWrappers {
	public Germany_DatenschutzPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Datenschutz | Esri Deutschland")) {
			Reporter.reportStep("This is not a Datenschutz | Esri Deutschland (Germany) page.", "FAIL");
		} else
			System.out.println("Germany Datenschutz | Esri Deutschland page Launched Successfully");
	}

	// click back button in browser
	public Germany_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Germany_HomePage();
	}

	// verify Datenschutz label
	public Germany_DatenschutzPage verifyDatenschutzlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disGermanyDat.DatenschutzLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
	// click back button in browser
		public Germany_HomePage clickHomeFooterLink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disGermanyHome.HomeFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Germany_HomePage();
		}
}
