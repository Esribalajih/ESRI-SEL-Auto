package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Instagram page
 * @author balajih
 *
 */
public class EsriCareerInstagramPage extends ESRIWrappers{
	
	public EsriCareerInstagramPage() throws Throwable{
		if (!VerifyTitle("Esri (@esrigram) • Instagram photos and videos"))
			Reporter.reportStep("This is not a Esri Career Instagram Page", "FAIL");
	}
	public EsriCareerMainPage switchbacktoParentWindow() throws Throwable{
		switchToDefaultContent();
		return new EsriCareerMainPage();
	}
}
