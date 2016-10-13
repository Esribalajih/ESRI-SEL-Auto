package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.esri.test.auto.pages.AEM_HOMEPAGE;
import com.esri.test.auto.pages.AEM_PROJECTPAGE;
import com.esri.test.auto.pages.AEM_SIGNIN_PAGE;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This script is to check Project Work Flow
 * @author Mohamed
 *
 */

public class AEM_PROJECT_FLOW extends ESRIWrappers{
	 @BeforeClass
	  public void startTestCase() {
		 dataSheetName="AEM_INPUT";
		 testCaseName="AEM_PROJECT (POM)";
		 testDescription="AEM PROJECT FLOW";
	  }
	 @Test(dataProvider="fetchdata")
	  public void ProjectFlow(String username,String password,String foldertitle,String foldername,String location,String assettitle,String description,String searchtagname,String searchtagdescname,String projecttitle,String wfname,String wfdesc,String cnum,String iuse,String username1,String password1,String url,String path) throws Throwable{
		  //Signin 
		 new AEM_SIGNIN_PAGE()
		  .enterUserName(username)
		  .enterPassword(password)
		  .clickSignin();
		 //Verify title
		  new AEM_HOMEPAGE()
		  .verifyTitle();
		  //Project workflow creation and viewing details
		  new AEM_PROJECTPAGE()
		  .clickOnProject()
		  .changeUserAsAdmin()
		  .createNewProject(projecttitle)
		  .createNewWorkflowRequest(wfname, wfdesc, cnum, iuse)
		  .notificationInbox()
		  .completeWorkflow1(path)
		  .completeWorkflow2()
		  .completeWorkflow3()
		  .completeWorkflow4()
		  .completeWorkflow5()
		  .completeWorkflow6()
		  .completeWorkflow7()
		  .completeWorkflow8()
		  .completeWorkflow9()
		  .completeWorkflow10()
		  .completeWorkflow11()
		  .completeWorkflow12()
		  .viewWfStepDetails()
		  .showStatisticView();
	   }
	   }
