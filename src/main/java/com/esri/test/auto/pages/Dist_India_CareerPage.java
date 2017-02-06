package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India Careers at Esri India | GIS Jobs | GIS Software and Development Jobs Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_CareerPage extends ESRIWrappers {
	public Dist_India_CareerPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Careers at Esri India | GIS Jobs | GIS Software and Development Jobs")) {
			Reporter.reportStep("This is not a Careers at Esri India | GIS Jobs | GIS Software and Development Jobs (India) page.", "FAIL");
		} else
			System.out.println("India Careers at Esri India | GIS Jobs | GIS Software and Development Jobs page Launched Successfully");
	}

	// click back button in browser
	public Dist_India_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_HomePage();
	}

	// verify Careers label
	public Dist_India_CareerPage verifyCareerslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaCar.careerLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
