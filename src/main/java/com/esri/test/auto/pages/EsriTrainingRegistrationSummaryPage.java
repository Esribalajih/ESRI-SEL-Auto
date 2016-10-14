package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author balajih
 *
 */
public class EsriTrainingRegistrationSummaryPage extends ESRIWrappers {

	public EsriTrainingRegistrationSummaryPage() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("Esri Training | Your Location for Lifelong Learning")) {
			Reporter.reportStep("Title did not match", "FAIL");
		}

	}
	
	public EsriTrainingRegistrationSummaryPage clickTerms() throws Throwable{
		scrollIntoViewById(prop.getProperty("NewCourseRegistration.clickButton.id"));
		clickByJavaScriptId(prop.getProperty("NewCourseRegistration.clickButton.id"));
		return this;
	}
	
	
	public EsriTrainingRegistrationConfirmationPage clickSubmit() throws Throwable{
		clickByXpath(prop.getProperty("NewCourseRegistration.clickSubmit.xpath"));
		return new EsriTrainingRegistrationConfirmationPage();
	}
	
	
	
	
	

}
