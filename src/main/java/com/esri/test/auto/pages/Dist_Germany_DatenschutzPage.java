package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Germany Datenschutz Page Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Germany_DatenschutzPage extends ESRIWrappers {
	public Dist_Germany_DatenschutzPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Datenschutz | Esri Deutschland")) {
			Reporter.reportStep("This is not a Datenschutz | Esri Deutschland (Germany) page.", "FAIL");
		} else
			System.out.println("Germany Datenschutz | Esri Deutschland page Launched Successfully");
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

	// verify Datenschutz label
	public Dist_Germany_DatenschutzPage verifyDatenschutzlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disGermanyDat.DatenschutzLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
	// click back button in browser
	
	public Dist_Germany_HomePage clickHomeFooterLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disGermanyHome.HomeFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Germany_HomePage();
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public Dist_Germany_DatenschutzPage headerEmbedCode(String HeaderEmbedCode) throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),HeaderEmbedCode);
		return this;
	}
	public Dist_Germany_DatenschutzPage googleTagManagerForScript(String GoogleTagManagerScript) throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),GoogleTagManagerScript);
		return this;
	}	
	public Dist_Germany_DatenschutzPage googleTagManagerForNoScript(String GoogleTagManagerNoScript) throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),GoogleTagManagerNoScript);
		return this;
	}
	public Dist_Germany_DatenschutzPage footerEmbbedCode(String FooterEmbedCode) throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),FooterEmbedCode);
		return this;
	}
	public Dist_Germany_DatenschutzPage pardotDataLayerCode(String PardotLayerCode) throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),PardotLayerCode);
		return this;
	}
}
