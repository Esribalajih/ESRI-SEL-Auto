package com.esri.test.auto.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author Mohamed This is the Project page of AEM
 *
 */
public class AEM_PROJECTPAGE extends ESRIWrappers {

	public AEM_PROJECTPAGE() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("AEM Projects")) {
			Reporter.reportStep("This is not a AEM Projects page", "FAIL");
		} else
			System.out.println("AEM Projects page Launched Successfully");
	}

	// Clicking on Project tab
	public AEM_PROJECTPAGE clickOnProject() throws Throwable {
		try {

			clickByXpath(prop.getProperty("AEMProject.main.xpath"));
			Reporter.reportStep("Project Tab is clicked", "PASS");
			waitForPageLoad(4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This method will change user to Admin
	public AEM_PROJECTPAGE changeUserAsAdmin() throws Throwable {
		try {

			clickByXpath(prop.getProperty("AEMProject.userchange.xpath"));
			clickByXpath(prop.getProperty("AEMProject.userselectdropdown.xpath"));
			waitForPageLoad(4);
			clickByXpath(prop.getProperty("AEMProject.userselect.xpath"));
			clickByXpath(prop.getProperty("AEMProject.userchangeokbtn.xpath"));
			waitForPageLoad(4);
			System.out.println("User changed to Admin");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This Method will Create new project
	public AEM_PROJECTPAGE createNewProject(String projecttitle) throws Throwable {
		try {

			clickByXpath(prop.getProperty("AEMProject.createnewproject.xpath"));
			Reporter.reportStep("Create new project is selected", "PASS");
			waitForPageLoad(2);
			clickByXpath(prop.getProperty("AEMProject.esriassetrequest.xpath"));
			Reporter.reportStep("Esri asset request is selected", "PASS");
			waitForPageLoad(2);
			clickByXpath(prop.getProperty("AEMProject.esriassetrequestnext.xpath"));
			Reporter.reportStep("Next button is clicked", "PASS");
			waitForPageLoad(2);
			enterByXpath(prop.getProperty("AEMProject.esriprojecttitle.xpath"), projecttitle);
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This method will create New workflow request inside project folder
	public AEM_PROJECTPAGE createNewWorkflowRequest(String wfname, String wfdesc, String cnum, String iuse)
			throws Throwable {
		try {
			clickByXpath(prop.getProperty("AEMProject.workflowaddbtn.xpath"));
			Reporter.reportStep("Workflow add button is clicked", "PASS");
			waitForPageLoad(3);
			clickByXpath(prop.getProperty("AEMProject.esriemailrequestworkflow.xpath"));
			Reporter.reportStep("ESRI email request workflow is selected", "PASS");
			waitForPageLoad(3);
			clickByXpath(prop.getProperty("AEMProject.esriemailrequestworkflownextbtn.xpath"));
			Reporter.reportStep("Next button is clicked", "PASS");
			waitForPageLoad(3);
			enterByXpath(prop.getProperty("AEMProject.esriemailrequestworkflowtitle.xpath"), wfname);
			Reporter.reportStep("Work flow title is entered", "PASS");
			waitForPageLoad(2);
			enterByXpath(prop.getProperty("AEMProject.esriemailrequestworkflowdescription.xpath"), wfdesc);
			Reporter.reportStep("Work flow description is entered", "PASS");
			waitForPageLoad(2);
			enterByXpath(prop.getProperty("AEMProject.esriemailrequestworkflowchargenmbr.xpath"), cnum);
			Reporter.reportStep("Workflow charge number is entered", "PASS");
			waitForPageLoad(2);
			enterByXpath(prop.getProperty("AEMProject.esriemailrequestworkflowimediateuse.xpath"), iuse);
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This Method will click on Notification button and to view all
	// notification details
	public AEM_PROJECTPAGE notificationInbox() throws Throwable {
		try {
			clickByXpath(prop.getProperty("AEMproject.notificationbtn.xpath"));
			Reporter.reportStep("Notification icon is clicked", "PASS");
			waitForPageLoad(3);
			clickByXpath(prop.getProperty("AEMproject.notificviewdetails.xpath"));
			Reporter.reportStep("View details link is selected", "PASS");
			waitForPageLoad(4);
			Reporter.reportStep("Notification page is displaying with newly created workflow", "PASS");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This method will process Update asset from the notification details page
	public AEM_PROJECTPAGE completeWorkflow1(String path) throws Throwable {
		try {
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

			// presenceOfElement(prop.getProperty("AEMProject.emailwfuploadassetokbtn.xpath"));

			clickByXpath(prop.getProperty("AEMProject.emailwfuploadassetokbtn.xpath"));
			Reporter.reportStep("Done button is clicked", "PASS");
			enterByXpath(prop.getProperty("AEMProject.pathuploadfield.xpath"), path);
			waitForPageLoad(3);
			clickByXpath(prop.getProperty("AEMProject.wfcompletebutton.xpath"));
			Reporter.reportStep("Workflow complete button is clicked", "PASS");
			waitForPageLoad(4);
			clickByXpath(prop.getProperty("AEMProject.notificationclose.xpath"));
			Reporter.reportStep("Notification close button is Clicked", "PASS");
			System.out.println("Update Asset path is completed");
			Reporter.reportStep("Update Asset path is completed", "PASS");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	private void presenceOfElement(String property) {
		// TODO Auto-generated method stub

	}

	// This method will process Assign Marketing data from the notification
	// details page
	public AEM_PROJECTPAGE completeWorkflow2() throws Throwable {
		try {
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This method will process Code HTML from the notification details page
	public AEM_PROJECTPAGE completeWorkflow3() throws Throwable {
		try {
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

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This method will process Using External List from the notification
	// details page
	public AEM_PROJECTPAGE completeWorkflow4() throws Throwable {
		try {
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This method will process Choose StakeHolder Days from the notification
	// details page
	public AEM_PROJECTPAGE completeWorkflow5() throws Throwable {
		try {
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

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This method will process Requestor review from the notification details
	// page
	public AEM_PROJECTPAGE completeWorkflow6() throws Throwable {
		try {
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

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This method will process Run and test Segmentation from the notification
	// details page
	public AEM_PROJECTPAGE completeWorkflow7() throws Throwable {
		try {
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This method will process 1 day from the notification details page
	public AEM_PROJECTPAGE completeWorkflow8() throws Throwable {
		try {
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

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This method will process the Run counts and generate list from the
	// notification details page
	public AEM_PROJECTPAGE completeWorkflow9() throws Throwable {
		try {
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

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This method will process the Submit to testing from the notification
	// details page
	public AEM_PROJECTPAGE completeWorkflow10() throws Throwable {
		try {
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

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This method will process the Review required from the notification
	// details page
	public AEM_PROJECTPAGE completeWorkflow11() throws Throwable {
		try {
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

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This method will process the Email from the notification details page
	public AEM_PROJECTPAGE completeWorkflow12() throws Throwable {
		try {
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

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This method is to view Workflow step details
	public AEM_PROJECTPAGE viewWfStepDetails() throws Throwable {
		try {
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

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// This method is to click and view Statistical view
	public AEM_PROJECTPAGE showStatisticView() throws Throwable {
		try {
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public void clickCreateButton() throws Throwable {
		clickByXpath(prop.getProperty("Homepage.projectCreateBtn.xpath"));
		waitForPageLoad(2);
	}

	public void clickCreateProjectButton() throws Throwable {
		clickByXpath(prop.getProperty("Homepage.createprojectsBtn.xpath"));
		waitForPageLoad(2);
	}

	public void clickESRIAssertRequestFolder() throws Throwable {
		try {
			waitForPageLoad(2);
			// coral-panel[@class='coral-Panel
			// is-selected']/coral-panel-content/div/coral-masonry/coral-masonry-item[3]/coral-card/div/coral-card-content/coral-card-title
			int folderCount = driver
					.findElements(By
							.xpath("//coral-panel[@class='coral-Panel is-selected']/coral-panel-content/div/coral-masonry/coral-masonry-item"))
					.size();
			System.out.println(folderCount);
			for (int count = 1; count <= folderCount; count++) {
				String folderName = driver.findElement(By
						.xpath("//coral-panel[@class='coral-Panel is-selected']/coral-panel-content/div/coral-masonry/coral-masonry-item["
								+ count + "]/coral-card/div/coral-card-content/coral-card-title"))
						.getText();
				System.out.println(folderName);
				if (folderName.equalsIgnoreCase("Esri Asset request")) {
					System.out.println(folderName);
					clickByXpath(
							"//coral-panel[@class='coral-Panel is-selected']/coral-panel-content/div/coral-masonry/coral-masonry-item["
									+ count + "]/coral-card/div/coral-card-content/coral-card-title");
					Reporter.reportStep("Esri Asset request Folder is clicked", "PASS");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickNextButton() throws Throwable {
		clickByXpath(prop.getProperty("Homepage.nextBtn.xpath"));
		waitForPageLoad(2);
	}

	public void enterProjectBasicTitle(String basictitle) throws Throwable {
		enterByXpath(prop.getProperty("projectpage.enterBasictitle.xpath"), basictitle);
		waitForPageLoad(2);
	}

	public void enterProjectAdvTitle(String advtitle) throws Throwable {
		enterByXpath(prop.getProperty("projectpage.enterAdvtitle.xpath"), advtitle);
		waitForPageLoad(2);
	}

	public void clickAdvancedTab() throws Throwable {
		clickByXpath(prop.getProperty("projectpage.advancedTab.xpath"));
		waitForPageLoad(2);
	}

	public void clickProjectOpenBtn() throws Throwable {
		clickByXpath(prop.getProperty("projectpage.openProjectBtn.xpath"));
	}

	public AEM_PROJECTPAGE createProjectEsriAssertRequest(String projectBasicTitle, String projectAdvTitle)
			throws Throwable {
		clickCreateButton();
		clickCreateProjectButton();
		clickESRIAssertRequestFolder();
		clickNextButton();
		enterProjectBasicTitle(projectBasicTitle);
		clickAdvancedTab();
		enterProjectAdvTitle(projectAdvTitle);
		clickCreateButton();
		clickProjectOpenBtn();
		return this;
	}

	public void clickAddWorkflow() throws Throwable {
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("projectpage.addWorkflowBtn.xpath"));
	}

	public void clickEmailRequestFlow() throws Throwable {
		try {
			waitForPageLoad(2);
			// coral-panel[@class=coral-Panel
			// is-selected]/coral-panel-content/div/div/coral-masonry/coral-masonry-item[2]/coral-card/div/coral-card-content/coral-card-title
			int folderCount = driver
					.findElements(By
							.xpath("//coral-panel[@class='coral-Panel is-selected']/coral-panel-content/div/div/coral-masonry/coral-masonry-item"))
					.size();
			System.out.println(folderCount);
			for (int count = 1; count <= folderCount; count++) {
				String folderName = driver.findElement(By
						.xpath("//coral-panel[@class='coral-Panel is-selected']/coral-panel-content/div/div/coral-masonry/coral-masonry-item["
								+ count + "]/coral-card/div/coral-card-content/coral-card-title"))
						.getText();
				System.out.println(folderName);
				if (folderName.equalsIgnoreCase("Esri Email Request Workflow")) {
					System.out.println(folderName);
					clickByXpath(
							"//coral-panel[@class='coral-Panel is-selected']/coral-panel-content/div/div/coral-masonry/coral-masonry-item["
									+ count + "]/coral-card/div/coral-card-content/coral-card-title");
					Reporter.reportStep("Esri Email Request Workflow", "PASS");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterEmailWrkflwTitle(String emailworkflowtitle) throws Throwable {
		waitForPageLoad(2);
		enterByXpath(prop.getProperty("projectpage.emailWorkflowTitle.xpath"), emailworkflowtitle);
	}

	public void enterEmailWrkflwDesc(String emailworkflowDesc) throws Throwable {
		enterByXpath(prop.getProperty("projectpage.emailWorkflowDesc.xpath"), emailworkflowDesc);
	}

	public void enterEmailWrkflwsendDate() throws Throwable {
		waitForPageLoad(2);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		enterByXpath(prop.getProperty("projectpage.emailWorkflowSendDate.xpath"), dateFormat.format(date));
	}

	public void enterEmailWrkflwChargeNo(String chargeNumber) throws Throwable {
		waitForPageLoad(1);
		enterByXpath(prop.getProperty("projectpage.emailWorkflowChargeNo.xpath"), chargeNumber);
	}
	
	public void enterEmailWrkflwMgrJustification(String managerJustification) throws Throwable {
		waitForPageLoad(1);
		enterById(prop.getProperty("projectpage.emailWorkflowMgrJust.id"), managerJustification);
	}

	public void enterEmailWrkflwImmediateUse(String immediateUse) throws Throwable {
		enterByXpath(prop.getProperty("projectpage.emailWorkflowImmUse.xpath"), immediateUse);
	}

	public void clickBrowseAndUploadFile(String location) throws Throwable {
		clickByXpath(prop.getProperty("projectpage.emailWorkflowBrowseBtn.xpath"));
		uploadFile(location);
	}

	public void clickSubmitButton() throws Throwable {
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("projectpage.submitBtn.xpath"));
	}

	public AEM_PROJECTPAGE createEmailRequestWorkflow(String emailworkflowtitle, String emailworkflowDesc,
			String location,String managerJustify ,String chargeNumber, String immediateUse) throws Throwable {
		clickAddWorkflow();
		clickEmailRequestFlow();
		clickNextButton();
		enterEmailWrkflwTitle(emailworkflowtitle);
		enterEmailWrkflwDesc(emailworkflowDesc);
		clickBrowseAndUploadFile(location);
		enterEmailWrkflwsendDate();
		enterEmailWrkflwMgrJustification(managerJustify);
		enterEmailWrkflwChargeNo(chargeNumber);
		enterEmailWrkflwImmediateUse(immediateUse);
		clickSubmitButton();
		waitForPageLoad(3);
		return this;
	}

	public AEM_PROJECTPAGE clickNotificationIcon() throws Throwable {
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("projectpage.notificationIcon.xpath"));
		return this;
	}

	public AEM_INBOX_PAGE clickNotificationViewAllLink() throws Throwable {
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("projectpage.notificationViewAllLink.xpath"));
		return new AEM_INBOX_PAGE();
	}

	public AEM_PROJECTPAGE verifyWorkflowRunningStatus() throws Throwable {
		waitForPageLoad(2);
		String runningStatus = getTextByXpath(prop.getProperty("projectpage.runningWorkflowStatus.xpath"));
		String noOfWorkflow = getTextByXpath(prop.getProperty("projectpage.noOfRunningWorkflow.xpath"));
		System.out.println(runningStatus + "    " + noOfWorkflow);
		if (runningStatus.equalsIgnoreCase("100%")) {
			Reporter.reportStep("Working Running Status: " + runningStatus + " with " + noOfWorkflow + ".", "PASS");
		} else {
			Reporter.reportStep("Working Running Status: " + runningStatus + " with " + noOfWorkflow + ".", "FAIL");
		}
		return this;
	}

	public AEM_PROJECTPAGE verifyWorkflowCompleteStatus() throws Throwable {
		waitForPageLoad(2);
		String completedStatus = getTextByXpath(prop.getProperty("projectpage.completedWorkflowStatus.xpath"));
		String noOfWorkflow = getTextByXpath(prop.getProperty("projectpage.noOfCompletedWorkflow.xpath"));
		System.out.println(completedStatus + "    " + noOfWorkflow);
		if (completedStatus.equalsIgnoreCase("100%")) {
			Reporter.reportStep("Working Running Status: " + completedStatus + " with " + noOfWorkflow + ".", "PASS");
		} else {
			Reporter.reportStep("Working Running Status: " + completedStatus + " with " + noOfWorkflow + ".", "FAIL");
		}
		return this;
	}

	public AEM_PROJECTPAGE clickProjectFolderNameHeader(String projectName) throws Throwable {
		waitForPageLoad(2);
		clickByXpath("//coral-button-label[text()='" + projectName + "']"); 
		return this;
	}

	public AEM_PROJECTPAGE selectProjectsfolder() throws Throwable {
		waitForPageLoad(2);
		clickByXpath("//coral-selectlist-item[text()='Projects']");
		return this;
	}
	
	// Delete Newly created folder
			public AEM_PROJECTPAGE deleteProjectCreatedFolder(String fName) throws Throwable {
				try {
					waitForPageLoad(5);
					int folderCount = driver
							.findElements(By
									.xpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item"))
							.size();
					System.out.println(folderCount);
					scrollIntoViewByXpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["+folderCount+"]");
					waitForPageLoad(5);
					folderCount = driver
							.findElements(By
									.xpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item"))
							.size();
					System.out.println(folderCount);
					for (int count = 1; count <= folderCount; count++) {
						String folderName = driver.findElement(
								By.xpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["
										+ count + "]/coral-card/div/coral-card-content/coral-card-title"))
								.getText();
						System.out.println(folderName+"   "+fName );
						if (folderName.equalsIgnoreCase(fName)) {
							System.out.println(folderName);
							/*mouseHoverByXpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["
									+ count + "]/coral-card/div/coral-card-content/coral-card-title");
							mouseHoverByXpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["
									+ count + "]//coral-quickactions/button[1]");*/
							clickByJavaScript("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["
									+ count + "]//coral-quickactions/button[1]");
							waitForPageLoad(3);
							clickByXpath("//coral-button-label[text()='Delete Project']");
							waitForPageLoad(2);
							//clickByXpath("//form[@id='cq-project-delete-projects-form']/coral-checkbox[2]/input");
							clickByXpath("//input[@name='deleteProjectAssetFolder']");
							clickByXpath("//coral-dialog-footer[@class='coral-Dialog-footer']/button[2]");
							Reporter.reportStep("Test Project Folder is deleted", "PASS");
							break;
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				return this;
			}
	

}