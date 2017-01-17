package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri News Overview Page
 * @author balaji
 *
 */
public class ESRI_NEWS_OverviewPage extends ESRIWrappers{
	
	
	public ESRI_NEWS_OverviewPage() throws Throwable{
		if(!VerifyTitle("home page esri"))
		Reporter.reportStep("This is not a Esri News Overview Home Page", "FAIL");
	}
	
	public ESRI_NEWS_OverviewPage verifyMainHeader(String mainHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("NewsOverviewPage.header.xpath"), mainHdr);
		return this;
	}
	
	public ESRI_NEWS_OverviewPage enterSearchKey(String userdata) throws Throwable{
		enterByClassName(prop.getProperty("NewsOverviewPage.searchTextfield.classname"), userdata);
		return this;
	}
	
	public ESRI_NEWS_OverviewPage clickSearchBtn() throws Throwable{
		clickByClassName(prop.getProperty("NewsOverviewPage.SearchButton.classname"));
		return this;
	}
	
	public ESRI_NEWS_ReleasePage clickReleasesPageMenuLink() throws Throwable{
		clickByXpath(prop.getProperty("NewsOverviewPage.ReleasesMenulink.xpath"));
		return new ESRI_NEWS_ReleasePage();
	}
	
	public ESRI_NEWS_IntheNewsPage clickIntheNewsPageMenuLink() throws Throwable{
		clickByXpath(prop.getProperty("NewsOverviewPage.intheNewsMenulink.xpath"));
		return new ESRI_NEWS_IntheNewsPage();
	}
	
	public ESRI_NEWS_PublicationsPage clickPublicationsPageMenuLink() throws Throwable{
		clickByXpath(prop.getProperty("NewsOverviewPage.PublicationsMenulink.xpath"));
		return new ESRI_NEWS_PublicationsPage();
	}
	
	public ESRI_NEWS_EsriStoriesPage clickEsriStoriesPageMenuLink() throws Throwable{
		clickByXpath(prop.getProperty("NewsOverviewPage.EsriStoriesMenulink.xpath"));
		return new ESRI_NEWS_EsriStoriesPage();
	}
	
	public ESRI_NEWS_BlogsPage clickBlogsPageMenuLink() throws Throwable{
		clickByXpath(prop.getProperty("NewsOverviewPage.BlogsMenulink.xpath"));
		return new ESRI_NEWS_BlogsPage();
	}
	
	public ESRI_NEWS_MediaRelationsPage clickMediaRelationsPageMenuLink() throws Throwable{
		clickByXpath(prop.getProperty("NewsOverviewPage.MediaRelationsMenulink.xpath"));
		return new ESRI_NEWS_MediaRelationsPage();
	}
	
}
