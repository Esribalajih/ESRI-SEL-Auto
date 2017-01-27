package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Facebook page
 * @author balajih
 *
 */
public class InsightsFacebookPage extends ESRIWrappers{
	
	public InsightsFacebookPage() throws Throwable{
		if (!VerifyTitle("Facebook"))
			Reporter.reportStep("This is not a Insights Facebook Page", "FAIL");
	}
	
	public TestYourInsightAppMainPage clickBwrBckBtntoInsightsApp() throws Throwable{
		clickBrowserBackButton();
		return new TestYourInsightAppMainPage();
	}

}

