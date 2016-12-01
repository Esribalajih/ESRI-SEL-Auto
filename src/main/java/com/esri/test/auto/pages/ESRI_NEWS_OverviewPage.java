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
	
	
}
