package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Finland ArcGIS for Server | GIS Web Server Software | Web Map Server
 *   Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_finland_ArcGIServerPage extends ESRIWrappers {
	public Dist_finland_ArcGIServerPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("ArcGIS for Server | GIS Web Server Software | Web Map Server")) {
			Reporter.reportStep("This is not a  ArcGIS for Server (Finland) page.", "FAIL");
		} else
			System.out.println("Finland ArcGIS for Server page Launched Successfully");
	}

	// click back button in browser
	public Dist_Finland_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Finland_HomePage();
	}

	// verify ArcGIS desktop label
	public Dist_finland_ArcGIServerPage verifyArcGISforServerlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disFinlandHome.ArcGISServerLbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
