package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Twitter page
 * @author balajih
 *
 */
public class EsriTwitterPage extends ESRIWrappers{
	
	public EsriTwitterPage() throws Throwable{
		if (!VerifyTitle("Esri (@Esri) | Twitter"))
			Reporter.reportStep("This is not a Esri Twitter Page", "FAIL");
	}
		
	public NewEsriHomePage clickBwrBckBtn() throws Throwable{
		clickBrowserBackButton();
		return new NewEsriHomePage();
	}
}
