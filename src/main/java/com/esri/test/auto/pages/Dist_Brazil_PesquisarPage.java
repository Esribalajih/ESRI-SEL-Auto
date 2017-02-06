package com.esri.test.auto.pages;


import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Brazil Pesquisar Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Brazil_PesquisarPage extends ESRIWrappers {
	public Dist_Brazil_PesquisarPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Pesquisar")) {
			Reporter.reportStep("This is not a Pesquisar (Brazil Search) page.", "FAIL");
		} else
			System.out.println("Brazil Pesquisar (Search) page Launched Successfully");
	}

	// click back button Tab
	public Dist_Brazil_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Brazil_HomePage();
	}

	// Verify result displaying of data for Search
	public Dist_Brazil_PesquisarPage verifyResultsDisplaying() throws Throwable {
		try {
			checkElementIsDisplayed(prop.getProperty("disBrazilPes.FilterResults.xpath"));
			Reporter.reportStep("Results : "+getTextByXpath(prop.getProperty("disBrazilPes.FilterResults.xpath")), "PASS");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	 

}
