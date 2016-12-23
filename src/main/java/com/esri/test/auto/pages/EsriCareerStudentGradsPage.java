package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Student Opps page
 * @author balajih
 *
 */
public class EsriCareerStudentGradsPage extends ESRIWrappers{
	
	public EsriCareerStudentGradsPage() throws Throwable{
		if (!VerifyTitle("Student Opps at Esri"))
			Reporter.reportStep("This is not a Esri Career Student Opps Page", "FAIL");
	}
	
	public EsriCareerStudentGradsPage verifyStudentsGradHdr(String StuHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CareerStudentOppsPage.verifyHeader.xpath"), StuHdr);
		return this;
	}
	
	public EsriCareerStudentGradsPage clickByNewGradlink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerStudentOppsPage.Joblistitem.xpath"));
		return this;
	}
	
	public EsriCareerStudentGradsPage clickByIntrnProgramlink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerStudentOppsPage.Joblistitem.xpath"));
		return this;
	}
	
	public EsriCareerStudentGradsPage clickByStuAssistProgramlink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerStudentOppsPage.Joblistitem.xpath"));
		return this;
	}
	
	public EsriCareerStudentGradsPage selectByjobCategory(String JCitemdata) throws Throwable{
		selectByIdWithvalue(prop.getProperty("CareerStudentOppsPage.Jobcategory.id"),JCitemdata);
		return this;
	}
	
	public EsriCareerStudentGradsPage clickByJobListItem() throws Throwable{
		clickByLinkText(prop.getProperty("CareerStudentOppsPage.Joblistitem.xpath"));
		return this;
	}
			
	public EsriCareerJobDetailsPage clickbacktoCareerJobDetail() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerJobDetailsPage();
	}
	
	public EsriCareerBenefitsPage clickBenefitsSubMenulink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Benefitslink.linktext"));
		return new EsriCareerBenefitsPage();
	}
//Start working on Benefits Page flow
}
