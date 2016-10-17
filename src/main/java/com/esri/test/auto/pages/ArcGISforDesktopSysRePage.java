package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is a ArcGis Desktop System Requirement Page
 * @author balajih
 * 
 */
public class ArcGISforDesktopSysRePage extends ESRIWrappers {
	
	public ArcGISforDesktopSysRePage() throws Throwable{
		if(!VerifyTitle("ArcGIS for Desktop | System Requirements"));
		Reporter.reportStep("This is not a ArcGIS Desktop System Requirement Page", "FAIL");		
	}
	
	public ArcGISforDesktopSysRePage clickSystemRequirementTab() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopReqPage.sysreqHeader.xpath"));
		return this;
	}
	
	public ArcGISforDesktopSysRePage verifySysReqHdr(String SysReqHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("arcGISDesktopReqPage.sysreqHeader.xpath"), SysReqHdr);
		return this;
	}
	//Clicking on the ArcMap System Requirement Link
	public ArcmapSysReqPage clickArcmapSysReqLink() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopReqPage.arcMapSysReqDwnload.xpath"));
		return new ArcmapSysReqPage();
	}
	//Clicking on the ArcGIS Pro system Requirement Link
	public ArcGISPROSysReqPage clickArcGISProSysReqLink() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopReqPage.arcGISProSysReqDwnload.xpath"));
		return new ArcGISPROSysReqPage();
	}
	
	public ArcGISforDesktopPricingPage clickPricingTab() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopPricingPage.subMenuPricinglink.xpath"));
		return new ArcGISforDesktopPricingPage();
	}
	
	public ArcGISforDesktopMainPage clickMainTab() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopMainPage.subMenuMainlink.xpath"));
		return new ArcGISforDesktopMainPage();
	}

}
