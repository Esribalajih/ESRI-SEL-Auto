package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the UK 	ArcGIS for Server | GIS Web Server Software | Web Map Server Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class UK_ArcGISServerPage extends ESRIWrappers {
	public UK_ArcGISServerPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("ArcGIS for Server | GIS Web Server Software | Web Map Server")) {
			Reporter.reportStep("This is not a ArcGIS for Server | GIS Web Server Software | Web Map Server (UK) page.", "FAIL");
		} else
			System.out.println("UK ArcGIS for Server | GIS Web Server Software | Web Map Server page Launched Successfully");
	}

	// click back button in browser
	public UK_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new UK_HomePage();
	}

	// verify ArcGIS for Servers label
	public UK_ArcGISServerPage verifyArcGISServerslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disUKServer.ArcGISServersLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
