package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author Sivaprakash
 *
 */
public class EsriTrainingPage extends ESRIWrappers {

	public EsriTrainingPage() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("Esri Training Catalog")) {
			Reporter.reportStep("Title of the catalog page did not match", "FAIL");
		}
	}

	public EsriTrainingSpotlightPage spotLightDetails() throws Throwable {
		waitForPageLoad(3);
		clickByCssSelector(prop.getProperty("Training.catalogSpotlightDetails.css"));
		return new EsriTrainingSpotlightPage();
	}

	public EsriTrainingCardPage VerifyCard() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogFirstCardDetails.xpath"));
		return new EsriTrainingCardPage();
	}
	
	public EsriTrainingPage headerEmbedCode() throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),prop.getProperty("Tag.HeaderEmbedCode.text"));
		return this;
	}
	public EsriTrainingPage googleTagManagerForScript() throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForScript.text"));
		return this;
	}	
	public EsriTrainingPage googleTagManagerForNoScript() throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForNoScript.text"));
		return this;
	}
	public EsriTrainingPage footerEmbbedCode() throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),prop.getProperty("Tag.FooterEmbbedCode.text"));
		return this;
	}
	public EsriTrainingPage pardotDataLayerCode() throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),prop.getProperty("Tag.PardotDataLayerCode.text"));
		return this;
	}
}
