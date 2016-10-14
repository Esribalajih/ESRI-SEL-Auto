package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author Sivaprakash
 *
 */
public class EsriTrainingLoginPage extends ESRIWrappers {

	public EsriTrainingLoginPage() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("Esri Accounts")) {
			Reporter.reportStep("Title of the catalog page did not match", "FAIL");
		}
	}
	
	public EsriTrainingLoginPage username(String data)throws Throwable{
		waitForPageLoad(5);
		switchToFrameByIndex(0);
		enterByXpath(prop.getProperty("Login.enterUsername.xpath"), data);
		return this;
	}
	
	public EsriTrainingLoginPage password(String data)throws Throwable{
		enterByXpath(prop.getProperty("Login.enterPassword.xpath"), data);
		return this;
	}
	
	public  EsriTrainingNewCourseRegistrationPage signIn()throws Throwable{
		clickByClassName(prop.getProperty("Login.enterSignInButton.class"));
		switchToDefaultContent();
		return new EsriTrainingNewCourseRegistrationPage();
	}
	
	public  EsriTrainingHomePage signInHomepage()throws Throwable{
		clickByClassName(prop.getProperty("Login.enterSignInButton.class"));
		switchToDefaultContent();
		return new EsriTrainingHomePage();
	}
	
	public  EsriTrainingCatalogSearchPage signInWishList()throws Throwable{
		clickByClassName(prop.getProperty("Login.enterSignInButton.class"));
		switchToDefaultContent();
		return new EsriTrainingCatalogSearchPage();
	}
	
		

}
