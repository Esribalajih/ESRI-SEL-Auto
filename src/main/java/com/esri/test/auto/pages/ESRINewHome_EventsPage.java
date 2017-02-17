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
	
	public ESRINewHome_EventsPage headerEmbedCode() throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),prop.getProperty("Tag.HeaderEmbedCode.text"));
		return this;
	}
	public ESRINewHome_EventsPage googleTagManagerForScript() throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForScript.text"));
		return this;
	}	
	public ESRINewHome_EventsPage googleTagManagerForNoScript() throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForNoScript.text"));
		return this;
	}
	public ESRINewHome_EventsPage footerEmbbedCode() throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),prop.getProperty("Tag.FooterEmbbedCode.text"));
		return this;
	}
	public ESRINewHome_EventsPage pardotDataLayerCode() throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),prop.getProperty("Tag.PardotDataLayerCode.text"));
		return this;
	}
}
