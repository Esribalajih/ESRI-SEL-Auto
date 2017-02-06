package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Netherlands Home Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Netherlands_HomePage extends ESRIWrappers {

	public Dist_Netherlands_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("Esri.nl")) {
			Reporter.reportStep("This is not a Esri.nl (Netherlands) Home page.", "FAIL");
		} else
			System.out.println("Netherlands Esri.nl Home page Launched Successfully");
	}

	// click Sectoren Tab
	public Dist_Netherlands_HomePage clickISectorenTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.SectorenTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Overheid link
	public Dist_Netherlands_HomePage verifyOverheidLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsHome.Overheidlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Producten Tab
	public Dist_Netherlands_HomePage clickProductenTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.ProductenTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify ArcGIS-platform Link
	public Dist_Netherlands_HomePage verifyArcGISPlatformLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsHome.ArcGISplatformlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Support & Services Tab
	public Dist_Netherlands_HomePage clickSupportServicesTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.SupportServicesTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Support Link
	public Dist_Netherlands_HomePage verifySupportLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsHome.Supportlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Opleidingen Tab
	public Dist_Netherlands_HomePage clickOpleidingenTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.OpleidingenTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Home link
	public Dist_Netherlands_HomePage verifyHomeLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsHome.Homelbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	// click Nieuws & Evenementen Tab
		public Dist_Netherlands_HomePage clickNieuwsEvenementenTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.nieuwsEvenementenTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// Verify Publicaties Link
		public Dist_Netherlands_HomePage verifyPublicatiesLink(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disNetherlandsHome.Publicatieslbl.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// click Over ons Tab
		public Dist_Netherlands_HomePage clickOveronsTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.OveronsTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// Verify Over ons link
		public Dist_Netherlands_HomePage verifyOveronsLink(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disNetherlandsHome.Overonslbl.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
	
		// click search icon link
		public Dist_Netherlands_ZoekenPage clickSearchIcon() throws Throwable {
			try {
				clickById(prop.getProperty("disNetherlandsHome.searchIcon.id"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Netherlands_ZoekenPage();
		}

		// enter the data to search text box
		public Dist_Netherlands_HomePage enterSearchTextBox(String data) throws Throwable {
			try {
				enterById(prop.getProperty("disNetherlandsHome.searchTextBox.id"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

	// click ArcGIS Platform link
	public Dist_Netherlands_ArcGISPlatformPage clickArcGISPlatformLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.ArcGISPlatform.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Netherlands_ArcGISPlatformPage();
	}

	// click ArcGIS online link
	public  Dist_Netherlands_ArcGISOnlinePage clickArcGISOnlineLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.ArcGISOnline.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Netherlands_ArcGISOnlinePage();
	}

	// click ArcGIS for Desktop link
	public Dist_Netherlands_ArcGISDesktopPage clickArcGISDesktopLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.ArcGISDesktop.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Netherlands_ArcGISDesktopPage();
	}

	// click ArcGIS for Server link
	public Dist_Netherlands_ArcGISServerPage clickArcGISServerLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.ArcGISServer.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Netherlands_ArcGISServerPage();
	}
	
	// click ArcGIS Content link
		public  Dist_Netherlands_ArcGISContentPage clickArcGISContentLink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.ArcGISContent.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Netherlands_ArcGISContentPage();
		}

		// click Apps link
		public Dist_Netherlands_AppPage clickAppsLink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.Apps.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Netherlands_AppPage();
		}

		// click ArcGIS Marketplace link
		public Dist_Netherlands_MarketingPlacePage clickArcGISMarketplaceLink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.ArcGISMarketplace.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Netherlands_MarketingPlacePage();
		}
	
	
	

	// click Disclaimer footer link
	public Dist_Netherlands_DisclaimerPage clickDisclaimerFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.DisclaimerFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Netherlands_DisclaimerPage();
	}

	// click Mijn Esri link
	public Dist_Netherlands_HomeESRINetherPage clickMijnEsriFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disNetherlandsHome.MijnEsriFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Netherlands_HomeESRINetherPage();
	}

	// click Mijn Opleiding footer link
		public Dist_Netherlands_EsriNetherOnlinePage clickMijnOpleidingFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.MijnOpleidingFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Netherlands_EsriNetherOnlinePage();
		}

		// click Esri-blog link
		public Dist_Netherlands_EsriBlogPage clickEsriblogFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.EsriblogFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Netherlands_EsriBlogPage();
		}
		
		// click Contact link
		public Dist_Netherlands_ContactPage clickContactFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disNetherlandsHome.ContactFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Netherlands_ContactPage();
		}
}
