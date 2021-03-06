package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Ireland Home Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Ireland_HomePage extends ESRIWrappers {

	public Dist_Ireland_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("Esri Ireland | Home")) {
			Reporter.reportStep("This is not a Esri Ireland | Home (Ireland) Home page.", "FAIL");
		} else
			System.out.println("Esri Ireland | Home page Launched Successfully");
	}

	// click Industries Tab
	public Dist_Ireland_HomePage clickIndustriesTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIrelandHome.industriesTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Government label
	public Dist_Ireland_HomePage verifyGovernmentLabel(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIrelandHome.govermentlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Products Tab
	public Dist_Ireland_HomePage clickProductsTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIrelandHome.ProductsTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Product ArcGIS Platform label
	public Dist_Ireland_HomePage verifyProdArcGISPlatformLabel(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIrelandHome.arcGISPlatformlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Services Tab
	public Dist_Ireland_HomePage clickServicesTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIrelandHome.servicesTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Training label
	public Dist_Ireland_HomePage verifyTrainingLabel(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIrelandHome.traininglabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click about Tab
	public Dist_Ireland_HomePage clickAboutTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIrelandHome.aboutTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify About Esri Inc label
	public Dist_Ireland_HomePage verifyAboutESRIIncLabel(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIrelandHome.aboutEsriInclbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click community Tab
	public Dist_Ireland_HomePage clickCommunityTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIrelandHome.communityTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify CommunityHub label
	public Dist_Ireland_HomePage verifyCommunityHubLabel(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIrelandHome.communityHubLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify ArcGIS platform label
	public Dist_Ireland_HomePage verifyArcGISPlatformLabel(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disIrelandHome.arcGISPlatformLabel.xpath"))));
			verifyValueByXpath(prop.getProperty("disIrelandHome.arcGISPlatformLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click ArcGIS Main link
	public Dist_Ireland_ArcGISMainPage clickArcGISMainLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIrelandHome.arcGISOnlineLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Ireland_ArcGISMainPage();
	}

	// click ArcGIS for Desktop link
	public Dist_Ireland_ArcGISDesktopPage clickArcGISDesktopLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIrelandHome.arcGISDesktopLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Ireland_ArcGISDesktopPage();
	}

	// click ArcGIS for Server link
	public Dist_Ireland_ArcGISServerPage clickArcGISServerLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIrelandHome.arcGISServerLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Ireland_ArcGISServerPage();
	}

	// click ArcGIS for Developer link
	public Dist_Ireland_ArcGISDeveloperPage clickArcGISDeveloperLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIrelandHome.arcGISDevelopersLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Ireland_ArcGISDeveloperPage();
	}

	// click Marketing place link
	public Dist_Ireland_MarketPlacePage clickMarketingPlaceLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIrelandHome.arcGISMarketplaceLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Ireland_MarketPlacePage();
	}

	// click ArcGIS Solutions link
	public Dist_Ireland_ArcGISSolutionsPage clickArcGISSolutionsLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIrelandHome.arcGISSolutionsLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Ireland_ArcGISSolutionsPage();
	}

	// click Contact US footer link
	public Dist_Ireland_ContactUsPage clickContactUSFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIrelandHome.contactUsFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Ireland_ContactUsPage();
	}

	// click Privacy footer link
	public Dist_Ireland_PrivacyPage clickPrivacyFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIrelandHome.privacyFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Ireland_PrivacyPage();
	}

	// click Legal footer link
	public Dist_Ireland_LegalTermsAndCondPage clickLegalFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIrelandHome.legalFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Ireland_LegalTermsAndCondPage();
	}

	// click Cookie Tracking footer link
		public Dist_Ireland_CookieTrackingPage clickCookieTrackingFooterlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disIrelandHome.cookieTrackingFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Ireland_CookieTrackingPage();
		}
	
}
