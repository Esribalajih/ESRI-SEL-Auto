package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Netherlands Home Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Netherlands_HomePage extends ESRIWrappers {

	public Netherlands_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("Esri.nl")) {
			Reporter.reportStep("This is not a Esri.nl (Netherlands) Home page.", "FAIL");
		} else
			System.out.println("Netherlands Esri.nl Home page Launched Successfully");
	}

	// click Sectoren Tab
	public Netherlands_HomePage clickISectorenTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.SectorenTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Overheid link
	public Netherlands_HomePage verifyOverheidLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsHome.Overheidlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Producten Tab
	public Netherlands_HomePage clickProductenTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.ProductenTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify ArcGIS-platform Link
	public Netherlands_HomePage verifyArcGISPlatformLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsHome.ArcGISplatformlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Support & Services Tab
	public Netherlands_HomePage clickSupportServicesTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.SupportServicesTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Support Link
	public Netherlands_HomePage verifySupportLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsHome.Supportlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Opleidingen Tab
	public Netherlands_HomePage clickOpleidingenTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.OpleidingenTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Home link
	public Netherlands_HomePage verifyHomeLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsHome.Homelbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	// click Nieuws & Evenementen Tab
		public Netherlands_HomePage clickNieuwsEvenementenTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.nieuwsEvenementenTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// Verify Publicaties Link
		public Netherlands_HomePage verifyPublicatiesLink(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disNetherlandsHome.Publicatieslbl.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// click Over ons Tab
		public Netherlands_HomePage clickOveronsTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.OveronsTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// Verify Over ons link
		public Netherlands_HomePage verifyOveronsLink(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disNetherlandsHome.Overonslbl.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
	
		// click search icon link
		public Netherlands_ZoekenPage clickSearchIcon() throws Throwable {
			try {
				clickById(prop.getProperty("disNetherlandsHome.searchIcon.id"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Netherlands_ZoekenPage();
		}

		// enter the data to search text box
		public Netherlands_HomePage enterSearchTextBox(String data) throws Throwable {
			try {
				enterById(prop.getProperty("disNetherlandsHome.searchTextBox.id"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

	// click ArcGIS Platform link
	public Netherlands_ArcGISPlatformPage clickArcGISPlatformLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.ArcGISPlatform.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Netherlands_ArcGISPlatformPage();
	}

	// click ArcGIS online link
	public  Netherlands_ArcGISOnlinePage clickArcGISOnlineLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.ArcGISOnline.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Netherlands_ArcGISOnlinePage();
	}

	// click ArcGIS for Desktop link
	public Netherlands_ArcGISDesktopPage clickArcGISDesktopLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.ArcGISDesktop.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Netherlands_ArcGISDesktopPage();
	}

	// click ArcGIS for Server link
	public Netherlands_ArcGISServerPage clickArcGISServerLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.ArcGISServer.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Netherlands_ArcGISServerPage();
	}
	
	// click ArcGIS Content link
		public  Netherlands_ArcGISContentPage clickArcGISContentLink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.ArcGISContent.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Netherlands_ArcGISContentPage();
		}

		// click Apps link
		public Netherlands_AppPage clickAppsLink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.Apps.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Netherlands_AppPage();
		}

		// click ArcGIS Marketplace link
		public Netherlands_MarketingPlacePage clickArcGISMarketplaceLink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.ArcGISMarketplace.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Netherlands_MarketingPlacePage();
		}
	
	
	

	// click Disclaimer footer link
	public Netherlands_DisclaimerPage clickDisclaimerFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.DisclaimerFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Netherlands_DisclaimerPage();
	}

	// click Mijn Esri link
	public Netherlands_HomeESRINetherPage clickMijnEsriFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.MijnEsriFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Netherlands_HomeESRINetherPage();
	}

	// click Mijn Opleiding footer link
		public Netherlands_EsriNetherOnlinePage clickMijnOpleidingFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.MijnOpleidingFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Netherlands_EsriNetherOnlinePage();
		}

		// click Esri-blog link
		public Netherlands_EsriBlogPage clickEsriblogFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.EsriblogFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Netherlands_EsriBlogPage();
		}
		
		// click Contact link
		public Netherlands_ContactPage clickContactFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.ContactFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Netherlands_ContactPage();
		}
}
