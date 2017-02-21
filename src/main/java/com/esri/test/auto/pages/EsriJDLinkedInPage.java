package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri LinkedIN Page
 * @author balajih
 *
 */
public class EsriJDLinkedInPage extends ESRIWrappers{
	
	public EsriJDLinkedInPage() throws Throwable{
		if(!VerifyTitle("Esri | LinkedIn "))
			Reporter.reportStep("This is not a Esri LinkedIn Page", "FAIL");
	}

	public EsriCareerJobDetailsPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerJobDetailsPage();

	}
	
}
