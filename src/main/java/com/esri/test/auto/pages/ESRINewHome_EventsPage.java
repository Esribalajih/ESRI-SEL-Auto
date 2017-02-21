package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Email Page
 * @author Rizwan
 *
 */
public class ESRINewHome_EventsPage extends ESRIWrappers {

	public ESRINewHome_EventsPage() throws Throwable{
		waitForPageLoad(3);
		if(!VerifyTitle("Esri Events | GIS User Conferences - Seminars - User Groups")){
			Reporter.reportStep("This is not a Esri Events | GIS User Conferences - Seminars - User Groups Page", "FAIL");
		}
	}
	
	public ESRINewHome_EventsPage VerifyEventsHeader(String EventsHeader) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.EventsHeader.xpath"), EventsHeader);
		return this;
	}

	//Click back to New Esri Home Page

	public ESRINewHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new ESRINewHomePage();
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public ESRINewHome_EventsPage headerEmbedCode(String HeaderEmbedCode) throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),HeaderEmbedCode);
		return this;
	}
	public ESRINewHome_EventsPage googleTagManagerForScript(String GoogleTagManagerScript) throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),GoogleTagManagerScript);
		return this;
	}	
	public ESRINewHome_EventsPage googleTagManagerForNoScript(String GoogleTagManagerNoScript) throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),GoogleTagManagerNoScript);
		return this;
	}
	public ESRINewHome_EventsPage footerEmbbedCode(String FooterEmbedCode) throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),FooterEmbedCode);
		return this;
	}
	public ESRINewHome_EventsPage pardotDataLayerCode(String PardotLayerCode) throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),PardotLayerCode);
		return this;
	}
}
