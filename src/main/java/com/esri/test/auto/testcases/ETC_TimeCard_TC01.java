/**
 * 
 */
package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.esri.test.auto.pages.ETCOKTAPage;
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
		/*testDescription= "This is the ESRI ETC Timecard - Positive Test scenario,\n"
						+" -> URL : 	https://esri-qa.oktapreview.com/login/default,\n"
						+" -> ENV : 	Staging,\n"
						+" -> BROWSER & VERSION: Chrome V_56.0.29.\n";*/
	}

	@Test(dataProvider="fetchdata")
	public void ETCOKTAPage(
			String EsriDevUrl, String Username,String Password, String SignInBtn,String WUname,String WPwd, String displayName,
			String TimecardHeader,String UserdisplayName,String OverviewToggle,String NextPeriodBtn,
			String ChargeCode,String Firstcode,String Hours,String MilesBtn,String Miles) throws Throwable{
		openbrowser(EsriDevUrl);
		new ETCOKTAPage()
		.enterSSOUserName(Username)
		.enterSSOPassword(Password)
		.clickSigninBtn(SignInBtn)
		.verifyETCDashboardSigninDisplayName(displayName)
		.verifyandClickETCTimeCardChicklet();
		/*.handlingBAuthUsingRobo(WUname,WPwd);*/
		new ETCDashboardPage()
		.verifyETCTimeCardHeader(TimecardHeader)
		.verifyETCUsername(UserdisplayName)
		.clickNextPeriodPickerButton(NextPeriodBtn)
		.clickOverviewtab(OverviewToggle)
		.enterChargeCode(ChargeCode)
		.selectFirstChargeCode(Firstcode)
		.enterHours(Hours)
		.clickMilesButton(MilesBtn)
		.enterMiles(Miles);
		
		
		
	}

}
