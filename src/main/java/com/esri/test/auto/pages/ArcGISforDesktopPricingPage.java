/**
 * 
 */
package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the ArcGIS Desktop Pricing Page
 * @author balajih
 *
 */
public class ArcGISforDesktopPricingPage extends ESRIWrappers{

	public ArcGISforDesktopPricingPage() throws Throwable{
		if(!VerifyTitle("Buy ArcGIS for Desktop")){
			Reporter.reportStep("This is not a ArcGIS Desktop Pricing Page", "FAIL");
		}
	}
	
	public ArcGISforDesktopPricingPage clickPricingTab() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopPricingPage.subMenuPricinglink.xpath"));
		return this;
	}
	
	public ArcGISforDesktopPricingPage verifyPricingHdr(String PricingHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("arcGISDesktopPricingPage.pricingHeader.xpath"), PricingHdr);
		return this;
	}
	
	public ArcGISforDesktopPricingPage clickShowHideAllLink() throws Throwable{
		clickByClassName(prop.getProperty("arcGISDesktopPricingPage.showhideAlllink.class"));
		return this;
	}
	
	public ArcGISforDesktopPricingPage clickBMEGILink() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopPricingPage.licenselvlBMEGIToggle.xpath"));
		return this;
	}
	
	public ArcGISforDesktopPricingPage clickMEADMLink() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopPricingPage.licenselvlMEADMToggle.xpath"));
		return this;
	}
	
	public ArcGISforDesktopPricingPage clickAADCLink() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopPricingPage.licenselvlAADCToggle.xpath"));
		return this;
	}
	
	public ArcGISforDesktopPricingPage clickWhitePaperDWNPDF() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopPricingPage.licenselvlWhitePaperDwnload.xpath"));
		return this;
	}
	
	public ArcGISforDesktopPricingPage verifyProgramsandELAHdr(String ProELAHdr) throws Throwable{
		VerifyTextByClassName(prop.getProperty("arcGISDesktopPricingPage.programsandELAHdr.class"), ProELAHdr);
		return this;
	}
	
	public ArcGISforDesktopFreeTrialPage clickFreeTrialLink() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopFreeTrialPage.FreeTrial.xpath"));
		return new ArcGISforDesktopFreeTrialPage();
	}
	
	public ArcGISforDesktopMainPage clickMainTab() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopMainPage.subMenuMainlink.xpath"));
		return new ArcGISforDesktopMainPage();
	}
}
