package com.esri.test.auto.pages;

import org.openqa.selenium.By;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Email Page
 * @author Rizwan
 *
 */
public class ESRINewHome_DIYGeoAppsPage extends ESRIWrappers {

	public ESRINewHome_DIYGeoAppsPage() throws Throwable{
		waitForPageLoad(3);
		if(!VerifyTitle("Esri MOOC - Massive Open Online Course")){
			Reporter.reportStep("This is not a Esri MOOC - Massive Open Online Course Page", "FAIL");
		}
	}
	
	public ESRINewHome_DIYGeoAppsPage VerifyGeoAppsHeader(String GeoAppsHeader) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.GeoAppsHeader.xpath"), GeoAppsHeader);
		//System.out.println(driver.findElement(By.xpath("NewEsriUATHomePage.GeoAppsHeader.xpath")).getAttribute("innerText"));
		return this;
	}

	//Click back to New Esri Home Page

	public ESRINewHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new ESRINewHomePage();
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public ESRINewHome_DIYGeoAppsPage headerEmbedCode() throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),prop.getProperty("Tag.HeaderEmbedCode.text"));
		return this;
	}
	public ESRINewHome_DIYGeoAppsPage googleTagManagerForScript() throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForScript.text"));
		return this;
	}	
	public ESRINewHome_DIYGeoAppsPage googleTagManagerForNoScript() throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForNoScript.text"));
		return this;
	}
	public ESRINewHome_DIYGeoAppsPage footerEmbbedCode() throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),prop.getProperty("Tag.FooterEmbbedCode.text"));
		return this;
	}
	public ESRINewHome_DIYGeoAppsPage pardotDataLayerCode() throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),prop.getProperty("Tag.PardotDataLayerCode.text"));
		return this;
	}
}
