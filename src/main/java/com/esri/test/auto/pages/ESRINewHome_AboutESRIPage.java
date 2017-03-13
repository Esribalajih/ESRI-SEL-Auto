package com.esri.test.auto.pages;

import org.openqa.selenium.By;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Email Page
 * @author Rizwan
 *
 */
public class ESRINewHome_AboutESRIPage extends ESRIWrappers {

	public ESRINewHome_AboutESRIPage() throws Throwable{
		waitForPageLoad(3);
		if(!VerifyTitle("About Esri | The Science of Where")){
			Reporter.reportStep("This is not a About Esri | The Science of Where Page", "FAIL");
		}
	}
	
	public ESRINewHome_AboutESRIPage VerifyAboutESRIHeader(String AboutESRIHeader) throws Throwable{
		//waitForPageLoad(5);
		//VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.SeeHowwithTheScienceofWherePageHeader.xpath"),AboutESRIHeader);
		VerifyTextByClassName(prop.getProperty("NewEsriUATHomePage.SeeHowwithTheScienceofWherePageHeader.className"),AboutESRIHeader);
		return this;
	}

	//Click back to New Esri Home Page

	public ESRINewHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new ESRINewHomePage();
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public ESRINewHome_AboutESRIPage headerEmbedCode(String HeaderEmbedCode) throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),HeaderEmbedCode);
		return this;
	}
	public ESRINewHome_AboutESRIPage googleTagManagerForScript(String GoogleTagManagerScript) throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),GoogleTagManagerScript);
		return this;
	}	
	public ESRINewHome_AboutESRIPage googleTagManagerForNoScript(String GoogleTagManagerNoScript) throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),GoogleTagManagerNoScript);
		return this;
	}
	public ESRINewHome_AboutESRIPage footerEmbbedCode(String FooterEmbedCode) throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),FooterEmbedCode);
		return this;
	}
	public ESRINewHome_AboutESRIPage pardotDataLayerCode(String PardotLayerCode) throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),PardotLayerCode);
		return this;
	}
}
