package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.EsriTrainingHomePage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to check all the functionality of Catalog-findTraining page
 * 
 * @author Sivaprakash
 *
 */
public class ESRITraining_TC02_FindTraining extends ESRIWrappers {
	@BeforeClass
	public void startTestCase() {
		dataSheetName = "ESRITraining_TC02_FindTraining";
		testCaseName = "ESRITraining_TC02_FindTraining";
		testDescription ="Navigate to Catalog/search,Search Works,Filters Work,Toggle View Works,Correct Cards Appear,Listview also works";
	}

	@Test(dataProvider="fetchdata")
	public void loginforSuccess(String keyword1, String data) throws Throwable {
		openbrowser("https://www.esri.com/training/");
		new EsriTrainingHomePage()
			.catalogTab()
			.clickFindTraining(data)
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.enterKeywords(keyword1)
			.clickSearch()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.resultsCount()
			.clearSearch()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.filterSelect()
			.checkBox()
			.resultsCount()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.listView()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode();
	}
	

}
