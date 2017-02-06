package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Ireland Marketplace Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Ireland_MarketPlacePage extends ESRIWrappers {
	public Dist_Ireland_MarketPlacePage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("Marketplace");
		if (!VerifyTitle("Marketplace")) {
			Reporter.reportStep("This is not a Marketplace (Ireland) page.", "FAIL");
		} else
			System.out.println("Ireland Marketplace page Launched Successfully");
	}

	// click back button in browser
	public Dist_Ireland_HomePage clickbsrBackBtn() throws Throwable {
		try {
			//clickBrowserBackButton();
			switchWindowByTitle("Esri Ireland | Home");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Ireland_HomePage();
	}

	// verify Marketing Place label
	public Dist_Ireland_MarketPlacePage verifyMarketingPlacelbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIrelandArcMar.marketingPlaceLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
