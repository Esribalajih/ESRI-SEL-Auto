package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the UK 	Search Esri Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_UK_SearchPage extends ESRIWrappers {
	public Dist_UK_SearchPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Search Esri")) {
			Reporter.reportStep("This is not a Search Esri (UK) page.", "FAIL");
		} else
			System.out.println("UK Search Esri Launched Successfully");
	}

	// click back button in browser
		public Dist_UK_HomePage clickbsrBackBtn() throws Throwable {
			try {
				clickBrowserBackButton();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_UK_HomePage();
		}
	
	
	// Verify result displaying of data for Search
		public Dist_UK_SearchPage verifyResultsDisplaying() throws Throwable {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions
						.presenceOfElementLocated(By.xpath(prop.getProperty("disUKSearch.FilterResults.xpath"))));
				checkElementIsDisplayed(prop.getProperty("disUKSearch.FilterResults.xpath"));
				Reporter.reportStep("Results : "+getTextByXpath(prop.getProperty("disUKSearch.FilterResults.xpath")), "PASS");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
	
}
