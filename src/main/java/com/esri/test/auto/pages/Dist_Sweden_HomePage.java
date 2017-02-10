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
public class Dist_Sweden_HomePage extends ESRIWrappers {

	public Dist_Sweden_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("Esri Sverige - GIS, digitala kartor, appar och data")) {
			Reporter.reportStep("This is not a Esri Sverige - GIS, digitala kartor, appar och data (Sweden) Home page.",
					"FAIL");
		} else
			System.out.println("Sweden Esri Sverige - GIS, digitala kartor, appar och data page Launched Successfully");
	}

	// click Om oss Tab
	public Dist_Sweden_HomePage clickOmOssTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.OmOssTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Om Esri Sverige link
	public Dist_Sweden_HomePage verifyOmEsriSverigeLink(String data) throws Throwable {
		try {
			waitForPageLoad(5);
			verifyValueByXpath(prop.getProperty("disSwedenHome.OmEsriSverigelabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Kunskap & insikt Tab
	public Dist_Sweden_HomePage clickKunskapInsiktTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.KunskapInsiktTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Om GIS Link
	public Dist_Sweden_HomePage verifyOmGISLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwedenHome.OmGISlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Branscher Tab
	public Dist_Sweden_HomePage clickBranscherTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.BranscherTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Branscher Link
	public Dist_Sweden_HomePage verifyBranscherLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwedenHome.Branscherlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Produkter Tab
	public Dist_Sweden_HomePage clickProdukterTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.ProdukterTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify ArcGIS-plattformen link
	public Dist_Sweden_HomePage verifyArcGISPlattformenLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwedenHome.ArcGISPlattformenlbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Tjänster & support Tab
	public Dist_Sweden_HomePage clickTjansterSupportTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.TjansterSupportTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Konsulttjänster Link
	public Dist_Sweden_HomePage verifyKonsulttjansterLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwedenHome.Konsulttjansterlbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Kontakt Tab
	public Dist_Sweden_HomePage clickKontaktTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.KontaktTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Kontakta oss link
	public Dist_Sweden_HomePage verifyKontaktaOssLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwedenHome.KontaktaOsslbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click search icon link
	public Dist_Sweden_Sok_EsriPage clickSearchIcon() throws Throwable {
		try {
			clickById(prop.getProperty("disSwedenHome.searchIcon.id"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Sweden_Sok_EsriPage();
	}

	// enter the data to search text box
	public Dist_Sweden_HomePage enterSearchTextBox(String data) throws Throwable {
		try {
			enterById(prop.getProperty("disSwedenHome.searchTextBox.id"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Om cookies footer link
	public Dist_Sweden_OmCookiesPage clickOmCookiesFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.OmCookiesFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Sweden_OmCookiesPage();
	}

	// click Kontakta oss link
	public Dist_Sweden_KontaktaOssPage clickKontaktaOssFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwedenHome.KontaktaOssFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Sweden_KontaktaOssPage();
	}

}
