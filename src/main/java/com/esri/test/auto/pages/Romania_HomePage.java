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
public class Romania_HomePage extends ESRIWrappers {

	public Romania_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("Esri Romania")) {
			Reporter.reportStep("This is not a Esri Romania (Romania) Home page.", "FAIL");
		} else
			System.out.println("Romania Esri Romania Home page Launched Successfully");
	}

	// click Industrii Tab
	public Romania_HomePage clickIndustriiTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.IndustriiTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Mediu link
	public Romania_HomePage verifyMediuLink(String data) throws Throwable {
		try {
			waitForPageLoad(5);
			verifyValueByXpath(prop.getProperty("disRomaniasHome.Mediulabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Produse Tab
	public Romania_HomePage clickProduseTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.ProduseTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Platforma ArcGIS Link
	public Romania_HomePage verifyArcGISPlatformLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRomaniasHome.PlatformaArcGISlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Suport & Servicii Tab
	public Romania_HomePage clickSupportServicesTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.SuportServiciiTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Instruire Link
	public Romania_HomePage verifyInstruireLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRomaniasHome.Instruirelabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Noutati Tab
	public Romania_HomePage clickNoutatiTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.NoutatiTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Noutati link
	public Romania_HomePage verifyNoutatiLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRomaniasHome.Noutatilbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	// click Despre Tab
		public Romania_HomePage clickDespreTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRomaniasHome.DespreTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// Verify Despre Esri Romania Link
		public Romania_HomePage verifyDespreEsriRomaniaLink(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disRomaniasHome.DespreEsriRomanialbl.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// click Comunitate Tab
		public Romania_HomePage clickComunitateTab() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRomaniasHome.ComunitateTab.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		// Verify GeoNet link
		public Romania_HomePage verifyGeoNetLink(String data) throws Throwable {
			try {
				verifyValueByXpath(prop.getProperty("disRomaniasHome.GeoNetlbl.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		
		
		// Verify ArcGIS Platform label
		public Romania_HomePage verifyArcGISPlatformLabel(String data) throws Throwable {
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
	public  Romania_ArcGISMainPage clickArcGISComLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.ArcGISCom.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Romania_ArcGISMainPage();
	}

	// click ArcGIS for Professionals link
	public Romania_ArcGISProPage clickArcGISProfessionalsLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.ArcGISProfessionals.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Romania_ArcGISProPage();
	}

	// click Location Analytics link
	public Romania_LocationAnalyticsPage clickLocationAnalyticsLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.LocationAnalytics.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Romania_LocationAnalyticsPage();
	}
	
	// click ArcGIS Marketplace link
		public  Romania_MarketPlacePage clickArcGISMarketplaceLink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRomaniasHome.ArcGISMarketplace.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Romania_MarketPlacePage();
		}

		// click ArcGIS for Developers link
		public Romania_ArcGISDevelopersPage clickArcGISDevelopersLink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRomaniasHome.ArcGISDevelopers.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Romania_ArcGISDevelopersPage();
		}

		
	// click Contactati-ne footer link
	public Romania_ContactPage clickContactatineFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.ContactatineFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Romania_ContactPage();
	}

	// click Confidentialitate link
	public Romania_LegalPrivacyInfoPage clickConfidentialitateFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disRomaniasHome.ConfidentialitateFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Romania_LegalPrivacyInfoPage();
	}

	// click Cadrul legal footer link
		public Romania_LegalOverviewInfoPage clickCadrulLegalFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disRomaniasHome.CadrulLegalFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Romania_LegalOverviewInfoPage();
		}

}
