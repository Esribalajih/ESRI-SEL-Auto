package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Twitter page
 * @author balajih
 *
 */
public class EsriCareerTwitterPage extends ESRIWrappers{
	
	public EsriCareerTwitterPage() throws Throwable{
		if (!VerifyTitle("Esri Careers (@EsriCareers) | Twitter"))
			Reporter.reportStep("This is not a Esri Career Twitter Page", "FAIL");
	}
	public EsriCareerMainPage switchbacktoParentWindow() throws Throwable{
		switchToDefaultContent();
		return new EsriCareerMainPage();
	}
}
