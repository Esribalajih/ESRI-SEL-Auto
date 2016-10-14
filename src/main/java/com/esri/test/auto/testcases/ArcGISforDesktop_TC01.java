/**
 * 
 */
package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.ArcGISforDesktopMainPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author balajih
 *
 */
public class ArcGISforDesktop_TC01 extends ESRIWrappers{
	@Parameters({"browsers"})
	@BeforeClass
	public void startTestcase(){
		dataSheetName="ArcGISforDesktop";
		testCaseName="ArcGIS for Desktop Page";
		testDescription="This is the testcase for Testing ArcGIS Desktop module - Positive Test scenario";
	}
	
	@Test
	public void arcgisforDesktop (String URL, String mainHdr) throws Throwable{
		openbrowser(URL);
		new ArcGISforDesktopMainPage().clickMainTab().verifyMainHeader(mainHdr);
		
	}

}
