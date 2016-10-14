package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author balajih
 *
 */
public class EsriTrainingRegistrationConfirmationPage extends ESRIWrappers {

	public EsriTrainingRegistrationConfirmationPage() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("Esri Training | Your Location for Lifelong Learning")) {
			Reporter.reportStep("Title did not match", "FAIL");
		}

	}
	
	public EsriTrainingRegistrationConfirmationPage verifyTick() throws Throwable{
		checkElementIsDisplayedByXpath(prop.getProperty("NewCourseRegistration.verifyTick.xpath"));
		return this;
	}
	
	public EsriTrainingRegistrationConfirmationPage clickLink() throws Throwable{
		waitForPageLoad(2);
		clickByLinkText(prop.getProperty("NewCourseRegistration.clickRegistrationRequest.linkText"));
		String Parent_Window = driver.getWindowHandle();
		// Switching from parent window to child window
		for (String Child_Window : driver.getWindowHandles()) {
			driver.switchTo().window(Child_Window);
			// Performing actions on child window				
		}
		waitForPageLoad(5);
		getTextByXpath(prop.getProperty("NewCourseRegistration.verifyPrint.xpath"));
		// Switching back to Parent Window
		driver.switchTo().window(Parent_Window);
		// Performing some actions on Parent Window
		getTitle();
		return this;
	}
	
	
	
	

}
