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
	
	public EsriTrainingRegistrationSummaryPage headerEmbedCode() throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),prop.getProperty("Tag.HeaderEmbedCode.text"));
		return this;
	}
	public EsriTrainingRegistrationSummaryPage googleTagManagerForScript() throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForScript.text"));
		return this;
	}	
	public EsriTrainingRegistrationSummaryPage googleTagManagerForNoScript() throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForNoScript.text"));
		return this;
	}
	public EsriTrainingRegistrationSummaryPage footerEmbbedCode() throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),prop.getProperty("Tag.FooterEmbbedCode.text"));
		return this;
	}
	public EsriTrainingRegistrationSummaryPage pardotDataLayerCode() throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),prop.getProperty("Tag.PardotDataLayerCode.text"));
		return this;
	}

}
