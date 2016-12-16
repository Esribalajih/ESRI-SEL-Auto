package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Blog Page
 * @author balajih
 *
 */
public class EsriCareerLinkedInPage extends ESRIWrappers{
	
	public EsriCareerLinkedInPage() throws Throwable{
		if(!VerifyTitle("Esri - Careers & Employment | LinkedIn"))
			Reporter.reportStep("This is not a Esri Career LinkedIn Page", "FAIL");
	}

	public EsriCareerMainPage switchbacktoParentWindow() throws Throwable{
		switchToDefaultContent();
		return new EsriCareerMainPage();
	}
	
}
