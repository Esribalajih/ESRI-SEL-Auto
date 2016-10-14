package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.EsriTrainingHomePage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to check the myactivity record
 * 
 * @author Sivaprakash
 *
 */
public class ESRITraining_TC10_MyActivityRecord extends ESRIWrappers {
	@BeforeClass
	public void startTestCase() {
		dataSheetName = "ESRITraining_TC10_MyActivityRecord";
		testCaseName = "ESRITraining_TC10_MyActivityRecord";
		testDescription = "MyLearning activityrecord items will be checked";
	}

	@Test(dataProvider="fetchdata")
	public void loginforSuccess(String username, String password,String enterKeyWord,String enterText, String enterSortText,String enterCourseCode) throws Throwable {
		openbrowser("https://www.esri.com/training/");		
		new EsriTrainingHomePage()
			.login()
			.username(username)
			.password(password)
			.signInHomepage()
			.myLearningTab()
			.myLearningActivityEnterKeyWord(enterKeyWord)
			.myLearningActivityFilterCheck(enterText)
			.myLearningActivityDownloadTranscript(enterSortText)
			.myLearningActivityEnterCourse(enterCourseCode);
			
	}	
	
}
