package com.esri.test.auto.pages;



import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author Mohamed
 * This is the Project page of AEM
 *
 */
public class AEM_PROJECTPAGE extends ESRIWrappers {
		public AEM_PROJECTPAGE() throws Throwable {
		 
		}
	
//Clicking on Project tab 
public AEM_PROJECTPAGE clickOnProject() throws Throwable{
	try{
		
		clickByXpath(prop.getProperty("AEMProject.main.xpath"));
		Reporter.reportStep("Project Tab is clicked", "PASS");
		waitForPageLoad(4);
		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}
	
//This method will change user to Admin
public AEM_PROJECTPAGE changeUserAsAdmin() throws Throwable{
	try{
	
		clickByXpath(prop.getProperty("AEMProject.userchange.xpath"));
		clickByXpath(prop.getProperty("AEMProject.userselectdropdown.xpath"));
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMProject.userselect.xpath"));
		clickByXpath(prop.getProperty("AEMProject.userchangeokbtn.xpath"));
		waitForPageLoad(4);
		System.out.println("User changed to Admin");
		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}


//This Method will Create new project 
public AEM_PROJECTPAGE createNewProject(String projecttitle)throws Throwable{
	try{
		
		clickByXpath(prop.getProperty("AEMProject.createnewproject.xpath"));
		Reporter.reportStep("Create new project is selected", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMProject.esriassetrequest.xpath"));
		Reporter.reportStep("Esri asset request is selected", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMProject.esriassetrequestnext.xpath"));
		Reporter.reportStep("Next button is clicked", "PASS");
		waitForPageLoad(2);
		enterByXpath(prop.getProperty("AEMProject.esriprojecttitle.xpath"),projecttitle);
		Reporter.reportStep("Project title is added", "PASS");
		clickByXpath(prop.getProperty("AEMProject.esrititleadvancedtab.xpath"));
		Reporter.reportStep("Advanced tab is selected", "PASS");
		clickByXpath(prop.getProperty("AEMProject.esrititlecreatenext.xpath"));
		Reporter.reportStep("Next button is clicked", "PASS");
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMProject.esriopenprojectbtn.xpath"));
		Reporter.reportStep("Open project is clicked", "PASS");
		waitForPageLoad(4);
		System.out.println("New Project is created");
		Reporter.reportStep("New Project is created", "PASS");
		}
		catch(Exception e){
		e.printStackTrace();
	    }
		return this;
		}

//This method will create New workflow request inside project folder
public AEM_PROJECTPAGE createNewWorkflowRequest(String wfname,String wfdesc,String cnum,String iuse)throws Throwable{
	try{
		clickByXpath(prop.getProperty("AEMProject.workflowaddbtn.xpath"));
		Reporter.reportStep("Workflow add button is clicked", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.esriemailrequestworkflow.xpath"));
		Reporter.reportStep("ESRI email request workflow is selected", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.esriemailrequestworkflownextbtn.xpath"));
		Reporter.reportStep("Next button is clicked", "PASS");
		waitForPageLoad(3);
		enterByXpath(prop.getProperty("AEMProject.esriemailrequestworkflowtitle.xpath"),wfname);
		Reporter.reportStep("Work flow title is entered", "PASS");
		waitForPageLoad(2);
		enterByXpath(prop.getProperty("AEMProject.esriemailrequestworkflowdescription.xpath"),wfdesc);
		Reporter.reportStep("Work flow description is entered", "PASS");
		waitForPageLoad(2);
		enterByXpath(prop.getProperty("AEMProject.esriemailrequestworkflowchargenmbr.xpath"),cnum);
		Reporter.reportStep("Workflow charge number is entered", "PASS");
		waitForPageLoad(2);
		enterByXpath(prop.getProperty("AEMProject.esriemailrequestworkflowimediateuse.xpath"),iuse);
		Reporter.reportStep("Workflow immediate use number is entered", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMProject.esriemailrequestworkflowcreatebtn.xpath"));
		Reporter.reportStep("ESRI email request create button is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMProject.esriemailrequestworkflowdone.xpath"));
		Reporter.reportStep("Esri email request workflow done button is clicked", "PASS");
		waitForPageLoad(4);
		System.out.println("New Workflow is initiated");
		Reporter.reportStep("New Workflow is initiated", "PASS");
		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

//This Method will click on Notification button and to view all notification details
public AEM_PROJECTPAGE notificationInbox()throws Throwable{
	try{
		clickByXpath(prop.getProperty("AEMproject.notificationbtn.xpath"));
		Reporter.reportStep("Notification icon is clicked", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMproject.notificviewdetails.xpath"));
		Reporter.reportStep("View details link is selected", "PASS");
		waitForPageLoad(4);
		Reporter.reportStep("Notification page is displaying with newly created workflow", "PASS");
		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

//This method will process Update asset  from the notification details page
public AEM_PROJECTPAGE completeWorkflow1(String path)throws Throwable{
	try{
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMProject.firstemailwfcheckbox.xpath"));
		Reporter.reportStep("Update asset path notification is selected", "PASS");
		waitForPageLoad(1);
		clickByXpath(prop.getProperty("AEMProject.emailwfcheckboxcompletebtn.xpath"));
		Reporter.reportStep("Complete button is clicked", "PASS");
		waitForPageLoad(1);
		clickByXpath(prop.getProperty("AEMProject.emailwfcompleteassetuploadbtn.xpath"));
		Reporter.reportStep("Upload asset path is selected", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.wfassetuploadpublicpath.xpath"));
		Reporter.reportStep("Public folder is selected", "PASS");
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("AEMProject.emailwfuploadassetitem.xpath"));
		Reporter.reportStep("Asset to be uploaded is selected", "PASS");
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("AEMProject.emailwfuploadassetokbtn.xpath"));
		Reporter.reportStep("Done button is clicked", "PASS");
		enterByXpath(prop.getProperty("AEMProject.pathuploadfield.xpath"),path);
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.wfcompletebutton.xpath"));
		Reporter.reportStep("Workflow complete button is clicked", "PASS");
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMProject.notificationclose.xpath"));
		Reporter.reportStep("Notification close button is Clicked", "PASS");
		System.out.println("Update Asset path is completed");
		Reporter.reportStep("Update Asset path is completed", "PASS");
		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

//This method will process Assign Marketing data from the notification details page
public AEM_PROJECTPAGE completeWorkflow2()throws Throwable{
	try{
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMproject.notificationbtn.xpath"));
		Reporter.reportStep("Notification icon is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMproject.notificviewdetails.xpath"));
		waitForPageLoad(2);
		Reporter.reportStep("View details link is selected", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.completewf2.xpath"));
		Reporter.reportStep("Assign Marketing Data notification is selected", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMProject.emailwfcheckboxcompletebtn.xpath"));
		Reporter.reportStep("complete button is clicked", "PASS");
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("AEMProject.wfcompletebtn.xpath"));
		Reporter.reportStep("Workflow complete button is clicked", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.notificationclose.xpath"));
		Reporter.reportStep("Notification close button is Clicked", "PASS");
		
		System.out.println("Assign Marketing Data is completed");
		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

//This method will process Code HTML from the notification details page
public AEM_PROJECTPAGE completeWorkflow3()throws Throwable{
	try{
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMproject.notificationbtn.xpath"));
		Reporter.reportStep("Notification icon is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMproject.notificviewdetails.xpath"));
		waitForPageLoad(2);
		Reporter.reportStep("View details link is selected", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.completewf3.xpath"));
		Reporter.reportStep("Code HTML notification is selected", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMProject.emailwfcheckboxcompletebtn.xpath"));
		Reporter.reportStep("complete button is clicked", "PASS");
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("AEMProject.wfcompletebtn.xpath"));
		Reporter.reportStep("Workflow complete button is clicked", "PASS");
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMProject.notificationclose.xpath"));
		Reporter.reportStep("Notification close button is Clicked", "PASS");
		System.out.println("Code HTML is completed");

		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

//This method will process Using External List from the notification details page
public AEM_PROJECTPAGE completeWorkflow4()throws Throwable{
	try{
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMproject.notificationbtn.xpath"));
		Reporter.reportStep("Notification icon is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMproject.notificviewdetails.xpath"));
		waitForPageLoad(2);
		Reporter.reportStep("View details link is selected", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.completewf4.xpath"));
		Reporter.reportStep("Using External List notification is selected", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMProject.emailwfcheckboxcompletebtn.xpath"));
		Reporter.reportStep("complete button is clicked", "PASS");
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("AEMProject.wfcompletebtn.xpath"));
		Reporter.reportStep("Workflow complete button is clicked", "PASS");
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMProject.notificationclose.xpath"));
		Reporter.reportStep("Notification close button is Clicked", "PASS");
		System.out.println("Choose external list is completed");
		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

//This method will process Choose StakeHolder Days from the notification details page
public AEM_PROJECTPAGE completeWorkflow5()throws Throwable{
	try{
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMproject.notificationbtn.xpath"));
		Reporter.reportStep("Notification icon is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMproject.notificviewdetails.xpath"));
		waitForPageLoad(2);
		Reporter.reportStep("View details link is selected", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.completewf5.xpath"));
		Reporter.reportStep("Choose stakeholder days notification is selected", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMProject.emailwfcheckboxcompletebtn.xpath"));
		Reporter.reportStep("complete button is clicked", "PASS");
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("AEMProject.wfcompletebtn.xpath"));
		Reporter.reportStep("Workflow complete button is clicked", "PASS");
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMProject.notificationclose.xpath"));
		Reporter.reportStep("Notification close button is Clicked", "PASS");
		System.out.println("Choose Stakeholders days is completed");

		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

//This method will process Requestor review from the notification details page
public AEM_PROJECTPAGE completeWorkflow6()throws Throwable{
	try{
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMproject.notificationbtn.xpath"));
		Reporter.reportStep("Notification icon is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMproject.notificviewdetails.xpath"));
		waitForPageLoad(2);
		Reporter.reportStep("View details link is selected", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.completewf6.xpath"));
		Reporter.reportStep("Requestor Review notification is selected", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMProject.emailwfcheckboxcompletebtn.xpath"));
		Reporter.reportStep("complete button is clicked", "PASS");
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("AEMProject.wfcompletebtn.xpath"));
		Reporter.reportStep("Workflow complete button is clicked", "PASS");
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMProject.notificationclose.xpath"));
		Reporter.reportStep("Notification close button is Clicked", "PASS");
		System.out.println("Requestor Review is completed");

		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

//This method will process Run and test Segmentation  from the notification details page
public AEM_PROJECTPAGE completeWorkflow7()throws Throwable{
	try{
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMproject.notificationbtn.xpath"));
		Reporter.reportStep("Notification icon is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMproject.notificviewdetails.xpath"));
		waitForPageLoad(2);
		Reporter.reportStep("View details link is selected", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.completewf7.xpath"));
		Reporter.reportStep("Run and test segmentation in Pardot notification is selected", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMProject.emailwfcheckboxcompletebtn.xpath"));
		Reporter.reportStep("complete button is clicked", "PASS");
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("AEMProject.wfcompletebtn.xpath"));
		Reporter.reportStep("Workflow complete button is clicked", "PASS");
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMProject.notificationclose.xpath"));
		Reporter.reportStep("Notification close button is Clicked", "PASS");
		System.out.println("Run and test segmentation in Pardot is completed");
		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

//This method will process 1 day from the notification details page
public AEM_PROJECTPAGE completeWorkflow8()throws Throwable{
	try{
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMproject.notificationbtn.xpath"));
		Reporter.reportStep("Notification icon is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMproject.notificviewdetails.xpath"));
		waitForPageLoad(2);
		Reporter.reportStep("View details link is selected", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.completewf8.xpath"));
		Reporter.reportStep("1 day notification is selected", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMProject.emailwfcheckboxcompletebtn.xpath"));
		Reporter.reportStep("complete button is clicked", "PASS");
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("AEMProject.wfcompletebtn.xpath"));
		Reporter.reportStep("Workflow complete button is clicked", "PASS");
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMProject.notificationclose.xpath"));
		Reporter.reportStep("Notification close button is Clicked", "PASS");
		System.out.println("1 day is completed");

		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

//This method will process the Run counts and generate list from the notification details page
public AEM_PROJECTPAGE completeWorkflow9()throws Throwable{
	try{
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMproject.notificationbtn.xpath"));
		Reporter.reportStep("Notification icon is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMproject.notificviewdetails.xpath"));
		waitForPageLoad(2);
		Reporter.reportStep("View details link is selected", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.completewf9.xpath"));
		Reporter.reportStep("Run counts and generate list is selected", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMProject.emailwfcheckboxcompletebtn.xpath"));
		Reporter.reportStep("complete button is clicked", "PASS");
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("AEMProject.wfcompletebtn.xpath"));
		Reporter.reportStep("Workflow complete button is clicked", "PASS");
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMProject.notificationclose.xpath"));
		Reporter.reportStep("Notification close button is Clicked", "PASS");
		System.out.println("Run counts and generate list is completed");

		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

//This method will process the Submit to testing from the notification details page
public AEM_PROJECTPAGE completeWorkflow10()throws Throwable{
	try{
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMproject.notificationbtn.xpath"));
		Reporter.reportStep("Notification icon is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMproject.notificviewdetails.xpath"));
		waitForPageLoad(2);
		Reporter.reportStep("View details link is selected", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.completewf10.xpath"));
		Reporter.reportStep("Submit to testing is selected", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMProject.emailwfcheckboxcompletebtn.xpath"));
		Reporter.reportStep("complete button is clicked", "PASS");
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("AEMProject.wfcompletebtn.xpath"));
		Reporter.reportStep("Workflow complete button is clicked", "PASS");
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMProject.notificationclose.xpath"));
		Reporter.reportStep("Notification close button is Clicked", "PASS");
		System.out.println("Submit to testing is completed");

		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

//This method will process the Review required from the notification details page
public AEM_PROJECTPAGE completeWorkflow11()throws Throwable{
	try{
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMproject.notificationbtn.xpath"));
		Reporter.reportStep("Notification icon is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMproject.notificviewdetails.xpath"));
		waitForPageLoad(2);
		Reporter.reportStep("View details link is selected", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.completewf11.xpath"));
		Reporter.reportStep("Review Required is selected", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMProject.emailwfcheckboxcompletebtn.xpath"));
		Reporter.reportStep("complete button is clicked", "PASS");
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("AEMProject.wfcompletebtn.xpath"));
		Reporter.reportStep("Workflow complete button is clicked", "PASS");
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMProject.notificationclose.xpath"));
		Reporter.reportStep("Notification close button is Clicked", "PASS");
		System.out.println("Review Required is completed");

		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

//This method will process the Email from the notification details page
public AEM_PROJECTPAGE completeWorkflow12()throws Throwable{
	try{
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMproject.notificationbtn.xpath"));
		Reporter.reportStep("Notification icon is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMproject.notificviewdetails.xpath"));
		waitForPageLoad(2);
		Reporter.reportStep("View details link is selected", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.completewf12.xpath"));
		Reporter.reportStep("Email is selected", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMProject.emailwfcheckboxcompletebtn.xpath"));
		Reporter.reportStep("complete button is clicked", "PASS");
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("AEMProject.wfcompletebtn.xpath"));
		Reporter.reportStep("Workflow complete button is clicked", "PASS");
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMProject.notificationclose.xpath"));
		Reporter.reportStep("Notification close button is Clicked", "PASS");
		System.out.println("Email is completed");

		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

//This method is to view Workflow step details
public AEM_PROJECTPAGE viewWfStepDetails()throws Throwable{
	try{
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("AEMproject.notificationbtn.xpath"));
		Reporter.reportStep("Notification icon is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("AEMproject.notificviewdetails.xpath"));
		waitForPageLoad(2);
		Reporter.reportStep("View details link is selected", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.firstchkboxslt.xpath"));
		Reporter.reportStep("First notification is selected", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.notificdetails.xpath"));
		Reporter.reportStep("Notification details is displaying", "PASS");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("AEMProject.notificationclose.xpath"));
		Reporter.reportStep("Notification close button is Clicked", "PASS");
		System.out.println("Workflow step details is viewed");

		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

//This method is to click and view Statistical view
public AEM_PROJECTPAGE showStatisticView()throws Throwable{
	try{
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("AEMProject.projectbackbtn.xpath"));
		waitForPageLoad(5);
		clickByXpath(prop.getProperty("AEMProject.statisticview.xpath"));
		Reporter.reportStep("Show Statistics view button is clicked", "PASS");
		waitForPageLoad(5);
		Reporter.reportStep("Statistics view is displaying", "PASS");
		waitForPageLoad(3);
		System.out.println("Statistics windows of each project is displayed");
		Reporter.reportStep("Statistics window of each project", "PASS");
		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}
		}