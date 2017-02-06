package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Switzerland French Accueil | Esri Suisse Page of ESRI Distributor
 * Application
 * 
 * @author Udhayasundar S
 *
 */
public class Switzerland_French_HomePage extends ESRIWrappers {

	public Switzerland_French_HomePage() throws Throwable {
		waitForPageLoad(5);
		if (!VerifyTitle("Accueil | Esri Suisse")) {
			Reporter.reportStep("Accueil | Esri Suisse (Switzerland French) Home page.", "FAIL");
		} else
			System.out.println("Switzerland French Accueil | Esri Suisse Launched Successfully");
	}

	// click Secteurs Tab
	public Switzerland_French_HomePage clickSecteursTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzFreHome.SecteursTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Télécommunication link
	public Switzerland_French_HomePage verifyTelecommunicationLink(String data) throws Throwable {
		try {
			waitForPageLoad(5);
			verifyValueByXpath(prop.getProperty("disSwitzFreHome.Telecommunicationlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Produits Tab
	public Switzerland_French_HomePage clickProduitsTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzFreHome.ProduitsTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Plateforme ArcGIS Link
	public Switzerland_French_HomePage verifyPlateformeArcGISLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwitzFreHome.PlateformeArcGISlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Services Tab
	public Switzerland_French_HomePage clickServicesTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzFreHome.ServicesTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Formation Link
	public Switzerland_French_HomePage verifyFormationLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwitzFreHome.Formationlabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Communauté SIG Tab
	public Switzerland_French_HomePage clickCommunauteSIGTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzFreHome.CommunauteSIGTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify GeoNet link
	public Switzerland_French_HomePage verifyGeoNetLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwitzFreHome.GeoNetlbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click A propos de nous Tab
	public Switzerland_French_HomePage clickAproposdenousTab() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzFreHome.AproposdenousTab.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Postes Link
	public Switzerland_French_HomePage verifyPostesLink(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disSwitzFreHome.Posteslbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify français Link
	public Switzerland_French_HomePage verifyFrancaisLink(String data) throws Throwable {
		try {
			verifyValueById(prop.getProperty("disSwitzFreHome.CurrentLandLabel.id"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click search icon link
	public Switzerland_French_RecherchePage clickSearchIcon() throws Throwable {
		try {
			clickById(prop.getProperty("disSwitzFreHome.searchIcon.id"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Switzerland_French_RecherchePage();
	}

	// enter the data to search text box
	public Switzerland_French_HomePage enterSearchTextBox(String data) throws Throwable {
		try {
			enterById(prop.getProperty("disSwitzFreHome.searchTextBox.id"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click Contact footer link
	public Switzerland_French_ContactPage clickContactFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzFreHome.ContactFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Switzerland_French_ContactPage();
	}

	// click Informations juridiques footer link
	public Switzerland_French_CondLicencePage clickInformationsjuridiquesFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzFreHome.InformationsjuridiquesFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Switzerland_French_CondLicencePage();
	}

	// click Mentions légales footer link
	public Switzerland_French_MentionsLegalPage clickMentionslegalesFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzFreHome.MentionslegalesFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Switzerland_French_MentionsLegalPage();
	}

	// click Protection des données footer link
	public Switzerland_French_ProtectionPage clickProtectiondesdonneesFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzFreHome.ProtectiondesdonneesFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Switzerland_French_ProtectionPage();
	}

	// click Accueil footer link
	public Switzerland_French_HomePage clickAccueilFooterlink() throws Throwable {
		try {
			clickByXpath(prop.getProperty("disSwitzFreHome.AccueilFooterlink.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
