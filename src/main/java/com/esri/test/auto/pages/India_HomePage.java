package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the India Home Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class India_HomePage extends ESRIWrappers {
	
	public India_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("Esri India | Your partner in GIS")) {
			Reporter.reportStep("This is not a Esri India | Your partner in GIS (India) Home page.", "FAIL");
		} else
			System.out.println("Esri India | Your partner in GIS Home page Launched Successfully");
	}

	// click Industries Tab
	public India_IndustriesPage clickIndustriesTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.industriesTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_IndustriesPage();
	}

		// click Products Tab
	public India_ProductsPage clickProductsTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.productsTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new  India_ProductsPage();
	}

	// click training Tab
	public India_CustEduServicesPage clickTrainingTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.trainingTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_CustEduServicesPage();
	}

	
	// click support Tab
	public India_EsriIndTechSupportPage clickSupportTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.supportTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_EsriIndTechSupportPage();
	}

	// click services Tab
	public India_ServicesPage clickServicesTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.servicesTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_ServicesPage();
	}

	// click Events Tab
	public India_EventsPage clickEventsTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.eventsTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_EventsPage();
	}
			
	// click News tab
	public India_ESRIIndNewsPage clickNewsTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.newsTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_ESRIIndNewsPage();
	}
	
	
	// click About tab
		public India_AboutPage clickAboutTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disIndiaHome.aboutTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new India_AboutPage();
		}

	// click online HelpDesk header Link
	public India_OnlineTechSupportPage clickonlineHelpdeskHeaderLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.onlineHelpDeskHeaderLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_OnlineTechSupportPage();
	}

	

	// click Contact Us header Link
	public India_ContactUsPage clickContactUsHeaderLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.contactUsHeaderLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_ContactUsPage();
	}

	// click careers header Link
	public India_CareerPage clickCareersHeaderLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.careersHeaderLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_CareerPage();
	}
	
		
	// click Contact US footer link
	public India_ContactUsPage clickContactUSFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.contactUsFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_ContactUsPage();
	}

	// click Privacy footer link
		public India_PrivacyPage clickPrivacyFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disIndiaHome.privacyFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new India_PrivacyPage();
		}
		
		// click Legal footer link
		public India_LegalPage clickLegalFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disIndiaHome.legalFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new India_LegalPage();
		}
		
	// Verify ArcGIS platform label
	public India_HomePage verifyArcGISPlatformLabel(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaHome.arcGISPlatformLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click ArcGIS Main link
	public India_ArcGISMainPage clickArcGISMainLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.arcGISMainLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_ArcGISMainPage();
	}

	// click ArcGIS Main link
	public India_ArcGISProPage clickArcGISProLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.arcGISProLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_ArcGISProPage();
	}

	// click Local analytics link
	public India_LocAnalyticsPage clickLocalAnalyticsLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.arcGISLocalAnalyticsLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_LocAnalyticsPage();
	}

	// click Marketing place link
	public India_MarketPlacePage clickMarketingPlaceLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.arcGISMarketingPlaceLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_MarketPlacePage();
	}

	// click ArcGIS for Developers link
	public India_ArcGISForDevPage clickArcGISDevelopersLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.arcGISDevelopersLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new India_ArcGISForDevPage();
	}
	
}
