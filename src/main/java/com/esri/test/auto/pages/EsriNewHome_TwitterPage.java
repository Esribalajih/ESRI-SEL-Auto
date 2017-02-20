package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Twitter page
 * @author balajih
 *
 */
public class EsriNewHome_TwitterPage extends ESRIWrappers{
	
	public EsriNewHome_TwitterPage() throws Throwable{
		waitForPageLoad(3);
		if (!VerifyTitle("Esri (@Esri) | Twitter"))
			Reporter.reportStep("This is not a Esri Twitter Page", "FAIL");
	}
		
	public ESRINewHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new ESRINewHomePage();
	}
}
