package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.EsriTrainingHomePage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to check mylearningplans
 * 
 * @author Sivaprakash
 *
 */
public class ESRITraining_TC12_MyLearningPlans extends ESRIWrappers {
	@BeforeClass
	public void startTestCase() {
		dataSheetName = "EsriTraining_SignInCredentials";
		testCaseName = "ESRITraining_TC12_MyLearningPlans";
		testDescription = "My Learning Plans will be checked";
	}

	@Test(dataProvider="fetchdata")
	public void loginforSuccess(String username, String password) throws Throwable {
		openbrowser("https://www.esri.com/training/");		
		new EsriTrainingHomePage()
			.login()
			.username(username)
			.password(password)
			.signInHomepage()
			.myLearningTab()
			.myLearningPlans();
			
	}	
	
}
