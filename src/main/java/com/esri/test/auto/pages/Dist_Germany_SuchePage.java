package com.esri.test.auto.pages;


import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Germany Suche Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Germany_SuchePage extends ESRIWrappers {
	public Dist_Germany_SuchePage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Suche | Esri Deutschland")) {
			Reporter.reportStep("This is not a Suche | Esri Deutschland (Germany Search) page.", "FAIL");
		} else
			System.out.println("Germany Suche | Esri Deutschland (Search) page Launched Successfully");
	}

	// click back button Tab
	public Dist_Germany_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Germany_HomePage();
	}

	// Verify result displaying of data for Search
	public Dist_Germany_SuchePage verifyResultsDisplaying() throws Throwable {
		try {
			checkElementIsDisplayed(prop.getProperty("disGermanySuche.FilterResults.xpath"));
			Reporter.reportStep("Results : "+getTextByXpath(prop.getProperty("disGermanySuche.FilterResults.xpath")), "PASS");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	 

}
