package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Netherlands Zoeken Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Netherlands_ZoekenPage extends ESRIWrappers {
	public Netherlands_ZoekenPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("zoeken")) {
			Reporter.reportStep("This is not a zoeken (Netherlands) page.", "FAIL");
		} else
			System.out.println("Netherlands zoeken page Launched Successfully");
	}

	// click back button in browser
		public Netherlands_HomePage clickbsrBackBtn() throws Throwable {
			try {
				clickBrowserBackButton();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Netherlands_HomePage();
		}
	
	
	// Verify result displaying of data for Search
		public Netherlands_ZoekenPage verifyResultsDisplaying() throws Throwable {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions
						.presenceOfElementLocated(By.xpath(prop.getProperty("disNetherlandsZoeken.FilterResults.xpath"))));
				checkElementIsDisplayed(prop.getProperty("disNetherlandsZoeken.FilterResults.xpath"));
				Reporter.reportStep("Results : "+getTextByXpath(prop.getProperty("disNetherlandsZoeken.FilterResults.xpath")), "PASS");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
	
}
