package com.esri.test.auto.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Sigin Page of AEM Application
 * @author Mohamed
 *
 */
public class AEM_SIGNIN_PAGE extends ESRIWrappers{

	public AEM_SIGNIN_PAGE() throws Throwable {
		if(!VerifyTitle("AEM Sign In")){
			Reporter.reportStep("This is not a login page", "FAIL");
		}
	}
	
	//Enter the UserName
	public AEM_SIGNIN_PAGE enterUserName(String userdata) throws Throwable{
		enterById(prop.getProperty("loginpage.userName.id"),userdata);
		return this;
	}
	
	//Enter the Password
	public AEM_SIGNIN_PAGE enterPassword(String pwd) throws Throwable{
		enterById(prop.getProperty("loginpage.Password.id"),pwd);
		return this;
	}
	
	//Click Sign in button positive scenario
	public AEM_HOMEPAGE clickSignin() throws Throwable{
		clickById(prop.getProperty("loginpage.submitbutton.id"));
		return new AEM_HOMEPAGE();
	
		}
}
