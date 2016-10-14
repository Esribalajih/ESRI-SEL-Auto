package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.EsriTrainingCourseRegistrationPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This test case is to check the Signin of Registration page
 * 
 *
 */
public class ESRITraining_TC04_CourseRegistrationSignin extends ESRIWrappers{
	 @BeforeClass
	  public void startTestCase() {
		 dataSheetName="ESRITraining_TC04_CourseRegistrationSignin";
		 testCaseName="ESRITraining_TC04_CourseRegistrationSignin";
		 testDescription="Not Signed In - Appears Correctly";
	  }

	  @Test(dataProvider="fetchdata")
	  public void loginforSuccess(String url,String CourseTitle) throws Throwable{
		  openbrowser(url);
		  new EsriTrainingCourseRegistrationPage()
		  .courseTitle(CourseTitle)
		  .verifySignIn();

		  
	  }
	
}
