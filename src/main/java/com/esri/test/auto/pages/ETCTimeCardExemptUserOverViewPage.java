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
	
	public ETCTimeCardExemptUserOverViewPage enterHours(String hours) throws Throwable{
		enterByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.Hours.xpath"), hours);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage clickMilesButton(String chargeCode) throws Throwable{
		clickButtonByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.MilesButton.xpath"), chargeCode);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage enterMiles(String hours) throws Throwable{
		enterByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.Miles.xpath"), hours);
		return this;
	}
	
	public ETCTimeCardExemptUserOverViewPage clickSaveHoursandMiles(String btn) throws Throwable{
		clickButtonByXpath(prop.getProperty("ETCTimeCardExemptUserOverviewPage.Miles.xpath"), btn);
		return this;
	}
	
	

}
