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
	public EsriTrainingCardPage headerEmbedCode() throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),prop.getProperty("Tag.HeaderEmbedCode.text"));
		return this;
	}
	public EsriTrainingCardPage googleTagManagerForScript() throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForScript.text"));
		return this;
	}	
	public EsriTrainingCardPage googleTagManagerForNoScript() throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForNoScript.text"));
		return this;
	}
	public EsriTrainingCardPage footerEmbbedCode() throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),prop.getProperty("Tag.FooterEmbbedCode.text"));
		return this;
	}
	public EsriTrainingCardPage pardotDataLayerCode() throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),prop.getProperty("Tag.PardotDataLayerCode.text"));
		return this;
	}
	
}
