package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author balajih
 *
 */
public class EsriTrainingCourseRegistrationPage extends ESRIWrappers {

	public EsriTrainingCourseRegistrationPage() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("Esri Training | Your Location for Lifelong Learning")) {
			Reporter.reportStep("Title did not match", "FAIL");
		}

	}
	
	public EsriTrainingCourseRegistrationPage courseTitle(String data) throws Throwable{
		VerifyTextByXpath(prop.getProperty("Training.couseRegistration.xpath"), data);
		return this;
	}
	
	public EsriTrainingCourseRegistrationPage verifySignIn() throws Throwable{
		checkElementIsDisplayedByXpath(prop.getProperty("Training.courseSignIn.xpath"));
		return this;
	}

}
