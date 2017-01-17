package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Life at Esri page
 * @author balajih
 *
 */
public class EsriCareerLifeatEsriPage extends ESRIWrappers{
	
	public EsriCareerLifeatEsriPage() throws Throwable{
		if (!VerifyTitle("LIFE @ ESRI"))
			Reporter.reportStep("This is not a LIFE @ ESRI Page", "FAIL");
	}
	
	public EsriCareerLifeatEsriPage verifyLifeatEsriHdr(String LifeHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CareerLife@EsriPage.LifeatEsriHeader.xpath"), LifeHdr);
		return this;
	}
	
	public EsriCareerHomePage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerHomePage();
	}
	public EsriCareerLifeatEsriPage clickFirstImageLink() throws Throwable{
		clickByXpath(prop.getProperty("CareerLife@EsriPage.FirstImageLink.xpath"));
		return this;
	}
	
	public EsriCareerLifeatEsriPage clickSecondImageLink() throws Throwable{
		clickByXpath(prop.getProperty("CareerLife@EsriPage.SecondImageLink.xpath"));
		return this;
	}
	
	public EsriCareerLifeatEsriPage clickThirdImageLink() throws Throwable{
		clickByXpath(prop.getProperty("CareerLife@EsriPage.ThirdImageLink.xpath"));
		return this;
	}
	
	public EsriCareerLifeatEsriPage clickFourthImageLink() throws Throwable{
		clickByXpath(prop.getProperty("CareerLife@EsriPage.FourthImageLink.xpath"));
		return this;
	}
	
	public EsriCareerLifeatEsriPage clickFivthImageLink() throws Throwable{
		clickByXpath(prop.getProperty("CareerLife@EsriPage.FivthImageLink.xpath"));
		return this;
	}
	
	public EsriCareerLifeatEsriPage clickSixthImageLink() throws Throwable{
		clickByXpath(prop.getProperty("CareerLife@EsriPage.SixthImageLink.xpath"));
		return this;
	}
	
	public EsriCareerLifeatEsriPage clickBenefitsSubMenulink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Benefitslink.linktext"));
		return this;
	}
	
	public EsriCareerStudLoginPage clickStudLoginSubMenulink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Loginlink.linktext"));
		return new EsriCareerStudLoginPage();
	}
	
	public EsriCareerContactUsPage clickContactusSubMenulink() throws Throwable{
		clickByLinkText(prop.getProperty("CareerJobDetailsPage.Contactuslink.linktext"));
		return new EsriCareerContactUsPage();
	}
}
