package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri RSSHomePage Page
 * @author balajih
 *
 */
public class EsriRSSHomePage extends ESRIWrappers {

	public EsriRSSHomePage() throws Throwable{
		if(!VerifyTitle("Esri News Feed - powered by FeedBurner")){
			Reporter.reportStep("this is not a Esri RSSHomePage Page", "FAIL");
		}
	}

	//Click back to New Esri Home Page

	public ESRINewHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new ESRINewHomePage();
	}
}
