package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India News Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_ESRIIndNewsPage extends ESRIWrappers {
	public Dist_India_ESRIIndNewsPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Esri India | In the News")) {
			Reporter.reportStep("This is not a Esri India | In the News (India) page.", "FAIL");
		} else
			System.out.println("India Esri India | In the News page Launched Successfully");
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

	// verify News label
	public Dist_India_ESRIIndNewsPage verifyNewslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaNews.newsLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
