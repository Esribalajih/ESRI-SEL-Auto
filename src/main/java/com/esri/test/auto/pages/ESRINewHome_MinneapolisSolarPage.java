package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Email Page
 * @author Rizwan
 *
 */
public class ESRINewHome_MinneapolisSolarPage extends ESRIWrappers {

	public ESRINewHome_MinneapolisSolarPage() throws Throwable{
		waitForPageLoad(3);
		if(!VerifyTitle("Minneapolis Solar Suitability | Maps We Love")){
			Reporter.reportStep("This is not a Minneapolis Solar Suitability | Maps We Love Page", "FAIL");
		}
	}
	
	public ESRINewHome_MinneapolisSolarPage VerifyMinneapolisSolarHeader(String MinneapolisSolarHeader) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.MinneapolisSolarHeader.xpath"), MinneapolisSolarHeader);
		return this;
	}

	//Click back to New Esri Home Page

	public ESRINewHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new ESRINewHomePage();
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public ESRINewHome_MinneapolisSolarPage headerEmbedCode() throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),prop.getProperty("Tag.HeaderEmbedCode.text"));
		return this;
	}
	public ESRINewHome_MinneapolisSolarPage googleTagManagerForScript() throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForScript.text"));
		return this;
	}	
	public ESRINewHome_MinneapolisSolarPage googleTagManagerForNoScript() throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForNoScript.text"));
		return this;
	}
	public ESRINewHome_MinneapolisSolarPage footerEmbbedCode() throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),prop.getProperty("Tag.FooterEmbbedCode.text"));
		return this;
	}
	public ESRINewHome_MinneapolisSolarPage pardotDataLayerCode() throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),prop.getProperty("Tag.PardotDataLayerCode.text"));
		return this;
	}
}
