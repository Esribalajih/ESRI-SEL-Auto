package com.esri.test.auto.pages;

import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author Sivaprakash
 *
 */
public class EsriTrainingCardPage extends ESRIWrappers {


	public EsriTrainingHomePage cardTitleVerify() throws Throwable {
		waitForPageLoad(3);
		String cardTitle2=getTextByXpath(prop.getProperty("Training.catalogCardTitle2.xpath"));
		if(cardTitle2.equalsIgnoreCase(EsriTrainingCatalogPage.firstcardTitle)){
			System.out.println("Card Title match and the title is:"+cardTitle2);
		}else{
			System.out.println("Card Title did not match");
		}
		//VerifyTextbyXpath(prop.getProperty("Training.catalogCardTitle.xpath"), data);
		clickBrowserBackButton();
		clickByXpath(prop.getProperty("Homepage.clickMain.xpath"));
		return new EsriTrainingHomePage();
	}
	
	
}
