package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author Sivaprakash
 *
 */
public class EsriTrainingHomePage extends ESRIWrappers {

	public EsriTrainingHomePage() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("Esri Training | Your Location for Lifelong Learning")) {
			Reporter.reportStep("Title of the Homepage page did not match", "FAIL");
		}
	}
	
	public EsriTrainingMainPage mainTab()throws Throwable{
		clickByXpath(prop.getProperty("Homepage.clickMain.xpath"));
		return new EsriTrainingMainPage();
	}
	public EsriTrainingCatalogPage catalogTab() throws Throwable{
		clickByXpath(prop.getProperty("Homepage.clickCatalog.xpath"));
		return new EsriTrainingCatalogPage();
	}
	
	public EsriTrainingMyLearningPage myLearningTab() throws Throwable{
		clickByXpath(prop.getProperty("Homepage.clickMylearning.xpath"));
		return new EsriTrainingMyLearningPage();
	}
	
	public EsriTrainingCertificationPage certificationTab() throws Throwable {
		clickByXpath(prop.getProperty("Homepage.clickCertification.xpath"));
		return new EsriTrainingCertificationPage();
	}
	
	public EsriTrainingHelpPage helpTab() throws Throwable {
		clickByXpath(prop.getProperty("Homepage.clickHelp.xpath"));
		return new EsriTrainingHelpPage();
	}
	
	public EsriTrainingLoginPage login() throws Throwable{
		clickById(prop.getProperty("Homepage.clickLogin.id"));		
		return new EsriTrainingLoginPage();
	}
	
	public EsriTrainingHomePage verifyLogin() throws Throwable{
		clickById(prop.getProperty("username"));
		clickById(prop.getProperty("Homepage.userEmailVerify.class"));		
		return this;
	}
	
	public EsriTrainingHomePage logout() throws Throwable{
		clickById(prop.getProperty("username"));
		clickByLinkText(prop.getProperty("Homepage.clickSignout.linkText"));
		return this;
	}
		
}
