package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri News Overview Page
 * @author balaji
 *
 */
public class ESRI_NEWS_EsriStoriesPage extends ESRIWrappers{
	
	
	public ESRI_NEWS_EsriStoriesPage() throws Throwable{
		if(!VerifyTitle("Esri Stories"))
		Reporter.reportStep("This is not a Esri News Blog Esri Stories Page", "FAIL");
	}
	
	public ESRI_NEWS_EsriStoriesPage verifyPageHeader(String EsriStoriesHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewsEsriStoriesPage.esriStoriesHeader.xpath"), EsriStoriesHdr);
		return this;
	}
	
	public ESRI_NEWS_BlogsPage clickBlogsPageMenuLink() throws Throwable{
		clickByXpath(prop.getProperty("NewsOverviewPage.BlogsMenulink.xpath"));
		return new ESRI_NEWS_BlogsPage();
	}
	
	public ESRI_NEWS_OverviewPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new ESRI_NEWS_OverviewPage();
	}
	
	
}
