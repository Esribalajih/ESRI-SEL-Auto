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
	
	public EsriTrainingNewCourseRegistrationPage headerEmbedCode() throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),prop.getProperty("Tag.HeaderEmbedCode.text"));
		return this;
	}
	public EsriTrainingNewCourseRegistrationPage googleTagManagerForScript() throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForScript.text"));
		return this;
	}	
	public EsriTrainingNewCourseRegistrationPage googleTagManagerForNoScript() throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForNoScript.text"));
		return this;
	}
	public EsriTrainingNewCourseRegistrationPage footerEmbbedCode() throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),prop.getProperty("Tag.FooterEmbbedCode.text"));
		return this;
	}
	public EsriTrainingNewCourseRegistrationPage pardotDataLayerCode() throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),prop.getProperty("Tag.PardotDataLayerCode.text"));
		return this;
	}

}
