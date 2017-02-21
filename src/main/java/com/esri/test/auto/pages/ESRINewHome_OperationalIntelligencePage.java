package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Email Page
 * @author Rizwan
 *
 */
public class ESRINewHome_OperationalIntelligencePage extends ESRIWrappers {

	public ESRINewHome_OperationalIntelligencePage() throws Throwable{
		waitForPageLoad(3);
		if(!VerifyTitle("Operational Intelligence")){
			Reporter.reportStep("This is not a Operational Intelligence Page", "FAIL");
		}
	}
	
	public ESRINewHome_OperationalIntelligencePage VerifyOperationalIntelligenceHeader(String OperationalIntelligenceHeader) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.OperationalIntelligenceHeader.xpath"), OperationalIntelligenceHeader);
		return this;
	}

	//Click back to New Esri Home Page

	public ESRINewHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new ESRINewHomePage();
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public ESRINewHome_OperationalIntelligencePage headerEmbedCode(String HeaderEmbedCode) throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),HeaderEmbedCode);
		return this;
	}
	public ESRINewHome_OperationalIntelligencePage googleTagManagerForScript(String GoogleTagManagerScript) throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),GoogleTagManagerScript);
		return this;
	}	
	public ESRINewHome_OperationalIntelligencePage googleTagManagerForNoScript(String GoogleTagManagerNoScript) throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),GoogleTagManagerNoScript);
		return this;
	}
	public ESRINewHome_OperationalIntelligencePage footerEmbbedCode(String FooterEmbedCode) throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),FooterEmbedCode);
		return this;
	}
	public ESRINewHome_OperationalIntelligencePage pardotDataLayerCode(String PardotLayerCode) throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),PardotLayerCode);
		return this;
	}
}
