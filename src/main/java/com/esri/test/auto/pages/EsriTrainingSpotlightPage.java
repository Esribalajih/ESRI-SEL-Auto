package com.esri.test.auto.pages;

import com.esri.test.auto.wrappers.ESRIWrappers;

public class EsriTrainingSpotlightPage extends ESRIWrappers {

	
	public EsriTrainingSpotlightPage getSpotlightCardTitle() throws Throwable{
		waitForPageLoad(2);
		System.out.println(getTextByXpath(prop.getProperty("Training.catalogCardSpotLightTitle.xpath")));
		return this;
	}
	
	public EsriTrainingSpotlightPage verifySpotlightTitle(String data) throws Throwable{
		waitForPageLoad(2);
		VerifyTextByXpath(prop.getProperty("Training.catalogSpotlightTitle.xpath"), data);
		return this;
	}

	public EsriTrainingCatalogPage navigateBack() throws Throwable {
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalog.xpath"));
		return new EsriTrainingCatalogPage();
	}
	
	public EsriTrainingSpotlightPage headerEmbedCode() throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),prop.getProperty("Tag.HeaderEmbedCode.text"));
		return this;
	}
	public EsriTrainingSpotlightPage googleTagManagerForScript() throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForScript.text"));
		return this;
	}	
	public EsriTrainingSpotlightPage googleTagManagerForNoScript() throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForNoScript.text"));
		return this;
	}
	public EsriTrainingSpotlightPage footerEmbbedCode() throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),prop.getProperty("Tag.FooterEmbbedCode.text"));
		return this;
	}
	public EsriTrainingSpotlightPage pardotDataLayerCode() throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),prop.getProperty("Tag.PardotDataLayerCode.text"));
		return this;
	}

}
