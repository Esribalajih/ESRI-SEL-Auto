package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Switzerland French Recherche | Esri Suisse Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Switzerland_French_RecherchePage extends ESRIWrappers {
	public Dist_Switzerland_French_RecherchePage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Recherche | Esri Suisse")) {
			Reporter.reportStep("This is not a Recherche | Esri Suisse (Switzerland- French) page.", "FAIL");
		} else
			System.out.println("Switzerland-French Recherche | Esri Suisse page Launched Successfully");
	}

	// click back button in browser
		public Dist_Switzerland_French_HomePage clickbsrBackBtn() throws Throwable {
			try {
				clickBrowserBackButton();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Switzerland_French_HomePage();
		}
	
	
	// Verify result displaying of data for Search
		public Dist_Switzerland_French_RecherchePage verifyResultsDisplaying() throws Throwable {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions
						.presenceOfElementLocated(By.xpath(prop.getProperty("diswitzFreRecherche.FilterResults.xpath"))));
				checkElementIsDisplayed(prop.getProperty("diswitzFreRecherche.FilterResults.xpath"));
				Reporter.reportStep("Results : "+getTextByXpath(prop.getProperty("diswitzFreRecherche.FilterResults.xpath")), "PASS");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
	
}
