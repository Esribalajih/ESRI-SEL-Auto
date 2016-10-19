package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;
/**This is a ArcGISDesktop Main Page
 * @author balajih
 *
 */
public class ArcGISforDesktopMainPage extends ESRIWrappers{
	
	
	public ArcGISforDesktopMainPage() throws Throwable{
		if(!VerifyTitle("ArcGIS for Desktop"))
		Reporter.reportStep("This is not a ArcGIS for Desktop Main Page", "FAIL");
	}
	
	public ArcGISforDesktopMainPage clickMainTab() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopMainPage.subMenuMainlink.xpath"));
		return this;
	}
	
	public ArcGISforDesktopMainPage verifyMainHeader(String mainHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("arcGISDesktopMainPage.mainHeader.xpath"), mainHdr);
		return this;
	}
	
	public ArcGISforDesktopMainPage verifyMainTopic2(String Mtopic2) throws Throwable{
		VerifyTextByXpath(prop.getProperty("arcGISDesktopMainPage.MTopic2.xpath"), Mtopic2);
		return this;
	}
	
	public ArcGISforDesktopMainPage verifyMainTopic3(String Mtopic3) throws Throwable{
		VerifyTextByXpath(prop.getProperty("arcGISDesktopMainPage.MTopic3.xpath"),Mtopic3);
		return this;
	}
	
	public ArcGISforDesktopMainPage verifyMainTopic4(String Mtopic4) throws Throwable{
		VerifyTextByXpath(prop.getProperty("arcGISDesktopMainPage.MTopic4.xpath"), Mtopic4);
		return this;
	}
	
	public ArcGISforDesktopMainPage verifyMainTopic5(String Mtopic5) throws Throwable{
		VerifyTextByXpath(prop.getProperty("arcGISDesktopMainPage.MTopic5.xpath"), Mtopic5);
		return this;
	}
	
	public ArcGISforDesktopMainPage verifyMainTopic6(String Mtopic6) throws Throwable{
		VerifyTextByXpath(prop.getProperty("arcGISDesktopMainPage.MTopic6.xpath"), Mtopic6);
		return this;
	}
	
	public ArcGISforDesktopFreeTrialPage clickFreeTrialLink() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopFreeTrialPage.FreeTrial.xpath"));
		return new ArcGISforDesktopFreeTrialPage();
	}
	
	public ArcGISforDesktopFeaturesPage clickFeaturesTab() throws Throwable {
		clickByXpath(prop.getProperty("arcGISDesktopFeaturesPage.subMenuFeatureslink.xpath"));
		return new ArcGISforDesktopFeaturesPage();
	}
	
	public ArcGISforDesktopPricingPage clickPricingTab() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopPricingPage.subMenuPricinglink.xpath"));
		return new ArcGISforDesktopPricingPage();
	}
	
	public ArcGISforDesktopSysRePage clickDesktopSysReTab() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopReqPage.subMenuSysReqlink.xpath"));
		return new ArcGISforDesktopSysRePage();
	}
	
}
