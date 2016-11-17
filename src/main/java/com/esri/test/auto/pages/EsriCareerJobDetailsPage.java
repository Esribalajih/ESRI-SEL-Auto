package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Job Details Page
 * @author balajih
 *
 */
public class EsriCareerJobDetailsPage extends ESRIWrappers{
	
	public EsriCareerJobDetailsPage() throws Throwable{
	if(!VerifyTitle("Esri Job Search"))
		Reporter.reportStep("This is not a Esri Career Job Details Page", "FAIL");
	}

}
