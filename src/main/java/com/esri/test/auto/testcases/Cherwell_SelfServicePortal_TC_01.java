package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.CherwellBeta_DashboardPage;
import com.esri.test.auto.pages.CherwellBeta_LoginPage;
import com.esri.test.auto.pages.CherwellStaging_LoginPage;
import com.esri.test.auto.wrappers.ESRIWrappers;
import com.esri.test.auto.wrappers.GenericWrappers;
/**This is the Testcase for Cherwell SelfServicePortal Incident Page Positive Scenario
 * @author Thenmozhi
 *
 */
public class Cherwell_SelfServicePortal_TC_01 extends ESRIWrappers {

	@Parameters({"browsers"})
	@BeforeClass
	public void startTestCase() {
		dataSheetName="Cherwell_SelfService_TC_01";
		testCaseName="Cherwell_SelfServicePortal_Positive Scenarios";
		testDescription="Cherwell_SelfServicePortal_Positive Scenarios";
	}
		
	@Test(dataProvider="fetchdata")
	public void cherwellSSPositiveScenarios(String CherwellStagingSelfServiceURL,String CherwellBetaSelfServiceURl,String CherwellBetaSelfServiceURLC,
			String useWindowsLoginLink,String Username,String Password,String UserNameDomain,String SignInButton,String StagingDashboardHeader,
			String StagingDashBoardElementName,String DashBoardheaderName,String IncidentTab,String ReportANewIncidentOption,String IncidentHeader,
			String AlternateInfo,String Subject,String SubjectLink,String OkBtn,String CloseBtn,String BriefDescription,String BriefDescriptionLink,
			String SaveBtn,String SubscriberEmail,String AbandonBtn,String AbandonAlertText,String RequestFormDBtn,String MFTOption,String MFTServiceValue,
			String MFTCategoryValue,String MFTSubCategoryValue,String RequestedForName,String AccountRequestDBtn,String NewOption,String ExistingOption,
			String Date,String ExternalPartyValue,String SharedContentValue,String ProjectValue,String BuisnessJustificationValue,
			String NEROption,String NERServiceValue,String NERCategoryValue,String NERSubCategoryValue,String EquipmentOwnerValue,String NERAgree,
			String SAPOption,String SAPServiceValue,String SAPCategoryValue,String SAPSubCategoryValue,String SAPJustificationValue,String ColleagueNameValue,
			String FRIOption,String FRIServiceValue,String FRICategoryValue,String FRISubCategoryValue,String FRIBuilding,String OptionA
			)throws Throwable{
			
			//If BETA environment is used use the below steps for login
			if(new GenericWrappers().browserName.equalsIgnoreCase("chrome")){
				openbrowser(CherwellBetaSelfServiceURLC);
				new CherwellBeta_LoginPage()
				.clickUseWindowsLogin(useWindowsLoginLink);
			}
			else{
				openbrowser(CherwellBetaSelfServiceURl);
				new CherwellBeta_LoginPage()
				.clickUseWindowsLogin(useWindowsLoginLink)
				.enterCredentials(UserNameDomain, Password);					
			}
			
			//Report a new incident or request with mandatory fields
			new CherwellBeta_DashboardPage()
			.verifyDashBoardHeader(DashBoardheaderName)
			
			//Report an incident with mandatory fields
			.clickIncidentTab(IncidentTab)
			.SelectReportANewIncidentOption(ReportANewIncidentOption)
			.verifyIncidentHeader(IncidentHeader)
			.enterSubject(Subject)
			.enterBriefDescription(BriefDescription)
			.clickSave(SaveBtn)
			
/*			//Report an incident with non-required fields			
			.clickIncidentTab(IncidentTab)
			.SelectReportANewIncidentOption(ReportANewIncidentOption)
			.verifyIncidentHeader(IncidentHeader)
			.clickIncidentTab(IncidentTab)
			.SelectReportANewIncidentOption(ReportANewIncidentOption)
			.enterAlternateInfo(AlternateInfo)
			.enterSubject(Subject)
			.clickSubjectLink(SubjectLink)
			.verifySubjectWindowDialogMessage(Subject)
			.clickSubjectWindowDialogOkButton(OkBtn)
			.enterBriefDescription(BriefDescription)
			.clickBriefDescriptionLink(BriefDescriptionLink)
			.verifyBriefDescriptionWindowDialogMessage(BriefDescription)
			.clickBriefDescriptionWindowDialogOkButton(OkBtn)
			.clickSave(SaveBtn)
			
			//Report an incident or request with non-required fields
			.clickIncidentTab(IncidentTab)
			.SelectReportANewIncidentOption(ReportANewIncidentOption)
			.verifyIncidentHeader(IncidentHeader)
			.enterAlternateInfo(AlternateInfo)
			.enterSubscribers(SubscriberEmail)
			.enterBriefDescription(BriefDescription)
			.clickSave(SaveBtn)
			
			//Report an incident or request with required and non-required field
			.clickIncidentTab(IncidentTab)
			.SelectReportANewIncidentOption(ReportANewIncidentOption)
			.verifyIncidentHeader(IncidentHeader)
			.enterAlternateInfo(AlternateInfo)
			.enterSubject(Subject)
			.enterBriefDescription(BriefDescription)
			.enterSubscribers(SubscriberEmail)
			.enterBriefDescription(BriefDescription)
			.clickSave(SaveBtn)
			
			//Verify the abandon button
			.clickIncidentTab(IncidentTab)
			.SelectReportANewIncidentOption(ReportANewIncidentOption)
			.verifyIncidentHeader(IncidentHeader)
			.enterAlternateInfo(AlternateInfo)
			.clickAbandon(AbandonBtn)
			.verifyAbandonAlertText(AbandonAlertText)
			
			//Create an incident and verify that upon Request Forms - MFT Site Request related fields are displayed 
			.clickIncidentTab(IncidentTab)
			.SelectReportANewIncidentOption(ReportANewIncidentOption)
			.verifyIncidentHeader(IncidentHeader)
			.enterSubject(Subject)
			.enterBriefDescription(BriefDescription)
			.clickRequestFormsDropdownButton(RequestFormDBtn)
			.SelectMFTSiteRequest(MFTOption)
			.verifyServiceValue(MFTServiceValue)
			.verifyCategoryValue(MFTCategoryValue)
			.verifySubCategoryValue(MFTSubCategoryValue)
			.enterRequestedFor(RequestedForName)
			.clickAccountRequestDropDownButton(AccountRequestDBtn)
			.SelectNew(NewOption)
			.clickAccountRequestDropDownButton(AccountRequestDBtn)
			.SelectExisting(ExistingOption)
			.enterRequestedDate(Date)
			.enterExternalParty(ExternalPartyValue)
			.enterProject(ProjectValue)
			.enterSharedContent(SharedContentValue)
			.enterBuisnessJustification(BuisnessJustificationValue)
			.clickSave(SaveBtn)	
			
			//Create an incident and verify that upon Request Forms - Non Esri Requirement related fields are displayed
			.clickIncidentTab(IncidentTab)
			.SelectReportANewIncidentOption(ReportANewIncidentOption)
			.verifyIncidentHeader(IncidentHeader)
			.enterSubject(Subject)
			.enterBriefDescription(BriefDescription)
			.clickRequestFormsDropdownButton(RequestFormDBtn)
			.SelectNonEsriRequirement(NEROption)
			.verifyServiceValue(NERServiceValue)
			.verifyCategoryValue(NERCategoryValue)
			.verifySubCategoryValue(NERSubCategoryValue)
			.enterNEREquipmentOwner(EquipmentOwnerValue)
			.enterNERBuisnessJustification(BuisnessJustificationValue)
			.clickNERIAgreeCheckBox(NERAgree)
			.clickSave(SaveBtn)
			
			//Create an incident and verify that upon Request Forms - SAP Account Request related fields are displayed
			.clickIncidentTab(IncidentTab)
			.SelectReportANewIncidentOption(ReportANewIncidentOption)
			.verifyIncidentHeader(IncidentHeader)
			.enterSubject(Subject)
			.enterBriefDescription(BriefDescription)
			.clickRequestFormsDropdownButton(RequestFormDBtn)
			.SelectSAPAccountRequestOption(SAPOption)
			.verifyServiceValue(SAPServiceValue)
			.verifyCategoryValue(SAPCategoryValue)
			.verifySubCategoryValue(SAPSubCategoryValue)
			.enterSAPJustification(SAPJustificationValue)
			.enterColleagueName(ColleagueNameValue)
			.clickSave(SaveBtn)
			
			//Create an incident and verify that upon Request Forms - Facilities Request Or Issue related fields are displayed
			.clickIncidentTab(IncidentTab)
			.SelectReportANewIncidentOption(ReportANewIncidentOption)
			.verifyIncidentHeader(IncidentHeader)
			.enterSubject(Subject)
			.enterBriefDescription(BriefDescription)
			.clickRequestFormsDropdownButton(RequestFormDBtn)
			.SelectFRIFacilitiesRequestOrIssueOption(FRIOption)
			.verifyServiceValue(FRIServiceValue)
			.verifyCategoryValue(FRICategoryValue)
			.verifySubCategoryValue(FRISubCategoryValue)
			.clickFRIBuildingDropDownButton(FRIBuilding)
			.selectFRIBuildingOption(OptionA)
			.clickSave(SaveBtn)*/
			
			;
		}	
}
