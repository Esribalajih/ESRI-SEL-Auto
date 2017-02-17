package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri GooglePlus page
 * @author balajih
 *
 */

public class EsriNewHome_GooglePlusPage extends ESRIWrappers{
	
	public EsriNewHome_GooglePlusPage() throws Throwable{
		waitForPageLoad(3);
		if (!VerifyTitle("Esri - Google+"))
			Reporter.reportStep("This is not a Esri GooglePlus Page", "FAIL");
	}
	
	public ESRINewHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new ESRINewHomePage();
	}
}
