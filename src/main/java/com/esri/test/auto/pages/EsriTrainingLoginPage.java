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
	
	public EsriTrainingLoginPage headerEmbedCode() throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),prop.getProperty("Tag.HeaderEmbedCode.text"));
		return this;
	}
	public EsriTrainingLoginPage googleTagManagerForScript() throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForScript.text"));
		return this;
	}	
	public EsriTrainingLoginPage googleTagManagerForNoScript() throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForNoScript.text"));
		return this;
	}
	public EsriTrainingLoginPage footerEmbbedCode() throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),prop.getProperty("Tag.FooterEmbbedCode.text"));
		return this;
	}
	public EsriTrainingLoginPage pardotDataLayerCode() throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),prop.getProperty("Tag.PardotDataLayerCode.text"));
		return this;
	}
		

}
