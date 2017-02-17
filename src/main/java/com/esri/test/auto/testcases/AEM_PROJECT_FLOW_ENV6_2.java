package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.esri.test.auto.pages.AEM_ASSET_PAGE;
import com.esri.test.auto.pages.AEM_HOMEPAGE;
import com.esri.test.auto.pages.AEM_PROJECTPAGE;
import com.esri.test.auto.pages.AEM_SIGNIN_PAGE;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This script is to check Project Work Flow
 * @author Mohamed
 *
 */

public class AEM_PROJECT_FLOW_ENV6_2 extends ESRIWrappers{
	 @BeforeClass
	  public void startTestCase() {
		 dataSheetName="AEM_INPUT_Environment_6.2";
		 testCaseName="AEM_PROJECT (POM)";
		 testDescription="AEM PROJECT FLOW";
	  }
	 @Test(dataProvider="fetchdata")
	  public void ProjectFlow(String username, String password, String foldertitle, String foldername, String location, String fileName,
				String parentFolder, String assettitle, String description, String searchTagType, String searchTagName,
				String searchtagdescname, String projecttitle, String wfname, String wfdesc, String cnum, String iuse,
				String username1, String password1, String url, String path) throws Throwable {
		 openbrowser(url);
		 //Signin 
		   new AEM_SIGNIN_PAGE()
		  .enterUserName(username)
		  .enterPassword(password)
		  .clickSignin()
		 
		  //Verify title
		  .verifyTitle()
	      .clickOnAdobeExperienceManager()
		  .clickOnProject_NEW()
		  .createProjectEsriAssertRequest(projecttitle, projecttitle)
		  .createEmailRequestWorkflow(wfname, wfdesc, location, cnum , cnum, iuse)
		  .verifyWorkflowRunningStatus()
		  .clickNotificationIcon()
		  .clickNotificationViewAllLink()
		  .refreshPage()
		  .checkEmailRequestFlow("Update Asset Path")   //Test Title Test
		  .clickCompleteButton()
		  .clickBrowseButton()
		  .selectAssertFolder("Test Title", "Test")
		  .clickStepCompleteButton()
		  .refreshPage()
		  .checkEmailRequestFlow("Data Team Kickoff Call") 
		  .checkEmailRequestFlow("Email Page Kickoff Call")
		  .clickCompleteButton()
		  .clickStepCompleteButton()
		  .clickStepCompleteButton()
		  .refreshPage()
		  .checkEmailRequestFlow("Select/Build List") 
		  .checkEmailRequestFlow("Code HTML")
		  .clickCompleteButton()
		  .clickStepCompleteButton()
		  .clickStepCompleteButton()
		  .refreshPage()
		  .checkEmailRequestFlow("Count/Criteria Review with Requester")
		  .checkEmailRequestFlow("Stakeholder Review of Copy")
		  .clickCompleteButton()
		  .clickStepCompleteButton()
		  .clickStepCompleteButton()
		  .refreshPage()
		  .checkEmailRequestFlow("Run Segmentation and Populate List in Pardot")
		  .checkEmailRequestFlow("Submit it to testing")
		  .clickCompleteButton()
		  .clickStepCompleteButton()
		  .clickStepCompleteButton()
		  .refreshPage()
		  .checkEmailRequestFlow("Stakeholder Final List Review")
		  .checkEmailRequestFlow("1st Reviewer Approval")
		  .clickCompleteButton()
		  .clickStepCompleteButton()
		  .clickStepCompleteButton()
		  .refreshPage()
		  .checkEmailRequestFlow("2nd Reviewer of Email page")
		  .clickCompleteButton()
		  .clickStepCompleteButton()
		  .refreshPage()
		  .checkEmailRequestFlow("Email")
		  .clickCompleteButton()
		  .clickStepCompleteButton()
		  .clickCloseButton()
		  .verifyWorkflowCompleteStatus()
		  .clickProjectFolderNameHeader(projecttitle)
		  .selectProjectsfolder()
		  .deleteProjectCreatedFolder(projecttitle);
	   
	   }
	 }
