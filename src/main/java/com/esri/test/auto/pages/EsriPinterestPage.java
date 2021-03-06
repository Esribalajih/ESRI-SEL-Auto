package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Pinterest page
 * @author balajih
 *
 */
public class EsriPinterestPage extends ESRIWrappers{
	
	public EsriPinterestPage() throws Throwable{
		if (!VerifyTitle("Esri on Pinterest"))
			Reporter.reportStep("This is not a Esri Pinterest Page", "FAIL");
	}
	
	public EsriCareerJobDetailsPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerJobDetailsPage();
	}
}
