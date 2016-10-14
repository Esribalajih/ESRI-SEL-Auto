package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.EsriTrainingHomePage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to check all filters
 * 
 * @author Sivaprakash
 *
 */
public class ESRITraining_TC07_AllFilters extends ESRIWrappers {
	@BeforeClass
	public void startTestCase() {
		dataSheetName = "EsriTraining_SignInCredentials";
		testCaseName = "ESRITraining_TC07_AllFilters";
		testDescription = "filter select, card subbar check, wishlist check";
	}

	@Test(dataProvider="fetchdata")
	public void loginforSuccess(String username,String password) throws Throwable {
		
		openbrowser("https://www.esri.com/training/");
		new EsriTrainingHomePage()
			.login()
			.username(username)
			.password(password)
			.signInHomepage()
			.catalogTab()
			.clickFindTraining()
			.selectFilterInstructorLed()
			.selectFilterWebCourses()
			.selectFilterTrainingSeminars()
			.selectFilterMoocs()
			.selectFilterVideos()
			.selectFilterLessons()
			.selectFilterLearningPlans()
			.selectFilterGeoInquiries()
			.selectFilterSpatialLabs()
			.selectFilterMappingOurWorld()
			.selectFilterThinkingSpatially()
			.selectFilterBooks()
			.selectFilterTechnicalCertifications()
			.selectFilterMOOC();
			
		
	}	
	
}
