package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Home Page
 * @author balajih
 *
 */
public class EsriHomePage extends ESRIWrappers {

	public EsriHomePage() throws Throwable{
		if(!VerifyTitle("Esri - GIS Mapping Software, Solutions, Services, Map Apps, and Data")){
			Reporter.reportStep("this is not a Esri Home Page", "FAIL");
		}
	}

	//Click back to New Esri Home Page

	public NewEsriHomePage clickBrowserBcktoNewEsriHomePage() throws Throwable{
		clickBrowserBackButton();
		return new NewEsriHomePage();
	}
}
