package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Sweden Sök Esri Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Sweden_Sok_EsriPage extends ESRIWrappers {
	public Dist_Sweden_Sok_EsriPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Sök Esri")) {
			Reporter.reportStep("This is not a Sök Esri (Sweden) page.", "FAIL");
		} else
			System.out.println("Sweden Sök Esri page Launched Successfully");
	}

	// click back button in browser
		public Dist_Sweden_HomePage clickbsrBackBtn() throws Throwable {
			try {
				clickBrowserBackButton();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new Dist_Sweden_HomePage();
		}
	
	
	// Verify result displaying of data for Search
		public Dist_Sweden_Sok_EsriPage verifyResultsDisplaying() throws Throwable {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions
						.presenceOfElementLocated(By.xpath(prop.getProperty("disSwedenSok.FilterResults.xpath"))));
				checkElementIsDisplayed(prop.getProperty("disSwedenSok.FilterResults.xpath"));
				Reporter.reportStep("Results : "+getTextByXpath(prop.getProperty("disSwedenSok.FilterResults.xpath")), "PASS");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
	
}
