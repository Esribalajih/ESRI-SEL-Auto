package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Email Page
 * @author Rizwan
 *
 */
public class ESRINewHome_GIS_IONPage extends ESRIWrappers {

	public ESRINewHome_GIS_IONPage() throws Throwable{
		waitForPageLoad(3);
		if(!VerifyTitle("GIS: Improving Our Nation and Public Sector Decisions » Posts | GovLoop")){
			Reporter.reportStep("This is not a GIS: Improving Our Nation and Public Sector Decisions » Posts | GovLoop Page", "FAIL");
		}
	}
	
	public ESRINewHome_GIS_IONPage ClosePopup() throws Throwable{
		clickByXpath(prop.getProperty("NewEsriUATHomePage.publicsectordecisionspopupClose.xpath"));
		return this;
	}
	
	public ESRINewHome_GIS_IONPage VerifyIONHeader(String GIS_IONHeader) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewEsriUATHomePage.ImprovingournationandpublicsectordecisionsHeader.xpath"), GIS_IONHeader);
		return this;
	}

	//Click back to New Esri Home Page

	public ESRINewHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new ESRINewHomePage();
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public ESRINewHome_GIS_IONPage headerEmbedCode(String HeaderEmbedCode) throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),HeaderEmbedCode);
		return this;
	}
	public ESRINewHome_GIS_IONPage googleTagManagerForScript(String GoogleTagManagerScript) throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),GoogleTagManagerScript);
		return this;
	}	
	public ESRINewHome_GIS_IONPage googleTagManagerForNoScript(String GoogleTagManagerNoScript) throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),GoogleTagManagerNoScript);
		return this;
	}
	public ESRINewHome_GIS_IONPage footerEmbbedCode(String FooterEmbedCode) throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),FooterEmbedCode);
		return this;
	}
	public ESRINewHome_GIS_IONPage pardotDataLayerCode(String PardotLayerCode) throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),PardotLayerCode);
		return this;
	}
}
