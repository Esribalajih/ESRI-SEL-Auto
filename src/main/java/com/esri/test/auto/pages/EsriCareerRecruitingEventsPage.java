package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Recruiting Events page
 * @author balajih
 *
 */
public class EsriCareerRecruitingEventsPage extends ESRIWrappers{
	
	public EsriCareerRecruitingEventsPage() throws Throwable{
		if (!VerifyTitle("Esri Recruiting Events"))
			Reporter.reportStep("This is not a Esri Recruiting Events Page", "FAIL");
	}
	
	public EsriCareerRecruitingEventsPage clickAlphaSortlink() throws Throwable{
		clickById(prop.getProperty("CareerRecruitingEventsPage.AlphabetsSortlink.id"));
		return this;
	}
	
	public EsriCareerRecruitingEventsPage clickDateSortlink() throws Throwable{
		clickById(prop.getProperty("CareerRecruitingEventsPage.DateSortlink.id"));
		return this;
	}
	
	public EsriCareerRecruitingEventsPage clickWhereWeHaveBeenlink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerRecruitingEventsPage.WhereWeHaveBeenlink.linktext"));
		return this;
	}
	
	public EsriCareerRecruitingEventsPage clickUpcomingEventslink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerRecruitingEventsPage.UpcomingEventslink.linktext"));
		return this;
	}
	
	public EsriCareerJobDetailsPage clickSearchJobsLink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerRecruitingEventsPage.SearchjobsLink.linktext"));
		return new EsriCareerJobDetailsPage();
	}
	
	public EsriCareerJobDetailsPage clickStudentsGradsLink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.StudentsandGradslink.linktext"));
		return new EsriCareerJobDetailsPage();
	}
	
	public EsriCareerBenefitsPage clickBenefitsLink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Benefitslink.linktext"));
		return new EsriCareerBenefitsPage();
	}
	
	public EsriCareerLifeatEsriPage clickLifeatEsriLink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.LifeatEsrilink.linktext"));
		return new EsriCareerLifeatEsriPage();
	}
	
	public EsriCareerStudLoginPage clickLoginLink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Loginlink.linktext"));
		return new EsriCareerStudLoginPage();
	}
	
	public EsriCareerContactUsPage clickContactUsLink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Contactuslink.linktext"));
		return new EsriCareerContactUsPage();
	}
	
	public EsriCareerMainPage clickCareersHomeLink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Careershomelink.linktext"));
		return new EsriCareerMainPage();
	}
	
	public EsriCareerRecruitingEventsPage clickSharelink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.sharelink.classname"));
		return this;
	}
	
	public EsriCareerRecruitingEventsPage switchbacktoParentWindow(){
		switchToDefaultContent();
		return this;
	}

}
