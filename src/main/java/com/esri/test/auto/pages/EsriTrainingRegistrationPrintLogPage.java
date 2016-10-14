package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author balajih
 *
 */
public class EsriTrainingRegistrationPrintLogPage extends ESRIWrappers {

	public EsriTrainingRegistrationPrintLogPage() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("Esri Training | Your Location for Lifelong Learning")) {
			Reporter.reportStep("Title did not match", "FAIL");
		}

	}

	public EsriTrainingRegistrationPrintLogPage printVerify() throws Throwable {
		checkElementIsDisplayedByXpath(prop.getProperty("NewCourseRegistration.verifyPrint.xpath"));
		return this;
	}

}
