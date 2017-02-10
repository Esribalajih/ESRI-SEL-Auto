package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Switzerland Mentions légales | Esri Suisse Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Switzerland_French_MentionsLegalPage extends ESRIWrappers {
	public Dist_Switzerland_French_MentionsLegalPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Mentions légales | Esri Suisse")) {
			Reporter.reportStep("This is not a Mentions légales | Esri Suisse (Switzerland) page.", "FAIL");
		} else
			System.out.println("Switzerland Mentions légales | Esri Suisse page Launched Successfully");
	}

	// click back button in browser
	public Dist_Switzerland_French_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Switzerland_French_HomePage();
	}

	// verify Mentions légales label
	public Dist_Switzerland_French_MentionsLegalPage verifyMentionslegaleslbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("diswitzFreMentions.MentionslegalesLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
