package com.esri.test.auto.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;
/**This is a Esri Cherwell SelfService Portal
 * @author Thenmozhi
 */
public class Cherwell_SS_IncidentPage extends ESRIWrappers{
	
	public Cherwell_SS_IncidentPage() throws Throwable{
		if(!VerifyTitle("Self-Service"))
			Reporter.reportStep("This is not a Esri Cherwell SelfService Incident Page", "FAIL");
		else
			System.out.println("SelfService Incident Page Launched Successfully!");
	}
	
	public Cherwell_SS_IncidentPage clickIncidentTab(String tab) throws Throwable{
		waitForPageLoad(3);
		clickButtonByXpath(prop.getProperty("CherwellDashboardPage.IncidentTab.xpath"),tab);
		return this;
	}
	
	public Cherwell_SS_IncidentPage SelectReportANewIncidentOption(String option) throws Throwable{
		waitForPageLoad(3);
		clickButtonByXpath(prop.getProperty("CherwellDashboardPage.ReportANewIncidentButton.xpath"),option);
		return this;
	}
	
	public Cherwell_SS_IncidentPage verifyIncidentHeader(String header) throws Throwable{
		waitForJsPageLoad(30);
		VerifyTextByXpath(prop.getProperty("CherwellIncidentPage.IncidentHeader.xpath"), header);
		return new Cherwell_SS_IncidentPage();
	}
	
	//---Alternate Info	
	public Cherwell_SS_IncidentPage enterAlternateInfo(String AlternateInfo) throws Throwable{
		waitForJsPageLoad(30);
		enterByXpath(prop.getProperty("CherwellIncidentPage.AlternateInfoTextBox.xpath"), AlternateInfo);
		return this;
	}
	
	//---Subject
	public Cherwell_SS_IncidentPage enterSubject(String Subject) throws Throwable{
		waitForJsPageLoad(30);
		enterByXpath(prop.getProperty("CherwellIncidentPage.SubjectTextBox.xpath"), Subject);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickSubjectLink(String Link) throws Throwable{
		waitForPageLoad(10);
		waitForJsPageLoad(30);
		clickLinkByXpath(prop.getProperty("CherwellIncidentPage.SubjectLink.xpath"), Link);
		return this;
	}
	
	public Cherwell_SS_IncidentPage verifySubjectWindowDialogMessage(String displayMessage) throws Throwable{
		waitForPageLoad(3);
		VerifyTextByXpath(prop.getProperty("CherwellIncidentPage.SubjectWindowDialogMessage.xpath"), displayMessage);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickSubjectWindowDialogOkButton(String Btn) throws Throwable{
		waitForPageLoad(3);
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.SubjectWindowDialogOKButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickSubjectWindowDialogCloseButton(String Btn) throws Throwable{
		waitForPageLoad(3);
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.SubjectWindowDialogCloseButton.xpath"), Btn);
		return this;
	}
	
	//---BriefDescription
	public Cherwell_SS_IncidentPage enterBriefDescription(String BriefDescription) throws Throwable{
		waitForPageLoad(10);
		waitForJsPageLoad(30);
		enterByXpath(prop.getProperty("CherwellIncidentPage.BriefDescriptionTextBox.xpath"), BriefDescription);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickBriefDescriptionLink(String Link) throws Throwable{
		waitForJsPageLoad(30);
		clickLinkByXpath(prop.getProperty("CherwellIncidentPage.BriefDescriptionLink.xpath"), Link);
		return this;
	}
	
	public Cherwell_SS_IncidentPage verifyBriefDescriptionWindowDialogMessage(String displayMessage) throws Throwable{
		waitForPageLoad(3);
		VerifyTextByXpath(prop.getProperty("CherwellIncidentPage.WindowDialogMessage.xpath"), displayMessage);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickBriefDescriptionWindowDialogOkButton(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.WindowDialogMessageOKButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickBriefDescriptionDialogCloseButton(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.WindowDialogMessageCloseButton.xpath"), Btn);
		return this;
	}
	
	//---ReportedBy	
	public Cherwell_SS_IncidentPage verifyReportedByText(String ReportedBy) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CherwellIncidentPage.ReportedByTextBox.xpath"), ReportedBy);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickReportedByFindRelatedItemButton(String data) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.ReportedByFindRelatedItemButton.xpath"), data);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickFReportedByGoToRelatedItemIconButton(String data) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.ReportedByGoToRelatedItemIcon.xpath"), data);
		return this;
	}
	
	
	//By clicking on "Find Related Item" button, displays a dialog window to search for employees. Which is common throughout the application.
	
	public Cherwell_SS_IncidentPage enterSearchKeyword(String SearchData) throws Throwable{
		enterByXpath(prop.getProperty("CherwellIncidentPage.DialogWindowSearchTextBox.xpath"), SearchData);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickDialogWindowGoButton(String data) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.DialogWindowGoButton.xpath"), data);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickDialogWindowFirstSearchItem(String data) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.DialogWindowFirstSearchItem.xpath"), data);
		return this;
	}
	
	//By clicking on "Go to Related Item" button, opens a new page.Verify the email present in there. Which is common throughout the application.
	
	public Cherwell_SS_IncidentPage verifyReportedByGoToRelatedItemEmail(String Email) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CherwellIncidentPage.ReportedByGoToRelatedItemVerifyEmail.xpath"), Email);
		return this;
	}
	
	//---Subscribers	
	public Cherwell_SS_IncidentPage enterSubscribers(String Subscribers) throws Throwable{
		enterByXpath(prop.getProperty("CherwellIncidentPage.DialogWindowSearchTextBox.xpath"), Subscribers);
		return this;
	}

	public Cherwell_SS_IncidentPage clickSubscribersLink(String data) throws Throwable{
		clickLinkByXpath(prop.getProperty("CherwellIncidentPage.SubscribersLink.xpath"), data);
		return this;
	}
	
	public Cherwell_SS_IncidentPage verifySubscribersWindowDialogMessage(String Message) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CherwellIncidentPage.SubscribersWindowDialogMessage.xpath"),Message);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickSubscribersWindowDialogOkButton(String data) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.SubscribersWindowDialogMessageOKButton.xpath"),data);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickSubscribersWindowDialogCloseButton(String data) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.SubscribersWindowDialogMessageCloseButton.xpath"),data);
		return this;
	}
	
	//---RequestForms DropDown Button
	public Cherwell_SS_IncidentPage clickRequestFormsDropdownButton(String DBtn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.RequestFormsDropdown.xpath"), DBtn);
		return this;
	}
	
	//---Selecting  MFT Site Request from RequestForms Dropdown Options
	//MFT Stands for MFT Site Request
	
	public Cherwell_SS_IncidentPage SelectMFTSiteRequest(String DValue) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.RequestForms_MFTSiteRequest.xpath"), DValue);
		return this;
	}	
	
	public Cherwell_SS_IncidentPage verifyServiceValue(String ServiceValue) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CherwellIncidentPage.MFT_ServiceValue.xpath"), ServiceValue);
		return this;
	}
	
	public Cherwell_SS_IncidentPage verifyCategoryValue(String CategoryValue) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CherwellIncidentPage.MFT_CategoryValue.xpath"), CategoryValue);
		return this;
	}
	
	public Cherwell_SS_IncidentPage verifySubCategoryValue(String SubCategoryValue) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CherwellIncidentPage.MFT_SubCategoryValue.xpath"), SubCategoryValue);
		return this;
	}
	
	public Cherwell_SS_IncidentPage enterRequestedFor(String  RequestedForName) throws Throwable{
		enterByXpath(prop.getProperty("CherwellIncidentPage.MFT_RequestedForInput.xpath"), RequestedForName);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickRequestedForFindRelatedItemButton(String  Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.MFT_RequestedFor_FindRelatedItemIcon.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickRequestedForGoToRelatedItemButton(String  Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.MFT_RequestedFor_GoToRelatedItemIcon.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickAccountRequestDropDownButton(String  DBtn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.MFT_AccountRequestDropDownButton.xpath"), DBtn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage SelectNew(String  NewOption) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.MFT_AccountRequestDropDownValue_New.xpath"), NewOption);
		return this;
	}
	
	public Cherwell_SS_IncidentPage SelectExisting(String ExistingOption) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.MFT_AccountRequestDropDownValue_Existing.xpath"), ExistingOption);
		return this;
	}
	
	//Date Format should be 3/10/2017 12:00 AM
	public Cherwell_SS_IncidentPage enterRequestedDate(String  RequestedDate) throws Throwable{
		enterByXpath(prop.getProperty("CherwellIncidentPage.MFT_RequestedDateTextBox.xpath"), RequestedDate);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickRequestedDateCalenderButton(String  CalenderBtn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.MFT_RequestedDateCalenderButtton.xpath"), CalenderBtn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage SelectDateFromCalender(String  CalenderDate) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.MFT_PickDateFromCalender.xpath"), CalenderDate);
		return this;
	}
	
	public Cherwell_SS_IncidentPage enterExternalParty(String  ExternalParty) throws Throwable{
		enterByXpath(prop.getProperty("CherwellIncidentPage.MFT_ExternalPartyTextBox.xpath"), ExternalParty);
		return this;
	}
	
	public Cherwell_SS_IncidentPage enterSharedContent(String  SharedContent) throws Throwable{
		enterByXpath(prop.getProperty("CherwellIncidentPage.MFT_SharedContentTextBox.xpath"),SharedContent);
		return this;
	}
	
	
	public Cherwell_SS_IncidentPage clickSharedContentLink(String  Link) throws Throwable{
		clickLinkByXpath(prop.getProperty("CherwellIncidentPage.MFT_SharedContentLink.xpath"), Link);
		return this;
	}
	
	public Cherwell_SS_IncidentPage verifySharedContentDialogMessage(String SharedContent) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CherwellIncidentPage.MFT_WindowDialogMessage.xpath"), SharedContent);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickSharedContentWindowDialogMessageOkButton(String  Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.MFT_WindowDialogMessageCloseButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickSharedContentWindowDialogMessageCloseButton(String  Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.MFT_WindowDialogMessageCloseButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage enterProject(String  Project) throws Throwable{
		enterByXpath(prop.getProperty("CherwellIncidentPage.MFT_ProjectTextBox.xpath"),Project);
		return this;
	}
	
	public Cherwell_SS_IncidentPage enterBuisnessJustification(String  BuisnessJustification) throws Throwable{
		enterByXpath(prop.getProperty("CherwellIncidentPage.MFT_BuisnessJustificationTextBox.xpath"),BuisnessJustification);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickMFTBuisnessJustificationLink(String  Link) throws Throwable{
		clickLinkByXpath(prop.getProperty("CherwellIncidentPage.MFT_BuisnessJustificationLink.xpath"), Link);
		return this;
	}
	
	public Cherwell_SS_IncidentPage verifyMFTBuisnessJustificationDialogMessage(String AlertText) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CherwellIncidentPage.WindowDialogMessage.xpath"), AlertText);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickMFTBuisnessJustificationWindowDialogMessageOkButton(String  Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.WindowDialogMessageOkButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickMFTBuisnessJustificationWindowDialogMessageCloseButton(String  Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.WindowDialogMessageCloseButton.xpath"), Btn);
		return this;
	}
	
	//This leads to new page and also asks for esri login flow. So we have to create a new page.
	public Cherwell_SS_IncidentPage clickForMoreInformationLink(String  Link) throws Throwable{
		clickLinkByXpath(prop.getProperty("CherwellIncidentPage.ForMoreInformationLink.xpath"), Link);
		return this;
	}
	
	//---RequestForms_Non Esri Requirement DropDown Option Related Fields
	//NER Stands for Non Esri Requirement
	
	public Cherwell_SS_IncidentPage SelectNonEsriRequirement(String Option) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.RequestForms_NonEsriRequirement.xpath"), Option);
		return this;
	}
	
	public Cherwell_SS_IncidentPage enterNEREquipmentOwner(String  EquipmentOwnerValue) throws Throwable{
		enterByXpath(prop.getProperty("CherwellIncidentPage.NER_EquipmentOwnerTextBox.xpath"),EquipmentOwnerValue);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickNEREquipmentOwnerFindRelatedItem(String  Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.NER_EquipmentOwnerFindRelatedItemButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickNEREquipmentOwnerGoToRelatedItem(String  Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.NER_EquipmentOwnerGoToRelatedItemButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage enterNERBuisnessJustification(String  BuisnessJustificationValue) throws Throwable{
		enterByXpath(prop.getProperty("CherwellIncidentPage.NER_BuisnessJustificationTextBox.xpath"),BuisnessJustificationValue);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickNERBuisnessJustification(String  Link) throws Throwable{
		clickLinkByXpath(prop.getProperty("CherwellIncidentPage.NER_BuisnessJustificationLink.xpath"), Link);
		return this;
	}
	
	public Cherwell_SS_IncidentPage verifyNERBuisnessJustificationDialogMessage(String BuisnessJustification) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CherwellIncidentPage.WindowDialogMessage.xpath"), BuisnessJustification);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickNERBuisnessJustificationWindowDialogMessageOk(String  Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.WindowDialogMessageOkButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickNERBuisnessJustificationWindowDialogMessageClose(String  Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.WindowDialogMessageCloseButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickNERIAgreeCheckBox(String  CheckBox) throws Throwable{
		clickRadioBtnByXpath(prop.getProperty("CherwellIncidentPage.NER_IAgreeCheckBox.xpath"), CheckBox);
		return this;
	}
	
	public Cherwell_SS_IncidentPage enterNERTypeOfEquipment(String  TypeOfEquipmentValue) throws Throwable{
		enterByXpath(prop.getProperty("CherwellIncidentPage.NER_TypeOfEquipmentTextBox.xpath"),TypeOfEquipmentValue);
		return this;
	}
	
	//---RequestForms_SAP Account Request DropDown Option Related Fields
	//SAP Stands for SAP Account Request
	
	public Cherwell_SS_IncidentPage SelectSAPAccountRequestOption(String  Option) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.RequestForms_SAPAccountRequest.xpath"), Option);
		return this;
	}
	
	//*This method is 
	public Cherwell_SS_IncidentPage enterSAPJustification(String SAPJustificationValue) throws Throwable{
		enterByXpath(prop.getProperty("CherwellIncidentPage.SAP_JustificationTextBox.xpath"),SAPJustificationValue);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickSAPJustification(String  Link) throws Throwable{
		clickLinkByXpath(prop.getProperty("CherwellIncidentPage.SAP_JustificationLink.xpath"), Link);
		return this;
	}
	
	public Cherwell_SS_IncidentPage verifySAPJustificationDialogMessage(String AlertText) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CherwellIncidentPage.WindowDialogMessage.xpath"), AlertText);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickSAPJustificationWindowDialogMessageOk(String  Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.WindowDialogMessageOkButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickSAPJustificationWindowDialogMessageClose(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.WindowDialogMessageCloseButton.xpath"), Btn);
		return this;
	}
	
	//*This method is 
	public Cherwell_SS_IncidentPage enterColleagueName(String ColleagueNameValue) throws Throwable{
		enterByXpath(prop.getProperty("CherwellIncidentPage.SAP_ColleagueNameTextBox.xpath"),ColleagueNameValue);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickColleagueNameFindRelatedItem(String  Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.SAP_ColleagueNameFindRelatedItem.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickColleagueNameGoToRelatedItemButton(String  data) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.SAP_ColleagueNameGoToRelatedItem.xpath"), data);
		return this;
	}
	
	//---RequestForms_Facilities Request Or Issue DropDown Option Related Fields
	//FRI Stands for Facilities Request Or Issue
	
	public Cherwell_SS_IncidentPage SelectFRIFacilitiesRequestOrIssueOption(String  Option) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.FRI_RequestForms_FacilitiesRequestOrIssue.xpath"), Option);
		return this;
	}
	
	//*This method
	public Cherwell_SS_IncidentPage clickFRIBuildingDropDownButton(String  DropDownBtn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.FRI_BuildingDropDownButton.xpath"), DropDownBtn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage selectFRIBuildingOption(String Option) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.FRI_BuildingDropDownValue.xpath"), Option);
		return this;
	}
	
	public Cherwell_SS_IncidentPage enterFRIAttachFormTextBox(String AttachFormValue) throws Throwable{
		enterByXpath(prop.getProperty("CherwellIncidentPage.FRI_AttachFormTextBox.xpath"), AttachFormValue);
		return this;
	}
	
	//IncidentForm Common Functionality
	
	public Cherwell_SS_IncidentPage clickSave(String Btn) throws Throwable{
		waitForJsPageLoad(30);
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.SaveButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickAbandon(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.AbandonButton.xpath"), Btn);
		return this;
	}
	
	//Verifying Alert Text and clik Ok Button.
	public Cherwell_SS_IncidentPage verifyAbandonAlertText(String AlertText) throws Throwable{
		Alert alert = driver.switchTo().alert();
		String alertText=alert.getText();
		VerifyTextAlertBox(alertText);
		clickOkAlertBox(AlertText);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickRefresh(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.RefreshButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickDelete(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.DeleteButton.xpath"), Btn);
		return this;
	}
	
	//Cherwell DownPanel
	
	//This method click the expand button in downpanel
	public Cherwell_SS_IncidentPage clickDownPaneExpand(String Expand) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.Incidents_ExpandButton.xpath"), Expand);
		return this;
	}
	//This method click the collapse button in downpanel
	public Cherwell_SS_IncidentPage clickDownPaneCollapse(String Collapse) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.Incidents_CollapseButton.xpath"), Collapse);
		return this;
	}
	
	//Cherwell DownPanel-Email/Notes Tab
	
	public Cherwell_SS_IncidentPage clickEmailOrNotes(String Tab) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.EmailNotesTab.xpath"), Tab);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickNewJournal(String Button) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.NewJournalButton.xpath"), Button);
		return this;
	}
	
	public Cherwell_SS_IncidentPage enterJournalNote(String data) throws Throwable{
		enterByXpath(prop.getProperty("CherwellIncidentPage.JournalNoteTextBox.xpath"), data);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickPriorityDropdown(String DropDownBtn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.PriorityDropdownButton.xpath"), DropDownBtn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage SelectHighPriority(String HighOption) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.HighPriorityOption.xpath"), HighOption);
		return this;
	}
	
	public Cherwell_SS_IncidentPage SelectNormalPriority(String NormalOption) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.NormalPriorityOption.xpath"), NormalOption);
		return this;
	}
	
	public Cherwell_SS_IncidentPage SelectLowPriority(String LowOption) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.LowPriorityOption.xpath"), LowOption);
		return this;
	}
	
	
	//Cherwell DownPanel-Journals Tab
	
	public Cherwell_SS_IncidentPage clickJournals(String Tab) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.JournalsTab.xpath"), Tab);
		return this;
	}
	
	//Cherwell DownPanel-Reminder Tab

	public Cherwell_SS_IncidentPage clickReminder(String Tab) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.ReminderTab.xpath"), Tab);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickNewReminderButton(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.NewReminderButton.xpath"), Btn);
		return this;
	}
	
	//Below Methods are common for Email,Journals & Reminder Tab.
	
	public Cherwell_SS_IncidentPage clickAllDropDownButtonButton(String DropDown) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.AllDropDownButton.xpath"), DropDown);
		return this;
	}
	
	public Cherwell_SS_IncidentPage SelectOption10(String Option) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.SelectOption10.xpath"), Option);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickPageFirstButton(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.PageFirstButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickPagePreviousButton(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.PagePreviousButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickPageNextButton(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.PageNextButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickPageLastButton(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.PageLastButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickViewDropDownButton(String DropDown) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.ViewDropDownButton.xpath"), DropDown);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickFormViewButton(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.FormViewButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickGridViewButton(String DropDown) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.GridViewButton.xpath"), DropDown);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickHorizontalGridOrView(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.HorizontalGridOrViewButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickVerticalGridOrView(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.VerticalGridOrViewButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickTotalRecordsCount(String count) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CherwellIncidentPage.RecordsTotalCount.xpath"), count);
		return this;
	}
	
	//Cherwell DownPanel-RelatedIncidents Tab
	
	public Cherwell_SS_IncidentPage clickRelatedIncidents(String tab) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.RelatedIncidentsTab.xpath"), tab);
		return this;
	}
	
	//Cherwell DownPanel-ThisCustomerIncidents Tab
	
	public Cherwell_SS_IncidentPage clickThisCustomerIncidents(String tab) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.ThisCustomerIncidentsTab.xpath"), tab);
		return this;
	}
	
	//Below methods are common for Related Incidents and This customer incidents.
	
	public Cherwell_SS_IncidentPage clickAddAnExistingIncident(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.AddAnExistingIncidentButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickUnlinkExistingIncident(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.UnlinkExistingIncidentButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickGoToIncident(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.GoToIncidentButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickQuickViewIncidentRecord(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.QuickViewIncidentRecordButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage clickAllDropDown(String DropDown) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.AllDropDownButton.xpath"), DropDown);
		return this;
	}
	
	public Cherwell_SS_IncidentPage SelectDropdownValue10(String option) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.SelectOption10.xpath"), option);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickPageFirst(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.PageFirstButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickPagePrevious(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.PagePreviousButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickPageNext(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.PageNextButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickPageLast(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.PageLastButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickViewDropDown(String DropDown) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.ViewDropDownButton.xpath"), DropDown);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickFormView(String option) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.FormViewButton.xpath"), option);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickGridView(String option) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.GridViewButton.xpath"), option);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickHorizontalGridOrView(String option) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.HorizontalGridOrViewButton.xpath"), option);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickVerticalGridOrView(String option) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.VerticalGridOrViewButton.xpath"), option);
		return this;
	}
	
	public Cherwell_SS_IncidentPage verifyTotalRecords(String count) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CherwellIncidentPage.RecordsTotalCount.xpath"), count);
		return this;
	}
	
	//Cherwell DownPanel-Problem Tab
	
	public Cherwell_SS_IncidentPage ClickProblem(String tab) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.ProblemTab.xpath"), tab);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickAddAnExistingProblem(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.AddAnExistingProblemButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickUnlinkExistingIncident(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.UnlinkExistingProblemButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickGoToProblem(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.GoToProblemButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickQuickViewIncidentRecord(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.QuickViewProblemRecordButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickGoToFirst(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.PROBGoToFirstButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickGoToPrevious(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.PROBGoToPreviousButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickGoToNext(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.PROBGoToNextButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickGoToLast(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.PROBGoToLastButton.xpath"), Btn);
		return this;
	}
	
	//Cherwell DownPanel-ChangeRequest Tab
	
	public Cherwell_SS_IncidentPage ClickChangeRequest(String tab) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.ChangeRequestTab.xpath"), tab);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickAddAnExistingCR(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.AddAnExistingCRButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickUnlinkExistingCR(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.UnlinkExistingCRButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickGoToCR(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.GoToCRButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickQuickViewCR(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.QuickViewCRButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickCRGoToFirst(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.CRGoToFirstButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickCRGoToPrevious(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.CRGoToPreviousButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickCRGoToNext(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.CRGoToNextButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_IncidentPage ClickCRGoToLast(String Btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellIncidentPage.CRGoToLastButton.xpath"), Btn);
		return this;
	}
	
	public Cherwell_SS_ComputerRequest ClickHome(String Tab) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellDashboardPage.HomeTab.xpath"), Tab);
		return new Cherwell_SS_ComputerRequest();
	}
	
}
