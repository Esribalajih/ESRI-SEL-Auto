package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Rwanda News | Esri Rwanda Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Rwanda_NewsPage extends ESRIWrappers {
	public Dist_Rwanda_NewsPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("News | Esri Rwanda")) {
			Reporter.reportStep("This is not a 	News | Esri Rwanda (Rwanda) page.", "FAIL");
		} else
			System.out.println("Rwanda News | Esri Rwanda page Launched Successfully");
	}

	// click back button in browser
	public Dist_Rwanda_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Rwanda_HomePage();
	}

	// verify News Label
	public Dist_Rwanda_NewsPage verifyNewslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRwandaNews.NewsLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
