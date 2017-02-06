package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Esri Staging - Sign In Page of IAM Application
 * 
 * @author udhayasundar
 *
 */
public class Dist_OktaEsriSigninPage extends ESRIWrappers {

	public Dist_OktaEsriSigninPage() throws Throwable {
		waitForPageLoad(10);
		System.out.println("Esri Staging - Sign In");
		if (!VerifyTitle("Esri Staging - Sign In")) {
			Reporter.reportStep("This is not a login page", "FAIL");
		}
	}

	// Enter the UserName
	public Dist_OktaEsriSigninPage enterUserName(String userdata) throws Throwable {
		waitForPageLoad(5);
		try {
			enterByName(prop.getProperty("okta.userName.name"), userdata);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

		
	// Enter the Password
	public Dist_OktaEsriSigninPage enterPassword(String pwd) throws Throwable {
		try {
			enterByName(prop.getProperty("okta.password.name"), pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Click Sign in button positive scenario and navigate to Home page
	public Dist_HomePage clickEsriSignInBtn() throws Throwable {
		try {
			clickByClassName(prop.getProperty("okta.signInBtn.class"));
			} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_HomePage();
	}

	// Click Sign in button positive scenario and navigate to CSAT Application
	public CSAT_Staging clickEsriSignInBtnCSAT() throws Throwable {
		try {
			clickByClassName(prop.getProperty("okta.signInBtn.class"));
			} catch (Exception e) {
			e.printStackTrace();
		}
		return new CSAT_Staging();
	}
	
	
}
