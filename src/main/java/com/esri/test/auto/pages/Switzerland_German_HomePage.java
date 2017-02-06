package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Switzerland German Home | Esri Schweiz Page of ESRI Distributor
 * Application
 * 
 * @author Udhayasundar S
 *
 */
public class Switzerland_German_HomePage extends ESRIWrappers {

	public Switzerland_German_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("Home | Esri Schweiz")) {
			Reporter.reportStep("Home | Esri Schweiz (Switzerland German) Home page.", "FAIL");
		} else
			System.out.println("Switzerland German Home | Esri Schweiz Launched Successfully");
	}

	// click Branchen Tab
	public Switzerland_German_HomePage clickBranchenTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzGerHome.BranchenTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Telekommunikation link
	public Switzerland_German_HomePage verifyTelekommunikationLink(String data) throws Throwable {
		try {
			waitForPageLoad(5);
			verifyValueByXpath(prop.getProperty("disSwitzGerHome.Telekommunikationlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Produkte Tab
	public Switzerland_German_HomePage clickProdukteTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzGerHome.ProdukteTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify ArcGIS Plattform Link
	public Switzerland_German_HomePage verifyArcGISPlattformLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwitzGerHome.ArcGISPlattformlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Services Tab
	public Switzerland_German_HomePage clickServicesTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzGerHome.ServicesTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Schulung Link
	public Switzerland_German_HomePage verifySchulungLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwitzGerHome.Schulunglabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click GIS-Community Tab
	public Switzerland_German_HomePage clickGISCommunityTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzGerHome.GISCommunityTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify GeoNet link
	public Switzerland_German_HomePage verifyGeoNetLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwitzGerHome.GeoNetlbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Über uns Tab
	public Switzerland_German_HomePage clickUberunsTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzGerHome.UberunsTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Jobs Link
	public Switzerland_German_HomePage verifyJobsLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwitzGerHome.Jobslbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Deutsch Link
	public Switzerland_German_HomePage verifyDeutschLink(String data) throws Throwable {
		try {
			verifyValueById(prop.getProperty("disSwitzGerHome.CurrentLandLabel.id"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click search icon link
	public Switzerland_German_SuchePage clickSearchIcon() throws Throwable {
		try {
			clickById(prop.getProperty("disSwitzGerHome.searchIcon.id"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Switzerland_German_SuchePage();
	}

	// enter the data to search text box
	public Switzerland_German_HomePage enterSearchTextBox(String data) throws Throwable {
		try {
			enterById(prop.getProperty("disSwitzGerHome.searchTextBox.id"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Kontakt footer link
	public Switzerland_German_KontaktPage clickKontaktFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzGerHome.KontaktFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Switzerland_German_KontaktPage();
	}

	// click Rechtliches footer link
	public Switzerland_German_LizenzbedingungenPage clickRechtlichesFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzGerHome.RechtlichesFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Switzerland_German_LizenzbedingungenPage();
	}

	// click Impressum footer link
	public Switzerland_German_ImpressumPage clickImpressumFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzGerHome.ImpressumFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Switzerland_German_ImpressumPage();
	}

	// click Datenschutz footer link
	public Switzerland_German_DatenschutzPage clickDatenschutzFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzGerHome.DatenschutzFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Switzerland_German_DatenschutzPage();
	}

	// click Home footer link
	public Switzerland_German_HomePage clickHomeFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzGerHome.HomeFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
