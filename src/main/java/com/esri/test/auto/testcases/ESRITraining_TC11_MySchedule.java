package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.EsriTrainingHomePage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to check schedule items
 * 
 * @author Sivaprakash
 *
 */
public class ESRITraining_TC11_MySchedule extends ESRIWrappers {
	@BeforeClass
	public void startTestCase() {
		dataSheetName = "EsriTraining_TC11_MySchedule";
		testCaseName = "ESRITraining_TC11_MySchedule";
		testDescription = "MyLearning schedule items will be checked";
	}

	@Test(dataProvider="fetchdata")
	public void loginforSuccess(String username, String password,String data) throws Throwable {
		openbrowser("https://www.esri.com/training/");		
		new EsriTrainingHomePage()
			.login()
			.username(username)
			.password(password)
			.signInHomepage()
			.myLearningTab()
			.mySchedule(data)
			.headerEmbedCode().googleTagManagerForNoScript().googleTagManagerForScript().footerEmbbedCode().pardotDataLayerCode();
	}	
	
}
