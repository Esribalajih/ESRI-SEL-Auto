package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Mexico Servicios y Soluciones Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Mexico_ServiciosPage extends ESRIWrappers {
	public Dist_Mexico_ServiciosPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Servicios y Soluciones")) {
			Reporter.reportStep("This is not a Servicios y Soluciones (Mexico) page.", "FAIL");
		} else
			System.out.println("Mexico Servicios y Soluciones page Launched Successfully");
	}

	// verify Servicios y Soluciones label
	public Dist_Mexico_ServiciosPage verifyServiciosySolucioneslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaServicios.serviciosYSoluciones.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
