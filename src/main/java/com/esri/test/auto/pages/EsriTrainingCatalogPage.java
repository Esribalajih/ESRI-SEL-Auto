package com.esri.test.auto.pages;

import org.openqa.selenium.WebElement;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author Sivaprakash
 *
 */
public class EsriTrainingCatalogPage extends ESRIWrappers {
	
	static String firstcardTitle;

	public EsriTrainingCatalogPage() throws Throwable {
		waitForPageLoad(3);
		if (!VerifyTitle("Esri Training Catalog")) {
			Reporter.reportStep("Title of the Catalog page did not match", "FAIL");
		}
	}

	public EsriSpotlightPage spotLightDetails() throws Throwable {
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogSpotlightDetails.xpath"));
		return new EsriSpotlightPage();
	}

	public EsriTrainingCardPage clickCard() throws Throwable {
		waitForPageLoad(3);
		//String cardTitle2=getTextUsingXpath(prop.getProperty("Training.catalogCardTitle1.xpath"));
		clickByXpath(prop.getProperty("Training.catalogFirstCardDetails.xpath"));
		return new EsriTrainingCardPage();
	}
	
	public EsriTrainingLoginPage addWishList() throws Throwable{
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogAddWishList.xpath"));
		return new EsriTrainingLoginPage();
	}
	
	public EsriTrainingHomePage getCardTitle() throws Throwable{
		waitForPageLoad(3);
		firstcardTitle= getTextByXpath(prop.getProperty("Training.catalogCardTitle1.xpath"));
		System.out.println(firstcardTitle);
		scrollIntoViewByXpath(prop.getProperty("Training.catalogCardTitle1.xpath"));
		try {			
			waitForPageLoad(3);
			WebElement element=driver.findElementByXPath(prop.getProperty("Training.wishListCardAdd.xpath"));
			WebElement element2=driver.findElementByXPath(prop.getProperty("Training.wishListCardAdded.xpath"));
			if(element.isDisplayed()){
				driver.findElementByXPath(prop.getProperty("Training.wishListCardAdd.xpath")).click();
			}else if(element2.isDisplayed()){
				driver.findElementByXPath(prop.getProperty("Training.wishListCardAdded.xpath")).click();
				waitForPageLoad(1);
				driver.findElementByXPath(prop.getProperty("Training.wishListCardAdd.xpath")).click();			
			}
		} catch (Exception e) {			
			System.out.println("Wishlist checkbox not identified");
		}		
		clickByXpath(prop.getProperty("Homepage.clickMain.xpath"));
		return new EsriTrainingHomePage();
	}
	
	public EsriTrainingCatalogEventSearchPage clickEventSearch() throws Throwable{
		clickByXpath(prop.getProperty("Training.catalogEventSearch.xpath"));
		return new EsriTrainingCatalogEventSearchPage();
	}
	public EsriTrainingCatalogSearchPage clickFindTraining() throws Throwable{
		mouseHoverByXpath(prop.getProperty("Training.catalogMouseHover.xpath"));
		clickByXpath(prop.getProperty("Training.catalogClickFindTraining.xpath"));
		return new EsriTrainingCatalogSearchPage();
	}
	
	public  EsriTrainingLocationPage clickLocation() throws Throwable{
		clickByXpath(prop.getProperty("Training.catalogLocationsClick.xpath"));
		return new EsriTrainingLocationPage();
	}
	

}
