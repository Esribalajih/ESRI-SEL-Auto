package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India Products Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_ProductsPage extends ESRIWrappers {
	public Dist_India_ProductsPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Products")) {
			Reporter.reportStep("This is not a Products (India) page.", "FAIL");
		} else
			System.out.println("India Products page Launched Successfully");
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

	// verify Products label
	public Dist_India_ProductsPage verifyProductslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaProd.productsLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
