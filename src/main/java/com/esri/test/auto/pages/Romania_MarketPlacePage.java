package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Romania Marketplace Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Romania_MarketPlacePage extends ESRIWrappers {
	public Romania_MarketPlacePage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Marketplace")) {
			Reporter.reportStep("This is not a Marketplace (Romania) page.", "FAIL");
		} else
			System.out.println("Romania Marketplace page Launched Successfully");
	}

	// click back button in browser
	public Romania_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Romania_HomePage();
	}

	// verify ArcGIS Marketplace banner label
	public Romania_MarketPlacePage verifyArcGISMarketplacelbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRomaniasMarket.MarketPlaceLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
