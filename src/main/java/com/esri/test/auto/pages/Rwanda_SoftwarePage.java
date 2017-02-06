package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Rwanda Software | Esri Rwanda Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Rwanda_SoftwarePage extends ESRIWrappers {
	public Rwanda_SoftwarePage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Software | Esri Rwanda")) {
			Reporter.reportStep("This is not a ArcGIS | Main (Rwanda) page.", "FAIL");
		} else
			System.out.println("Rwanda Software | Esri Rwanda page Launched Successfully");
	}

	// click back button in browser
	public Rwanda_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Rwanda_HomePage();
	}

	// verify Software label
	public Rwanda_SoftwarePage verifySoftwarelbl(String data) throws Throwable {
		try {
			waitForPageLoad(5);
			verifyValueByXpath(prop.getProperty("disRwandaSoft.softwareLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
	// verify ArcGIS label
		public Rwanda_SoftwarePage verifyArcGISlbl(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disRwandaSoft.mainArcGISLabel.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
		
		
		
		// verify ArcGIS Online label
		public Rwanda_SoftwarePage verifyArcGISOnlinelbl(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disRwandaSoft.ArcGISOnlineLabel.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
		
		
		
		// verify ArcGIS for Desktop label
		public Rwanda_SoftwarePage verifyArcGISDesktoplbl(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disRwandaSoft.ArcGISforDesktopLabel.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
		
		
		
		// verify ArcGIS for Servers label
		public Rwanda_SoftwarePage verifyArcGISServerslbl(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disRwandaSoft.ArcGISforServersLabel.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
		
		
		// verify ArcGIS for Mobile label
		public Rwanda_SoftwarePage verifyArcGISMobilelbl(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disRwandaSoft.ArcGISforMobileLabel.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
	
	
}
