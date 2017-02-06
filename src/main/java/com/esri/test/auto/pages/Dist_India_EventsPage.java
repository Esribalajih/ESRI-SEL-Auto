package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India Events Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_EventsPage extends ESRIWrappers {
	public Dist_India_EventsPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Events")) {
			Reporter.reportStep("This is not a Events (India) page.", "FAIL");
		} else
			System.out.println("India Events page Launched Successfully");
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

	// verify Events label
	public Dist_India_EventsPage verifyEventslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaEvent.eventsLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
		
}
