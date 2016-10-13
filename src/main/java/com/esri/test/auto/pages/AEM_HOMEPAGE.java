package com.esri.test.auto.pages;



import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author Mohamed
 * This is the home page of AEM
 *
 */
public class AEM_HOMEPAGE extends ESRIWrappers {
	public AEM_HOMEPAGE() throws Throwable{
		waitForPageLoad(2);
		}
		
	
    //Verify the page Title
	public AEM_HOMEPAGE verifyTitle() throws Throwable {
		waitForPageLoad(2);
		if(!VerifyTitle("AEM Projects")){
			Reporter.reportStep("This is not a Home page", "FAIL");
		}
		else System.out.println("Home page Launched Successfully");
		return this;
		}

	//Click on Asset tab
	public AEM_HOMEPAGE clickOnAsset() throws Throwable{
		
		try{
			
			clickByXpath(prop.getProperty("Homepage.asset.xpath"));
			waitForPageLoad(2);
			}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
	
		}
		
		}

