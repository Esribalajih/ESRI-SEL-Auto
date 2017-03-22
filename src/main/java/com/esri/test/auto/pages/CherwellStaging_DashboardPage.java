/**
 * 
 */
package com.esri.test.auto.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author thenmozhis
 *
 */
public class CherwellStaging_DashboardPage extends ESRIWrappers{
	
	public CherwellStaging_DashboardPage() throws Throwable{
		waitForPageLoad(5);
		if(!VerifyTitle("Esri Staging - My Applications"))
			Reporter.reportStep("This is not a Esri Staging - My Applications Page", "FAIL");
	}
	
	public CherwellStaging_DashboardPage ClickEsriCherwellSelfServicePortalApplication(String CherwellSelfService) throws Throwable{
		int count=0;
		List<WebElement> Elements=driver.findElements(By.xpath(prop.getProperty("Cherwell.StagingDashBoardElements.xpath")));
		ArrayList<String> ApplicationName= new ArrayList<String>();
		
		for(WebElement Element:Elements){
			String pAttributeValue=Element.getText();
			ApplicationName.add(pAttributeValue);
		}

		for(String Name:ApplicationName){
			count++;
			if(Name.contains(CherwellSelfService)){
				waitForPageLoad(2);
				clickButtonByXpath(prop.getProperty("Cherwell.StagingDashBoardElement.xpath")+"["+count+"]/a", CherwellSelfService);
				switchToWindow();
				switchWindowByTitle("Authentication Required");
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				waitForPageLoad(5);
				break;
			}
		}
		return this;
	}
		
	
	

}
