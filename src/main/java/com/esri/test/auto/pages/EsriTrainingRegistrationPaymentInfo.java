package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author balajih
 *
 */
public class EsriTrainingRegistrationPaymentInfo extends ESRIWrappers {

	public EsriTrainingRegistrationPaymentInfo() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("Esri Training | Your Location for Lifelong Learning")) {
			Reporter.reportStep("Title did not match", "FAIL");
		}

	}

	public EsriTrainingRegistrationPaymentInfo enterOrganizationInfo(String data, String data1, String data2,
			String data3, String data4, String data5) throws Throwable {
		enterByXpath(prop.getProperty("NewCourseRegistration.enterOrganizationName.xpath"), data);
		enterByXpath(prop.getProperty("NewCourseRegistration.enterAddress.xpath"), data1);
		enterByXpath(prop.getProperty("NewCourseRegistration.enterCity.xpath"), data2);
		enterByXpath(prop.getProperty("NewCourseRegistration.enterState.xpath"), data3);
		selectByXpathWithText(prop.getProperty("NewCourseRegistration.SelectCountry.xpath"), data4);
		enterByXpath(prop.getProperty("NewCourseRegistration.enterZipcode.xpath"), data5);
		return this;
	}

	public EsriTrainingRegistrationPaymentInfo billingInfo() throws Throwable {
		clickByJavaScriptId(prop.getProperty("NewCourseRegistration.billingInfo.id"));
		return this;
	}

	public EsriTrainingRegistrationPaymentInfo selectPayment(String data) throws Throwable {
		selectByXpathWithText(prop.getProperty("NewCourseRegistration.selectPayment.xpath"), data);
		return this;
	}

	public EsriTrainingRegistrationPaymentInfo billingInfo(String data) throws Throwable {
		enterByXpath(prop.getProperty("NewCourseRegistration.enterNotes.xpath"), data);
		return this;
	}

	public EsriTrainingRegistrationSummaryPage clickSummary() throws Throwable {
		clickByXpath(prop.getProperty("NewCourseRegistration.clickReviewSummary.xpath"));
		return new EsriTrainingRegistrationSummaryPage();
	}

}
