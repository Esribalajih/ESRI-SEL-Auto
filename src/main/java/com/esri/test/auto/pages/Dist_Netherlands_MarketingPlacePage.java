package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Netherlands Marketplace Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Netherlands_MarketingPlacePage extends ESRIWrappers {
	public Dist_Netherlands_MarketingPlacePage() throws Throwable {
		waitForPageLoad(15);
		switchWindowByTitle("Marketplace");
		if (!VerifyTitle("Marketplace")) {
			Reporter.reportStep("This is not a Marketplace (Netherlands) page.", "FAIL");
		} else
			System.out.println("Netherlands Marketplace  page Launched Successfully");
	}

	// click back button in browser
	public Dist_Netherlands_HomePage clickbsrBackBtn() throws Throwable {
		try {
			//clickBrowserBackButton();
			switchWindowByTitle("Esri.nl");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Netherlands_HomePage();
	}

	// verify Marketing place label
	public Dist_Netherlands_MarketingPlacePage verifyMarketplacelbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsMP.MarketingPlaceLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
