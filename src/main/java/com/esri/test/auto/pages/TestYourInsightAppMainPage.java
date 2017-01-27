package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Test Your Insight Application
 * @author balajih
 *
 */
public class TestYourInsightAppMainPage extends ESRIWrappers{
	
	public TestYourInsightAppMainPage() throws Throwable{
		if(!VerifyTitle("Location Strategy"))
			Reporter.reportStep("This is not a Test Your Insight Application Home Page", "FAIL");
	}
	
	public TestYourInsightAppMainPage clickExplorePopupDialog() throws Throwable{
		//clickByXpath(prop.getProperty("InsightsAppPage.clickExplorePopup.xpath"));
		clickByCssSelector(prop.getProperty("InsightsAppPage.clickExplorePopup.cssselector"));
		return this;
	}
	
	public TestYourInsightAppMainPage verifyExplorePopupHeader(String popupHdr) throws Throwable{
		waitForPageLoad(5);
		VerifyTextByCssSelector(prop.getProperty("InsightsAppPage.verifypopupHeader.cssselector"), popupHdr);
		return this;
	}
	
	public TestYourInsightAppMainPage clickStartExploring() throws Throwable{
		clickByCssSelector(prop.getProperty("InsightsAppPage.clickStartExploring.cssselector"));
		return this;
	}
	
	public TestYourInsightAppMainPage verifyZipcodeLabel(String zipcodeLabel) throws Throwable{
		VerifyTextByCssSelector(prop.getProperty("InsightsAppPage.verifyZipcodelabel.cssselector"), zipcodeLabel);
		return this;
	}

	public TestYourInsightAppMainPage enterZipcode(String ZipCode) throws Throwable{
		enterByCssSelector(prop.getProperty("InsightsAppPage.ènterZipcode.cssselector"),ZipCode);
		return this;
	}
	
	public TestYourInsightAppMainPage selectPopulationDensity() throws Throwable{
		clickByCssSelector(prop.getProperty("InsightsAppPage.selectPopulationDensityTopic.cssselector"));
		return this;
	}
	
	public TestYourInsightAppMainPage selectMediaAge() throws Throwable{
		clickByCssSelector(prop.getProperty("InsightsAppPage.selectMedianAgeTopic.cssselector"));
		return this;
	}
	
	public TestYourInsightAppMainPage selectMonthlyCreditCharges() throws Throwable{
		clickByXpath(prop.getProperty("InsightsAppPage.selectMonthlyCreditCardChargesTopic.xpath"));
		return this;
	}
	
	public TestYourInsightAppMainPage selectOnlineBanking() throws Throwable{
		clickByXpath(prop.getProperty("InsightsAppPage.selectOnlineBankingUsersTopic.xpath"));
		return this;
	}
	
	public TestYourInsightAppMainPage selectFinancialOptimists() throws Throwable{
		clickByXpath(prop.getProperty("InsightsAppPage.selectFinancialOptimistsTopic.xpath"));
		return this;
	}
	
	public TestYourInsightAppMainPage selectGradProfess() throws Throwable{
		clickByXpath(prop.getProperty("InsightsAppPage.selectGradandProfessDegTopic.xpath"));
		return this;
	}
	
	public TestYourInsightAppMainPage selectManufacturingWorkspace() throws Throwable{
		clickByXpath(prop.getProperty("InsightsAppPage.selectManufacturingWorkspaceTopic.xpath"));
		return this;
	}
	
	public TestYourInsightAppMainPage selectCollageFootball() throws Throwable{
		clickByXpath(prop.getProperty("InsightsAppPage.selectCollageFootbalViewersTopic.xpath"));
		return this;
	}
	
	public TestYourInsightAppMainPage clickSeeResultsButton() throws Throwable{
		waitTillElementclickableByCssSelector(prop.getProperty("InsightsAppPage.clickSeeResultsButton.cssselector"));
		return this;
	}
	
	public TestYourInsightAppMainPage clickDriveTime() throws Throwable{
		waitTillElementclickableByXpath(prop.getProperty("InsightsAppPage.clickDriveTime.xpath"));
		return this;
	}
	
	public TestYourInsightAppMainPage clickRingBuffer() throws Throwable{
		waitTillElementclickableByXpath(prop.getProperty("InsightsAppPage.clickRingBuffer.xpath"));
		return this;
	}
	
	public TestYourInsightAppMainPage clickFacebookbutton() throws Throwable{
		clickById(prop.getProperty("InsightsAppPage.facebookWidget.id"));
		return this;
	}
	
	public TestYourInsightAppMainPage clickTwitterbutton() throws Throwable{
		clickById(prop.getProperty("InsightsAppPage.twitterWidget.id"));
		return this;
	}
	
	public TestYourInsightAppMainPage clickLinkedINbutton() throws Throwable{
		clickById(prop.getProperty("InsightsAppPage.linkedinWidget.id"));
		return this;
	}
	
	public TestYourInsightAppMainPage mousehoverEmailIcon() throws Throwable{
		mouseHoverById(prop.getProperty("InsightsAppPage.EmailWidget.id"));
		return this;
	}
	
	public TestYourInsightAppMainPage clickEmailCloseIcon() throws Throwable{
		clickByXpath(prop.getProperty("InsightsAppPage.clickemailCloseButton.xpath"));
		return this;
	}
	
	public EsriDataPage clickExploreEsriDatalink() throws Throwable {
		clickByLinkText(prop.getProperty("InsightsAppPage.clickexploreEsriDatalink.linktext"));
		return new EsriDataPage();
	}
	
	public TestYourInsightAppMainPage clickContactUsButton() throws Throwable {
		clickByXpath(prop.getProperty("InsightsAppPage.clickcontactusbutton.xpath"));
		return this;
	}
	
	//Switch to Contact US popup frame
	public TestYourInsightAppMainPage switchtoContactUs() throws Throwable {
		switchToFrameByXpath(prop.getProperty("InsightsAppPage.switchtoContactUsFrame.xpath"));
		return this;
	}
	
	public TestYourInsightAppMainPage verifyContactUsHeader(String ContactUSHdr) throws Throwable {
		VerifyTextByClassName(prop.getProperty("InsightsAppPage.ContactUsFrameHeader.class"),ContactUSHdr);
		return this;
	}
	
	public TestYourInsightAppMainPage enterContactUSFirstName(String ContactUSFname) throws Throwable {
		enterByXpath(prop.getProperty("InsightsAppPage.ContactUsFirstNametext.xpath"),ContactUSFname);
		return this;
	}
	
	public TestYourInsightAppMainPage enterContactUSLastName(String ContactUSLname) throws Throwable {
		enterByXpath(prop.getProperty("InsightsAppPage.ContactUsLastNametext.xpath"),ContactUSLname);
		return this;
	}
	
	public TestYourInsightAppMainPage enterContactUSEmail(String ContactUSEmail) throws Throwable {
		enterByXpath(prop.getProperty("InsightsAppPage.ContactUsEmailtext.xpath"),ContactUSEmail);
		return this;
	}
	
	public TestYourInsightAppMainPage enterContactUSCompanyinput(String ContactUSComp) throws Throwable {
		enterByXpath(prop.getProperty("InsightsAppPage.ContactUsCompanyRequiredtext.xpath"),ContactUSComp);
		return this;
	}
	
	public TestYourInsightAppMainPage selectContactUSCompany(int compSel) throws Throwable {
		selectByIdWithindex(prop.getProperty("InsightsAppPage.ContactUsCompanyRequireddropdown1.id"),compSel);
		return this;
	}
	
	public TestYourInsightAppMainPage clickSubmitBtn() throws Throwable {
		clickById(prop.getProperty("InsightsAppPage.ContactUsSubmitButton.id"));
		return this;
	}
	
	public TestYourInsightAppMainPage verifyContactUSThankyou(String Tyou) throws Throwable {
		VerifyTextByXpath(prop.getProperty("InsightsAppPage.ContactUsThankYouMessage.xpath"),Tyou);
		return this;
	}
	
	public EsriCareerPrivacyStatePage clickContactUSPrivacyPolicylink() throws Throwable {
		clickByLinkText(prop.getProperty("InsightsAppPage.ContactUsPrivacyPolicy.linktext"));
		return new EsriCareerPrivacyStatePage();
	}
	
	public TestYourInsightAppMainPage clickContactUSCloseBtn() throws Throwable {
		clickByXpath(prop.getProperty("InsightsAppPage.ContactUsclosebutton.xpath"));
		return this;
	}
	
	
}
