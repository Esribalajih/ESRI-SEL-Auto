package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is a ETC Time card Page common for both Exempt and Non-Exempt user
 * @author balajih
 *
 */
public class ETCTimeCardExemptUserOverViewPage extends ESRIWrappers{
	
	public ETCTimeCardExemptUserOverViewPage() throws Throwable{
		if(!VerifyTitle("Esri Timecard")){
			Reporter.reportStep("Esri Timecard", "FAIL");
		}
		else
			System.out.println("Esri Timecard Page is launched successfully");
	}
	
	public ETCTimeCardExemptUserOverViewPage enterChargeCode(String IT) throws Throwable{
		enterByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.Addchargecode.xpath"), IT);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage selectFirstChargeCode(String chargeCode) throws Throwable{
		clickButtonByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.SelectFirstChargeCode.xpath"), chargeCode);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage enterHours1(String hours) throws Throwable{
		enterByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.Hours1.xpath"), hours);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage verifyHours(String HoursEntered) throws Throwable{
		VerifyTextByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.Hours1.xpath"), HoursEntered);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage clickMilesButton1(String chargeCode) throws Throwable{
		clickButtonByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.MilesButton1.xpath"), chargeCode);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage enterMiles1(String miles) throws Throwable{
		enterByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.Miles1.xpath"), miles);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage verifyMiles(String MilesEntered) throws Throwable{
		VerifyTextByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.Miles1.xpath"), MilesEntered);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage enterHours2(String hours) throws Throwable{
		enterByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.Hours2.xpath"), hours);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage clickMilesButton2(String chargeCode) throws Throwable{
		clickButtonByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.MilesButton2.xpath"), chargeCode);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage enterMiles2(String miles) throws Throwable{
		enterByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.Miles2.xpath"), miles);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage enterHours3(String hours) throws Throwable{
		enterByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.Hours3.xpath"), hours);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage clickMilesButton3(String chargeCode) throws Throwable{
		clickButtonByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.MilesButton3.xpath"), chargeCode);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage enterMiles3(String miles) throws Throwable{
		enterByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.Miles3.xpath"), miles);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage clickSaveHoursandMiles(String btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.Miles.xpath"), btn);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage verifyPayPeriodSummaryHours(String TotalHours) throws Throwable{
		VerifyTextByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.PayPeriodSummaryTotalHours.xpath"), TotalHours);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage verifyPayPeriodSummaryMiles(String TotalMiles) throws Throwable{
		VerifyTextByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.PayPeriodSummaryTotalMiles.xpath"), TotalMiles);
		return this;
	}
	

}
