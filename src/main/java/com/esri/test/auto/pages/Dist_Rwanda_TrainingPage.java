package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Rwanda Training | Esri Rwanda Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Rwanda_TrainingPage extends ESRIWrappers {
	public Dist_Rwanda_TrainingPage() throws Throwable {
		waitForPageLoad(10);
		if (!VerifyTitle("Training | Esri Rwanda")) {
			Reporter.reportStep("This is not a Training | Esri Rwanda (Rwanda) page.", "FAIL");
		} else
			System.out.println("Rwanda Training | Esri Rwanda page Launched Successfully");
	}

	// click back button in browser
	public Dist_Rwanda_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Rwanda_HomePage();
	}

	// verify Training label
	public Dist_Rwanda_TrainingPage verifyTraininglbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disRwandaTrg.trainingLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
