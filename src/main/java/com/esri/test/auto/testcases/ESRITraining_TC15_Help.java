package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.EsriTrainingHomePage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to check help page.
 * 
 * @author Sivaprakash
 *
 */
public class ESRITraining_TC15_Help extends ESRIWrappers {
	@BeforeClass
	public void startTestCase() {
		dataSheetName = "ESRITraining_TC15_Help";
		testCaseName = "ESRITraining_TC15_Help";
		testDescription = "Search Works,It shows up and data is correct ";
	}

	@Test(dataProvider="fetchdata")
	public void loginforSuccess(String searchKeyword,String filterValue) throws Throwable {
		openbrowser("https://www.esri.com/training/");
		new EsriTrainingHomePage()			
			.helpTab()
			.search(searchKeyword)
			.clickSearch()
			.filterSelect(filterValue)
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
			.results()
			.clickHighlightedtext()
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode();						
	}

}
