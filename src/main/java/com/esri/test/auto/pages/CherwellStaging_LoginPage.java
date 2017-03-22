/**
 * 
 */
package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author thenmozhis
 *
 */
public class CherwellStaging_LoginPage extends ESRIWrappers {
	
	public CherwellStaging_LoginPage() throws Throwable{
		if(!VerifyTitle("Esri Staging - Sign In"))
			Reporter.reportStep("This is not a Esri Staging - Sign In Page", "FAIL");
	}
	
	public CherwellStaging_LoginPage enterUserName(String Username) throws Throwable{
		enterByXpath(prop.getProperty("CherwellLoginPage.UsernameTextBox.xpath"), Username);
		return this;
	}
	
	public CherwellStaging_LoginPage enterPassword(String Password) throws Throwable{
		enterByXpath(prop.getProperty("CherwellLoginPage.PasswordTextBox.xpath"), Password);
		return this;
	}
	
	public CherwellStaging_LoginPage ClickSignIn(String data) throws Throwable{
		clickButtonByXpath(prop.getProperty("CheCherwellLoginPagerwell.SignInButton.xpath"), data);
		return this;
	}
	
	public CherwellStaging_DashboardPage verifyEsriStagingDashBoardHeader(String data) throws Throwable{
		waitForPageLoad(5);
		VerifyTextByXpath(prop.getProperty("CherwellStagingDashboardPage.VerifyEsriStagingDashBoardPageHeader.xpath"), data);
		return new CherwellStaging_DashboardPage();
	}
	
}
