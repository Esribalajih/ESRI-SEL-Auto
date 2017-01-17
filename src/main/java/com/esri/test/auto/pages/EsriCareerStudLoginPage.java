package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Student Login page
 * @author balajih
 *
 */
public class EsriCareerStudLoginPage extends ESRIWrappers{
	
	public EsriCareerStudLoginPage() throws Throwable{
		if (!VerifyTitle("Careers Center - Welcome"))
			Reporter.reportStep("This is not a Esri Career Center Page", "FAIL");
	}
	
	public EsriCareerLifeatEsriPage clickBwrBckBtnLifePage() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerLifeatEsriPage();
	}
	
	public EsriCareerHomePage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new EsriCareerHomePage();
	}

}
