package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Facebook page
 * @author balajih
 *
 */
public class EsriCareerJDSearchResultsPage extends ESRIWrappers{
	
	public EsriCareerJDSearchResultsPage() throws Throwable{
		if (!VerifyTitle("Esri Careers | Job Details"))
			Reporter.reportStep("This is not a Esri Career Job Details Search Results Page", "FAIL");
	}
	
	public EsriCareerCenterResumeSubPage clickApplyNowHdrlink() throws Throwable{
		clickByXpath(prop.getProperty("EsriCareerJDSearchResultsPage.applyNowHdrlink.xpath"));
		return new EsriCareerCenterResumeSubPage();
	}
	
	public EsriCareerCenterResumeSubPage clickApplyNowFtrlink() throws Throwable{
		clickByXpath(prop.getProperty("EsriCareerJDSearchResultsPage.applyNowFtrlink.xpath"));
		return new EsriCareerCenterResumeSubPage();
	}
	
	public EsriCareerJobDetailsPage clickSearchJobsSubMenulink() throws Throwable{
		clickByLinkText(prop.getProperty("EsriCareerJDSearchResultsPage.searchjobssubmenulink.linktext"));
		return new EsriCareerJobDetailsPage();
	}
	
	public EsriCareerJobDetailsPage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerJobDetailsPage();
	}

}
