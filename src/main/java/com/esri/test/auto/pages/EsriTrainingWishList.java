package com.esri.test.auto.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author Sivaprakash
 *
 */
public class EsriTrainingWishList extends ESRIWrappers {
	String cardLinkTitle=null;
	

	public EsriTrainingWishList() throws Throwable {
		waitForPageLoad(2);
		if (!VerifyTitle("Organize Your Esri Training Wish List")) {
			Reporter.reportStep("Title of the WishList page did not match", "FAIL");
		}
	}
/*
	public EsriSpotlightPage clickWishList() throws Throwable {
		waitForPageLoad(3);
		clickbyXpath(prop.getProperty(""));
		return new EsriSpotlightPage();
	}*/

	public EsriTrainingCardPage VerifyCard() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogFirstCardDetails.xpath"));
		return new EsriTrainingCardPage();
	}
	
	public EsriTrainingHomePage verifyCardTitle() throws Throwable{
		List<WebElement> cardLinkoptions=driver.findElementsByXPath(prop.getProperty("Training.wishListCardlink.xpath"));
		System.out.println(cardLinkoptions.size());
		cardLinkTitle=cardLinkoptions.get(cardLinkoptions.size()-1).getText();	
		System.out.println(cardLinkTitle);
		if(cardLinkTitle.equalsIgnoreCase(EsriTrainingCatalogPage.firstcardTitle)){
			List<WebElement> button=driver.findElementsByXPath(prop.getProperty("Training.wishlistCardClickButton.xpath"));
			System.out.println(button.get(button.size()-1).isDisplayed());			
			waitForPageLoad(5);
		}else{
			System.out.println("Card Title did not match");
		}
		clickByXpath(prop.getProperty("Homepage.clickMain.xpath"));
		return new EsriTrainingHomePage();
	}
	
	public EsriTrainingWishList headerEmbedCode() throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),prop.getProperty("Tag.HeaderEmbedCode.text"));
		return this;
	}
	public EsriTrainingWishList googleTagManagerForScript() throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForScript.text"));
		return this;
	}	
	public EsriTrainingWishList googleTagManagerForNoScript() throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForNoScript.text"));
		return this;
	}
	public EsriTrainingWishList footerEmbbedCode() throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),prop.getProperty("Tag.FooterEmbbedCode.text"));
		return this;
	}
	public EsriTrainingWishList pardotDataLayerCode() throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),prop.getProperty("Tag.PardotDataLayerCode.text"));
		return this;
	}
}
