package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Netherlands Blogs van Esri in Nederland Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Netherlands_EsriBlogPage extends ESRIWrappers {
	public Dist_Netherlands_EsriBlogPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Blogs van Esri in Nederland")) {
			Reporter.reportStep("This is not a Blogs van Esri in Nederland (Netherlands) page.", "FAIL");
		} else
			System.out.println("Netherlands Blogs van Esri in Nederland page Launched Successfully");
	}

	// click back button in browser
	public Dist_Netherlands_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Netherlands_HomePage();
	}

	// verify Esri Nederland-blog label
	public Dist_Netherlands_EsriBlogPage verifyEsriNederlandbloglbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disNetherlandsBlog.EsriNederlandblogLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
