package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Student Job Details Page
 * @author balajih
 *
 */
public class EsriCareerStudJobDetailsPage extends ESRIWrappers{
	
	public EsriCareerStudJobDetailsPage() throws Throwable{
	if(!VerifyTitle("Esri Careers | Job Details"))
		Reporter.reportStep("This is not a Esri Career Student Job Details Page", "FAIL");
	}
	
	public EsriCareerStudJobDetailsPage verifyStudentJobDetailsHdr(String StuJDHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CareerStudJobDetailsPage.StudJobDetailsHeader.xpath"), StuJDHdr);
		return this;
	}
	
	public EsriCareerCenterResumeSubPage clickApplyNowHdrBtn() throws Throwable{
		clickByXpath(prop.getProperty("CareerStudJobDetailsPage.applyNowHdrbtn.xpath"));
		return new EsriCareerCenterResumeSubPage();
	}
	
	public EsriCareerCenterResumeSubPage clickApplyNowFtrBtn() throws Throwable{
		clickByXpath(prop.getProperty("CareerStudJobDetailsPage.applyNowFtrbtn.xpath"));
		return new EsriCareerCenterResumeSubPage();
	}

}
