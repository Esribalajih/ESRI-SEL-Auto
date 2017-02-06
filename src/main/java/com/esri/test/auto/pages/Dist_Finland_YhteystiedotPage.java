package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Finland Yhteystiedot Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Finland_YhteystiedotPage extends ESRIWrappers {
	public Dist_Finland_YhteystiedotPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Yhteystiedot")) {
			Reporter.reportStep("This is not a Yhteystiedot (Finland) page.", "FAIL");
		} else
			System.out.println("Finland Yhteystiedot page Launched Successfully");
	}

	// click back button in browser
	public Dist_Finland_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Finland_HomePage();
	}

	// verify Esri Finland Oy label
	public Dist_Finland_YhteystiedotPage verifyEsriFinlandOylbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disFinlandHome.EsriFinlandOyLbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
