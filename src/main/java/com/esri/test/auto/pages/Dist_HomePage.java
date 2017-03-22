package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the ESRI Home Page of IAM Application/ Distributor Test
 * 
 * @author udhayasundar
 *
 */
public class Dist_HomePage extends ESRIWrappers {
	public Dist_HomePage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Esri - GIS Mapping Software, Solutions, Services, Map Apps, and Data")) {
			Reporter.reportStep("This is not a Home page", "FAIL");
		} else
			System.out.println("ESRI Home page Launched Successfully");
	}

	// Verify the UserName
	public Dist_HomePage verifyLoggedUserName(String userdata) throws Throwable {
		try {
			waitForPageLoad(15);
			System.out.println("verify user name: "
					+ driver.findElement(By.xpath(prop.getProperty("homepage.userName.xpath"))).getText());
			verifyValueByXpath(prop.getProperty("homepage.userName.xpath"), userdata);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify the default : Sign in UserName
	public Dist_HomePage verifyUserName(String userdata) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("homepage.signInUserNm.xpath"), userdata);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Click the UserName
	public Dist_HomePage clickLoggedUserName() throws Throwable {
		try {
			clickByXpath(prop.getProperty("homepage.userName.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// verify the logged UserFullName
	public Dist_HomePage verifyUserFullName(String fullName) throws Throwable {
		try {
			// mouseHoverById(prop.getProperty("homepage.userName.id"));
			System.out.println("verify user Full name: " + driver
					.findElement(By.className(prop.getProperty("homePage.userNameDropdown.className"))).getText());
			VerifyTextByClassName(prop.getProperty("homePage.userNameDropdown.className"), fullName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// verify the logged UserEmail
	public Dist_HomePage verifyUserEmail(String fullName) throws Throwable {
		try {
			System.out.println("verify user Email: " + driver
					.findElement(By.className(prop.getProperty("homePage.userEmailDropdown.className"))).getText());
			VerifyTextByClassName(prop.getProperty("homePage.userEmailDropdown.className"), fullName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// click sign out button
	public Dist_HomePage clickSignoutBtn() throws Throwable {
		try {
			System.out.println("verify Signout button: "
					+ driver.findElement(By.xpath(prop.getProperty("homePage.signOutDropdown.xpath"))).getText());
			clickByXpath(prop.getProperty("homePage.signOutDropdown.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	// Verify Error Message
	public Dist_HomePage verifyErrorMessage(String errorMessage) throws Throwable {
		System.out.println(
				"Error Message: " + driver.findElement(By.id(prop.getProperty("homePage.errorMessage.id"))).getText());
		VerifyTextById(prop.getProperty("homePage.errorMessage.id"), errorMessage);
		return this;
	}

	// Verify the logged out perform success or not with user name: Sign in
	public Dist_HomePage verifySignoutSuccess() throws Throwable {
		waitForPageLoad(10);
		verifyUserName("Sign In");
		return this;
	}

	// click sign out button for error message (negative scenario)
	public Dist_HomePage clickSignoutforFailure() throws Throwable {
		clickByXpath(prop.getProperty("homePage.signOutDropdown.xpath"));
		return this;
	}

	// Verify ArcGIS Platform label - Distributor Test
	
	public Dist_HomePage verifyArcGISPlatformLabel(String data) throws Throwable {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(prop.getProperty("homePage.arcGISPlatformLabel.xpath"))));
			verifyValueByXpath(prop.getProperty("homePage.arcGISPlatformLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
		
	// click back button in browser
	public Dist_Mexico_HomePage clickbsrBackBtn_MexicoHomePage() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Mexico_HomePage();
	}
	

	//Verifying Google Tag and Abobe Analytics
	
	public Dist_HomePage headerEmbedCode(String HeaderEmbedCode) throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),HeaderEmbedCode);
		return this;
	}
	public Dist_HomePage googleTagManagerForScript(String GoogleTagManagerScript) throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),GoogleTagManagerScript);
		return this;
	}	
	public Dist_HomePage googleTagManagerForNoScript(String GoogleTagManagerNoScript) throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),GoogleTagManagerNoScript);
		return this;
	}
	public Dist_HomePage footerEmbbedCode(String FooterEmbedCode) throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),FooterEmbedCode);
		return this;
	}
	public Dist_HomePage pardotDataLayerCode(String PardotLayerCode) throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),PardotLayerCode);
		return this;
	}	
}
