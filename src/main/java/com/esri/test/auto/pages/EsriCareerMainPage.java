package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is the Esri Career Main Page
 * @author balajih
 *
 */
public class EsriCareerMainPage extends ESRIWrappers {
	
	public EsriCareerMainPage() throws Throwable{
		if(!VerifyTitle("Careers at Esri")){
			Reporter.reportStep("this is not a Esri Career Page", "FAIL");
		}
	}
	
	public EsriCareerMainPage verifyCareerMainHdr(String careerMHdr){
		try {
			VerifyTextByXpath(prop.getProperty("CareerMainPage.mainHdr.xpath"), careerMHdr);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return this;
	}
		public EsriCareerMainPage clickScrolltoExplore() throws Throwable{
			clickByClassName(prop.getProperty("CareerMainPage.Login.classname"));
			return this;
		}
		
		public EsriCareerBlogPage clickBlogLink() throws Throwable{
			clickByXpath(prop.getProperty("CareerMainPage.bloglink.xpath"));
			return new EsriCareerBlogPage();
		}
		
		
		public EsriCareerJobDetailsPage clickComeJoinUS() throws Throwable{
			clickByLinkText(prop.getProperty("CareerMainPage.ComeJoin.linktext"));
			return new EsriCareerJobDetailsPage();
		}
	
	

}
