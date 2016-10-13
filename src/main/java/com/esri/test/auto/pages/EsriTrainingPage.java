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

	public EsriSpotlightPage spotLightDetails() throws Throwable {
		waitForPageLoad(3);
		clickbyCssSelector(prop.getProperty("Training.catalogSpotlightDetails.css"));
		return new EsriSpotlightPage();
	}

	public EsriTrainingCardPage VerifyCard() throws Throwable {
		waitForPageLoad(3);
		clickbyXpath(prop.getProperty("Training.catalogFirstCardDetails.xpath"));
		return new EsriTrainingCardPage();
	}

}
