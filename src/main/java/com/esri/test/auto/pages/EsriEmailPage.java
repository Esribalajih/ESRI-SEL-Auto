package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Email Page
 * @author balajih
 *
 */
public class EsriEmailPage extends ESRIWrappers {

	public EsriEmailPage() throws Throwable{
		waitForPageLoad(3);
		if(!VerifyTitle("Esri News | ArcWatch | Subscribe")){
			Reporter.reportStep("this is not a Esri News | ArcWatch | Subscribe", "FAIL");
		}
	}

	//Click back to New Esri Home Page

	public NewEsriHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new NewEsriHomePage();
	}
}
