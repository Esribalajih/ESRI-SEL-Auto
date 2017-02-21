package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Email Page
 * @author Rizwan
 *
 */
public class ESRINewHome_WhatsNewPage extends ESRIWrappers {

	public ESRINewHome_WhatsNewPage() throws Throwable{
		waitForPageLoad(3);
		if(!VerifyTitle("What's New | ArcGIS")){
			Reporter.reportStep("This is not a What's New | ArcGIS Page", "FAIL");
		}
	}
	
	public ESRINewHome_WhatsNewPage VerifyArcGISWhatsNewHeader(String ArcGISWhatsNewHeader) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.ArcGISWhatsNewHeader.xpath"), ArcGISWhatsNewHeader);
		return this;
	}

	//Click back to New Esri Home Page

	public ESRINewHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new ESRINewHomePage();
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public ESRINewHome_WhatsNewPage headerEmbedCode(String HeaderEmbedCode) throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),HeaderEmbedCode);
		return this;
	}
	public ESRINewHome_WhatsNewPage googleTagManagerForScript(String GoogleTagManagerScript) throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),GoogleTagManagerScript);
		return this;
	}	
	public ESRINewHome_WhatsNewPage googleTagManagerForNoScript(String GoogleTagManagerNoScript) throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),GoogleTagManagerNoScript);
		return this;
	}
	public ESRINewHome_WhatsNewPage footerEmbbedCode(String FooterEmbedCode) throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),FooterEmbedCode);
		return this;
	}
	public ESRINewHome_WhatsNewPage pardotDataLayerCode(String PardotLayerCode) throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),PardotLayerCode);
		return this;
	}
	
	
}
