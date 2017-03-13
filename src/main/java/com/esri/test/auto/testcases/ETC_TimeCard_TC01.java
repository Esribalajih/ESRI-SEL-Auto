/**
 * 
 */
package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.ETCDashboardPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author balajih
 *
 */
public class ETC_TimeCard_TC01 extends ESRIWrappers{
	@Parameters({"browsers"})
	@BeforeClass
	public void startTestCase() {
		dataSheetName="ESRI_ETC_TC01";
		testCaseName="ETC Time card - Module";
		Category="Regression Testing";
		//For IE
		testDescription= "This is the ESRI New Home Page Module - Positive Test scenario,\n"
						+" -> URL : 	http://uat.esri.com,\n"
						+" -> ENV : 	Staging,\n"
						+" -> BROWSER & VERSION: Chrome V_56.0.29.\n";
	}

	@Test(dataProvider="fetchdata")
	public void ETCOKTAPage(
			String etcurl, String u,String p, String sign, String displayName) throws Throwable{
		openbrowser(etcurl);
		new com.esri.test.auto.pages.ETCOKTAPage()
		.enterSSOUserName(u)
		.enterSSOPassword(p)
		.clickSigninBtn(sign)
		.verifyandClickETCTimeCardChicklet();
		new ETCDashboardPage()
		.verifyETCDashboardSigninDisplayName(displayName);
		
	}

}
