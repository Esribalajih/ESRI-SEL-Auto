package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India About Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_AboutPage extends ESRIWrappers {
	public Dist_India_AboutPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("About")) {
			Reporter.reportStep("This is not a About (India) page.", "FAIL");
		} else
			System.out.println("India About page Launched Successfully");
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

	// verify About label
	public Dist_India_AboutPage verifyAboutLabel(String data) throws Throwable {
		try {
			verifyValueById(prop.getProperty("disIndiaAbout.aboutLabel.id"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
	// click Home Tab in browser
	public Dist_India_HomePage clickHomeTabLink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disIndiaHome.homeTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_HomePage();
	}
	
	//Verifying Google Tag and Abobe Analytics
	
	public Dist_India_AboutPage headerEmbedCode(String HeaderEmbedCode) throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),HeaderEmbedCode);
		return this;
	}
	public Dist_India_AboutPage googleTagManagerForScript(String GoogleTagManagerScript) throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),GoogleTagManagerScript);
		return this;
	}	
	public Dist_India_AboutPage googleTagManagerForNoScript(String GoogleTagManagerNoScript) throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),GoogleTagManagerNoScript);
		return this;
	}
	public Dist_India_AboutPage footerEmbbedCode(String FooterEmbedCode) throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),FooterEmbedCode);
		return this;
	}
	public Dist_India_AboutPage pardotDataLayerCode(String PardotLayerCode) throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),PardotLayerCode);
		return this;
	}	
}
