package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Instagram page
 * @author balajih
 *
 */
public class EsriCareerMoreAboutEsriPage extends ESRIWrappers{
	
	public EsriCareerMoreAboutEsriPage() throws Throwable{
		if (!VerifyTitle("About Esri"))
			Reporter.reportStep("This is not a Esri Career About Esri Page", "FAIL");
	}
	public EsriCareerJobDetailsPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerJobDetailsPage();
	}
}
