package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri News In the News Page
 * @author balaji
 *
 */
public class ESRI_NEWS_IntheNewsPage extends ESRIWrappers{
	
	
	public ESRI_NEWS_IntheNewsPage() throws Throwable{
		if(!VerifyTitle("In the News"))
		Reporter.reportStep("This is not a Esri News In the News Page", "FAIL");
	}
	
	public ESRI_NEWS_IntheNewsPage verifyPageHeader(String InNewsHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewsIntheNewsPage.intheNewsHeader.xpath"), InNewsHdr);
		return this;
	}
	
	public ESRI_NEWS_IntheNewsPage enterSearchKey(String userIdata) throws Throwable{
		enterByXpath(prop.getProperty("NewsIntheNewsPage.SearchInput.xpath"), userIdata);
		return this;
	}
	
	public ESRI_NEWS_IntheNewsPage verifyFilterResultsCountDisplay(String FilterIResult) throws Throwable{
		VerifyTextByClassName(prop.getProperty("NewsIntheNewsPage.SearchResultFilter.classname"),FilterIResult);
		return this;
	}
	
	public ESRI_NEWS_PublicationsPage clickPublicationsPageMenuLink() throws Throwable{
		clickByXpath(prop.getProperty("NewsOverviewPage.PublicationsMenulink.xpath"));
		return new ESRI_NEWS_PublicationsPage();
	}
	
	public ESRI_NEWS_OverviewPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new ESRI_NEWS_OverviewPage();
	}
	
	
}
