package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Login Page
 * @author balajih
 *
 */
public class EsriCareerLoginPage extends ESRIWrappers{
	
	public EsriCareerLoginPage() throws Throwable{
		if(!VerifyTitle("Careers Center - Welcome"))
			Reporter.reportStep("This is not a Esri Career center login Page", "FAIL");
	}

	
	
}
