package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Switzerland Datenschutz | Esri Schweiz Page of ESRI Distributor
 * Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Switzerland_German_DatenschutzPage extends ESRIWrappers {
	public Dist_Switzerland_German_DatenschutzPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Datenschutz | Esri Schweiz")) {
			Reporter.reportStep("This is not a Datenschutz | Esri Schweiz (Switzerland) page.", "FAIL");
		} else
			System.out.println("Switzerland Datenschutz | Esri Schweiz page Launched Successfully");
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

	// verify Datenschutz label
	public Dist_Switzerland_German_DatenschutzPage verifyDatenschutzlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("diswitzGerDatenschutz.DatenschutzLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Home footer link
	public Dist_Switzerland_German_HomePage clickHomeFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzGerHome.HomeFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Switzerland_German_HomePage();
	}

}
