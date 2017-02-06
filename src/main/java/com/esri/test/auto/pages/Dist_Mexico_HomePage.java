package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Mexico Home Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Mexico_HomePage extends ESRIWrappers {

	public Dist_Mexico_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("SIGSA")) {
			Reporter.reportStep("This is not a SIGSA (Mexico) Home page.", "FAIL");
		} else
			System.out.println("Esri Mexico Home page Launched Successfully");
	}

	// click Productos y Geotecnologías Tab
	public Dist_Mexico_HomePage clickIProductoyGeotecnologíassTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disMexicoHome.productosTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Productos link
	public Dist_Mexico_HomePage verifyProductosLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disMexicoHome.productoslabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Servicios y Soluciones Tab
	public Dist_Mexico_HomePage clickServiciosySolucionesTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disMexicoHome.serviciosTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Servicios y Soluciones Link
	public Dist_Mexico_HomePage verifyServiciosySolucionesLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disMexicoHome.serviciosySolucioneslabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Industrias Tab
	public Dist_Mexico_HomePage clickIndustriasTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disMexicoHome.industriasTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Gobierno Link
	public Dist_Mexico_HomePage verifyGobiernoLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disMexicoHome.gobiernolabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Acerca de SIGSA Tab
	public Dist_Mexico_HomePage clickAcercadeSIGSATab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disMexicoHome.acercadeSIGSATab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Comunidad SIGSA link
	public Dist_Mexico_HomePage verifyComunidadSIGSALink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disMexicoHome.comunidadSIGSAlbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	

	// Verify Sitios recomendados label
	public Dist_Mexico_HomePage verifySitiosRecomendadosLabel(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disMexicoHome.sitiosRecomendadosLabel.xpath"))));
			verifyValueByXpath(prop.getProperty("disMexicoHome.sitiosRecomendadosLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click ESRI link
	public Dist_HomePage clickESRILink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disMexicoHome.esriLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_HomePage();
	}

	// click DHI link
	public  Dist_Mexico_DHIPage clickDHILink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disMexicoHome.dhiLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Mexico_DHIPage();
	}

	// click Digital Globe link
	public Dist_Mexico_DigitalGlobePage clickDigitalGlobeLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disMexicoHome.digitalGlobeLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Mexico_DigitalGlobePage();
	}

	// click Tienda GPS link
	public Dist_Mexico_TiendaGPSPage clickTiendaGPSLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disMexicoHome.tiendaGPSLink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Mexico_TiendaGPSPage();
	}

	// click Contacto footer link
	public Dist_Mexico_ContactoPage clickContactoFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disMexicoHome.contactoFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Mexico_ContactoPage();
	}

	// click Privacidad link
	public Dist_Mexico_PrivacidadPage clickPrivacidadFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disMexicoHome.privacidadFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Mexico_PrivacidadPage();
	}

}
