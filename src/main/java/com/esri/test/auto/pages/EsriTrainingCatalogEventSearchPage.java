package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author Sivaprakash
 *
 */
public class EsriTrainingCatalogEventSearchPage extends ESRIWrappers {

	public EsriTrainingCatalogEventSearchPage() throws Throwable {
		waitForPageLoad(3);
		if (!VerifyTitle("Find Esri Instructor-Led Classes and Other Events")) {
			Reporter.reportStep("Title did not match", "FAIL");
		}

	}

	public EsriTrainingCatalogEventSearchPage search(String data) throws Throwable {
		waitForPageLoad(3);
		enterByXpath(prop.getProperty("Training.catalogEnterKeyword.xpath"), data);
		return this;
	}

	public EsriTrainingCatalogEventSearchPage clearSearch() throws Throwable {
		waitForPageLoad(2);
		clearContentByXpath(prop.getProperty("Training.catalogEnterKeyword.xpath"));
		return this;
	}

	public EsriTrainingCatalogEventSearchPage click() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogClickSearch.xpath"));
		return this;
	}

	public EsriTrainingCatalogEventSearchPage filterClick() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogFilterClick.xpath"));
		return this;
	}

	public EsriTrainingCatalogEventSearchPage filterSelectMooc() throws Throwable {
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogFilterSelectOptionsMooc.xpath"));
		return this;
	}

	public EsriTrainingCatalogEventSearchPage filterDeselectMooc() throws Throwable {
		clickByXpath(prop.getProperty("Training.catalogFilterDeselectOptionsMooc.xpath"));
		return this;
	}

	public EsriTrainingCatalogEventSearchPage filterSelectTrainingSeminar() throws Throwable {
		clickByXpath(prop.getProperty("Training.catalogFilterSelectOptionsTrainingSeminar.xpath"));
		return this;
	}

	public EsriTrainingCatalogEventSearchPage filterDeselectTrainingSeminar() throws Throwable {
		clickByXpath(prop.getProperty("Training.catalogFilterDeselectOptionsTrainingSeminar.xpath"));
		return this;
	}

	public EsriTrainingCatalogEventSearchPage filterSelectInstructorLed() throws Throwable {
		clickByXpath(prop.getProperty("Training.catalogFilterSelectOptionsInstructorLed.xpath"));
		return this;
	}

	public EsriTrainingCatalogEventSearchPage filterDeselectInstructorLed() throws Throwable {
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogFilterSelectOptionsInstructorLed.xpath"));
		return this;
	}

	public EsriTrainingCatalogEventSearchPage startDatePicker() throws Throwable {
		clickByXpath(prop.getProperty("Training.catalogDatepicker1.xpath"));
		return this;
	}

	public EsriTrainingCatalogEventSearchPage startDateSelect() throws Throwable {
		scrollIntoViewByXpath(prop.getProperty("Training.catalogDateSelection1.xpath"));
		clickByXpath(prop.getProperty("Training.catalogDateSelection1.xpath"));
		return this;
	}

	public EsriTrainingCatalogEventSearchPage endDatePicker() throws Throwable {
		clickByXpath(prop.getProperty("Training.catalogDatepicker2.xpath"));
		return this;
	}

	public EsriTrainingCatalogEventSearchPage endDateSelect() throws Throwable {
		scrollIntoViewByXpath(prop.getProperty("Training.catalogDateSelection2.xpath"));		
		clickByXpath(prop.getProperty("Training.catalogDateSelection2.xpath"));
		return this;
	}

	public EsriTrainingCatalogEventSearchPage results() throws Throwable {
		waitForPageLoad(2);
		System.out.println(getTextByXpath(prop.getProperty("Training.catalogFilteredResults.xpath")));
		return this;
	}

	public EsriTrainingCatalogEventSearchPage verifyLink() throws Throwable {
		clickByLinkText(prop.getProperty("Training.catalogTitleLink.linkText"));
		waitForPageLoad(5);
		clickBrowserBackButton();
		waitForPageLoad(2);
		return this;

	}

	public EsriTrainingCatalogEventSearchPage cardButtonInstructorLed() throws Throwable {

		try {
			if (checkElementIsDisplayedByLinkText(prop.getProperty("Training.catalogCardButtonFilterInstructorLed.linkText"))) {
				clickByLinkText(prop.getProperty("Training.catalogCardButtonFilterInstructorLed.linkText"));
				System.out.println(getTextByXpath(prop.getProperty("Training.catalogCardButtonFilterInstructorLedCourseRegisterVerify.linkText")));
				clickBrowserBackButton();
			} else {
				System.out.println("");
			}
		} catch (Exception e) {
			System.out.println("Card Button is not available,either already selected or no link");
		}
		return this;
	}

	public EsriTrainingCatalogEventSearchPage cardButtonClickMooc() throws Throwable {

		try {
			if (checkElementIsDisplayedByLinkText(prop.getProperty("Training.catalogCardButtonFilterMooc.linkText"))) {
				System.out.println("Mooc card button is displayed");
			} else {				
				clickByXpath(prop.getProperty("Training.catalogCardButtonFilterScheduleRemove.xpath"));
				checkElementIsDisplayedByLinkText(prop.getProperty("Training.catalogCardButtonFilterMooc.linkText"));
			}
		} catch (Exception e) {
			System.out.println("Card Button is not available,either already selected or no link");
		}
		return this;
	}

	public EsriTrainingCatalogEventSearchPage cardButtonClickTrainingSeminar() throws Throwable {

		try {
			if (checkElementIsDisplayedByLinkText(prop.getProperty("Training.catalogCardButtonFilterTrainingSeminar.linkText"))) {
				clickByLinkText(prop.getProperty("Training.catalogCardButtonFilterTrainingSeminar.linkText"));
				checkElementIsDisplayedByLinkText(prop.getProperty("Training.downloadICS.linktext"));
			} else {				
				clickByXpath(prop.getProperty("Training.catalogCardButtonFilterScheduleRemove.xpath"));
				clickByXpath(prop.getProperty("Training.catalogCardButtonFilterTrainingSeminar.linkText"));
				checkElementIsDisplayedByLinkText(prop.getProperty("Training.downloadICS.linktext"));
			}
		} catch (Exception e) {
			System.out.println("Card Button is not available,either already selected or no link");
		}
		return this;

	}
	public EsriTrainingCatalogEventSearchPage headerEmbedCode() throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),prop.getProperty("Tag.HeaderEmbedCode.text"));
		return this;
	}
	public EsriTrainingCatalogEventSearchPage googleTagManagerForScript() throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForScript.text"));
		return this;
	}	
	public EsriTrainingCatalogEventSearchPage googleTagManagerForNoScript() throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForNoScript.text"));
		return this;
	}
	public EsriTrainingCatalogEventSearchPage footerEmbbedCode() throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),prop.getProperty("Tag.FooterEmbbedCode.text"));
		return this;
	}
	public EsriTrainingCatalogEventSearchPage pardotDataLayerCode() throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),prop.getProperty("Tag.PardotDataLayerCode.text"));
		return this;
	}
}
