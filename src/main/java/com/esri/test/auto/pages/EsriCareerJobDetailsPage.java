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
	
	public EsriCareerJobDetailsPage verifyJobDetailsHdr(String JDHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CareerJobDetailsPage.JobDetailsHeader.xpath"), JDHdr);
		return this;
	}
	//Job Details Search Functionalities
	
	public EsriCareerJobDetailsPage enterTextSearch(String Inputdata) throws Throwable{
		enterByClassName(prop.getProperty("CareerJobDetailsPage.JobSearchInput.classname"),Inputdata);
		return this;
	}
	
	public EsriCareerJobDetailsPage clickBySearchBtn() throws Throwable{
		waitForPageLoad(5);
		clickByClassName(prop.getProperty("CareerJobDetailsPage.Searchbutton.classname"));
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
	
	public EsriCareerJDSearchResultsPage clickSearchResult() throws Throwable{
		clickByXpath(prop.getProperty("CareerJobDetailsPage.clicksearchresult.xpath"));
		return new EsriCareerJDSearchResultsPage();
	}
	
	//Sub Menu links
	
	public EsriCareerRecruitingEventsPage clickRecruitingEventsLink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.RecruitingEventslink.linktext"));
		return new EsriCareerRecruitingEventsPage();
	}
	
	public EsriCareerStudentGradsPage clickStudentsGradsSubMenulink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.StudentsandGradslink.linktext"));
		return new EsriCareerStudentGradsPage();
	}
	
	public EsriCareerJobDetailsPage clickBenefitsSubMenulink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Benefitslink.linktext"));
		return this;
	}
	
	public EsriCareerLifeatEsriPage clickLifeatEsriSubMenulink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.LifeatEsrilink.linktext"));
		return new EsriCareerLifeatEsriPage();
	}
	
	public EsriCareerStudLoginPage clickStudLoginSubMenulink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Loginlink.linktext"));
		return new EsriCareerStudLoginPage();
	}
	
	public EsriCareerContactUsPage clickContactusSubMenulink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Contactuslink.linktext"));
		return new EsriCareerContactUsPage();
	}
	
	public EsriCareerHomePage clickCareersHomeSubMenulink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Careershomelink.linktext"));
		return new EsriCareerHomePage();
	}
	//Footer Widgets functionalities
	
	public EsriCareerJobDetailsPage verifyFooterHdr(String FooterHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CareerJobDetailsPage.footerhdr.xpath"), FooterHdr);
		return this;
	}
	
	public EsriCareerMoreAboutEsriPage clickMoreAboutEsrilink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.moreaboutEsri.linktext"));
		return new EsriCareerMoreAboutEsriPage();
	}
	
	public EsriCareerBlogPage clickFooterBlogButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerJobDetailsPage.footerbloglink.xpath"));
		return new EsriCareerBlogPage();
	}
	
	public EsriInstagramPage clickFooterInstagramButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerJobDetailsPage.footerinstagramlink.xpath"));
		return new EsriInstagramPage();
	}

	public EsriFacebookPage clickFooterFacebookButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerJobDetailsPage.footerfblink.xpath"));
		return new EsriFacebookPage();
	}

	public EsriTwitterPage clickFooterTwitterButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerJobDetailsPage.footertwitterlink.xpath"));
		return new EsriTwitterPage();
	}

	public EsriLinkedInPage clickFooterLinkedInButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerJobDetailsPage.footerlinkedinlink.xpath"));
		return new EsriLinkedInPage();
	}
	
	public EsriGlassDoorPage clickFooterGlassDoorButton() throws Throwable{
		clickByXpath(prop.getProperty("CareerJobDetailsPage.footerglassdoorlink.xpath"));
		return new EsriGlassDoorPage();
	}
	
	public EsriCareerHomePage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerHomePage();
	}

}
