package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is a ArcGISDesktop Free Trial Page
 * @author balajih
 *
 */
public class ArcGISforDesktopFreeTrialPage extends ESRIWrappers{
	
	public ArcGISforDesktopFreeTrialPage() throws Throwable{
		if(!VerifyTitle("ArcGIS for Desktop | Free Trial"))
		Reporter.reportStep("This is not a ArcGISDesktop Free Trial Page", "FAIL");
	}
	
	public ArcGISforDesktopFreeTrialPage clickFreeTrialTab() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopFreeTrialPage.subMenuFreeTriallink.xpath"));
		return this;
	}
	
	public ArcGISforDesktopFreeTrialPage verifyFreeTrialHdr(String FreeTrialHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("arcGISDesktopFreeTrialPage.freeTrialHdr.xpath"), FreeTrialHdr);
		return this;
	}
	
	/*public ArcGISforDesktopFreeTrialPage navigateToFrame() throws Throwable{
		int iFrameSize = driver.findElementsByTagName("iframe").size();
		for (int i=0;i<=iFrameSize;i++){
			driver.switchTo().frame(i);
		}
		return this;
	}*/
	
	public ArcGISforDesktopFreeTrialPage navigateToFrame() throws Throwable{
		switchToFrameByIndex(0);
		System.out.println("We are inside the Frame");
		return this;
	}
	

}
