package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India Support Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_EsriIndTechSupportPage extends ESRIWrappers {
	public Dist_India_EsriIndTechSupportPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Esri India Technical Support")) {
			Reporter.reportStep("This is not a Esri India Technical Support (India) page.", "FAIL");
		} else
			System.out.println("India Esri India Technical Support page Launched Successfully");
	}

	// click back button in browser
	public Dist_India_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_HomePage();
	}

	// verify support label
	public Dist_India_EsriIndTechSupportPage verifysupportlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disIndiaSup.supportLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public Dist_India_EsriIndTechSupportPage headerEmbedCode(String HeaderEmbedCode) throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),HeaderEmbedCode);
		return this;
	}
	public Dist_India_EsriIndTechSupportPage googleTagManagerForScript(String GoogleTagManagerScript) throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),GoogleTagManagerScript);
		return this;
	}	
	public Dist_India_EsriIndTechSupportPage googleTagManagerForNoScript(String GoogleTagManagerNoScript) throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),GoogleTagManagerNoScript);
		return this;
	}
	public Dist_India_EsriIndTechSupportPage footerEmbbedCode(String FooterEmbedCode) throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),FooterEmbedCode);
		return this;
	}
	public Dist_India_EsriIndTechSupportPage pardotDataLayerCode(String PardotLayerCode) throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),PardotLayerCode);
		return this;
	}	
	
}
