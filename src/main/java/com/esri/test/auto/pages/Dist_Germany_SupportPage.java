package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Germany Support Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Germany_SupportPage extends ESRIWrappers {
	public Dist_Germany_SupportPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Support | Esri Deutschland")) {
			Reporter.reportStep("This is not a Support | Esri Deutschland (Germany) page.", "FAIL");
		} else
			System.out.println("Germany Support | Esri Deutschland page Launched Successfully");
	}

	// verify Support label
	public Dist_Germany_SupportPage verifySupportlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disGermanyDat.SupportLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public Dist_Germany_SupportPage headerEmbedCode(String HeaderEmbedCode) throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),HeaderEmbedCode);
		return this;
	}
	public Dist_Germany_SupportPage googleTagManagerForScript(String GoogleTagManagerScript) throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),GoogleTagManagerScript);
		return this;
	}	
	public Dist_Germany_SupportPage googleTagManagerForNoScript(String GoogleTagManagerNoScript) throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),GoogleTagManagerNoScript);
		return this;
	}
	public Dist_Germany_SupportPage footerEmbbedCode(String FooterEmbedCode) throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),FooterEmbedCode);
		return this;
	}
	public Dist_Germany_SupportPage pardotDataLayerCode(String PardotLayerCode) throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),PardotLayerCode);
		return this;
	}	
}
