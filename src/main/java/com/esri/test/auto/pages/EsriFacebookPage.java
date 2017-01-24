package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Facebook page
 * @author balajih
 *
 */
public class EsriFacebookPage extends ESRIWrappers{
	
	public EsriFacebookPage() throws Throwable{
		if (!VerifyTitle("Esri | Facebook"))
			Reporter.reportStep("This is not a Esri Facebook Page", "FAIL");
	}
	
	public NewEsriHomePage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new NewEsriHomePage();
	}

}

