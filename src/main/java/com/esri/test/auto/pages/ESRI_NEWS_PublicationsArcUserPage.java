package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri News Overview Page
 * @author balaji
 *
 */
public class ESRI_NEWS_PublicationsArcUserPage extends ESRIWrappers{
	
	
	public ESRI_NEWS_PublicationsArcUserPage() throws Throwable{
		if(!VerifyTitle("404 Not Found"))//Need to change it to Page Title as Arc User
		Reporter.reportStep("This is not a Esri News Arc User Page", "FAIL");
	}
	
	public ESRI_NEWS_PublicationsPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new ESRI_NEWS_PublicationsPage();
	}
	
	
}
