package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Facebook page
 * @author balajih
 *
 */
public class EsriCareerBenefitsPage extends ESRIWrappers{
	
	public EsriCareerBenefitsPage() throws Throwable{
		if (!VerifyTitle("Esri Student Connection | Facebook"))
			Reporter.reportStep("This is not a Esri Career Facebook Page", "FAIL");
	}
	
	public EsriCareerBenefitsPage switchbacktoParentWindow(){
		switchToDefaultContent();
		return this;
	}

}
