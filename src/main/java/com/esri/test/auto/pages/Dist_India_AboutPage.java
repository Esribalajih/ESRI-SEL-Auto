package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India About Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_AboutPage extends ESRIWrappers {
	public Dist_India_AboutPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("About")) {
			Reporter.reportStep("This is not a About (India) page.", "FAIL");
		} else
			System.out.println("India About page Launched Successfully");
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

	// verify About label
	public Dist_India_AboutPage verifyAboutLabel(String data) throws Throwable {
		try {
			verifyValueById(prop.getProperty("disIndiaAbout.aboutLabel.id"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
	// click Home Tab in browser
	public Dist_India_HomePage clickHomeTabLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.homeTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_HomePage();
	}
	
}
