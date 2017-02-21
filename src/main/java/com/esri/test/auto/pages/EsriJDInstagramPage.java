package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Instagram page
 * @author balajih
 *
 */
public class EsriJDInstagramPage extends ESRIWrappers{
	
	public EsriJDInstagramPage() throws Throwable{
		if (!VerifyTitle("Esri (@esrigram) • Instagram photos and videos"))
			Reporter.reportStep("This is not a Esri Instagram Page", "FAIL");
	}

	public EsriCareerJobDetailsPage clickBwrBckBtnNewHomePage() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerJobDetailsPage();
	}
}
