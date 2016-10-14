package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.EsriTrainingHomePage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to check location
 * 
 * @author Sivaprakash
 *
 */
public class ESRITraining_TC06_Location extends ESRIWrappers {
	@BeforeClass
	public void startTestCase() {
		dataSheetName = "EsriTraining_SignInCredentials";
		testCaseName = "ESRITraining_TC06_Location";
		testDescription = "Page Shows Up Correctly,Dates and Times Are Correct,Map Works";
	}

	@Test(dataProvider="fetchdata")
	public void loginforSuccess(String username, String password) throws Throwable {
		openbrowser("https://www.esri.com/training/");		
		new EsriTrainingHomePage()
			.login()
			.username(username)
			.password(password)
			.signInHomepage()
			.catalogTab()
			.clickLocation()
			.onlineClassRoom()
			.otherLocation();
			
			
	}	
	
}
