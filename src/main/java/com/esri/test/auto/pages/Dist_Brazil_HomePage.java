package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Brazil Home Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Brazil_HomePage extends ESRIWrappers {
	public Dist_Brazil_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("Imagem")) {
			Reporter.reportStep("This is not a Imagem (Brazil) Home page.", "FAIL");
		} else
			System.out.println("Brazil Home page Launched Successfully");
	}

	// click Produtos Tab
	public Dist_Brazil_HomePage clickProdutos() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disBrazilHome.Produtoslink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Produtos Tab list
	public Dist_Brazil_HomePage verifyProductosList(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disBrazilHome.PltfrmArcGISlbl.xpath"))));
			verifyValueByXpath(prop.getProperty("disBrazilHome.PltfrmArcGISlbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click industries Tab
	public Dist_Brazil_HomePage clickIndustries() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disBrazilHome.industrieslink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// verify industries Tab list
	public Dist_Brazil_HomePage verifyIndustriesList(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disBrazilHome.Educalbl.xpath"))));
			verifyValueByXpath(prop.getProperty("disBrazilHome.Educalbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click suporte Tab
	public Dist_Brazil_HomePage clickSuporte() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disBrazilHome.suportelink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// verify suporte Tab list
	public Dist_Brazil_HomePage verifySuporteList(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disBrazilHome.suportelbl.xpath"))));
			verifyValueByXpath(prop.getProperty("disBrazilHome.suportelbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click institucional Tab
	public Dist_Brazil_HomePage clickInstitucional() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disBrazilHome.sobrelink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// verify institucional Tab list
	public Dist_Brazil_HomePage verifyInstitucionalList(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disBrazilHome.sobrelbl.xpath"))));
			verifyValueByXpath(prop.getProperty("disBrazilHome.sobrelbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click 5 Desafios Tab
	public Dist_Brazil_HomePage click5Desafios() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disBrazilHome.desafios05link.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// verify 5 Desafios Tab list
	public Dist_Brazil_HomePage verify5DesafiosList(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("disBrazilHome.5Desafioslbl.xpath"))));
			verifyValueByXpath(prop.getProperty("disBrazilHome.5Desafioslbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Contato Tab
	public Dist_Brazil_ContatoPage clickContato() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disBrazilHome.contatolink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Brazil_ContatoPage();
	}

	// click Plataforma ArcGIS Link
	public Dist_Brazil_ArcGISPage clickPlataformaArcGIS() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disBrazilHome.PlataformaArcGISlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Brazil_ArcGISPage();
	}

	// click ArcGIS Desktop Link
	public Dist_Brazil_ArcGISDesktopPage clickArcGISDesktop() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disBrazilHome.ArcGISDesktoplink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Brazil_ArcGISDesktopPage();
	}

	// click ArcGIS Online link
	public Dist_Brazil_ArcGISOnlinePage clickArcGISOnline() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disBrazilHome.ArcGISOnlinelink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Brazil_ArcGISOnlinePage();
	}

	// click Location Analytics link
	public Dist_Brazil_LocationAnalyticsPage clickLocationAnalytics() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disBrazilHome.LocationAnalyticslink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Brazil_LocationAnalyticsPage();
	}

	// click Desenvolvedores link
	public Dist_Brazil_ESRIDevNtwkPage clickDesenvolvedores() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disBrazilHome.Desenvolvedoreslink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Brazil_ESRIDevNtwkPage();
	}

	// click search icon link
	public Dist_Brazil_PesquisarPage clickSearchIcon() throws Throwable {
		try {
			clickById(prop.getProperty("disBrazilHome.searchIcon.id"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Brazil_PesquisarPage();
	}

	// enter the data to search text box
	public Dist_Brazil_HomePage enterSearchTextBox(String data) throws Throwable {
		try {
			enterById(prop.getProperty("disBrazilHome.searchTextBox.id"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Política de Privacidade footer icon link
	public Dist_Brazil_ContatoPage clickContatoFooterLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disBrazilHome.contatiFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Brazil_ContatoPage();
	}

	// click Política de Privacidade footer link
		public Dist_Brazil_PoliticadePrivacidadePage clickPolDePriFooterLink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disBrazilHome.PoliticadePrivacidadeFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Brazil_PoliticadePrivacidadePage();
		}
		
		
		// click Academia GIS footer link
		public Dist_Brazil_ArcGISOnlinePage clickAcademiaGISFooterLink() throws Throwable {
			try {
				clickByXpath(prop.getProperty("disBrazilHome.AcademiaGISFooterlink.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Brazil_ArcGISOnlinePage();
		}
	
}
