package com.esri.test.auto.wrappers;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.google.common.base.Predicate;
import com.esri.test.auto.utils.Reporter;

/**This is the Generic Wrapper Methods called with in Pages and Test cases for Handling WebElements from the WebBrowser.
 * @author balajih
 *
 */
public class GenericWrappers implements WrappersInterface{

	protected static RemoteWebDriver driver;
	protected static Properties prop;
	public String sUrl,primaryWindowHandles,sHubUrl,sHubPort;
	private String primaryWindowHandle;
	private String ANY;
	private List<WebElement> tagElements;
	private List<String> tagContents;
	private int tagContentsSize;
	protected static String browserName;
	
	/**This Constructor is used to load the configuration properties for Selenium Grid 2.0 
	 * 
	 */
	public GenericWrappers(){
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("./Config/config.properties")));
			sHubUrl=prop.getProperty("HUB");
			sHubPort=prop.getProperty("PORT");
			sUrl=prop.getProperty("URL");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**This method is to Invoke the Browser
	 * @author balajih
	 * @param browser - name of the webelement
	 * 
	 */
	//public void invokeApp(String browser, String version){
		public void invokeApp(String browser){
		boolean bReturn=false;
		browserName=browser;
		//System.out.println("1"+browserName);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		//dc.setVersion(version);
		dc.setPlatform(Platform.WINDOWS);
		try {
			killAllDrivers();
			driver = new RemoteWebDriver(new URL("http://"+ sHubUrl +":"+ sHubPort +"/wd/hub"),dc);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(sUrl);
			clearCookies(browser, dc);

			primaryWindowHandle = driver.getWindowHandle();

			try {
				Reporter.reportStep("The Browser  "+ browser +" launched Successfully.", "PASS");
				bReturn=true;
			} catch (Exception e) {
				e.printStackTrace();


				Reporter.reportStep("The Browser  "+ browser +" could not be launched Successfully.", "FAIL");
				bReturn=false;
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	/**This Method is to load Objects from the Object Property file
	 * @author balajih
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void loadObjects() {
		prop =new Properties();
		try {
			prop.load(new FileInputStream(new File("./src/test/resources/object.properties")));
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**This Method is to load test data from the Object Property file
	 * @author balajih
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void loadTestdata() {
		prop =new Properties();
		try {
			prop.load(new FileInputStream(new File("./src/test/resources/testdata.properties")));
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	
	/**This method will enter the value as text field using Id attribute to locate
	 * @author Balajih 
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean enterById(String idValue,String data) throws Throwable{
		boolean bReturn = false;
		try{
			driver.findElement(By.id(idValue)).clear();
			driver.findElement(By.id(idValue)).sendKeys(data);
			Reporter.reportStep("The data "+ data +" is entered successfully.", "PASS");
			bReturn = true;
		} catch (NoSuchElementException e) {
			Reporter.reportStep("The data "+ data +" couldn't be entered successfully.", "FAIL");
		} catch (Exception e) {
			Reporter.reportStep("The data "+ data +" is not entered successfully.", "FAIL");
		}
		return bReturn;
	}

	/**This method will enter the value as text field using Name attribute to locate
	 * @author Balajih
	 * @param nameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean enterByName(String nameValue,String data) throws Throwable{
		boolean bReturn = false;
		try {
			driver.findElement(By.name(nameValue)).clear();
			driver.findElement(By.name(nameValue)).sendKeys(data);
			Reporter.reportStep("The data "+ data +" is entered successfully.", "PASS");
			bReturn = true;
		}  catch (NoSuchElementException e){
			Reporter.reportStep("The data "+ data +" couldn't be entered successfully.", "FAIL");
		}  catch (Exception e) {
			Reporter.reportStep("The data "+ data +" is not entered successfully.", "FAIL");
		}
		return bReturn;
	}

	/**This method will enter the value as text field using ClassName attribute to locate
	 * @author Balajih
	 * @param cnameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean enterByClassName(String cnameValue,String data) throws Throwable{
		boolean bReturn = false;
		try {
			driver.findElement(By.className(cnameValue)).clear();
			driver.findElement(By.className(cnameValue)).sendKeys(data);
			Reporter.reportStep("The data "+ data +" is entered successfully.", "PASS");
			bReturn = true;
		}  catch (NoSuchElementException e){
			Reporter.reportStep("The data "+ data +" couldn't be entered successfully.", "FAIL");
		} catch (Exception e) {
			Reporter.reportStep("The data "+ data +" is not entered successfully.", "FAIL");
		}
		return bReturn;
	}
	/**This method will enter the value as text field using CssSelector attribute to locate
	 * @author Balajih
	 * @param cssValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean enterByCssSelector(String cssValue,String data) throws Throwable{
		boolean bReturn = false;
		try {
			driver.findElement(By.cssSelector(cssValue)).clear();
			driver.findElement(By.cssSelector(cssValue)).sendKeys(data);
			Reporter.reportStep("The data "+ data +" is entered successfully.", "PASS");
			bReturn = true;
		} catch (NoSuchElementException e){
			Reporter.reportStep("The data "+ data +" couldn't be entered successfully.", "FAIL");
		} catch (Exception e) {
			Reporter.reportStep("The data "+ data +" is not entered successfully.", "FAIL");
		}
		return bReturn;
	}

	/**This method will enter the value as text field using Xpath attribute to locate
	 * @author Balajih
	 * @param xpathValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean enterByXpath(String xpathValue,String data) throws Throwable{
		boolean bReturn = false;
		try {
			driver.findElement(By.xpath(xpathValue)).clear();
			driver.findElement(By.xpath(xpathValue)).sendKeys(data);
			Reporter.reportStep("The data "+ data +" is entered successfully.", "PASS");
			bReturn = true;
		} catch (NoSuchElementException e){
			Reporter.reportStep("The data "+ data +" couldn't be entered successfully.", "FAIL");
		} catch (Exception e) {
			Reporter.reportStep("The data "+ data +" is not entered successfully.", "FAIL");
		}
		return bReturn;
	}
	
	/**This method will enter the value as text field using tagname attribute to locate
	 * @author Balajih 
	 * @param tagValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean enterByTagname(String tagValue,String data) throws Throwable{
		boolean bReturn = false;
		try {
			driver.findElement(By.tagName(tagValue)).clear();
			driver.findElement(By.tagName(tagValue)).sendKeys(data);
			Reporter.reportStep("The data "+ data +" is entered successfully.", "PASS");
			bReturn = true;
		} catch (NoSuchElementException e){
			Reporter.reportStep("The data "+ data +" couldn't be entered successfully.", "FAIL");
		} catch (Exception e) {
			Reporter.reportStep("The data "+ data +" is not entered successfully.", "FAIL");
		}
		return bReturn;
	}

	/**This method will verify the fetched title is matching or not.
	 * @author balajih
	 * @param title - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean VerifyTitle(String title) throws Throwable {
		boolean bReturn=false;
		if(driver.getTitle().trim().equalsIgnoreCase(title)){
			try {
				Reporter.reportStep("The title of the page "+ title+" is matching successfully.", "PASS");
				bReturn=true;

			} catch (Exception e) {
				Reporter.reportStep("The title of the page "+ title+" is not matching successfully.", "FAIL");
				bReturn=false;
			}
		}
		return bReturn;
	}
	
	/**This method will verify the fetched Window title is displayed or not.
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean VerifyWindowTitleById(String idValue, String WinTitle) throws Throwable {
		boolean bReturn=false;
		try{
		if(driver.findElement(By.id(idValue)).getText().equalsIgnoreCase(WinTitle)){
				Reporter.reportStep("The title of the Window "+ WinTitle+" is displayed successfully.", "PASS");
				bReturn=true;
			}
			} catch (NoSuchElementException e){
				Reporter.reportStep("The title of the Window "+ WinTitle+" is not available to check.", "FAIL");
			}	catch (Exception e) {
				Reporter.reportStep("The title of the Window "+ WinTitle+" is not displayed successfully.", "FAIL");
			}
		return bReturn;
	}
	
	/**This method will verify the fetched Window title is displayed or not.
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean VerifyWindowTitleByXpath(String xpathValue, String WinTitle) throws Throwable {
		boolean bReturn=false;
		try{
		if(driver.findElement(By.xpath(xpathValue)).getText().equalsIgnoreCase(WinTitle)){
				Reporter.reportStep("The title of the Window "+ WinTitle+" is displayed successfully.", "PASS");
				bReturn=true;
			}
			} catch (NoSuchElementException e){
				Reporter.reportStep("The title of the Window "+ WinTitle+" is not available to check.", "FAIL");
			}	catch (Exception e) {
				Reporter.reportStep("The title of the Window "+ WinTitle+" is not displayed successfully.", "FAIL");
			}
		return bReturn;
	}

	/**This method will verify the entered value in text field using Id attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean VerifyTextById(String idValue,String data) throws Throwable{
		boolean bReturn = false;
		try {
			if(driver.findElement(By.id(idValue)).getText().equalsIgnoreCase(data)){
				Reporter.reportStep("The data "+ data +" is Read successfully.", "PASS");
				bReturn = true;
			}
		}  catch (NoSuchElementException e){
			Reporter.reportStep("The data "+ data +" is not available to verify.", "FAIL");
		} catch (Exception e) {
			Reporter.reportStep("The data "+ data +" is not Read successfully.", "FAIL");
		}	
		return bReturn;
	}

	/**This method will verify the entered value in text field using Name attribute to locate
	 * @author balajih
	 * @param nameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean VerifyTextByName(String nameValue,String data) throws Throwable{
		boolean bReturn = false;
		try {
			if(driver.findElement(By.name(nameValue)).getText().equalsIgnoreCase(data)){
				Reporter.reportStep("The data "+ data +" is Read successfully.", "PASS");
				bReturn = true;
			}
		} catch (Exception e) {
			Reporter.reportStep("The data "+ data +" is not Read successfully.", "FAIL");
		}	
		return bReturn;
	}

	/**This method will verify the entered value in text field using Class Name attribute to locate
	 * @author balajih
	 * @param cnameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean VerifyTextByClassName(String cnameValue,String data) throws Throwable{
		boolean bReturn = false;
		try {
			if(driver.findElement(By.className(cnameValue)).getText().equalsIgnoreCase(data)){
				Reporter.reportStep("The data "+ data +" is Read successfully.", "PASS");
				bReturn = true;
			}
		} catch (Exception e) {
			Reporter.reportStep("The data "+ data +" is not Read successfully.", "FAIL");

		}	
		return bReturn;
	}
	
	/**This method will verify the entered value in text field using CSS Selector attribute to locate
	 * @author balajih
	 * @param cssValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean VerifyTextByCssSelector(String cssValue,String data) throws Throwable{
		boolean bReturn = false;
		try {
			if(driver.findElement(By.cssSelector(cssValue)).getText().equalsIgnoreCase(data)){
				Reporter.reportStep("The data "+ data +" is Read successfully.", "PASS");
				bReturn = true;
			}
		} catch (Exception e) {
			Reporter.reportStep("The data "+ data +" is not Read successfully.", "FAIL");

		}	
		return bReturn;
	}
	
	/**This method will verify the entered value in text field using Xpath Value attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean VerifyTextByXpath(String xpathValue,String data) throws Throwable{
		boolean bReturn = false;
		try {
			if(driver.findElement(By.xpath(xpathValue)).getText().trim().equalsIgnoreCase(data)){
				Reporter.reportStep("The data "+ data +" is Read successfully.", "PASS");
				bReturn = true;
			}
			else Reporter.reportStep("The data "+ data +" which is not matching correctly.", "FAIL");
		} catch (Exception e) {
			Reporter.reportStep("The data "+ data +" is not Read Successfully.", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will verify the entered value in text field using tagName attribute to locate
	 * @author balajih
	 * @param tagValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean VerifyTextBytagName(String tagValue,String data) throws Throwable{
		boolean bReturn = false;
		try {
			if(driver.findElement(By.tagName(tagValue)).getText().equalsIgnoreCase(data)){
				Reporter.reportStep("The data "+ data +" is Read successfully.", "PASS");
				bReturn = true;
			}
			else Reporter.reportStep("The data "+ data +" which is not matching correctly.", "FAIL");
		} catch (Exception e) {
			Reporter.reportStep("The data "+ data +" is not Read successfully.", "FAIL");
		}	
		return bReturn;
	}	
	
	/**This method will check the click of the buttons or links using the Id attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable 
	 */
	public boolean clickById(String idValue) throws Throwable{
		boolean bReturn = false;
		try {
			Reporter.reportStep("The Button is clicked successfully", "PASS");
			driver.findElement(By.id(idValue)).click();
			
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Button is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the buttons using the Id attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be displayed in the Report.
	 * @return
	 * @throws Throwable 
	 */
	public boolean clickButtonById(String idValue, String data) throws Throwable{
		boolean bReturn = false;
		try {
			Reporter.reportStep("The Button "+ data +" is clicked successfully", "PASS");
			driver.findElement(By.id(idValue)).click();
			Reporter.reportStep("The Button "+ data +" is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Button "+ data +" is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the Links using the Id attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be displayed in the Report.
	 * @return
	 * @throws Throwable 
	 */
	public boolean clickLinkById(String idValue, String data) throws Throwable{
		boolean bReturn = false;
		try {
			Reporter.reportStep("The Link "+ data +" is clicked successfully", "PASS");
			driver.findElement(By.id(idValue)).click();
			Reporter.reportStep("The Link "+ data +" is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Link "+ data +" is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the buttons using the Name attribute to locate
	 * @author balajih
	 * @param nameValue - name of the webelement
	 * @return
	 * @throws Throwable 
	 */
	public boolean clickByName(String nameValue) throws Throwable{
		boolean bReturn = false;
		try {
			Reporter.reportStep("The Button is clicked successfully", "PASS");
			driver.findElement(By.name(nameValue)).click();
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Button is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}

	/**This method will check the click of the buttons or links using the Class Name attribute to locate
	 * @author balajih
	 * @param cnameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickByClassName(String cnameValue) throws Throwable{
		boolean bReturn = false;
		try {
			Reporter.reportStep("The Button is clicked successfully", "PASS");
			driver.findElement(By.className(cnameValue)).click();
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Button is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the buttons or links using the Class Name attribute to locate
	 * @author balajih
	 * @param cnameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickButtonByClassName(String cnameValue, String data) throws Throwable{
		boolean bReturn = false;
		try {
			Reporter.reportStep("The Button "+ data +" is clicked successfully", "PASS");
			driver.findElement(By.className(cnameValue)).click();
			Reporter.reportStep("The Button "+ data +" is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Button "+ data +" is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the buttons or links using the CSS Selector attribute to locate
	 * @author balajih
	 * @param cssValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickByCssSelector(String cssValue) throws Throwable{
		boolean bReturn = false;
		try {
			Reporter.reportStep("The Button is clicked successfully", "PASS");
			driver.findElement(By.cssSelector(cssValue)).click();
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Button is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the buttons using the CSS Selector attribute to locate
	 * @author balajih
	 * @param cssValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickButtonByCssSelector(String cssValue, String data) throws Throwable{
		boolean bReturn = false;
		try {
			//Reporter.reportStep("The Button "+ data +" is clicked successfully", "PASS");
			driver.findElement(By.cssSelector(cssValue)).click();
			Reporter.reportStep("The Button "+ data +" is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Button  "+ data +" is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the buttons or links using the Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickByXpath(String xpathValue) throws Throwable{
		boolean bReturn = false;
		try {
			Reporter.reportStep("The Button is clicked successfully", "PASS");
			driver.findElement(By.xpath(xpathValue)).click();
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Button is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	

	/**This method will check the click of the buttons using the Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickButtonByXpath(String xpathValue, String data) throws Throwable{
		boolean bReturn = false;
		try {
			Reporter.reportStep("The "+ data +" button is clicked successfully", "PASS");
			driver.findElement(By.xpath(xpathValue)).click();
			Reporter.reportStep("The "+ data +" button is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The "+ data +" button is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the Drop-down list Option using the Xpath attribute to locate
	 * This is mainly used for Kendo-UI Drop down list
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickOptionByXpath(String xpathValue, String data) throws Throwable{
		boolean bReturn = false;
		try {
			//Reporter.reportStep("The "+ data +" option is selected successfully", "PASS");
			driver.findElement(By.xpath(xpathValue)).click();
			Reporter.reportStep("The "+ data +" option is selected successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The "+ data +" option is not selected successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the Drop-down list Option using the CSS Selector attribute to locate
	 * This is mainly used for Kendo-UI Drop down list
	 * @author balajih
	 * @param CssValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickOptionByCssSelector(String CssValue, String data) throws Throwable{
		boolean bReturn = false;
		try {
			//Reporter.reportStep("The "+ data +" option is selected successfully", "PASS");
			driver.findElement(By.cssSelector(CssValue)).click();
			Reporter.reportStep("The "+ data +" option is selected successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The "+ data +" option is not selected successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the buttons using the Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickTabByXpath(String xpathValue, String data) throws Throwable{
		boolean bReturn = false;
		try {
			Reporter.reportStep("The "+ data +" tab is clicked successfully", "PASS");
			driver.findElement(By.xpath(xpathValue)).click();
			Reporter.reportStep("The "+ data +" tab is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The "+ data +" tab is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the buttons using the Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickTabByClassname(String CValue, String data) throws Throwable{
		boolean bReturn = false;
		try {
			Reporter.reportStep("The "+ data +" tab is clicked successfully", "PASS");
			driver.findElement(By.className(CValue)).click();
			Reporter.reportStep("The "+ data +" tab is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The "+ data +" tab is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the buttons using the Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickImageByXpath(String xpathValue, String data) throws Throwable{
		boolean bReturn = false;
		try {
			Reporter.reportStep("The Image "+ data +" is clicked successfully", "PASS");
			driver.findElement(By.xpath(xpathValue)).click();
			Reporter.reportStep("The Image "+ data +" is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Image "+ data +" is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the links using the Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickLinkByXpath(String xpathValue, String data) throws Throwable{
		boolean bReturn = false;
		try {
			Reporter.reportStep("The Link "+ data +" is clicked successfully", "PASS");
			driver.findElement(By.xpath(xpathValue)).click();
			Reporter. reportStep("The Link "+ data +" is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Link "+ data +" is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the link text attribute to locate
	 * @author balajih
	 * @param linkTextValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickByLinkText(String linkTextValue) throws Throwable{
		boolean bReturn = false;
		try {
			driver.findElement(By.linkText(linkTextValue)).click();
			Reporter.reportStep("The Link is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Link is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the link text attribute to locate
	 * @author balajih
	 * @param linkTextValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickButtonByLinkText(String linkTextValue, String data) throws Throwable{
		boolean bReturn = false;
		try {
			Reporter.reportStep("The Link "+ data +" is clicked successfully", "PASS");
			driver.findElement(By.linkText(linkTextValue)).click();
			Reporter.reportStep("The Link "+ data +" is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Link "+ data +" is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}

	/**This method will check the click of the partial link text attribute to locate
	 * @author balajih
	 * @param partLinkTextValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickByPartialLinkText(String partLinkTextValue) throws Throwable{
		boolean bReturn = false;
		try {
			driver.findElement(By.partialLinkText(partLinkTextValue)).click();
			Reporter.reportStep("The Link is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Link is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the partial link text attribute to locate
	 * @author balajih
	 * @param tagNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickBytagName(String tagNameValue) throws Throwable{
		boolean bReturn = false;
		try {
			driver.findElement(By.tagName(tagNameValue)).click();
			Reporter.reportStep("The Link is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Link is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the check box using the Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickChkBoxByXpath(String xpathValue, String data) throws Throwable{
		boolean bReturn = false;
		try {
			//Reporter.reportStep("The Checkbox "+ data+" is clicked successfully", "PASS");
			driver.findElement(By.xpath(xpathValue)).click();
			//waitForPageLoad(1);
			Reporter.reportStep("The Checkbox "+ data+" is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Checkbox "+ data+" is not clicked successfully", "FAIL");
		}	
		return bReturn;
	}
	
	/**This method will check the click of the check box using the Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickRadioBtnByXpath(String xpathValue,String data) throws Throwable{
		boolean bReturn = false;
		try {
			Reporter.reportStep("The Radio Button "+data+" is clicked successfully", "PASS");
			driver.findElement(By.xpath(xpathValue)).click();
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Radio Button "+data+" is not clicked successfully", "PASS");
		}	
		return bReturn;
	}

	
	/**This method is used to fetch the data from dropdown using select By Id attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean selectByIdWithvalue(String idValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			Select dropdown = new Select(driver.findElement(By.id(idValue)));
			dropdown.selectByValue(data);
			Reporter.reportStep("The element is selected with value"+ data+" successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The value "+ data +"is not selected", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to fetch the data from dropdown using select By Name attribute to locate
	 * @author balajih
	 * @param nameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByNameWithValue(String nameValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			Select dropdown = new Select(driver.findElement(By.name(nameValue)));
			dropdown.selectByValue(data);
			Reporter.reportStep("The element is selected with value"+ data+" successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The value "+ data +"is not selected", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to fetch the data from dropdown using select By Class Name attribute to locate
	 * @author balajih
	 * @param cnameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByClassNamewithValue(String cnameValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			Select dropdown = new Select(driver.findElement(By.className(cnameValue)));
			dropdown.selectByValue(data);
			Reporter.reportStep("The element is selected with value"+ data+" successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The value "+ data +" is not selected", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to fetch the data from dropdown using select By CSS Selector attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean selectByCssSelectorWithValue(String cssValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			Select dropdown = new Select(driver.findElement(By.cssSelector(cssValue)));
			dropdown.selectByValue(data);
			Reporter.reportStep("The element is selected with value"+ data+" successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The value "+ data +" is not selected", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to fetch the data from dropdown using select By Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByXpathWithValue(String xpathValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			Select dropdown = new Select(driver.findElement(By.xpath(xpathValue)));
			dropdown.selectByValue(data);
			Reporter.reportStep("The element is selected with value"+ data+" successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The value "+ data +" is not selected", "FAIL");
		}
		return bReturn;
	}	
	
	/**This method is used to fetch the data from dropdown using select By visible text with Id attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByIdWithText(String idValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			Select dropdown = new Select(driver.findElement(By.id(idValue)));
			dropdown.selectByVisibleText(data);
			Reporter.reportStep("The element is selected with value"+ data+" successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The value "+ data +" is not selected", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to fetch the data from dropdown using select By visible text with Name attribute to locate
	 * @author balajih
	 * @param nameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByNameWithText(String nameValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			Select dropdown = new Select(driver.findElement(By.name(nameValue)));
			dropdown.selectByVisibleText(data);
			Reporter.reportStep("The element is selected with value"+ data+" successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The value "+ data +" is not selected", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to fetch the data from dropdown using select By visible text with Class Name attribute to locate
	 * @author balajih
	 * @param cnameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByClassNamewithText(String cnameValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			Select dropdown = new Select(driver.findElement(By.className(cnameValue)));
			dropdown.selectByVisibleText(data);
			Reporter.reportStep("The element is selected with value"+ data+" successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The value "+ data +" is not selected", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to fetch the data from dropdown using select By visible text with CSS Selector attribute to locate
	 * @author balajih
	 * @param cssValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByCssSelectorWithText(String cssValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			Select dropdown = new Select(driver.findElement(By.cssSelector(cssValue)));
			dropdown.selectByVisibleText(data);
			Reporter.reportStep("The element is selected with value"+ data+" successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The value "+ data +" is not selected", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to fetch the data from dropdown using select By visible text with Xpath attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean selectByXpathWithText(String xpathValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			Select dropdown = new Select(driver.findElement(By.xpath(xpathValue)));
			dropdown.selectByVisibleText(data);
			Reporter.reportStep("The "+ data+" value is selected successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The "+ data +" value is not selected", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to fetch the data from dropdown using select By visible text with tagName attribute to locate
	 * @author balajih
	 * @param tagNameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean selectBytagName(String tagNameValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			Select dropdown = new Select(driver.findElement(By.tagName(tagNameValue)));
			dropdown.selectByVisibleText(data);
			Reporter.reportStep("The "+ data+" value is selected successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The "+ data +" value is not selected", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to fetch the data from dropdown using select Option By Index attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectOptionByIndex(String xpathValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			Select dropdown = new Select(driver.findElement(By.xpath(xpathValue)));
			dropdown.selectByIndex(0);
			Reporter.reportStep("The element is selected with value"+ data+" successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The value "+ data +" is not selected", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to fetch the data from dropdown using select Option By Index attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectAllOption(String xpathValue) throws Throwable {
		boolean bReturn = false;
		try {
			Select dropdown = new Select(driver.findElement(By.xpath(xpathValue)));
			List<WebElement> options = dropdown.getOptions();
			for(WebElement item:options){
				item.click();
			}
			Reporter.reportStep("All Dropdown items are selected successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("All Dropdown items are not selected", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to click OK button in Alert box
	 * @author balajih
	 * @return
	 * @throws Throwable
	 */
	public boolean clickOkAlertBox() throws Throwable {
		boolean bReturn = false;
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Reporter.reportStep("The Alert ok button is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Alert ok button has not been clicked", "FAIL");
		}
		return bReturn;
	}
	/**This method is used to click OK button in Alert box
	 * @author balajih
	 * @return
	 * @throws Throwable
	 */
	public boolean clickOkAlertBox(String data) throws Throwable {
		boolean bReturn = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			Alert alert=wait.until(ExpectedConditions.alertIsPresent());
			alert = driver.switchTo().alert();
			alert.getText();
			alert.accept();
			
			Reporter.reportStep("The Alert "+data+" button is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Alert "+data+" button has not been clicked", "FAIL");
		}
		return bReturn;
	}
	/**This method is used to click CANCEL button in Alert box
	 * @author balajih
	 * @return
	 * @throws Throwable
	 */
	public boolean clickCancelAlertBox() throws Throwable {
		boolean bReturn = false;
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			Reporter.reportStep("The Alert Cancel button is clicked successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The Alert Cancel button has not been clicked", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to enter the value in the Alert box
	 * @author balajih
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean enterValueAlertBox(String data) throws Throwable {
		boolean bReturn = false;
		try {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(data);
			Reporter.reportStep("The value in the Alert box "+ data +" has been entered successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The value in the Alert box "+ data +" has not been entered successfully", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to verify the text in the Alert box
	 * @author balajih
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean VerifyTextAlertBox(String data) throws Throwable{
		boolean bReturn = false;
		try {
			Alert alert = driver.switchTo().alert();
			if(alert.getText().equalsIgnoreCase(data)){
				Reporter.reportStep("The text in the Alert box "+ data +" has been verified successfully", "PASS");
				bReturn = true;
			}
		} catch (Exception e) {
			Reporter.reportStep("The text in the Alert box "+ data +" has not been verified successfully", "FAIL");
		}	
		return bReturn;
	}

	/**This method is used to Mouse hover on the element using ID element.
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseHoverById(String idValue) throws Throwable{
		boolean bReturn=false;
		new Actions(driver).moveToElement(driver.findElement(By.id(idValue))).build().perform();
		try {
			Reporter.reportStep("The mouse hover to the element is successfull", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The mouse hover to the element is not successfull", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to Mouse hover on the element using ID element.
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseHoverByXpath(String xpathValue) throws Throwable{
		boolean bReturn=false;
		new Actions(driver).moveToElement(driver.findElement(By.xpath(xpathValue))).build().perform();
		try {
			Reporter.reportStep("The mouse hover to the element is successfull", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The mouse hover to the element is not successfull", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method is used to switch the frame with id
	 *
	 * @author balajih & Udhay
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean switchToFrameByID(String data) throws Throwable{
		boolean bReturn = false;
		try {
			driver.switchTo().frame(driver.findElement(By.id(data)));
			Reporter.reportStep("Frame switched successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("Frame not switched successfully", "FAIL");
		}
		return bReturn;
	}
	
	/**
	 * This method is used to switch the frame with name
	 *
	 * @author balajih 
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean switchToFrameByName(String data) throws Throwable{
		boolean bReturn = false;
		try {
			driver.switchTo().frame(driver.findElement(By.name(data)));
			Reporter.reportStep("Frame switched successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("Frame not switched successfully", "FAIL");
		}
		return bReturn;
	}
	
	/**
	 * This method is used to switch the frame with WebElement Xpath
	 *
	 * @author balajih 
	 * @param xpathValue - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean switchToFrameByXpath(String xpathValue) throws Throwable{
		boolean bReturn = false;
		try {
			driver.switchTo().frame(driver.findElement(By.xpath(xpathValue)));
			Reporter.reportStep("Frame switched successfully", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("Frame not switched successfully", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to switch the frame with index value
	 * @author Balajih
	 * @param indexValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean switchToFrameByIndex(int indexValue) throws Throwable {
		boolean bReturn = false;
		try {
			driver.switchTo().frame(indexValue);
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("Frame not switched successfully", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to switch to frame with CssSelector value
	 * @author Balajih
	 * @param CssSelectorValue
	 * @return
	 * @throws Throwable
	 */
	public boolean switchToFrameByCssSelector(String CssSelectorValue) throws Throwable {
		boolean bReturn = false;
		try {
			driver.switchTo().frame(driver.findElement(By.xpath(CssSelectorValue)));
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("Frame not switched successfully", "FAIL");
		}
		return bReturn;
	}
		
	/**This method is to Switch to Default Content from nested windows
	 * @author balajih
	 * @return
	 */
	public boolean switchToDefaultContent(){
		boolean bReturn = false;
		try{
			driver.switchTo().defaultContent();
			bReturn = true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return bReturn;
	}

	/**This method is used to wait for loading page js elements.
	 * @author balajih
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public void waitForJsPageLoad(long seconds) {
		try {
			WebDriverWait wait=new WebDriverWait(driver,seconds);
			/*wait.until( new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver driver) {*/
	            	wait.until( new Predicate<WebDriver>() {
	    	            public boolean apply(WebDriver driver) {
	                return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
	            }
	        }
	    );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**This method is used to sleep for the given seconds
	 * @author balajih
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public void waitForJqueryPageLoad(long seconds) {
		try {
			WebDriverWait wait=new WebDriverWait(driver,seconds);
			wait.until( new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver driver) {
	                return ((JavascriptExecutor)driver).executeScript("return jQuery.active").equals("0");
	            }
	        }
	    );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**This method is used to sleep for the given seconds
	 * @author balajih
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public void waitForPageLoad(long seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**This method is used to sleep for the given minutes
	 * @author balajih
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public void waitForRegURLLoadinMins(long seconds) {
		try {
			Thread.sleep(seconds * 100000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to switch the frame with id
	 *
	 * @author balajih
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public String switchToWindow() throws Throwable {
		// boolean bReturn = false;
		String currentWin = null;
		try {
			currentWin = driver.getWindowHandle();
			for (String newWindow : driver.getWindowHandles()) {
				driver.switchTo().window(newWindow);
			}
			// bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("Window not switched successfully", "FAIL");
		}
		return currentWin;
	}
	
	/**This method is used to Mouse hover on the element using windowHandles.
	 * @author balajih
	 * @param title 
	 * @return
	 * @throws Throwable
	 */
	public boolean switchWindowByTitle(String title)
    {

	  String currentWindow = driver.getWindowHandle();
      List<String> availableWindows = new ArrayList<String>(driver.getWindowHandles());
      
      for(String w : availableWindows)
      {
    	  System.out.println("***"+w);
        if (w != currentWindow)
        {
          driver.switchTo().window(w);
          if (driver.getTitle().equalsIgnoreCase(title))
            return true;
          else
          {
            driver.switchTo().window(currentWindow);
          }
        }
      }
      return false;
    } 
	
	/**
	 * This method is used to open a new URL
	 * @author balajih
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean openbrowser(String URL) throws Throwable {
		boolean bReturn = false;
		try {
			driver.get(URL);
			waitForPageLoad(5);
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep(URL+" : not launched successfully", "FAIL");
		}
		return bReturn;
	}
	
	/**
	 * This method is used to open a new URL
	 * @author balajih
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean copyRegistrationURL(String cURL) throws Throwable {
		boolean bReturn = false;
		try {
			driver.get(cURL);
			waitForPageLoad(5);
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep(cURL+" : not launched successfully", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method will verify the fetched title is matching or not using the partial title.
	 *
	 * @author balajih
	 * @param title - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean VerifyTitleEndsWith(String title) throws Throwable {
		boolean bReturn = false;
		if (driver.getTitle().trim().endsWith(title)) {
			try {
				Reporter.reportStep("The title of the page" + title + " is matching successfully", "PASS");
				bReturn = true;

			} catch (Exception e) {
				Reporter.reportStep("The title of the page" + title + " is not matching successfully", "FAIL");
				bReturn = false;
			}
		}
		return bReturn;
	}

	/**
	 * This method will enter the value using ClassName attribute in I/O device
	 * @author Balajih
	 * @param cnameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean enterkeysByClassName(String cnameValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			driver.findElement(By.className(cnameValue)).sendKeys(Keys.ENTER);
			Reporter.reportStep("The data "+ data +" is entered successfully.", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The data "+ data +" is not entered successfully.", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method will enter the value using Xpath attribute in I/O device
	 * @author Balajih
	 * @param xpathValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean enterkeysByXpath(String xpathValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			driver.findElement(By.xpath(xpathValue)).sendKeys(data+Keys.ENTER);
			Reporter.reportStep("The data "+ data +" is entered successfully.", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The data "+ data +" is not entered successfully.", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method will enter the value using ID attribute in I/O device
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean enterkeysByID(String idValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			driver.findElement(By.className(idValue)).sendKeys(Keys.ENTER);
			Reporter.reportStep("The data "+ data +" is entered successfully.", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The data "+ data +" is not entered successfully.", "FAIL");
		}
		return bReturn;
	}
	
	/**
	 * This method will enter the value By handling Browser Authentication using I/O device
	 *
	 * @author Balajih
	 * @param uName - The Data to be sent to the WebElement
	 * @param pwd - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public void handlingBAuthUsingRobo(String uName, String pwd) {
		System.out.println("->"+uName+"**"+pwd);
		try{
			//wait - increase this wait period if required
			waitForPageLoad(5);

			//create robot for keyboard operations
			Robot rb = new Robot();

			//Enter user name By ctrl-v Keyboard action
			StringSelection username = new StringSelection(uName);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);

			//tab to password entry field
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			waitForPageLoad(2);

			//Enter password By ctrl-v Keyboard action
			StringSelection passwd = new StringSelection(pwd);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(passwd, null);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);

			//press enter Keyboard action
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);

			//wait
			waitForPageLoad(2);
			System.err.println("handlingBAuthUsingRobo");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

	/**
	 * This method will verify the Web Table using Xpath
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @param rowNum - The Data to be sent to the WebElement
	 * @param colNum - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public String verifyTablecellValueByXpath(String xpathValue, int rowNum, int colNum) throws Throwable {
		String value = null;
		try {
			value = driver.findElement(By.xpath(xpathValue+"/tr["+rowNum+"]/td["+colNum+"]")).getText();
		} catch (Exception e) {
		}
		return value;
	}
	
	/**This Method will fetch the Table row Count by Xpath WebElement
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public int getTableRowcountByXpath(String xpathValue) throws Throwable {
		int rowCount=0;
		try {
			rowCount = (int) driver.findElements(By.xpath(xpathValue+"/tr")).size();
		} catch (Exception e) {
		}
		return rowCount;
	}
	
	/**This Method will fetch the Table column Count by Xpath WebElement
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public int getTableColcountByXpath(String xpathValue) throws Throwable {
		int colCount=0;
		try {
			colCount = (int) driver.findElements(By.xpath(xpathValue+"/tr[1]/td")).size();
		} catch (Exception e) {
		}
		return colCount;
	}

	/**This Method is used to Kill the Browser drivers from task manager
	 * @author balajih
	 */
	public void killAllDrivers() {
		try {
			Process p =
					Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			try {
				p.waitFor();
				Thread.sleep(3000);
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
			p = Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe*");
			try {
				p.waitFor();
				Thread.sleep(3000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**This method is to clear Cache & Cookies in a browser
	 * @author Balajih
	 * @param browserName - name of the webelement
	 * @param capabilities
	 */
	
	public void clearCookies(String browserName, DesiredCapabilities capabilities){
		if(browserName.equalsIgnoreCase("firefox")||browserName.equalsIgnoreCase("Firefox")){
			driver.manage().deleteAllCookies();
		}
		else if(browserName.equalsIgnoreCase("IE")||browserName.equalsIgnoreCase("internet explorer")){
			capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		}
		else if(browserName.equalsIgnoreCase("chrome")||browserName.equalsIgnoreCase("Chrome")){
			driver.manage().deleteAllCookies();
		}
	}
	
	/**
	 * This method will Upload the File from windows into Browser.
	 * @author Balajih
	 * @param location - The Data to be sent to the WebElement
	 * @param 
	 * @return
	 */
	public void uploadFile(String location) throws Throwable{
		try{
			//wait - increase this wait period if required
			waitForPageLoad(3);
			StringSelection stringSelection = new StringSelection(location);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			Robot ro = new Robot();
			ro.keyPress(KeyEvent.VK_CONTROL);
			ro.keyPress(KeyEvent.VK_V);
			ro.keyRelease(KeyEvent.VK_V);
			ro.keyRelease(KeyEvent.VK_CONTROL);
			ro.keyPress(KeyEvent.VK_ENTER);
			ro.keyRelease(KeyEvent.VK_ENTER);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	/**
	 * This method is used to Mouse hover on the element using xpath element.
	 * @author Balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseHoverByXpath(String xpathValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).moveToElement(driver.findElement(By.xpath(xpathValue))).build().perform();
			Reporter.reportStep("The mouse hover to the" + data + " element is successful", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The mouse hover to the" + data + " element is not successful", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method is used to Mouse hover on the element using CSS element.
	 * @author Balajih
	 * @param cssValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseHoverByCSS(String cssValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).moveToElement(driver.findElement(By.cssSelector(cssValue))).build().perform();
			Reporter.reportStep("The mouse hover to the" + data + " element is successful", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The mouse hover to the" + data + " element is not successful", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method is used to Mouse hover on the element using class name element.
     * @author Balajih
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseHoverByClassName(String classNameValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).moveToElement(driver.findElement(By.className(classNameValue))).build().perform();
			Reporter.reportStep("The mouse hover to the" + data + " element is successful", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The mouse hover to the" + data + " element is not successful", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method is used to Mouse hover on the element using name element.
	 * @author Balajih
	 * @param nameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseHoverByName(String nameValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).moveToElement(driver.findElement(By.name(nameValue))).build().perform();
			Reporter.reportStep("The mouse hover to the" + data + " element is successful", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The mouse hover to the" + data + " element is not successful", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method is used to Mouse hover on the element using LinkText element.
	 * @author Balajih
	 * @param linkTextValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseHoverByLinkText(String linkTextValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).moveToElement(driver.findElement(By.linkText(linkTextValue))).build().perform();
			Reporter.reportStep("The mouse hover to the" + data + " element is successful", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The mouse hover to the" + data + " element is not successful", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method is used to Mouse hover on the element using Partial Link Text element.
	 * @author Balajih
	 * @param pLinkTextValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseHoverByPLinkText(String pLinkTextValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).moveToElement(driver.findElement(By.partialLinkText(pLinkTextValue))).build().perform();
			Reporter.reportStep("The mouse hover to the" + data + " element is successful", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The mouse hover to the" + data + " element is not successful", "FAIL");
		}
		return bReturn;
	}


	/**
	 * This method is used to fetch the data from dropdown using select By Id
	 * attribute to locate 
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByIdWithindex(String idValue, int data) throws Throwable {
		boolean bReturn = false;
		try {
			Select dropdown = new Select(driver.findElement(By.id(idValue)));
			dropdown.selectByIndex(data);
			Reporter.reportStep("The element with " + idValue + " is selected with value" + data + " successfully",
					"PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The value " + data + " is not selected", "FAIL");
		}
		return bReturn;
	}


	/**
	 * This method is used to click the element By mouse hover using ID element.
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseClickByID(String idValue) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).moveToElement(driver.findElement(By.id(idValue))).click();
			Reporter.reportStep("The element clicked successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The element click was not successful", "FAIL");
		}
		return bReturn;
	}


	/**
	 * This method is used to click the element By mouse hover using className element.
	 * @author Balajih
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseClickByClass(String classNameValue) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).moveToElement(driver.findElement(By.className(classNameValue))).click();
			Reporter.reportStep("The element clicked successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The element clicked was not successful", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method is used to click the element By mouse hover using ID element.
	 * @author Balajih 
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actionClickByID(String idValue) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).click(driver.findElement(By.id(idValue)));
			Reporter.reportStep("The element clicked successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The element clicked was not successful", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method is used to click the element By mouse hover using className element.
	 * @author Balajih
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actionClickByClass(String classNameValue) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).click(driver.findElement(By.className(classNameValue)));
			Reporter.reportStep("The element clicked successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The element clicked was not successful", "FAIL");
		}
		return bReturn;
	}


	/**
	 * This method is used to context click the element By mouse hover using ID element.
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseCntxtClickById(String idValue) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).moveToElement(driver.findElement(By.id(idValue))).contextClick();
			Reporter.reportStep("The element Context clicked successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The element Context clicked was not successful", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method is used to context click the element By mouse hover using ClassName element.
	 * @author Balajih
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseCntxtClickByClass(String classNameValue) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).moveToElement(driver.findElement(By.className(classNameValue))).contextClick();
			Reporter.reportStep("The element Context clicked successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The element Context clicked was not successful", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method is used to context click the element By mouse hover using id element.
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actioncnxtClickById(String idValue) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).contextClick(driver.findElement(By.id(idValue)));
			Reporter.reportStep("The element Context clicked successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The element Context clicked was not successful", "FAIL");
		}
		return bReturn;
	}


	/**
	 * This method is used to context click the element By mouse hover using class element.
	 * @author Balajih
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actioncnxtClickByClass(String classNameValue) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).contextClick(driver.findElement(By.className(classNameValue)));
			Reporter.reportStep("The element Context clicked successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The element Context clicked was not successful", "FAIL");
		}
		return bReturn;
	}


	/**
	 * This method is used to double click the element By mouse hover using id element.
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actiondbleClickById(String idValue) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).doubleClick(driver.findElement(By.id(idValue)));
			Reporter.reportStep("The element double clicked successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The element double clicked was not successful", "FAIL");
		}
		return bReturn;
	}


	/**
	 * This method is used to double click the element By mouse hover using class name element.
	 * @author Balajih
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actiondbleClickByClass(String classNameValue) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).doubleClick(driver.findElement(By.className(classNameValue)));
			Reporter.reportStep("The element double clicked successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The element double clicked was not successful", "FAIL");
		}
		return bReturn;
	}


	/**
	 * This method is used to double click the element By mouse hover using id element.
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mousedbleClickById(String idValue) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).moveToElement(driver.findElement(By.id(idValue))).doubleClick();
			Reporter.reportStep("The element double clicked successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The element double clicked was not successful", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method is used to double click the element By mouse hover using class name element.
	 * @author Balajih
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mousedbleClickByclass(String classNameValue) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).moveToElement(driver.findElement(By.className(classNameValue))).doubleClick();
			Reporter.reportStep("The element double clicked successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The element double clicked was not successful", "FAIL");
		}
		return bReturn;
	}



	/**
	 * This method is used to drag and drop the element By Mouse hover using ID element.
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean DragAndDropById(String source, String target) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).dragAndDrop(driver.findElement(By.id(source)), driver.findElement(By.id(target)));
			Reporter.reportStep("Drag and dropped successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("Drag and dropped was not performed successfully", "FAIL");
		}
		return bReturn;
	}


	/**
	 * This method is used to drag and drop the element By Mouse hover using classname element.
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean DragAndDropByclass(String source, String target) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).dragAndDrop(driver.findElement(By.className(source)), driver.findElement(By.className(target)));
			Reporter.reportStep("Drag and dropped successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("Drag and dropped was not performed successfully", "FAIL");
		}
		return bReturn;
	}


	/**
	 * This method is used to send the keys By Mouse hover on the element using ID element.
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actionMseSendKeysById(String idValue,String data) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).moveToElement(driver.findElement(By.id(idValue))).sendKeys(data);
			Reporter.reportStep("The "+data+" entered successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The "+data+" not entered successfully", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method is used to send the keys By Mouse hover on the element using className element.
	 * @author Balajih
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actionMseSendKeysByclass(String classNameValue,String data) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).moveToElement(driver.findElement(By.className(classNameValue))).sendKeys(data);
			Reporter.reportStep("The "+data+" entered successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The "+data+" not entered successfully", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method is used to send the keys By Mouse hover on the element using ID element.
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actionSendKeysById(String idValue,String data) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).sendKeys(driver.findElement(By.id(idValue)),data);
			Reporter.reportStep("The "+data+" entered successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The "+data+" not entered successfully", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method is used to send the keys By Mouse hover on the element using className element.
	 * @author Balajih
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actionSendKeysByclass(String classNameValue,String data) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).sendKeys(driver.findElement(By.className(classNameValue)),data);
			Reporter.reportStep("The "+data+" entered successfully", "PASS");
			bReturn = true;

		} catch (Throwable e) {
			Reporter.reportStep("The "+data+" not entered successfully", "FAIL");
		}
		return bReturn;
	}

	/**This method is used to compare the value between the element and input data
	 * if new line exist then replace it with space
	 * @author Balajih
	 * @param xpathValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean verifyValueWithNewLineByXpath(String xpathValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			String lblValue = getTextByXpath(xpathValue).trim()
					.replace("\n", " ");
			if (lblValue.equalsIgnoreCase(data)) {
				Reporter.reportStep(lblValue + " label displaying successfully", "PASS");
				bReturn=true;
			} else {
				Reporter.reportStep(data + " label is not displayed", "FAIL");
				bReturn = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bReturn;
	}
	
	/**This method is used to compare the value between the element and input data
	 * if Special Character exist then replace it with space
	 * @author Balajih
	 * @param xpathValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean verifyValueWithSpecialCharacterByXpath(String xpathValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			String lblValue = getTextByXpath(xpathValue).trim()
					.replace("-", " ");
			if (lblValue.equalsIgnoreCase(data)) {
				Reporter.reportStep(lblValue + " label displaying successfully", "PASS");
				bReturn=true;
			} else {
				Reporter.reportStep(data + " label is not displayed", "FAIL");
				bReturn = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bReturn;
	}
	
	
	/**This method is used to compare the value between the element and input data
	 * if new line exist then it replace with space
	 * @author Balajih
	 * @param xpathValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean verifyValueByXpath(String xpathValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			String lblValue = getTextByXpath(xpathValue).trim();
			if (lblValue.equalsIgnoreCase(data)) {
				Reporter.reportStep(lblValue + " label displaying successfully", "PASS");
				bReturn=true;
			} else {
				Reporter.reportStep(data + " label is not displayed", "FAIL");
				bReturn = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bReturn;
	}
	
	/**This method will check the element is displaying or not using id
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean verifyValueById(String idValue, String data) throws Throwable {
        boolean bReturn = false;
        try {
            String lblValue = getTextById(idValue).trim();
            if (lblValue.equalsIgnoreCase(data)) {
                Reporter.reportStep(lblValue + " label displaying successfully", "PASS");
                bReturn = true;
            } else {
                Reporter.reportStep(data + " label is not displayed", "FAIL");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bReturn;
    }
	
	/**This method will check the element is displaying or not using xpath
	 * @author Balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean checkElementIsDisplayed(String xpathValue) throws Throwable {
		boolean bReturn = false;
		try {
			driver.findElement(By.xpath(xpathValue)).isDisplayed();
			Reporter.reportStep("Element is present/ displayed on the screen", "PASS");
			bReturn = true;
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("Element is not present/ displayed on the screen", "FAIL");
		}
		return bReturn;
	}

	/**This method will return the web element Text using xpath
	 * @author Balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public String getTextByXpath(String xpathValue) throws Throwable {
		String textValue = null;
		try {
			textValue = driver.findElement(By.xpath(xpathValue)).getText();
			Reporter.reportStep("The Captured text is :"+ textValue, "PASS");

		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("The text is not captured", "FAIL");
		}
		return textValue;
	}

	/**This method will return the web element Text using ID
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public String getTextById(String idValue) throws Throwable {
		String textValue = null;
		try {
			textValue = driver.findElement(By.id(idValue)).getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return textValue;
	}

	/** This method is used to click the element using Java script
	 * @author Balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public void clickByJavaScript(String xpathValue) throws Throwable{

		WebElement element = driver.findElement(By.xpath(xpathValue));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}


	/** This method is used to compare the value between the element and input data
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean verifyMessageById(String idValue, String data) throws Throwable {
		boolean bReturn = false;
		try {
			String lblValue = getTextById(idValue).trim();
			if (lblValue.equalsIgnoreCase(data)) {
				Reporter.reportStep(lblValue + " message displaying successfully", "PASS");
				bReturn = true;
			} else {
				Reporter.reportStep(data + " message is not displayed", "FAIL");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bReturn;
	}


	/** This method is used to get text value using LinkText
	 * @author Balajih & Balajih
	 * @param linkText - name of the webelement
	 * @throws Throwable
	 */
	public String getTextUsingLinkText(String linkText) throws Throwable {
		String textvalue = null;
		try {

			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText)));
			textvalue = element.getText();
			Reporter.reportStep("received text value ", "PASS");
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.reportStep("text value is not received", "FAIL");
		}
		return textvalue;
	}

	/** This method is used to view the element using scrollbar
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @throws Throwable
	 */
	public void scrollIntoViewById(String idValue) throws Throwable {
		try {

			WebElement element = driver.findElement(By.id(idValue));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Reporter.reportStep("The text value is received", "PASS");
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.reportStep("The text value is not received", "FAIL");
		}
	}
	
	/** This method is used to view the element using scrollbar
	 * @author Balajih
	 * @param xpathValue - name of the webelement
	 * @throws Throwable
	 */
	public void scrollIntoViewByXpath(String xpathValue) throws Throwable {
		try {

			WebElement element = driver.findElement(By.xpath(xpathValue));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.reportStep("text value is not received", "FAIL");
		}
	}
	
	/**This method will clear the contents of the text field
	 * @author Balajih
	 * @param xpathValue
	 * @param data
	 * @return
	 * @throws Throwable
	 */
	public boolean clearContentByXpath(String xpathValue) throws Throwable {
		boolean bReturn = false;
		try {
			driver.findElement(By.xpath(xpathValue)).clear();
			Reporter.reportStep("Content cleared successfully", "PASS");
			bReturn = true;
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.reportStep("no content cleared", "FAIL");
		}
		return bReturn;
	}
	
	/**This method will check whether the element is enabled on the screen.
	 * @author Balajih
	 * @param xpathValue
	 * @return
	 * @throws Throwable
	 */
	public boolean checkElementIsEnabledByXpath(String xpathValue) throws Throwable {
		boolean bReturn = false;
		try {
			driver.findElement(By.xpath(xpathValue)).isEnabled();
			Reporter.reportStep("Element is present and displayed on the screen", "PASS");
			bReturn = true;
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.reportStep("The button is not clicked successfuly", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to mouse release on the element 
	 * @author Balajih
	 * @param xpathValue
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseReleaseByXpath(String xpathValue) throws Throwable {
		boolean bReturn = false;
		try {
			new Actions(driver).release(driver.findElement(By.xpath(xpathValue)));
			Reporter.reportStep("The mouse hover to the" + xpathValue + " element is successful", "PASS");
			bReturn = true;
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.reportStep("The mouse hover to the" + xpathValue + " element is not successful", "FAIL");
		}
		return bReturn;
	}
	
	/**This method is used to get Title of the page.
	 * @author Balajih
	 * @return
	 * @throws Throwable
	 */	
	public void getTitle() throws Throwable {
		
		try {
			System.out.println("Title of the page is :" +driver.getTitle());
			Reporter.reportStep("Title of the page is received successfully", "PASS");			
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("Title of the page is not received successfully", "FAIL");
		}
		
	}
	
	/**This method will check whether element is displayed.
	 * @author Balajih
	 * @param xpathValue
	 * @return
	 * @throws Throwable
	 */
	public boolean checkElementIsDisplayedByXpath(String xpathValue) throws Throwable {
		boolean bReturn = false;
		try {
			driver.findElement(By.xpath(xpathValue)).isDisplayed();
			Reporter.reportStep("Element is present and displayed on the screen", "PASS");
			bReturn = true;
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("The button is not clicked successfuly", "FAIL");
		}
		return bReturn;
	}
	
	/**This method will check whether element is displayed.
	 * @author Balajih
	 * @param tagName
	 * @return
	 * @throws Throwable
	 */
	public boolean checkElementIsDisplayedByTagName(String tagName) throws Throwable {
		boolean bReturn = false;
		try {

			driver.findElement(By.tagName(tagName)).isDisplayed();
			Reporter.reportStep("Element is present and displayed on the screen", "PASS");
			bReturn = true;
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("The button is not clicked successfuly", "FAIL");
		}
		return bReturn;
	}

	/** This method will check whether element is displayed.
	 * @author Balajih
	 * @param className
	 * @return
	 * @throws Throwable
	 */
	public boolean checkElementIsDisplayedByClassName(String className) throws Throwable {
		boolean bReturn = false;
		try {

			driver.findElement(By.className(className)).isDisplayed();
			Reporter.reportStep("Element is present and displayed on the screen", "PASS");
			bReturn = true;
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("The button is not clicked successfuly", "FAIL");
		}
		return bReturn;
	}
	/**This method will check whether element is displayed.
	 * @author Balajih
	 * @param id
	 * @return
	 * @throws Throwable
	 */
	public boolean checkElementIsDisplayedById(String id) throws Throwable {
		boolean bReturn = false;
		try {

			driver.findElement(By.id(id)).isDisplayed();
			Reporter.reportStep("Element is present and displayed on the screen", "PASS");
			bReturn = true;
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("The button is not clicked successfuly", "FAIL");
		}
		return bReturn;
	}
	/**This method will check whether element is displayed.
	 * @author Balajih
	 * @param linkText
	 * @return
	 * @throws Throwable
	 */
	public boolean checkElementIsDisplayedByLinkText(String linkText) throws Throwable {
		boolean bReturn = false;
		try {

			driver.findElement(By.linkText(linkText)).isDisplayed();
			Reporter.reportStep("Element is present and displayed on the screen", "PASS");
			bReturn = true;
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("The button is not clicked successfuly", "FAIL");
		}
		return bReturn;
	}
	/**This method is used to wait till element is visible for a given time using Ajax control.
	 * @author Balajih
	 * @param xpathValue
	 * @return
	 * @throws Throwable
	 */
	public void waitTillElementVisibleByXpath(String xpathValue) {
		try {
			// waiting 30 seconds to detect the visibility of the element
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue)));

		} catch (Throwable e) {
			e.printStackTrace();
			System.err.println("Error while waiting for the element to be visible: " + e.getMessage());
		}
	}
	
	/**This method is used to wait till Invisible element is visible for a given time using Ajax control.
	 * @author Balajih
	 * @param xpathValue
	 * @return
	 * @throws Throwable
	 */
	public void waitTillInvisibilityOfElementLocatedByXpath(String xpathValue) {
		try {
			// waiting 30 seconds to detect the visibility of the element
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathValue)));

		} catch (Throwable e) {
			e.printStackTrace();
			System.err.println("Error while waiting for the element to be visible: " + e.getMessage());
		}
	}
	
	/**This method is used to wait till presence of element located for a given time using Ajax control.
	 * @author Balajih
	 * @param xpathValue
	 * @return
	 * @throws Throwable
	 */
	public void waitTillPresenceOfElementLocatedByXpath(String xpathValue) {
		try {
			// waiting 30 seconds to detect the visibility of the element
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue)));

		} catch (Throwable e) {
			e.printStackTrace();
			System.err.println("Error while waiting for the element to be visible: " + e.getMessage());
		}
	}
	
	/**This method will return the web element Text
	 * @author Balajih
	 * @param linkText
	 * @return
	 * @throws Throwable
	 */
	public String getTextByLinkText(String linkText) throws Throwable {
		String textvalue = null;
		try {

			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText)));
			textvalue = element.getText();
			Reporter.reportStep("received text value ", "PASS");
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.reportStep("text value is not received", "FAIL");
		}
		return textvalue;
	}

	/** This method will return the web element Text 
	 * @author Balajih
	 * @param tagName
	 * @return
	 * @throws Throwable
	 */
	public String getTextByTagName(String tagName) throws Throwable {
		String textvalue = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(tagName)));
			textvalue = element.getText();
			Reporter.reportStep("received text value ", "PASS");
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.reportStep("text value is not received", "FAIL");
		}
		return textvalue;
	}
	/** This method is used to click the element using Java script
	 * @author Balajih
	 * @param id
	 * @return
	 * @throws Throwable
	 */
	public void clickByJavaScriptId(String id) throws Throwable {

		try {
			WebElement element = driver.findElement(By.id(id));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
			Reporter.reportStep("Element is present and clickable successfully", "PASS");
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.reportStep("Element is not present and not clickable successfully", "FAIL");
		}

	}

	/**This method is to click on the Browser Back button
	 * @author balajih
	 * @throws Throwable
	 */
	public void clickBrowserBackButton() throws Throwable{
		try {
			driver.navigate().back();
			Reporter.reportStep("Clicked Browser Back button successfully", "PASS");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("Clicked Browser Back button un-successfully", "FAIL");
		}
	} 

	/**This method is to quit the current Browser opened for testing
	 * @author balajih
	 * @throws Throwable
	 */
	public void quitBrowser() throws Throwable{

		try {
			driver.quit();
		} catch (Throwable e) {
			Reporter.reportStep("The Browser" + driver.getCapabilities().getBrowserName()+ "could not be closed", "FAIL");
			e.printStackTrace();
		}
	}
	
	/**This method is to close the current Browser opened for testing
	 * @author balajih
	 * @throws Throwable
	 */
	public void closeBrowser() throws Throwable{

		try {
			driver.close();
		} catch (Throwable e) {
			Reporter.reportStep("The Browser" + driver.getCapabilities().getBrowserName()+ "could not be closed", "FAIL");
			e.printStackTrace();
		}
	}
	
	/**This method is to reloads the page
	 * @author thenmozhi
	 * @throws Throwable
	 */
	public void pageRefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	/**This Method is to unload the used Objects from the Memory for efficient execution
	 * @author balajih
	 */
	public void unloadObjects() {
		
		prop = null;
		
	}
	
	/**This Method is to login through the windows popup for IE
	 * @author 
	 * @throws Throwable 
	 */
	
	public void alertAuthentication(String Username,String Password) throws Throwable{
		try {
			if(browserName.equalsIgnoreCase("internet explorer") || browserName.equalsIgnoreCase("firefox") ){
				System.out.println("alertAuth");
				System.out.println("3");
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				WebDriverWait wait = new WebDriverWait(driver, 10);
				Alert alert=wait.until(ExpectedConditions.alertIsPresent());
				alert.authenticateUsing(new UserAndPassword(Username,Password));
				Reporter.reportStep("The Alert Authentication is passed successfully.", "PASS");
			}
			else
			{
				System.out.println("else");
				clickBrowserBackButton();
				openbrowser("http://"+Username+":"+Password+"@"+"servicedeskbeta.esri.com/CherwellPortal/SelfService");
				Reporter.reportStep("The Alert Authentication is passed successfully.", "PASS");
			}
		} 
		catch (Exception e) {
				Reporter.reportStep("The Alert Authentication has been failed.", "FAIL");
		}
		
	}
	/** This method is used to click the element for dynamic webtable
	 * @author Balajih
	 * @param xpath
	 * @return
	 * @throws Throwable
	 */
	public void clickDynamicWebTableByxpath(String xpath, String data) throws Throwable {

		try {
			WebElement htmlTable = driver.findElement(By.xpath(xpath));
			List<WebElement> rows = htmlTable.findElements(By.tagName("tr"));
			for(int rownum=0;rownum<rows.size();rownum++)
			{
				List<WebElement> columns = rows.get(rownum).findElements(By.tagName("td"));
				for(int colnum=0;colnum<columns.size();colnum++)
				{
					columns.get(colnum).sendKeys(data);
					Reporter.reportStep("The data:"+ data+" entered Successfully in the Web table.", "PASS");
				}
			}
			
			
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.reportStep("The data:"+ data+" not entered Successfully in the Web table.", "FAIL");
		}

	}
}


