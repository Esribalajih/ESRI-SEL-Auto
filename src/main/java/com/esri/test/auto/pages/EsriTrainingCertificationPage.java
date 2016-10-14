package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

public class EsriTrainingCertificationPage extends ESRIWrappers  {
	
	public EsriTrainingCertificationPage() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("Your Esri Training Learning Dashboard")) {
			Reporter.reportStep("Title of the catalog page did not match", "FAIL");
		}
		
	}
	
}
