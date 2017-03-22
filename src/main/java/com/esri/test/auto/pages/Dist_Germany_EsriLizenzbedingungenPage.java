package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Germany Esri Lizenzbedingungen Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Germany_EsriLizenzbedingungenPage extends ESRIWrappers {
	public Dist_Germany_EsriLizenzbedingungenPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Esri Lizenzbedingungen | Esri Deutschland")) {
			Reporter.reportStep("This is not a Esri Lizenzbedingungen | Esri Deutschland (Germany) page.", "FAIL");
		} else
			System.out.println("Germany Esri Lizenzbedingungen | Esri Deutschland page Launched Successfully");
	}

	// click back button in browser
	public Dist_Germany_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Germany_HomePage();
	}

	// verify Esri Lizenzbedingungen label
	public Dist_Germany_EsriLizenzbedingungenPage verifyEsriLizenzbedingungenlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disGermanyLiz.EsriLizenzbedingungenLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public Dist_Germany_EsriLizenzbedingungenPage headerEmbedCode(String HeaderEmbedCode) throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),HeaderEmbedCode);
		return this;
	}
	public Dist_Germany_EsriLizenzbedingungenPage googleTagManagerForScript(String GoogleTagManagerScript) throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),GoogleTagManagerScript);
		return this;
	}	
	public Dist_Germany_EsriLizenzbedingungenPage googleTagManagerForNoScript(String GoogleTagManagerNoScript) throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),GoogleTagManagerNoScript);
		return this;
	}
	public Dist_Germany_EsriLizenzbedingungenPage footerEmbbedCode(String FooterEmbedCode) throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),FooterEmbedCode);
		return this;
	}
	public Dist_Germany_EsriLizenzbedingungenPage pardotDataLayerCode(String PardotLayerCode) throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),PardotLayerCode);
		return this;
	}
}
