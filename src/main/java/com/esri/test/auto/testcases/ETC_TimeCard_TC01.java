/**
 * 
 */
package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.esri.test.auto.pages.ETCOKTAPage;
import com.esri.test.auto.pages.ETCTimeCardExemptUserOverViewPage;
import com.esri.test.auto.pages.ETCTimeCardExemptViewPage;
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
		//Category="Regression Testing";
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
			String ChargeCodeIT,String ITCode1,String Hours1,String MilesBtn,String Miles1,
			String ChargeCodeVac,String VacCode,String Hours2,String Miles2,
			String SaveBtn,String TotalHours,String TotalMiles) throws Throwable{
		openbrowser(EsriDevUrl);
		new ETCOKTAPage()
		.enterSSOUserName(Username)
		.enterSSOPassword(Password)
		.clickSigninBtn(SignInBtn)
		.verifyETCDashboardSigninDisplayName(displayName)
		.verifyandClickETCTimeCardChicklet();
		switchToWindow();
		handlingBAuthUsingRobo("Test", "Test");
		new ETCTimeCardExemptViewPage()
		.verifyETCTimeCardHeader(TimecardHeader)
		.verifyETCUsername(UserdisplayName)
		.clickNextPeriodPickerButton(NextPeriodBtn)
		.clickOverviewtab(OverviewToggle)
		.enterChargeCode(ChargeCodeIT)
		.selectFirstChargeCode(ITCode1)
		.enterHours1(Hours1)
		.clickMilesButton1(MilesBtn)
		.enterMiles1(Miles1)
		.enterChargeCode(ChargeCodeVac)
		.selectFirstChargeCode(VacCode)
		.enterHours2(Hours2)
		.clickMilesButton2(MilesBtn)
		.enterMiles2(Miles2)
		.clickSaveHoursandMiles(SaveBtn)
		.verifyPayPeriodSummaryHours(TotalHours)
		.verifyPayPeriodSummaryMiles(TotalMiles);
		
		
		
	}

}
