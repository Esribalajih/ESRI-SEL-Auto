/**
 * 
 */
package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author thenmozhis
 *
 */
public class Cherwell_SS_ForMoreInformationDetailsPage extends ESRIWrappers {
	
	public Cherwell_SS_ForMoreInformationDetailsPage() throws Throwable{
		if(!VerifyTitle("Information Systems and Technology - File Transfers"))
			Reporter.reportStep("This is not a Information Systems and Technology - File Transfers Page", "FAIL");
		else
			System.out.println("Information Systems and Technology - File Transfers Launched Successfully!");
	}
	
	// click back button Tab
	public Cherwell_SS_IncidentPage clickbsrBackBtn() throws Throwable {
		try {
			if (VerifyTitle("Information Systems and Technology - File Transfers")) 
				clickBrowserBackButton();
		} catch (Exception e) {
				e.printStackTrace();
		}
		return new Cherwell_SS_IncidentPage();
	}
	
}
