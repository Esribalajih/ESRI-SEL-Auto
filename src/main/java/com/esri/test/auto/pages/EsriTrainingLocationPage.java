package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author Sivaprakash
 *
 */
public class EsriTrainingLocationPage extends ESRIWrappers {
	
	static String firstcardTitle;

	public EsriTrainingLocationPage() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("Training Locations for Instructor-Led Classes")) {
			Reporter.reportStep("Title of the location page did not match", "FAIL");
		}
	}

	public EsriTrainingLocationPage onlineClassRoom() throws Throwable{
		clickByXpath(prop.getProperty("Training.locationOnlineClassRoom.xpath"));
		waitForPageLoad(3);
		if(checkElementIsDisplayedByXpath(prop.getProperty("Training.locationOnlinePageVerify.xpath"))){
			
			System.out.println(getTextByXpath(prop.getProperty("Training.locationOnlinePageVerify.xpath")));
		}else{
			System.out.println("Text Value of the element is not obtained.");
		}
		clickBrowserBackButton();
		return this;
	}
	
	public EsriTrainingLocationPage otherLocation() throws Throwable{
		String locationname = getTextByXpath(prop.getProperty("Training.locationName.xpath"));
		System.out.println("location name:" +locationname);
		clickByXpath(prop.getProperty("Training.locationOtherLocation.xpath"));
		clickByLinkText(prop.getProperty("Training.locationRegister.linkText"));
		waitForPageLoad(3);
		System.out.println(getTextByXpath(prop.getProperty("Training.locationCourseRegister.xpath")));
		clickBrowserBackButton();
		waitForPageLoad(3);
		clickByLinkText(prop.getProperty("Training.locationDirections.linkText"));
		waitForPageLoad(3);
		checkElementIsDisplayedByTagName(prop.getProperty("Training.locationMap.tagName"));
		return this;
	}
	
	
	
	
	
	
	

}
