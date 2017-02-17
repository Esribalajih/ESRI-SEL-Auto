package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

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
	
	public EsriTrainingHomePage headerEmbedCode() throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),prop.getProperty("Tag.HeaderEmbedCode.text"));
		return this;
	}
	public EsriTrainingHomePage googleTagManagerForScript() throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForScript.text"));
		return this;
	}	
	public EsriTrainingHomePage googleTagManagerForNoScript() throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForNoScript.text"));
		return this;
	}
	public EsriTrainingHomePage footerEmbbedCode() throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),prop.getProperty("Tag.FooterEmbbedCode.text"));
		return this;
	}
	public EsriTrainingHomePage pardotDataLayerCode() throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),prop.getProperty("Tag.PardotDataLayerCode.text"));
		return this;
	}
}
