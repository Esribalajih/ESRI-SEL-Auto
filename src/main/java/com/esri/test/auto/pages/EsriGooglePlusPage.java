package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri GooglePlus page
 * @author balajih
 *
 */

public class EsriGooglePlusPage extends ESRIWrappers{
	
	public EsriGooglePlusPage() throws Throwable{
		if (!VerifyTitle("Esri - Google+"))
			Reporter.reportStep("This is not a Esri GooglePlus Page", "FAIL");
	}
	
	public NewEsriHomePage clickBwrBckBtntoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new NewEsriHomePage();
	}
}
