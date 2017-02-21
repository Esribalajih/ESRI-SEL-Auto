package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Email Page
 * @author Rizwan
 *
 */
public class ESRINewHome_ESRINewsPage extends ESRIWrappers {

	public ESRINewHome_ESRINewsPage() throws Throwable{
		waitForPageLoad(3);
		if(!VerifyTitle("News")){
			Reporter.reportStep("This is not a News Page", "FAIL");
		}
	}
	
	public ESRINewHome_ESRINewsPage VerifynewsHeader(String ESRINewsHeader) throws Throwable{
		//waitForPageLoad(3);
		VerifyTextByClassName(prop.getProperty("NewEsriUATHomePage.newsHeader.xpath.classname"), ESRINewsHeader);
		return this;
	}

	//Click back to New Esri Home Page

	public ESRINewHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		//Enable this if you are executing in IE
		//clickBrowserBackButton();
		return new ESRINewHomePage();
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public ESRINewHome_ESRINewsPage headerEmbedCode(String HeaderEmbedCode) throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),HeaderEmbedCode);
		return this;
	}
	public ESRINewHome_ESRINewsPage googleTagManagerForScript(String GoogleTagManagerScript) throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),GoogleTagManagerScript);
		return this;
	}	
	public ESRINewHome_ESRINewsPage googleTagManagerForNoScript(String GoogleTagManagerNoScript) throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),GoogleTagManagerNoScript);
		return this;
	}
	public ESRINewHome_ESRINewsPage footerEmbbedCode(String FooterEmbedCode) throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),FooterEmbedCode);
		return this;
	}
	public ESRINewHome_ESRINewsPage pardotDataLayerCode(String PardotLayerCode) throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),PardotLayerCode);
		return this;
	}
}
