package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.EsriTrainingHomePage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to check wishList
 * 
 * @author Sivaprakash
 *
 */
public class ESRITraining_TC13_WishList extends ESRIWrappers {
	@BeforeClass
	public void startTestCase() {
		dataSheetName = "EsriTraining_SignInCredentials";
		testCaseName = "ESRITraining_TC13_WishList";
		testDescription = "It shows up and data is correct,Buttons Work ";
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
			.getCardTitle()
			.myLearningTab()
			.wishList()
			.verifyCardTitle();	
					
	}

}
