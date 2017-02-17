package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri LinkedIN Page
 * @author balajih
 *
 */
public class EsriLinkedInPage extends ESRIWrappers{
	
	public EsriLinkedInPage() throws Throwable{
		if(!VerifyTitle("Esri | LinkedIn "))
			Reporter.reportStep("This is not a Esri LinkedIn Page", "FAIL");
	}

	public NewEsriHomePage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new NewEsriHomePage();

	}
	
}
