package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Facebook page
 * @author balajih
 *
 */
public class EsriGlassDoorPage extends ESRIWrappers{
	
	public EsriGlassDoorPage() throws Throwable{
		if (!VerifyTitle("Working at Esri | Glassdoor.co.in"))
			Reporter.reportStep("This is not a Esri Glass Door Web Page", "FAIL");
	}
	
	public EsriCareerJobDetailsPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerJobDetailsPage();
	}

}
