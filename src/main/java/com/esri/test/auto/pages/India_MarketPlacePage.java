package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India Marketplace Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class India_MarketPlacePage extends ESRIWrappers {
	public India_MarketPlacePage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("Marketplace");
		if (!VerifyTitle("Marketplace")) {
			Reporter.reportStep("This is not a Marketplace (India) page.", "FAIL");
		} else
			System.out.println("India Marketplace page Launched Successfully");
	}

	// click back button in browser
	public India_HomePage clickbsrBackBtn() throws Throwable {
		try {
			//clickBrowserBackButton();
			switchWindowByTitle("Esri India | Your partner in GIS");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_HomePage();
	}

	// verify Marketing Place label
	public India_MarketPlacePage verifyMarketingPlacelbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaArcMar.marketingPlaceLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
