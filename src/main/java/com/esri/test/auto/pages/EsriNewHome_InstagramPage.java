package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Instagram page
 * @author balajih
 *
 */
public class EsriNewHome_InstagramPage extends ESRIWrappers{
	
	public EsriNewHome_InstagramPage() throws Throwable{
		waitForPageLoad(3);
		if (!VerifyTitle("Esri (@esrigram) • Instagram photos and videos"))
			Reporter.reportStep("This is not a Esri Instagram Page", "FAIL");
	}

	public ESRINewHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new ESRINewHomePage();
	}
}
