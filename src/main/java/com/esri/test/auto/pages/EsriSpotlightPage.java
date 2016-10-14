package com.esri.test.auto.pages;

import com.esri.test.auto.wrappers.ESRIWrappers;

public class EsriSpotlightPage extends ESRIWrappers {

	
	public EsriSpotlightPage getSpotlightCardTitle() throws Throwable{
		waitForPageLoad(2);
		System.out.println(getTextByXpath(prop.getProperty("Training.catalogCardSpotLightTitle.xpath")));
		return this;
	}
	
	public EsriSpotlightPage verifySpotlightTitle(String data) throws Throwable{
		waitForPageLoad(2);
		VerifyTextByXpath(prop.getProperty("Training.catalogSpotlightTitle.xpath"), data);
		return this;
	}

	public EsriTrainingCatalogPage navigateBack() throws Throwable {
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalog.xpath"));
		return new EsriTrainingCatalogPage();
	}

}
