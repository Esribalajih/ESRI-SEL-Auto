package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the UK Marketplace Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class UK_MarketingPlacePage extends ESRIWrappers {
	public UK_MarketingPlacePage() throws Throwable {
		waitForPageLoad(10);
		switchWindowByTitle("Marketplace");
		if (!VerifyTitle("Marketplace")) {
			Reporter.reportStep("This is not a Marketplace (UK) page.", "FAIL");
		} else
			System.out.println("UK Marketplace page Launched Successfully");
	}

	// click back button in browser
	public UK_HomePage clickbsrBackBtn() throws Throwable {
		try {
			//clickBrowserBackButton();
			switchWindowByTitle("Esri UK - GIS Mapping Software, Solutions, Services, Map Apps and Data");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new UK_HomePage();
	}

	// verify ArcGIS Marketplace label
	public UK_MarketingPlacePage verifyMarketplacelbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disUKMarketplace.ArcGISMarketplaceLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
