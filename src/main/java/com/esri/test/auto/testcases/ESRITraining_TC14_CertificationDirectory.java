package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.esri.test.auto.pages.EsriTrainingCourseCertification;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This test case is to check course certification page.
 * 
 * @author Sivaprakash
 *
 */
public class ESRITraining_TC14_CertificationDirectory extends ESRIWrappers {
	@BeforeClass
	public void startTestCase() {
		dataSheetName = "ESRITraining_TC14_CertificationDirectory";
		testCaseName = "ESRITraining_TC14_CertificationDirectory";
		testDescription = "Verify Course Certification Page";
	}

	@Test(dataProvider="fetchdata")
	public void loginforSuccess(String url,String searchKeyword, String filterValue, String filterCertificate) throws Throwable {
		
		openbrowser(url);
		new EsriTrainingCourseCertification()
		.search(searchKeyword)
		.clickSearch()
		.filterSelect(filterValue)
		.filterSelectCertificate(filterCertificate)
		.results();
	}

}
