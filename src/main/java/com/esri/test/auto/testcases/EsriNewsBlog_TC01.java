package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.ESRI_NEWS_OverviewPage;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author balajih
 *
 */
public class EsriNewsBlog_TC01 extends ESRIWrappers {
	@Parameters({"browsers"})
	@BeforeClass
	public void startTestcase(){
		dataSheetName="EsriNewsBlog_TC01";
		testCaseName="Esri News Blog Page_TC01";
		testDescription="This is the testcase for Testing Esri News Blog module - Positive Test scenario";
	}
	
	@Test(dataProvider="fetchdata")
	public void esriNewsBlog(String EsriNewsBlogURL, String mainHdr, String userOdata, String RHdr, 
			String userRdata, String FilterResult, String InNewsHdr, String userIdata, String FilterIResult,
			String PubHdr, String EsriStoriesHdr, String BlogHdr, String MRHdr) throws Throwable{
		openbrowser(EsriNewsBlogURL);
		new ESRI_NEWS_OverviewPage()
		.verifyMainHeader(mainHdr)
		.enterSearchKey(userOdata)
		.clickSearchBtn()
		.clickReleasesPageMenuLink()
		.verifyPageHeader(RHdr)
		.enterSearchKey(userRdata)
		.verifyFilterResultscountDisplay(FilterResult)
		.clickIntheNewsPageMenuLink()
		.verifyPageHeader(InNewsHdr)
		.enterSearchKey(userIdata)
		.verifyFilterResultsCountDisplay(FilterIResult)
		.clickPublicationsPageMenuLink()
		.verifyPageHeader(PubHdr)
		//.clickArcNewsLink()
		//.clickBwrBckBtn()
		//.clickArcUserLink()
		//.clickBwrBckBtn()
		//.clickArcWatchLink()
		//.clickBwrBckBtn()
		.clickEsriStoriesPageMenuLink()
		.verifyPageHeader(EsriStoriesHdr)
		.clickBlogsPageMenuLink()
		.verifyPageHeader(BlogHdr)
		.clickMediaRelationsPageMenuLink()
		.verifyPageHeader(MRHdr);
		//.clickBwrBckBtntoOverview();
		
		
		
		
		
	}
}
