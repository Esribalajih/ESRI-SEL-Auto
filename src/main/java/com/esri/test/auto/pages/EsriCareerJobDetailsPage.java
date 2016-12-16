package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Job Details Page
 * @author balajih
 *
 */
public class EsriCareerJobDetailsPage extends ESRIWrappers{
	
	public EsriCareerJobDetailsPage() throws Throwable{
	if(!VerifyTitle("Esri Job Search"))
		Reporter.reportStep("This is not a Esri Career Job Details Page", "FAIL");
	}
	
	public EsriCareerJobDetailsPage enterTextSearch(String Inputdata) throws Throwable{
		enterByClassName(prop.getProperty("CareerJobDetailsPage.JobSearchInput.classname"),Inputdata);
		return this;
	}
	
	public EsriCareerJobDetailsPage clickBySearchBtn() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Searchbutton.linktext"));
		return this;
	}
		
	public EsriCareerJobDetailsPage clickStudentLinkText() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Studentlink.linktext"));
		return this;
	}
	
	public EsriCareerJobDetailsPage clickJobCategory() throws Throwable{
		clickById(prop.getProperty("CareerJobDetailsPage.JobCategory.Id"));
		return this;
	}
	
	public EsriCareerJobDetailsPage selectJobCategory(String idValue) throws Throwable{
		selectByIdWithvalue(prop.getProperty("CareerJobDetailsPage.selectIT.id"),idValue);
		return this;
	}
	
	public EsriCareerJobDetailsPage clickLocation() throws Throwable{
		clickById(prop.getProperty("CareerJobDetailsPage.Location.Id"));
		return this;
	}
	
	public EsriCareerJobDetailsPage selectLocation(String idValue) throws Throwable{
		selectByIdWithvalue(prop.getProperty("CareerJobDetailsPage.selectRedlandLoc.Id"),idValue);
		return this;
	}
	
	public EsriCareerRecruitingEventsPage clickRecruitingEventsLink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.RecruitingEventslink.linktext"));
		return new EsriCareerRecruitingEventsPage();
	}

}
