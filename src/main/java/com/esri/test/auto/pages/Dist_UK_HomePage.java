package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the UK Esri UK - GIS Mapping Software, Solutions, Services, Map Apps and Data Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_UK_HomePage extends ESRIWrappers {
	
	public Dist_UK_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("Esri UK - GIS Mapping Software, Solutions, Services, Map Apps and Data")) {
			Reporter.reportStep("This is not a Esri UK - GIS Mapping Software, Solutions, Services, Map Apps and Data (UK) Home page.", "FAIL");
		} else
			System.out.println("Esri UK - GIS Mapping Software, Solutions, Services, Map Apps and Data Home page Launched Successfully");
	}

	// click Industries Tab
	public Dist_UK_HomePage clickIndustriesTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disUKHome.IndustriesTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	// Verify Commercial link
			public Dist_UK_HomePage verifyCommercialLink(String data) throws Throwable {
				try {
					waitForPageLoad(5);
					verifyValueByXpath(prop.getProperty("disUKHome.Commerciallabel.xpath"), data);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return this;
			}
	
			// click Products Tab
	public Dist_UK_HomePage clickProductsTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disUKHome.ProductsTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

			// Verify ArcGIS Platform  link
		public Dist_UK_HomePage verifyArcGISPlatformLink(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disUKHome.ArcGISPlatformlabel.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// click Support & Services Tab
		public Dist_UK_HomePage clickSupportServicesTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disUKHome.SupportServicesTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// Verify Training Link
		public Dist_UK_HomePage verifyTrainingLink(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disUKHome.Traininglabel.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// click About Tab
		public Dist_UK_HomePage clickAboutTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disUKHome.AboutTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// Verify About Esri UK Link
		public Dist_UK_HomePage verifyAboutEsriUKLink(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disUKHome.AboutEsriUKlbl.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// click Community Tab
		public Dist_UK_HomePage clickCommunityTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disUKHome.CommunityTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
		
		// Verify CommunityHub Link
		public Dist_UK_HomePage verifyCommunityHubLink(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disUKHome.CommunityHublbl.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// click Shop Tab
		public Dist_UK_HomePage clickShopTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disUKHome.ShopTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// Verify Store Link
		public Dist_UK_HomePage verifyStoreLink(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disUKHome.Storelbl.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
		
		// click search icon link
		public Dist_UK_SearchPage clickSearchIcon() throws Throwable {
			try {
				clickById(prop.getProperty("disUKHome.searchIcon.id"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_UK_SearchPage();
		}

		// enter the data to search text box
		public Dist_UK_HomePage enterSearchTextBox(String data) throws Throwable {
			try {
				enterById(prop.getProperty("disUKHome.searchTextBox.id"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
		
	// Verify ArcGIS platform label
	public Dist_UK_HomePage verifyArcGISPlatformLabel(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disUKHome.ArcGISPlatformLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click ArcGIS Online link
	public Dist_UK_ArcGISOnlinePage clickArcGISOnlineLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disUKHome.ArcGISOnlineLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_UK_ArcGISOnlinePage();
	}

	// click ArcGIS for Desktop link
	public Dist_UK_ArcGISDesktopPage clickArcGISDesktopLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disUKHome.ArcGISforDesktopLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_UK_ArcGISDesktopPage();
	}

	// click ArcGIS for Servers link
	public Dist_UK_ArcGISServerPage clickArcGISServersLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disUKHome.ArcGISforServerLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_UK_ArcGISServerPage();
	}

	// click ArcGIS for Developers link
	public Dist_UK_ArcGISDevelopersPage clickArcGISDevelopersLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disUKHome.ArcGISforDevelopersLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_UK_ArcGISDevelopersPage();
	}

	// click ArcGIS Solutions link
	public Dist_UK_ArcGISSolutionsPage clickArcGISSolutionsLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disUKHome.ArcGISSolutionsLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_UK_ArcGISSolutionsPage();
	}
	
	// Click ArcGIS Marketplace link
	public Dist_UK_MarketingPlacePage clickArcGISMarketplaceLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disUKHome.ArcGISMarketplaceLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_UK_MarketingPlacePage();
	}
		
// click Contact US footer link
public Dist_UK_ContactUsPage clickContactUSFooterlink() throws Throwable {
	try {
		clickByXpath(prop.getProperty("disUKHome.ContactUsFooterlink.xpath"));
	} catch (Exception e) {
		e.printStackTrace();
	}
	return new Dist_UK_ContactUsPage();
}
//
//click Cookies footer link
public Dist_UK_CookiesPage clickCookiesFooterlink() throws Throwable {
	try {
		clickByXpath(prop.getProperty("disUKHome.CookiesFooterlink.xpath"));
	} catch (Exception e) {
		e.printStackTrace();
	}
	return new Dist_UK_CookiesPage();
}
// click Privacy footer link
	public Dist_UK_PrivacyPage clickPrivacyFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disUKHome.PrivacyFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_UK_PrivacyPage();
	}
	
	// click Legal footer link
	public Dist_UK_LegalPage clickLegalFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disUKHome.LegalFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_UK_LegalPage();
	}
	
	// click  Slavery/Human Trafficking Statement  footer link
		public Dist_UK_LegalPage clickSlaveryHumanTrafStmtFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disUKHome.legalFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_UK_LegalPage();
		}
}
