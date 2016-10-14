package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author Sivaprakash
 *
 */
public class EsriTrainingHelpPage extends ESRIWrappers {

	public EsriTrainingHelpPage() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("Search Esri Training Common Questions and Contact Us")) {
			Reporter.reportStep("Title of the catalog page did not match", "FAIL");
		}
	}
	
	public EsriTrainingHelpPage search(String data) throws Throwable{
		enterByXpath(prop.getProperty("Training.helpSearch.xpath"), data);
		return this;
	}
	public EsriTrainingHelpPage clickSearch() throws Throwable{
		clickByXpath(prop.getProperty("Training.helpClickSearch.xpath"));
		return this;
	}
	public EsriTrainingHelpPage filterSelect(String data) throws Throwable{
		selectByXpathWithValue(prop.getProperty("Training.helpFilter"), data);
		return this;
	}
	public EsriTrainingHelpPage results() throws Throwable{
		System.out.println(getTextByXpath(prop.getProperty("Training.helpResults.xpath")));
		return this;
	}
	public EsriTrainingHelpPage clickHighlightedtext() throws Throwable{
		clickByClassName(prop.getProperty("Training.helpHighlightedText.class"));
		waitForPageLoad(3);		
		return this;
	}



}
