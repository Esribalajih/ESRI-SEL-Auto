package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.EsriTrainingHomePage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to check the take courses page
 * 
 * @author Sivaprakash
 *
 */
public class ESRITraining_TC08_TakeCourses extends ESRIWrappers {
	@BeforeClass
	public void startTestCase() {
		dataSheetName = "EsriTraining_SignInCredentials";
		testCaseName = "ESRITraining_TC08_TakeCourses";
		testDescription = "filter select, card subbar button click page check, wishlist check";
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
		.selectTakeCoursesFilterInstructorLed()
		.selectTakeCoursesFilterWebCourses()
		.selectTakeCoursesFilterTrainingSeminars()
		.selectTakeCoursesFilterMoocs()
		.selectTakeCoursesFilterVideos()
		.selectTakeCoursesFilterLessons()
		.selectTakeCoursesFilterLearningPlans()
		.selectTakeCoursesFilterGeoInquiries()
		.selectTakeCoursesFilterSpatialLabs()
		.selectTakeCoursesFilterMappingOurWorld()		
		.selectTakeCoursesFilterThinkingSpatially()
		.selectTakeCoursesFilterBooks()
		.selectTakeCoursesFilterTechnicalCertifications();
				
		
	}	
	
}
