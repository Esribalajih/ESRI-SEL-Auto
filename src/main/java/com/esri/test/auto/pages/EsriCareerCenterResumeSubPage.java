package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Center Resume Submission page
 * @author balajih
 *
 */
public class EsriCareerCenterResumeSubPage extends ESRIWrappers{
	
	public EsriCareerCenterResumeSubPage() throws Throwable{
		if (!VerifyTitle("Careers Center - Resume Submission"))
			Reporter.reportStep("This is not a Esri Careers Center Resume Submission Page", "FAIL");
	}
	
	public EsriCareerJDSearchResultsPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerJDSearchResultsPage();
	}
	
	public EsriCareerStudJobDetailsPage clickBwrBckBtnStudJD() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerStudJobDetailsPage();
	}

}
