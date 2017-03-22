package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is a Esri Cherwell SelfService Portal
 * @author Thenmozhi
 */

public class CherwellBeta_LoginPage extends ESRIWrappers{
	
	public CherwellBeta_LoginPage() throws Throwable{
		if(!VerifyTitle("Self-Service"))
			Reporter.reportStep("This is not a Cherwell Beta Self Service - Login Page", "FAIL");
		else
			System.out.println("Cherwell Beta Self Service - Login Page Launched Successfully!");
	}
	
	public CherwellBeta_LoginPage clickUseWindowsLogin(String data) throws Throwable{
		clickLinkByXpath(prop.getProperty("CherwellLoginPage.UseWindowsLogin.xpath"),data);
		System.out.println(data);
		return this;
	}
	
	
	public CherwellBeta_LoginPage enterCredentials(String Username,String Password) throws Throwable{
		System.out.println("Windows auth page");
		//waitForPageLoad(10);
		handlingBAuthUsingRobo(Username, Password);
		return new CherwellBeta_LoginPage();
	}
	
	public CherwellBeta_LoginPage enterUserName(String Username) throws Throwable{
		enterByXpath(prop.getProperty("CherwellLoginPage.UsernameTextBox.xpath"), Username);
		return this;
	}
	
	public CherwellBeta_LoginPage enterPassword(String Password) throws Throwable{
		enterByXpath(prop.getProperty("CherwellLoginPage.PasswordTextBox.xpath"), Password);
		return this;
	}
	
	public CherwellBeta_LoginPage ClickSignIn(String data) throws Throwable{
		clickButtonByXpath(prop.getProperty("CherwellLoginPage.SignInButton.xpath"), data);
		return this;
	}
	
	
	

}
