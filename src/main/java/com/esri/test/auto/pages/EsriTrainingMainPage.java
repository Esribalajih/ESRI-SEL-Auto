package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

public class EsriTrainingMainPage extends ESRIWrappers {
	
	public EsriTrainingMainPage() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("Esri Training | Your Location for Lifelong Learning")) {
			Reporter.reportStep("Title of the catalog page did not match", "FAIL");
		}
	}
}
