package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri LinkedIN Page
 * @author balajih
 *
 */
public class EsriNewHome_LinkedInPage extends ESRIWrappers{
	
	public EsriNewHome_LinkedInPage() throws Throwable{
		waitForPageLoad(3);
		if(!VerifyTitle("Esri | LinkedIn"))
			Reporter.reportStep("This is not a Esri LinkedIn Page", "FAIL");
	}

	public ESRINewHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new ESRINewHomePage();

	}
	
}
