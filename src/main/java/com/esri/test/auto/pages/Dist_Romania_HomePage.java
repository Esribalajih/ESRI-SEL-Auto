package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Romania Home Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Romania_HomePage extends ESRIWrappers {

	public Dist_Romania_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("Esri Romania")) {
			Reporter.reportStep("This is not a Esri Romania (Romania) Home page.", "FAIL");
		} else
			System.out.println("Romania Esri Romania Home page Launched Successfully");
	}

	// click Industrii Tab
	public Dist_Romania_HomePage clickIndustriiTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.IndustriiTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Mediu link
	public Dist_Romania_HomePage verifyMediuLink(String data) throws Throwable {
		try {
			waitForPageLoad(5);
			verifyValueByXpath(prop.getProperty("disRomaniasHome.Mediulabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Produse Tab
	public Dist_Romania_HomePage clickProduseTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.ProduseTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Platforma ArcGIS Link
	public Dist_Romania_HomePage verifyArcGISPlatformLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRomaniasHome.PlatformaArcGISlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Suport & Servicii Tab
	public Dist_Romania_HomePage clickSupportServicesTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.SuportServiciiTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Instruire Link
	public Dist_Romania_HomePage verifyInstruireLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRomaniasHome.Instruirelabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Noutati Tab
	public Dist_Romania_HomePage clickNoutatiTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.NoutatiTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Noutati link
	public Dist_Romania_HomePage verifyNoutatiLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRomaniasHome.Noutatilbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	// click Despre Tab
		public Dist_Romania_HomePage clickDespreTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRomaniasHome.DespreTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// Verify Despre Esri Romania Link
		public Dist_Romania_HomePage verifyDespreEsriRomaniaLink(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disRomaniasHome.DespreEsriRomanialbl.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// click Comunitate Tab
		public Dist_Romania_HomePage clickComunitateTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRomaniasHome.ComunitateTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// Verify GeoNet link
		public Dist_Romania_HomePage verifyGeoNetLink(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disRomaniasHome.GeoNetlbl.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		
		
		// Verify ArcGIS Platform label
		public Dist_Romania_HomePage verifyArcGISPlatformLabel(String data) throws Throwable {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions
						.presenceOfElementLocated(By.xpath(prop.getProperty("disRomaniasHome.PlatformaArcGIS.xpath"))));
				verifyValueByXpath(prop.getProperty("disRomaniasHome.PlatformaArcGIS.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
	
	// click ArcGI.com link
	public  Dist_Romania_ArcGISMainPage clickArcGISComLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.ArcGISCom.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Romania_ArcGISMainPage();
	}

	// click ArcGIS for Professionals link
	public Dist_Romania_ArcGISProPage clickArcGISProfessionalsLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.ArcGISProfessionals.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Romania_ArcGISProPage();
	}

	// click Location Analytics link
	public Dist_Romania_LocationAnalyticsPage clickLocationAnalyticsLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.LocationAnalytics.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Romania_LocationAnalyticsPage();
	}
	
	// click ArcGIS Marketplace link
		public  Dist_Romania_MarketPlacePage clickArcGISMarketplaceLink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRomaniasHome.ArcGISMarketplace.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Romania_MarketPlacePage();
		}

		// click ArcGIS for Developers link
		public Dist_Romania_ArcGISDevelopersPage clickArcGISDevelopersLink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRomaniasHome.ArcGISDevelopers.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Romania_ArcGISDevelopersPage();
		}

		
	// click Contactati-ne footer link
	public Dist_Romania_ContactPage clickContactatineFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.ContactatineFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Romania_ContactPage();
	}

	// click Confidentialitate link
	public Dist_Romania_LegalPrivacyInfoPage clickConfidentialitateFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.ConfidentialitateFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Romania_LegalPrivacyInfoPage();
	}

	// click Cadrul legal footer link
		public Dist_Romania_LegalOverviewInfoPage clickCadrulLegalFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRomaniasHome.CadrulLegalFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Romania_LegalOverviewInfoPage();
		}

}
