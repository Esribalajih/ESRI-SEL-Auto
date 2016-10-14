package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is a ArcGISDesktop Extensions Page
 * @author balajih
 *
 */
public class ArcGISforDesktopExtnPage extends ESRIWrappers{

	public ArcGISforDesktopExtnPage() throws Throwable {
		if(!VerifyTitle("ArcGIS for Desktop | Extensions"));
		Reporter.reportStep("This is not the ArcGISDesktop Extensions Page", "FAIL");
	}

	public ArcGISforDesktopExtnPage clickExtensionsTab() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.subMenuExtensionslink.xpath"));
		return this;
	}
	public ArcGISforDesktopExtnPage verifyExtenHeader(String data) throws Throwable {
		VerifyTextByXpath(prop.getProperty("arcGISDesktopExtPage.extensionHeader.xpath"), data);
		return this;
	}

	public ArcGISforDesktopExtnPage clickShowAllLink() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.showhideAlllink.xpath"));
		return this;
	}

	public ArcGISforDesktopExtnPage clickHideAllLink() throws Throwable {
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.showhideAlllink.xpath"));
		return this;
	}

	public ArcGISforDesktopExtnPage clickAdvAnalysPlus() throws Throwable {
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.extnAAplus.xpath"));
		return this;
	}

	public ArcGISforDesktopExtnPage clickAdvAnalysHdr() throws Throwable {
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.extnAAheader.xpath"));
		return this;
	}
	
	public ArcGISforDesktopExtnPage clickAdvAnalysKeyBenefit() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.extnAAKeyBenheader.xpath"));
		return this;
	}
	
	public ArcGISforDesktopExtnPage clickDataWFPlus() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.extndataandwfplus.xpath"));
		return this;
	}
	
	public ArcGISforDesktopExtnPage clickDataWFHdr() throws Throwable {
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.extndataandwfHdr.xpath"));
		return this;
	}
	
	public ArcGISforDesktopExtnPage clickDataWFKeyBenefit() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.extnDFKeyBenHdr.xpath"));
		return this;
	}
	
	public ArcGISforDesktopExtnPage clickIndustryFocusedPlus() throws Throwable {
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.extnIFplus.xpath"));
		return this;
	}
	
	public ArcGISforDesktopExtnPage clickIndustryfocusedHdr() throws Throwable {
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.extnIndFocHdr.xpath"));
		return this;
	}
	
	public ArcGISforDesktopExtnPage clickIndustryfocusedKeyBenefit() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.extnIFKeyBenHdr.xpath"));
		return this;
	}
	
	public ArcGISforDesktopExtnPage clickNoCostAddonPlus() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.extnNCAplus.xpath"));
		return this;
	}
	
	public ArcGISforDesktopExtnPage clickNoCostAddonHdr() throws Throwable {
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.extnNCAHdr.xpath"));
		return this;
	}
	
	public ArcGISforDesktopExtnPage clickNoCostAddonKeyBenefit() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.extnNCAKenBen.xpath"));
		return this;
	}

	public ArcGISforDesktopExtnPage clickArcGISforDesktopExtnPDF() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopExtPage.arcGIDDesktopExtnPDF.xpath"));
		return this;
	}
	
	public ArcGISforDesktopMainPage clickMainTab() throws Throwable{
		clickByXpath(prop.getProperty("arcGISDesktopMainPage.subMenuMainlink.xpath"));
		return new ArcGISforDesktopMainPage();
	}
}
