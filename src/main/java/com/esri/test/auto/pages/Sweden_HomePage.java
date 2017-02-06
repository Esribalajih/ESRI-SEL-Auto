package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Sweden Esri Sverige - GIS, digitala kartor, appar och data Page
 * of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Sweden_HomePage extends ESRIWrappers {

	public Sweden_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("Esri Sverige - GIS, digitala kartor, appar och data")) {
			Reporter.reportStep("This is not a Esri Sverige - GIS, digitala kartor, appar och data (Sweden) Home page.",
					"FAIL");
		} else
			System.out.println("Sweden Esri Sverige - GIS, digitala kartor, appar och data page Launched Successfully");
	}

	// click Om oss Tab
	public Sweden_HomePage clickOmOssTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.OmOssTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Om Esri Sverige link
	public Sweden_HomePage verifyOmEsriSverigeLink(String data) throws Throwable {
		try {
			waitForPageLoad(5);
			verifyValueByXpath(prop.getProperty("disSwedenHome.OmEsriSverigelabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Kunskap & insikt Tab
	public Sweden_HomePage clickKunskapInsiktTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.KunskapInsiktTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Om GIS Link
	public Sweden_HomePage verifyOmGISLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwedenHome.OmGISlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Branscher Tab
	public Sweden_HomePage clickBranscherTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.BranscherTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Branscher Link
	public Sweden_HomePage verifyBranscherLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwedenHome.Branscherlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Produkter Tab
	public Sweden_HomePage clickProdukterTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.ProdukterTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify ArcGIS-plattformen link
	public Sweden_HomePage verifyArcGISPlattformenLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwedenHome.ArcGISPlattformenlbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Tjänster & support Tab
	public Sweden_HomePage clickTjansterSupportTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.TjansterSupportTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Konsulttjänster Link
	public Sweden_HomePage verifyKonsulttjansterLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwedenHome.Konsulttjansterlbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Kontakt Tab
	public Sweden_HomePage clickKontaktTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.KontaktTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Kontakta oss link
	public Sweden_HomePage verifyKontaktaOssLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwedenHome.KontaktaOsslbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click search icon link
	public Sweden_Sok_EsriPage clickSearchIcon() throws Throwable {
		try {
			clickById(prop.getProperty("disSwedenHome.searchIcon.id"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Sweden_Sok_EsriPage();
	}

	// enter the data to search text box
	public Sweden_HomePage enterSearchTextBox(String data) throws Throwable {
		try {
			enterById(prop.getProperty("disSwedenHome.searchTextBox.id"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Om cookies footer link
	public Sweden_OmCookiesPage clickOmCookiesFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.OmCookiesFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Sweden_OmCookiesPage();
	}

	// click Kontakta oss link
	public Sweden_KontaktaOssPage clickKontaktaOssFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.KontaktaOssFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Sweden_KontaktaOssPage();
	}

}
