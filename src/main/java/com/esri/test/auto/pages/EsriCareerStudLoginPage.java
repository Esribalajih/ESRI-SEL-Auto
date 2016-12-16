package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Student Login page
 * @author balajih
 *
 */
public class EsriCareerStudLoginPage extends ESRIWrappers{
	
	public EsriCareerStudLoginPage() throws Throwable{
		if (!VerifyTitle("Esri Student Connection | Facebook"))
			Reporter.reportStep("This is not a Esri Career Facebook Page", "FAIL");
	}
	
	public EsriCareerStudLoginPage switchbacktoParentWindow(){
		switchToDefaultContent();
		return this;
	}

}
