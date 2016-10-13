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
		clickByXpath(prop.getProperty("arcGISDesktopPage.subMenuPricinglink.xpath"));
		return this;
	}
	
	public ArcGISforDesktopPricingPage verifyPricingHdr(String PricingHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("arcGISDesktopPage.pricingHeader.xpath"), PricingHdr);
		return this;
	}
	
	public ArcGISforDesktopPricingPage clickShowHideAllLink() throws Throwable{
		clickByClassName(prop.getProperty("arcGISDesktopPage.showhideAlllink.class"));
		return this;
	}
	
	public ArcGISforDesktopPricingPage clickBMEGILink() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopPage.licenselvlBMEGIToggle.xpath"));
		return this;
	}
	
	public ArcGISforDesktopPricingPage clickMEADMLink() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopPage.licenselvlMEADMToggle.xpath"));
		return this;
	}
	
	public ArcGISforDesktopPricingPage clickAADCLink() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopPage.licenselvlAADCToggle.xpath"));
		return this;
	}
	
	public ArcGISforDesktopPricingPage clickWhitePaperDWNPDF() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopPage.licenselvlWhitePaperDwnload.xpath"));
		return this;
	}
	
	public ArcGISforDesktopPricingPage verifyProgramsandELAHdr(String ProELAHdr) throws Throwable{
		VerifyTextByClassName(prop.getProperty("arcGISDesktopPage.programsandELAHdr.class"), ProELAHdr);
		return this;
	}
	
	public ArcGISforDesktopMainPage clickMainTab() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopPage.subMenuMainlink.xpath"));
		return new ArcGISforDesktopMainPage();
	}
}
