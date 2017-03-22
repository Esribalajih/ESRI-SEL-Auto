package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Finland Home Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Finland_HomePage extends ESRIWrappers {
	
	public Dist_Finland_HomePage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Esri Finland - Paikkatieto")) {
			Reporter.reportStep("This is not a Esri Finland - Paikkatieto (Finland) Home page.", "FAIL");
		} else
			System.out.println("Esri Finland - Paikkatieto Home page Launched Successfully");
	}

	// click Toimialat Tab
	public Dist_Finland_HomePage clickToimialat() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disFinlandHome.Toimialatlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Toimialat Tab list
	public Dist_Finland_HomePage verifyToimialatList(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disFinlandHome.Liiketoimintalbl.xpath"))));
			verifyValueByXpath(prop.getProperty("disFinlandHome.Liiketoimintalbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Tuotteet Tab
	public Dist_Finland_HomePage clickTuotteet() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disFinlandHome.Tuotteetlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// verify Tuotteet Tab list
	public Dist_Finland_HomePage verifyTuotteetList(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disFinlandHome.ArcGISPailbl.xpath"))));
			verifyValueByXpath(prop.getProperty("disFinlandHome.ArcGISPailbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Palvelut & Tuki Tab
	public Dist_Finland_HomePage clickPalvelut_Tuki() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disFinlandHome.PalvelutTukilink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// verify Palvelut & Tuki Tab list
	public Dist_Finland_HomePage verifyPalvelut_TukiList(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disFinlandHome.Palvelutlbl.xpath"))));
			verifyValueByXpath(prop.getProperty("disFinlandHome.Palvelutlbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click TutustuMeihin Tab
	public Dist_Finland_HomePage clickTutustuMeihin() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disFinlandHome.Tutustumeihinlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// verify TutustuMeihin Tab list
	public Dist_Finland_HomePage verifyTutustuMeihinList(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disFinlandHome.EsriFinlandOylbl.xpath"))));
			verifyValueByXpath(prop.getProperty("disFinlandHome.EsriFinlandOylbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Rekrytointi Tab
	public Dist_Finland_HomePage clickRekrytointi() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disFinlandHome.Rekrytointilink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// verify Rekrytointi Tab list
	public Dist_Finland_HomePage verifyRekrytointiList(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disFinlandHome.Rekrytointilbl.xpath"))));
			verifyValueByXpath(prop.getProperty("disFinlandHome.Rekrytointilbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Käyttäjille Tab
	public Dist_Finland_HomePage clickKäyttäjille() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disFinlandHome.Kayttajillelink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	// verify Käyttäjille Tab list
		public Dist_Finland_HomePage verifyKäyttäjilleList(String data) throws Throwable {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions
						.presenceOfElementLocated(By.xpath(prop.getProperty("disFinlandHome.KayttajilleLbl.xpath"))));
				verifyValueByXpath(prop.getProperty("disFinlandHome.KayttajilleLbl.xpath"), data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

		
	// click ArcGIS-paikkatietoalusta Link
	public Dist_Finland_ArcGISPlatformPage clickArcGISPaikkatietoalustaLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disFinlandHome.ArcGISPaikkatietoalustalink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Finland_ArcGISPlatformPage();
	}
	
	
	// click ArcGIS Online link
		public Dist_Finland_ArcGISOnlinePage clickArcGISOnline() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disFinlandHome.ArcGISOnlinelink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Finland_ArcGISOnlinePage();
		}

	// click ArcGIS Desktop Link
	public Dist_Finland_ArcGISDesktopPage clickArcGISForDesktop() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disFinlandHome.ArcGISforDesktoplink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Finland_ArcGISDesktopPage();
	}

	

	// click ArcGIS For Server link
	public Dist_finland_ArcGIServerPage clickArcGISForServer() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disFinlandHome.ArcGISforServerlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_finland_ArcGIServerPage();
	}

	// click ArcGIS for Developers link
	public Dist_Finland_ArcGISDeveloperPage clickArcGISforDevelopers() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disFinlandHome.ArcGISforDeveloperslink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Finland_ArcGISDeveloperPage();
	}
	
	// click GEOSECMA for ArcGIS link
		public Dist_Finland_GEOSEMAArcGISPage clickGEOSECMAforArcGISlink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disFinlandHome.GEOSECMAforArcGISlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Finland_GEOSEMAArcGISPage();
		}
		
	
	// click Ota YhteyttA footer icon link
	public Dist_Finland_YhteystiedotPage clickOtaYhteyttAFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disFinlandHome.OtaYhteyttAFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Finland_YhteystiedotPage();
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public Dist_Finland_HomePage headerEmbedCode(String HeaderEmbedCode) throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),HeaderEmbedCode);
		return this;
	}
	public Dist_Finland_HomePage googleTagManagerForScript(String GoogleTagManagerScript) throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),GoogleTagManagerScript);
		return this;
	}	
	public Dist_Finland_HomePage googleTagManagerForNoScript(String GoogleTagManagerNoScript) throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),GoogleTagManagerNoScript);
		return this;
	}
	public Dist_Finland_HomePage footerEmbbedCode(String FooterEmbedCode) throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),FooterEmbedCode);
		return this;
	}
	public Dist_Finland_HomePage pardotDataLayerCode(String PardotLayerCode) throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),PardotLayerCode);
		return this;
	}
		
}
