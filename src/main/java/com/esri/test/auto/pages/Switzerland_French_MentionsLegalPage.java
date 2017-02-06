package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Switzerland Mentions l�gales | Esri Suisse Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Switzerland_French_MentionsLegalPage extends ESRIWrappers {
	public Switzerland_French_MentionsLegalPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Mentions l�gales | Esri Suisse")) {
			Reporter.reportStep("This is not a Mentions l�gales | Esri Suisse (Switzerland) page.", "FAIL");
		} else
			System.out.println("Switzerland Mentions l�gales | Esri Suisse page Launched Successfully");
	}

	// click back button in browser
	public Switzerland_French_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Switzerland_French_HomePage();
	}

	// verify Mentions l�gales label
	public Switzerland_French_MentionsLegalPage verifyMentionslegaleslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("diswitzFreMentions.MentionslegalesLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
