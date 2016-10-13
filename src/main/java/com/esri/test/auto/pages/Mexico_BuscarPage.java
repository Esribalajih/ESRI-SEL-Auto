package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Mexico Buscar Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Mexico_BuscarPage extends ESRIWrappers {
	public Mexico_BuscarPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Buscar")) {
			Reporter.reportStep("This is not a Buscar (Mexico) page.", "FAIL");
		} else
			System.out.println("Mexico Buscar page Launched Successfully");
	}

	// click enter text in search text box
		public Mexico_BuscarPage enterValueSearchTextBox(String searchData) throws Throwable {
			try {
				enterByXpath(prop.getProperty("disMexicoBuscar.searchTextBox.xpath"), searchData);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
	
	
	// click search icon button 
	public Mexico_BuscarPage clickSearchIconBtn() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disMexicoBuscar.searchIconButton.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify result displaying of data for Search
		public Mexico_BuscarPage verifyResultsDisplaying() throws Throwable {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions
						.presenceOfElementLocated(By.xpath(prop.getProperty("disMexicoBuscar.FilterResults.xpath"))));
				checkElementIsDisplayed(prop.getProperty("disMexicoBuscar.FilterResults.xpath"));
				Reporter.reportStep("Results : "+getTextByXpath(prop.getProperty("disMexicoBuscar.FilterResults.xpath")), "PASS");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
	
}
