package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri News Blogs Page
 * @author balaji
 *
 */
public class ESRI_NEWS_BlogsPage extends ESRIWrappers{
	
	
	public ESRI_NEWS_BlogsPage() throws Throwable{
		waitForPageLoad(4);
		if(!VerifyTitle("Blogs"))
		Reporter.reportStep("This is not a Esri News Blogs Page", "FAIL");
	}
	
	public ESRI_NEWS_BlogsPage verifyPageHeader(String BlogHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewsEsriBlogPage.esriBlogHeader.xpath"), BlogHdr);
		return this;
	}
	
	public ESRI_NEWS_MediaRelationsPage clickMediaRelationsPageMenuLink() throws Throwable{
		clickByXpath(prop.getProperty("NewsOverviewPage.MediaRelationsMenulink.xpath"));
		return new ESRI_NEWS_MediaRelationsPage();
	}
	
	public ESRI_NEWS_OverviewPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new ESRI_NEWS_OverviewPage();
	}
	
	
}
