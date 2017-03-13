package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the ETC time card Home page for Exempt User View
 * @author balajih
 *
 */
public class ETCTimeCardExemptDailyViewPage extends ESRIWrappers{
	
	public ETCTimeCardExemptDailyViewPage() throws Throwable{
		if(!VerifyTitle("Esri Timecard")){
			Reporter.reportStep("This is not a Esri Time Card Exempt User Daily View Page ", "FAIL");
		}
	}
	
	public ETCTimeCardExemptDailyViewPage verifyETCTimeviewHeader(String displayName) throws Throwable{
		VerifyTextByXpath(prop.getProperty("ETCTimeCardExemptUserDailyViewPage.TimeViewHeader.xpath"), displayName);
		return this;
	}
	
	public ETCTimeCardExemptDailyViewPage verifyTimePeriodSubmissionStatus(String statusDisp) throws Throwable{
		VerifyTextByXpath(prop.getProperty("ETCTimeCardExemptUserDailyViewPage.TimePeriodStatus.xpath"), statusDisp);
		return this;
	}

	public ETCTimeCardExemptDailyViewPage clickPreviousDayPicker(String prevDayPicker) throws Throwable{
		clickButtonByXpath(prop.getProperty("ETCTimeCardExemptUserDailyViewPage.prevDayPicker.xpath"), prevDayPicker);
		return this;
	}
	
	public ETCTimeCardExemptDailyViewPage clickNextDayPicker(String nextDayPicker) throws Throwable{
		clickButtonByXpath(prop.getProperty("ETCTimeCardExemptUserDailyViewPage.nextDayPicker.xpath"), nextDayPicker);
		return this;
	}

}
