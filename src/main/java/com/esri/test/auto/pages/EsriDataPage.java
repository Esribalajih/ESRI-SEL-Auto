package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is a Esri Data Page
 * @author balajih
 *
 */
public class EsriDataPage extends ESRIWrappers{
	
	public EsriDataPage() throws Throwable{
		if(!VerifyTitle("Esri Data | Current Year Demographic & Business Data | Estimates & Projections"));
		Reporter.reportStep("This is not a ESRI Data Page", "FAIL");
	}
	
	public TestYourInsightAppMainPage clickBrowserBckBtntoInsightsPage() throws Throwable{
		clickBrowserBackButton();
		return new TestYourInsightAppMainPage();
	}

}
