package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Mexico Bienvenido a Tiendagps | Tiendagps Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Mexico_TiendaGPSPage extends ESRIWrappers {
	public Dist_Mexico_TiendaGPSPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Bienvenido a Tiendagps | Tiendagps")) {
			Reporter.reportStep("This is not a Bienvenido a Tiendagps | Tiendagps (Mexico) page.", "FAIL");
		} else
			System.out.println("Mexico Bienvenido a Tiendagps | Tiendagps page Launched Successfully");
	}

	// click back button in browser
	public Dist_Mexico_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Mexico_HomePage();
	}

	// verify Tienda GPS label
	public Dist_Mexico_TiendaGPSPage verifyTiendaGPSlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disMexicoTiendaGPS.TiendaGPSdropdownLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
