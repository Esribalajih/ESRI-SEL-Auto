package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.EsriTrainingHomePage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to check the Correct Cards Appear, Spotlight Training Works
 * 
 * @author Sivaprakash
 *
 */
public class ESRITraining_TC01_Catalog extends ESRIWrappers {
	@BeforeClass
	public void startTestCase() {
		dataSheetName = "ESRITraining_TC01_Catalog";
		testCaseName = "ESRITraining_TC01_Catalog";
		testDescription = "Make sure the page loads, Correct Cards Appear, Spotlight Training Works ";
	}

	@Test
	public void loginforSuccess() throws Throwable {
		openbrowser("https://www.esri.com/training/");
		new EsriTrainingHomePage()
			.catalogTab()
			.spotLightDetails()
			.getSpotlightCardTitle()
			.navigateBack()
			.getCardTitle()
			.catalogTab()
			.clickCard()
			.cardTitleVerify();
			
					
	}

}
