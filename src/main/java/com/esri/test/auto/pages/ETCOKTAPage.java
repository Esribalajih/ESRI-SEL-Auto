package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the ESRI OKTA SSO Sign in Page
 * @author balajih
 *
 */
public class ETCOKTAPage extends ESRIWrappers {
	
	public ETCOKTAPage() throws Throwable{
		if(!VerifyTitle("Esri Dev - Sign In")){
			Reporter.reportStep("This is not the Esri Dev OKTA Sign in Page", "FAIL");
		}
	}
	
	public ETCOKTAPage enterSSOUserName(String uName) throws Throwable{
		enterByXpath(prop.getProperty("ETCOKTAPage.Username.xpath"), uName);
		return this;
	}
	
	public ETCOKTAPage enterSSOPassword(String passWord) throws Throwable{
		enterByXpath(prop.getProperty("ETCOKTAPage.Password.xpath"), passWord);
		return this;
	}
	
	public ETCDashboardPage clickSigninBtn(String signInBtn) throws Throwable{
		clickButtonByXpath(prop.getProperty("ETCOKTAPage.Signinbutton.xpath"), signInBtn);
		return new ETCDashboardPage();
	}
	

}
