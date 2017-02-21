package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Twitter page
 * @author balajih
 *
 */
public class EsriJDTwitterPage extends ESRIWrappers{
	
	public EsriJDTwitterPage() throws Throwable{
		if (!VerifyTitle("Esri (@Esri) | Twitter"))
			Reporter.reportStep("This is not a Esri Twitter Page", "FAIL");
	}
		
	public EsriCareerJobDetailsPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerJobDetailsPage();
	}
}
