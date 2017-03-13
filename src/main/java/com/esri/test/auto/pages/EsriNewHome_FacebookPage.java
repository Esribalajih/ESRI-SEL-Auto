package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Facebook page
 * @author balajih
 *
 */
public class EsriNewHome_FacebookPage extends ESRIWrappers{
	
	public EsriNewHome_FacebookPage() throws Throwable{
		waitForPageLoad(3);
		if (!VerifyTitle("Esri | Facebook"))
			Reporter.reportStep("This is not a Esri Facebook Page", "FAIL");
	}
	
	public ESRINewHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new ESRINewHomePage();
	}

}

