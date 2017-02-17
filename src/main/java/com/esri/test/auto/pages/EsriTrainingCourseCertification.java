package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author Sivaprakash
 *
 */
public class EsriTrainingCourseCertification extends ESRIWrappers {

	public EsriTrainingCourseCertification() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("Directory of Esri-Certified Individuals")) {
			Reporter.reportStep("Title of the catalog page did not match", "FAIL");
		}
	}

	public EsriTrainingCourseCertification search(String data) throws Throwable {
		enterByXpath(prop.getProperty("Training.certificationSearch.xpath"), data);
		return this;
	}

	public EsriTrainingCourseCertification clickSearch() throws Throwable {
		clickByXpath(prop.getProperty("Training.certificationClickSearch.xpath"));
		return this;
	}

	public EsriTrainingCourseCertification filterSelect(String data) throws Throwable {
		selectByXpathWithText(prop.getProperty("Training.certificationFilterCountry.xpath"), data);
		return this;
	}
	
	public EsriTrainingCourseCertification filterSelectCertificate(String data) throws Throwable {
		selectByXpathWithValue(prop.getProperty("Training.certificationFilterCertification.xpath"), data);
		return this;
	}

	public EsriTrainingCourseCertification results() throws Throwable {
		System.out.println(getTextByXpath(prop.getProperty("Training.certificationResults.xpath")));
		waitForPageLoad(2);
		Reporter.reportStep("End of the test case", "PASS");
		return this;
	}
	
	public EsriTrainingCourseCertification headerEmbedCode() throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),prop.getProperty("Tag.HeaderEmbedCode.text"));
		return this;
	}
	public EsriTrainingCourseCertification googleTagManagerForScript() throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForScript.text"));
		return this;
	}	
	public EsriTrainingCourseCertification googleTagManagerForNoScript() throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForNoScript.text"));
		return this;
	}
	public EsriTrainingCourseCertification footerEmbbedCode() throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),prop.getProperty("Tag.FooterEmbbedCode.text"));
		return this;
	}
	public EsriTrainingCourseCertification pardotDataLayerCode() throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),prop.getProperty("Tag.PardotDataLayerCode.text"));
		return this;
	}

}
