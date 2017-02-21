package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Facebook page
 * @author balajih
 *
 */
public class EsriJDFacebookPage extends ESRIWrappers{
	
	public EsriJDFacebookPage() throws Throwable{
		if (!VerifyTitle("Esri | Facebook"))
			Reporter.reportStep("This is not a Esri Facebook Page", "FAIL");
	}
	
	public EsriCareerJobDetailsPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerJobDetailsPage();
	}

}

