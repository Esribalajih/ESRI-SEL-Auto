package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author balajih
 *
 */
public class EsriTrainingNewCourseRegistrationPage extends ESRIWrappers {

	public EsriTrainingNewCourseRegistrationPage() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("Esri Training | Your Location for Lifelong Learning")) {
			Reporter.reportStep("Title did not match", "FAIL");
		}

	}
	
	
	public EsriTrainingLoginPage login() throws Throwable{
		clickById(prop.getProperty("Homepage.clickLogin.id"));		
		return new EsriTrainingLoginPage();
	}
	
	public EsriTrainingNewCourseRegistrationPage verifyLogin() throws Throwable{
		clickById(prop.getProperty("Homepage.clickLogin.id"));
		clickById(prop.getProperty("Homepage.userEmailVerify.class"));		
		return this;
	}
	
	public EsriTrainingRegistrationPaymentInfo clickNext() throws Throwable{
		clickByXpath(prop.getProperty("NewCourseRegistration.clickNext.xpath"));
		return new EsriTrainingRegistrationPaymentInfo();
	}
	
	public EsriTrainingNewCourseRegistrationPage navigateToUrl(String URL) throws Throwable{
		openbrowser(URL);
		return this;
	}
	
	

}
