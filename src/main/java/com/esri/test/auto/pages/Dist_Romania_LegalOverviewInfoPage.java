package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Romania Legal Information | Overview Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Romania_LegalOverviewInfoPage extends ESRIWrappers {
	public Dist_Romania_LegalOverviewInfoPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Legal Information | Overview")) {
			Reporter.reportStep("This is not a Legal Information | Overview (Romania) page.", "FAIL");
		} else
			System.out.println("Romania Legal Information | Overview page Launched Successfully");
	}

	// click back button in browser
	public Dist_Romania_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Romania_HomePage();
	}

	// verify Overview label
	public Dist_Romania_LegalOverviewInfoPage verifyOverviewlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRomaniasLeg.LegalOverviewInfoLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
