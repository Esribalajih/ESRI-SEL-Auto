package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri News Overview Page
 * @author balaji
 *
 */
public class ESRI_NEWS_PublicationsArcWatchPage extends ESRIWrappers{
	
	
	public ESRI_NEWS_PublicationsArcWatchPage() throws Throwable{
		if(!VerifyTitle("404 Not Found"))//Need to change it to Page Title as Arc Watch
		Reporter.reportStep("This is not a Esri News Arc Watch Page", "FAIL");
	}
	
	public ESRI_NEWS_PublicationsPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new ESRI_NEWS_PublicationsPage();
	}
	
	
}
