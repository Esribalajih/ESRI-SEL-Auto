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
	
	public TestYourInsightAppMainPage verifyPopupHeader(String popupHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("InsightsAppPage.verifypopupHeader.xpath"), popupHdr);
		return this;
	}
	
	public TestYourInsightAppMainPage clickStartExploring() throws Throwable{
		clickByXpath(prop.getProperty("InsightsAppPage.verifypopupHeader.xpath"));
		return this;
	}
	
	public TestYourInsightAppMainPage verifyZipcodeLabel(String zipcodeLabel) throws Throwable{
		VerifyTextByXpath(prop.getProperty("InsightsAppPage.verifyZipcodelabel.xpath"), zipcodeLabel);
		return this;
	}

	public TestYourInsightAppMainPage enterZipcode(String ZipCode) throws Throwable{
		enterByXpath(prop.getProperty("InsightsAppPage.ènterZipcode.xpath"),ZipCode);
		return this;
	}
	
	public TestYourInsightAppMainPage selectPopulationDensity() throws Throwable{
		clickByXpath(prop.getProperty("InsightsAppPage.selectPopulationDensityTopic.xpath"));
		return this;
	}
	
	public TestYourInsightAppMainPage selectMediaAge() throws Throwable{
		clickByXpath(prop.getProperty("InsightsAppPage.selectMedianAgeTopic.xpath"));
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
		clickByXpath(prop.getProperty("InsightsAppPage.clickSeeResultsButton.xpath"));
		return this;
	}
	
	public TestYourInsightAppMainPage clickDriveTime() throws Throwable{
		clickByXpath(prop.getProperty("InsightsAppPage.clickDriveTime.xpath"));
		return this;
	}
	
	public TestYourInsightAppMainPage clickRingBuffer() throws Throwable{
		clickByXpath(prop.getProperty("InsightsAppPage.clickRingBuffer.xpath"));
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
		mouseHoverByXpath(prop.getProperty("InsightsAppPage.EmailWidget.id"));
		return this;
	}
	
	public TestYourInsightAppMainPage clickEmailCloseIcon() throws Throwable{
		clickById(prop.getProperty("InsightsAppPage.clickemailCloseButton.id"));
		return this;
	}
	
	public EsriDataPage clickExploreEsriDatalink() throws Throwable {
		clickByLinkText(prop.getProperty("InsightsAppPage.clickexploreEsriDatalink.linktext"));
		return new EsriDataPage();
	}
	
}
