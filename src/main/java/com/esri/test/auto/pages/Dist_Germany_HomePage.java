package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Germany Home Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Germany_HomePage extends ESRIWrappers {
	public Dist_Germany_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("Home | Esri Deutschland")) {
			Reporter.reportStep("This is not a Home | Esri Deutschland (Germany) Home page.", "FAIL");
		} else
			System.out.println("Germany Home page Launched Successfully");
	}

	// click Branchen Tab
	public Dist_Germany_HomePage clickBranchen() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disGermanyHome.Branchenlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Telekommunikation list
	public Dist_Germany_HomePage verifyTelekommunikationList(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disGermanyHome.industrieslbl.xpath"))));
			verifyValueByXpath(prop.getProperty("disGermanyHome.industrieslbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Produkte Tab
	public Dist_Germany_HomePage clickProdukte() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disGermanyHome.Produktelink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// verify ArcGIS_Plattform list
	public Dist_Germany_HomePage verifyArcGIS_PlattformList(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disGermanyHome.productslbl.xpath"))));
			verifyValueByXpath(prop.getProperty("disGermanyHome.productslbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Services Tab
	public Dist_Germany_HomePage clickServices() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disGermanyHome.Serviceslink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// verify Schulung list
	public Dist_Germany_HomePage verifySchulungList(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disGermanyHome.supportServiceslbl.xpath"))));
			verifyValueByXpath(prop.getProperty("disGermanyHome.supportServiceslbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click GIS-Community Tab
	public Dist_Germany_HomePage clickGIS_Community() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disGermanyHome.GISCommunitylink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// verify GeoNet list
	public Dist_Germany_HomePage verifyGeoNetList(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disGermanyHome.communitylbl.xpath"))));
			verifyValueByXpath(prop.getProperty("disGermanyHome.communitylbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Über uns Tab
	public Dist_Germany_HomePage clickUberuns() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disGermanyHome.uberunslink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// verify Jobs list
	public Dist_Germany_HomePage verifyJobsList(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disGermanyHome.aboutlbl.xpath"))));
			verifyValueByXpath(prop.getProperty("disGermanyHome.aboutlbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Kontakt footer Link
	public Dist_Germany_KontaktPage clickKontaktFooter() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disGermanyHome.KontaktFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Germany_KontaktPage();
	}

	// click Rechtliches Footer Link
	public Dist_Germany_EsriLizenzbedingungenPage clickRechtlichesFooter() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disGermanyHome.EsriLizenzbedingungenFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Germany_EsriLizenzbedingungenPage();
	}

	// click Impressum Footer link
	public Dist_Germany_ImpressumPage clickImpressumFooter() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disGermanyHome.ImpressumFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Germany_ImpressumPage();
	}

	// click Datenschutz Footer link
	public Dist_Germany_DatenschutzPage clickDatenschutzFooter() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disGermanyHome.DatenschutzFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Germany_DatenschutzPage();
	}

	// click Home Footer link
	public Dist_Germany_HomePage clickHomeFooter() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disGermanyHome.HomeFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click search icon link
	public Dist_Germany_SuchePage clickSearchIcon() throws Throwable {
		try {
			clickById(prop.getProperty("disGermanyHome.searchIcon.id"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Germany_SuchePage();
	}

	// enter the data to search text box
	public Dist_Germany_HomePage enterSearchTextBox(String data) throws Throwable {
		try {
			enterById(prop.getProperty("disGermanyHome.searchTextBox.id"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Branchen Tab is displaying
		public Dist_Germany_HomePage verifyBranchenTabDisplaying() throws Throwable {
			try {
				checkElementIsDisplayed(prop.getProperty("disGermanyHome.Branchenlink.xpath"));
				Reporter.reportStep("Results : "+getTextByXpath(prop.getProperty("disGermanyHome.Branchenlink.xpath")), "PASS");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
	
		
		
}
