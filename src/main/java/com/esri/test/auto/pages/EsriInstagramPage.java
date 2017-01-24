package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Instagram page
 * @author balajih
 *
 */
public class EsriInstagramPage extends ESRIWrappers{
	
	public EsriInstagramPage() throws Throwable{
		if (!VerifyTitle("Esri (@esrigram) • Instagram photos and videos"))
			Reporter.reportStep("This is not a Esri Instagram Page", "FAIL");
	}

	public NewEsriHomePage clickBwrBckBtnNewHomePage() throws Throwable{
		clickBrowserBackButton();
		return new NewEsriHomePage();
	}
}
