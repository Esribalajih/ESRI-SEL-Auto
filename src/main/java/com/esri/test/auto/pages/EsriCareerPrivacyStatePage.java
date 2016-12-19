package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Privacy Statement page
 * @author balajih
 *
 */
public class EsriCareerPrivacyStatePage extends ESRIWrappers{
	
	public EsriCareerPrivacyStatePage() throws Throwable{
		if (!VerifyTitle("Legal Information | Esri Privacy Statement"))
			Reporter.reportStep("This is not a Esri Privacy Statement Page", "FAIL");
	}
	
	public EsriCareerHomePage switchbacktoParentWindow() throws Throwable{
		switchToDefaultContent();
		return new EsriCareerHomePage();
	}

}
