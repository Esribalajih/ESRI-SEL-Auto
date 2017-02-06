package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.esri.test.auto.pages.Dist_Brazil_HomePage;
import com.esri.test.auto.pages.Dist_Brazil_SuporteImagemPage;
import com.esri.test.auto.pages.Dist_Finland_HomePage;
import com.esri.test.auto.pages.Dist_Finland_TukiPage;
import com.esri.test.auto.pages.Dist_Germany_HomePage;
import com.esri.test.auto.pages.Dist_Germany_SupportPage;
import com.esri.test.auto.pages.Dist_India_EsriIndTechSupportPage;
import com.esri.test.auto.pages.Dist_India_HomePage;
import com.esri.test.auto.pages.Dist_Ireland_HomePage;
import com.esri.test.auto.pages.Dist_Ireland_TechSupportPage;
import com.esri.test.auto.pages.Dist_Mexico_BuscarPage;
import com.esri.test.auto.pages.Dist_Mexico_HomePage;
import com.esri.test.auto.pages.Dist_Mexico_ServiciosPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to validating the Mexico ESRI happy path
 * 
 * @author udhayasundar
 *
 */
public class Dist_Mexico_TC06 extends ESRIWrappers {
	@BeforeClass
	@Parameters({ "browser" })
	public void startTestCase(String browser) {
		browserName = browser;
		dataSheetName = "Dist_Mexico_TC06";
		testCaseName = "Dist_Mexico_TC06 (POM)";
		testDescription = "Distributor Mexico Test cases validating happy path";
	}

	@Test(dataProvider = "fetchdata")
	public void loginforSuccess(String MexicoHomeURL, String MexicoSearchURL, String MexicoSupportURL, String Productos,
			String Servicios, String Industrias, String AcercadeSIGSA, String Sitiosrecomendados, String ESRI, 
			String DHI, String DigitalGlobe, String TiendaGPS, String Contacto, String Privacidad,String Search,
			String ServiciosySoluciones) throws Throwable {
		
		openbrowser(MexicoHomeURL);
		new Dist_Mexico_HomePage()
		.clickIProductoyGeotecnologíassTab()
		.verifyProductosLink(Productos)
		.clickServiciosySolucionesTab()
		.verifyServiciosySolucionesLink(Servicios)
		.clickIndustriasTab()
		.verifyGobiernoLink(Industrias)
		.clickAcercadeSIGSATab()
		.verifyComunidadSIGSALink(AcercadeSIGSA)
		.verifySitiosRecomendadosLabel(Sitiosrecomendados)
		.clickESRILink()
		.verifyArcGISPlatformLabel(ESRI)
		.clickbsrBackBtn_MexicoHomePage()
		.clickDHILink()
		.verifyDHIlbl(DHI)
		.clickbsrBackBtn()
		.clickDigitalGlobeLink()
		.verifyDigitalGlobelbl(DigitalGlobe)
		.clickbsrBackBtn()
		.clickTiendaGPSLink()
		.verifyTiendaGPSlbl(TiendaGPS)
		.clickbsrBackBtn()
		.clickContactoFooterlink()
		.verifyContactolbl(Contacto)
		.clickbsrBackBtn()
		.clickPrivacidadFooterlink()
		.verifyAvisodePrivacidadlbl(Privacidad)
		.clickbsrBackBtn();
		
		
		openbrowser(MexicoSearchURL);
		new Dist_Mexico_BuscarPage()
		.enterValueSearchTextBox(Search)
		.clickSearchIconBtn()
		.verifyResultsDisplaying();
		
		openbrowser(MexicoSupportURL);
		new Dist_Mexico_ServiciosPage()
		.verifyServiciosySolucioneslbl(ServiciosySoluciones);
		
		
		
	}

}
