package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri News Releases Page
 * @author balaji
 *
 */
public class ESRI_NEWS_ReleasePage extends ESRIWrappers{
	
	
	public ESRI_NEWS_ReleasePage() throws Throwable{
		if(!VerifyTitle("Press Releases"))
		Reporter.reportStep("This is not a Esri News Press Releases Page", "FAIL");
	}
	
	public ESRI_NEWS_ReleasePage verifyPageHeader(String RHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewsReleasePage.pressHeader.xpath"), RHdr);
		return this;
	}
	
	public ESRI_NEWS_ReleasePage enterSearchKey(String userdata) throws Throwable{
		enterByXpath(prop.getProperty("NewsReleasePage.SearchInput.xpath"), userdata);
		return this;
	}
	
	public ESRI_NEWS_ReleasePage verifyFilterResultscountDisplay(String FilterResult) throws Throwable{
		VerifyTextByClassName(prop.getProperty("NewsReleasePage.SearchResultFilter.classname"),FilterResult);
		return this;
	}
	
	public ESRI_NEWS_IntheNewsPage clickIntheNewsPageMenuLink() throws Throwable{
		clickByXpath(prop.getProperty("NewsOverviewPage.intheNewsMenulink.xpath"));
		return new ESRI_NEWS_IntheNewsPage();
	}
	
	public ESRI_NEWS_OverviewPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new ESRI_NEWS_OverviewPage();
	}
	
	
}
