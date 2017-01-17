package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri News Publications Page
 * @author balaji
 *
 */
public class ESRI_NEWS_PublicationsPage extends ESRIWrappers{
	
	
	public ESRI_NEWS_PublicationsPage() throws Throwable{
		if(!VerifyTitle("Publications"))
		Reporter.reportStep("This is not a Esri News Publications Page", "FAIL");
	}
	
	public ESRI_NEWS_PublicationsPage verifyPageHeader(String PubHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewsReleasePage.pressHeader.xpath"), PubHdr);
		return this;
	}
	
	public ESRI_NEWS_PublicationsArcNewsPage clickArcNewsLink() throws Throwable{
		clickByXpath(prop.getProperty("NewsPublicationsPage.clickArcNewsCurrentIssue.xpath"));
		return new ESRI_NEWS_PublicationsArcNewsPage();
	}
	
	public ESRI_NEWS_PublicationsArcUserPage clickArcUserLink() throws Throwable{
		clickByXpath(prop.getProperty("NewsPublicationsPage.clickArcUserCurrentIssue.xpath"));
		return new ESRI_NEWS_PublicationsArcUserPage();
	}
	
	public ESRI_NEWS_PublicationsArcWatchPage clickArcWatchLink() throws Throwable{
		clickByXpath(prop.getProperty("NewsPublicationsPage.clickArcWatchCurrentIssue.xpath"));
		return new ESRI_NEWS_PublicationsArcWatchPage();
	}
	
	public ESRI_NEWS_EsriStoriesPage clickEsriStoriesPageMenuLink() throws Throwable{
		clickByXpath(prop.getProperty("NewsOverviewPage.EsriStoriesMenulink.xpath"));
		return new ESRI_NEWS_EsriStoriesPage();
	}
	
	public ESRI_NEWS_OverviewPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new ESRI_NEWS_OverviewPage();
	}
	
	
}
