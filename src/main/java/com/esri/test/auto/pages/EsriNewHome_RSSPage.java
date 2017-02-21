package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri RSSHomePage Page
 * @author balajih
 *
 */
public class EsriNewHome_RSSPage extends ESRIWrappers {

	public EsriNewHome_RSSPage() throws Throwable{
		waitForPageLoad(3);
		//If you are executing in Chrome Browser, enable the below if block
		if(!VerifyTitle("Esri News Feed - powered by FeedBurner")){
			Reporter.reportStep("This is not a Esri RSSHomePage Page", "FAIL");
		}
		//If you are executing in Firefox or Internet Browser, enable the below if block
		/*if(!VerifyTitle("Esri News Feed")){
					Reporter.reportStep("This is not a Esri RSSHomePage Page", "FAIL");
		}*/
	}

	//Click back to New Esri Home Page

	public ESRINewHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new ESRINewHomePage();
	}
}
