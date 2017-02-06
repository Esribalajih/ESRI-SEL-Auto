package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Rwanda Home Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Rwanda_HomePage extends ESRIWrappers {

	public Rwanda_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("Esri Rwanda")) {
			Reporter.reportStep("This is not a Esri Rwanda (Rwanda) Home page.", "FAIL");
		} else
			System.out.println("Rwanda Esri Rwanda Home page Launched Successfully");
	}

	// click Home Tab
	public Rwanda_HomePage clickHomeTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRwandaHome.HomeTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Software Tab
	public Rwanda_SoftwarePage clickSoftwareLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRwandaHome.SoftwareTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Rwanda_SoftwarePage();
	}

	// click Training Tab
	public Rwanda_TrainingPage clickTrainingTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRwandaHome.TrainingTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Rwanda_TrainingPage();
		}
	
	// click Support & Resources Tab
	public Rwanda_SupportServPage clickSupportResourcesTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRwandaHome.SupportTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Rwanda_SupportServPage();
	}

	// click News Tab	
	public Rwanda_NewsPage clickNewsTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRwandaHome.NewsTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Rwanda_NewsPage();
	}

	// click About Tab
	public Rwanda_AboutPage clickAboutTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRwandaHome.AboutTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Rwanda_AboutPage();
	}

	
	// Verify Software Label
	public Rwanda_HomePage verifySoftwareLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRwandaHome.SoftwareLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	// click Software Link
		public Rwanda_SoftwarePage clickDespreTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRwandaHome.SoftwareLabel.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Rwanda_SoftwarePage();
		}

	// click ArcGIS Online Tab
		public Rwanda_SoftwarePage clickArcGISOnlineLink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRwandaHome.ArcGISOnlineLink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Rwanda_SoftwarePage();
		}
			
	// click ArcGIS for Desktop link
	public  Rwanda_SoftwarePage clickArcGISDesktopLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRwandaHome.ArcGISforDesktopLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Rwanda_SoftwarePage();
	}

	// click ArcGIS for Servers link
	public Rwanda_SoftwarePage clickArcGISServersLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRwandaHome.ArcGISforServerLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Rwanda_SoftwarePage();
	}

	// click ArcGIS for Mobile link
		public  Rwanda_SoftwarePage clickArcGISMobileLink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRwandaHome.ArcGISforMobile.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Rwanda_SoftwarePage();
		}
		
	// click Contact us footer link
	public Rwanda_ContactUsPage clickContactUsFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRwandaHome.ContactUsFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Rwanda_ContactUsPage();
	}

	// click Home link
	public Rwanda_HomePage clickHomeFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRwandaHome.HomeFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Privacy footer link
		public Rwanda_PrivacyPage clickPrivcacyFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRwandaHome.PrivacyFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Rwanda_PrivacyPage();
		}

}
