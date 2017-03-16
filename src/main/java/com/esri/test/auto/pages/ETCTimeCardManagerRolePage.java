package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the ETC time card Home page for Exempt User View
 * @author balajih
 *
 */
public class ETCTimeCardManagerRolePage extends ESRIWrappers{
	
	public ETCTimeCardManagerRolePage() throws Throwable{
		if(!VerifyTitle("Esri Timecard")){
			Reporter.reportStep("This is not a Esri Time Card Manager Role Page ", "FAIL");
		}
	}
	
	public ETCTimeCardManagerRolePage verifyETCTimecardApprovalHeader(String AppHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("ETCTimeCardManagerRolePage.TabHeader.xpath"), AppHdr);
		return this;
	}
	
	public ETCTimeCardManagerRolePage clickPrimarySubTab(String PrimSubTab) throws Throwable{
		clickButtonByXpath(prop.getProperty("ETCTimeCardManagerRolePage.primarySubTab.xpath"), PrimSubTab);
		return this;
	}

	public ETCTimeCardManagerRolePage clickPreviousDayPicker(String prevDayPicker) throws Throwable{
		clickButtonByXpath(prop.getProperty("ETCTimeCardExemptUserDailyViewPage.prevDayPicker.xpath"), prevDayPicker);
		return this;
	}
	
	public ETCTimeCardManagerRolePage clickNextDayPicker(String nextDayPicker) throws Throwable{
		clickButtonByXpath(prop.getProperty("ETCTimeCardExemptUserDailyViewPage.nextDayPicker.xpath"), nextDayPicker);
		return this;
	}

}
