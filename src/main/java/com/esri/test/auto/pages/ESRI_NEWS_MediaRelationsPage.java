package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri News Media Relations Page
 * @author balaji
 *
 */
public class ESRI_NEWS_MediaRelationsPage extends ESRIWrappers{
	
	
	public ESRI_NEWS_MediaRelationsPage() throws Throwable{
		if(!VerifyTitle("Media Relations"))
		Reporter.reportStep("This is not a Esri News Media Relations Page", "FAIL");
	}
	
	public ESRI_NEWS_MediaRelationsPage verifyPageHeader(String MRHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewsMediaRelationsPage.esriMediaRelationsHeader.xpath"), MRHdr);
		return this;
	}
		
	public ESRI_NEWS_OverviewPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new ESRI_NEWS_OverviewPage();
	}
	
	
}
