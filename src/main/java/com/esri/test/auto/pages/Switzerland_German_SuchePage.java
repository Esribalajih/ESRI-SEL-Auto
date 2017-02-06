package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Switzerland German Esri Schweiz | Suche Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Switzerland_German_SuchePage extends ESRIWrappers {
	public Switzerland_German_SuchePage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Esri Schweiz | Suche")) {
			Reporter.reportStep("This is not a Esri Schweiz | Suche (Switzerland- German) page.", "FAIL");
		} else
			System.out.println("Switzerland-German Esri Schweiz | Suche page Launched Successfully");
	}

	// click back button in browser
		public Switzerland_German_HomePage clickbsrBackBtn() throws Throwable {
			try {
				clickBrowserBackButton();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Switzerland_German_HomePage();
		}
	
	
	// Verify result displaying of data for Search
		public Switzerland_German_SuchePage verifyResultsDisplaying() throws Throwable {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions
						.presenceOfElementLocated(By.xpath(prop.getProperty("diswitzGerSuche.FilterResults.xpath"))));
				checkElementIsDisplayed(prop.getProperty("diswitzGerSuche.FilterResults.xpath"));
				Reporter.reportStep("Results : "+getTextByXpath(prop.getProperty("diswitzGerSuche.FilterResults.xpath")), "PASS");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
	
}
