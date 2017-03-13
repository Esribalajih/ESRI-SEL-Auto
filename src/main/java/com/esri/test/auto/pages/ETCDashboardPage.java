package com.esri.test.auto.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is a ETC Dashboard Page
 * @author balajih
 *
 */
public class ETCDashboardPage extends ESRIWrappers{
	
	public ETCDashboardPage() throws Throwable{
		if(!VerifyTitle("Esri Dev - Sign In")){
			Reporter.reportStep("Esri Dev - My Applications", "FAIL");
		}
	}
	
	public ETCDashboardPage verifyETCDashboardSigninDisplayName(String displayName) throws Throwable{
		VerifyTextByXpath(prop.getProperty("ETCDashboardPage.DisplayName.xpath"), displayName);
		return this;
	}
	
	/**This method is to Click ETC Time card Chicklet in ESRI OKTA SSO Page
	 * 
	 * @throws Throwable
	 */
	public void verifyandClickETCTimeCardChicklet() throws Throwable{
		int ListSize=0;
		List<WebElement> elements=driver.findElements(By.xpath("//ul[@class='app-buttons-list clearfix ui-sortable']/li"));
		List<String> litext = new ArrayList<String>();
		for(WebElement element:elements){
			Thread.sleep(5000);
			WebElement ele=element.findElement(By.tagName("p"));
			String licontent=ele.getAttribute("innerText");
			System.out.println("--------> "+licontent+" Total-elements Size "+elements.size());
			litext.add(licontent);
		}
		
		for(String text:litext){
			ListSize++;
			Thread.sleep(1000);
			if(text.equalsIgnoreCase("Esri Timecard Dev")){
				try {
					Thread.sleep(5000);
					driver.findElement(By.xpath("//ul[@class='app-buttons-list clearfix ui-sortable']/li["+ListSize+"]/a")).click();
				} catch (StaleElementReferenceException e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}

}
