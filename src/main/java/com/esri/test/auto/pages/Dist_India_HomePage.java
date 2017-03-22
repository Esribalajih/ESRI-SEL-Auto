package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the India Home Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_HomePage extends ESRIWrappers {
	
	public Dist_India_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("Esri India | Your partner in GIS")) {
			Reporter.reportStep("This is not a Esri India | Your partner in GIS (India) Home page.", "FAIL");
		} else
			System.out.println("Esri India | Your partner in GIS Home page Launched Successfully");
	}

	// click Industries Tab
	public Dist_India_IndustriesPage clickIndustriesTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.industriesTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_IndustriesPage();
	}

		// click Products Tab
	public Dist_India_ProductsPage clickProductsTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.productsTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new  Dist_India_ProductsPage();
	}

	// click training Tab
	public Dist_India_CustEduServicesPage clickTrainingTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.trainingTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_CustEduServicesPage();
	}

	
	// click support Tab
	public Dist_India_EsriIndTechSupportPage clickSupportTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.supportTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_EsriIndTechSupportPage();
	}

	// click services Tab
	public Dist_India_ServicesPage clickServicesTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.servicesTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_ServicesPage();
	}

	// click Events Tab
	public Dist_India_EventsPage clickEventsTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.eventsTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_EventsPage();
	}
			
	// click News tab
	public Dist_India_ESRIIndNewsPage clickNewsTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.newsTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_ESRIIndNewsPage();
	}
	
	
	// click About tab
		public Dist_India_AboutPage clickAboutTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disIndiaHome.aboutTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_India_AboutPage();
		}

	// click online HelpDesk header Link
	public Dist_India_OnlineTechSupportPage clickonlineHelpdeskHeaderLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.onlineHelpDeskHeaderLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_OnlineTechSupportPage();
	}

	

	// click Contact Us header Link
	public Dist_India_ContactUsPage clickContactUsHeaderLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.contactUsHeaderLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_ContactUsPage();
	}

	// click careers header Link
	public Dist_India_CareerPage clickCareersHeaderLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.careersHeaderLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_CareerPage();
	}
	
		
	// click Contact US footer link
	public Dist_India_ContactUsPage clickContactUSFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.contactUsFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_ContactUsPage();
	}

	// click Privacy footer link
		public Dist_India_PrivacyPage clickPrivacyFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disIndiaHome.privacyFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_India_PrivacyPage();
		}
		
		// click Legal footer link
		public Dist_India_LegalPage clickLegalFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disIndiaHome.legalFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_India_LegalPage();
		}
		
	// Verify ArcGIS platform label
	public Dist_India_HomePage verifyArcGISPlatformLabel(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaHome.arcGISPlatformLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click ArcGIS Main link
	public Dist_India_ArcGISMainPage clickArcGISMainLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.arcGISMainLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_ArcGISMainPage();
	}

	// click ArcGIS Main link
	public Dist_India_ArcGISProPage clickArcGISProLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.arcGISProLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_ArcGISProPage();
	}

	// click Local analytics link
	public Dist_India_LocAnalyticsPage clickLocalAnalyticsLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.arcGISLocalAnalyticsLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_LocAnalyticsPage();
	}

	// click Marketing place link
	public Dist_India_MarketPlacePage clickMarketingPlaceLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.arcGISMarketingPlaceLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_MarketPlacePage();
	}

	// click ArcGIS for Developers link
	public Dist_India_ArcGISForDevPage clickArcGISDevelopersLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.arcGISDevelopersLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_ArcGISForDevPage();
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public Dist_India_HomePage headerEmbedCode(String HeaderEmbedCode) throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),HeaderEmbedCode);
		return this;
	}
	public Dist_India_HomePage googleTagManagerForScript(String GoogleTagManagerScript) throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),GoogleTagManagerScript);
		return this;
	}	
	public Dist_India_HomePage googleTagManagerForNoScript(String GoogleTagManagerNoScript) throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),GoogleTagManagerNoScript);
		return this;
	}
	public Dist_India_HomePage footerEmbbedCode(String FooterEmbedCode) throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),FooterEmbedCode);
		return this;
	}
	public Dist_India_HomePage pardotDataLayerCode(String PardotLayerCode) throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),PardotLayerCode);
		return this;
	}	
	
}
