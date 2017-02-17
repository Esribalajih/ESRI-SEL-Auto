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
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.selectTakeCoursesFilterWebCourses()
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.selectTakeCoursesFilterTrainingSeminars()
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.selectTakeCoursesFilterMoocs()
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.selectTakeCoursesFilterVideos()
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.selectTakeCoursesFilterLessons()
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.selectTakeCoursesFilterLearningPlans()
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.selectTakeCoursesFilterGeoInquiries()
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.selectTakeCoursesFilterSpatialLabs()
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.selectTakeCoursesFilterMappingOurWorld()
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.selectTakeCoursesFilterThinkingSpatially()
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.selectTakeCoursesFilterBooks()
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode()
		.selectTakeCoursesFilterTechnicalCertifications()
		.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode();		
	}	
	
}
