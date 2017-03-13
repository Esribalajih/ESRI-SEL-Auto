package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is a ETC Time card Page common for both Exempt and Non-Exempt user
 * @author balajih
 *
 */
public class ETCTimeCardPage extends ESRIWrappers{
	
	public ETCTimeCardPage() throws Throwable{
		if(!VerifyTitle("Esri Dev - Sign In")){
			Reporter.reportStep("Esri Dev - My Applications", "FAIL");
		}
	}

}
