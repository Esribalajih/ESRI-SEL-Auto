package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Privacy Statement page
 * @author balajih
 *
 */
public class EsriCareerPrivacyStatePage extends ESRIWrappers{
	
	public EsriCareerPrivacyStatePage() throws Throwable{
		if (!VerifyTitle("Legal Information | Esri Privacy Statement"))
			Reporter.reportStep("This is not a Esri Privacy Statement Page", "FAIL");
	}
	
	public EsriCareerPrivacyStatePage verifyLegalinfoHdr(String LHdr) throws Throwable{
		VerifyTextByXpath(prop.getProperty("CareerPrivacy.legalinfo.xpath"), LHdr);
		return this;
	}
	public EsriCareerContactUsPage clickContactUsBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerContactUsPage();
	}
	
	public EsriCareerHomePage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerHomePage();
	}

}
