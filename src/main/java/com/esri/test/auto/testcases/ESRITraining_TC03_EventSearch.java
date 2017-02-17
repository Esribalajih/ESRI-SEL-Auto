package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.EsriTrainingHomePage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to check all the functionality of Catalog-EventSearch page
 * 
 * @author Sivaprakash
 *
 */
public class ESRITraining_TC03_EventSearch extends ESRIWrappers {
	@BeforeClass
	public void startTestCase() {
		dataSheetName = "ESRITraining_TC03_EventSearch";
		testCaseName = "ESRITraining_TC03_EventSearch";
		testDescription = "Search Works,Filters Work,Dates and Times Are Correct,Functionality Works - All Types ";
	}

	@Test(dataProvider="fetchdata")
	public void loginforSuccess(String keyword) throws Throwable {
		openbrowser("https://www.esri.com/training/");
		new EsriTrainingHomePage()
			
			.catalogTab()
			.clickEventSearch()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.search(keyword)
			.click()
			.results()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.clearSearch()
			.startDatePicker()
			.startDateSelect()
			.endDatePicker()
			.endDateSelect()
			.results()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.filterClick()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.filterSelectInstructorLed()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.cardButtonInstructorLed()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.filterClick()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.filterDeselectInstructorLed()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.filterSelectMooc()
			.cardButtonClickMooc()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.filterSelectMooc()
			.filterSelectTrainingSeminar()
			.cardButtonClickTrainingSeminar()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode();
					
	}

}
