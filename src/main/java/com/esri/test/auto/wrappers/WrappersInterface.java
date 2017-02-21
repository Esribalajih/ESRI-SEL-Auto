/**
 * 
 */
package com.esri.test.auto.wrappers;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.remote.DesiredCapabilities;

/**This is a Wrappers Interfaces used for Generic Wrappers Methods
 * @author balajih
 *
 */
public interface WrappersInterface {
	
	
	
	public void invokeApp(String browser);
	
	/**This Method is to load Objects from the Object Property file
	 * @author balajih
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void loadObjects();
	
	/**This Method is to unload the used Objects from the Memory for efficient execution
	 * @author balajih
	 */
	public void unloadObjects();
	
	/**This method will enter the value as text field using Id attribute to locate
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @param data - The data to be sent to the Webelement.
	 * @return
	 * @throws Throwable 
	 */
	public boolean enterById(String idValue,String data) throws Throwable;
	
	/**This method will enter the value as text field using Name attribute to locate
	 * @author Balajih
	 * @param nameValue - name of the webelement
	 * @param data - The data to be sent to the Webelement.
	 * @return
	 * @throws Throwable 
	 */
	public boolean enterByName(String nameValue,String data) throws Throwable;
	
	/**This method will enter the value as text field using ClassName attribute to locate
	 * @author Balajih
	 * @param cnameValue - name of the webelement
	 * @param data - The data to be sent to the Webelement.
	 * @return
	 * @throws Throwable 
	 */
	public boolean enterByClassName(String cnameValue,String data) throws Throwable;
	
	/**This method will enter the value as text field using CssSelector attribute to locate
	 * @author Balajih
	 * @param cssValue - name of the webelement
	 * @param data - The data to be sent to the Webelement.
	 * @return
	 * @throws Throwable
	 */
	public boolean enterByCssSelector(String cssValue,String data) throws Throwable;
	
	/**This method will enter the value as text field using Xpath attribute to locate
	 * @author Balajih
	 * @param xpathValue - name of the webelement
	 * @param data - The data to be sent to the Webelement.
	 * @return
	 * @throws Throwable 
	 */
	public boolean enterByXpath(String xpathValue,String data) throws Throwable;
	
	/**This method will enter the value as text field using tagname attribute to locate
	 * @author Balajih 
	 * @param tagValue - name of the webelement
	 * @param data - The data to be sent to the Webelement.
	 * @return
	 * @throws Throwable 
	 */
	public boolean enterByTagname(String tagValue,String data) throws Throwable;
	
	/**This method will verify the fetched title is matching or not.
	 * @author balajih
	 * @param title
	 * @return
	 * @throws Throwable
	 */
	public boolean VerifyTitle(String title) throws Throwable;
	
	/**This method will verify the entered value in text field using Id attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @param data - The data to be sent to the Webelement.
	 * @return
	 * @throws Throwable 
	 */
	public boolean VerifyTextById(String idValue,String data) throws Throwable;
	
	/**This method will verify the entered value in text field using Name attribute to locate
	 * @author balajih
	 * @param nameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean VerifyTextByName(String nameValue,String data) throws Throwable;
	
	/**This method will verify the entered value in text field using Class Name attribute to locate
	 * @author balajih
	 * @param cnameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean VerifyTextByClassName(String cnameValue,String data) throws Throwable;
	
	/**This method will verify the entered value in text field using CSS Selector attribute to locate
	 * @author balajih
	 * @param cssValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean VerifyTextByCssSelector(String cssValue,String data) throws Throwable;
	
	/**This method will verify the entered value in text field using Xpath Value attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean VerifyTextByXpath(String xpathValue,String data) throws Throwable;
	
	/**
	 * This method will check the element is displaying or not using id
	 * 
	 * @author Udhayasundar
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean verifyValueById(String idValue, String data) throws Throwable;
	
	/**This method will verify the entered value in text field using tagName attribute to locate
	 * @author balajih
	 * @param tagValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean VerifyTextBytagName(String tagValue,String data) throws Throwable;
	
	/**This method will check the click of the buttons or links using the Id attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable 
	 */
	public boolean clickById(String idValue) throws Throwable;
	
	/**This method will check the click of the buttons using the Id attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be displayed in the Report.
	 * @return
	 * @throws Throwable 
	 */
	public boolean clickButtonById(String idValue, String data) throws Throwable;
	
	/**This method will check the click of the Links using the Id attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be displayed in the Report.
	 * @return
	 * @throws Throwable 
	 */
	public boolean clickLinkById(String idValue, String data) throws Throwable;
	
	/**This method will check the click of the buttons or links using the Name attribute to locate
	 * @author balajih
	 * @param nameValue - name of the webelement
	 * @return
	 * @throws Throwable 
	 */
	public boolean clickByName(String nameValue) throws Throwable;
	
	/**This method will check the click of the buttons or links using the Class Name attribute to locate
	 * @author balajih
	 * @param cnameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickByClassName(String cnameValue) throws Throwable;
	
	/**This method will check the click of the buttons or links using the CSS Selector attribute to locate
	 * @author balajih
	 * @param cssValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickByCssSelector(String cssValue) throws Throwable;
	
	/**This method will check the click of the buttons using the CSS Selector attribute to locate
	 * @author balajih
	 * @param cssValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickButtonByCssSelector(String cssValue, String data) throws Throwable;
	
	/**This method will check the click of the buttons or links using the Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickByXpath(String xpathValue) throws Throwable;
	
	/**This method will check the click of the buttons using the Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickButtonByXpath(String xpathValue, String data) throws Throwable;
	
	/**This method will check the click of the buttons using the Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickImageByXpath(String xpathValue, String data) throws Throwable;
	
	/**This method will check the click of the links using the Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickLinkByXpath(String xpathValue, String data) throws Throwable;
	
	/**This method will check the click of the link text attribute to locate
	 * @author balajih
	 * @param linkTextValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickByLinkText(String linkTextValue) throws Throwable;
	
	/**This method will check the click of the partial link text attribute to locate
	 * @author balajih
	 * @param partLinkTextValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickByPartialLinkText(String partLinkTextValue) throws Throwable;
	
	/**This method will check the click of the partial link text attribute to locate
	 * @author balajih
	 * @param tagNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickBytagName(String tagNameValue) throws Throwable;
	
	/**This method will check the click of the check box using the Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickChkBoxByXpath(String xpathValue) throws Throwable;
	
	/**This method will check the click of the check box using the Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean clickRadioBtnByXpath(String xpathValue) throws Throwable;
	
	/**This method is used to fetch the data from dropdown using select By Id attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean selectByIdWithvalue(String idValue, String data) throws Throwable;
	
	/**This method is used to fetch the data from dropdown using select By Name attribute to locate
	 * @author balajih
	 * @param nameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByNameWithValue(String nameValue, String data) throws Throwable;
	
	/**This method is used to fetch the data from dropdown using select By Class Name attribute to locate
	 * @author balajih
	 * @param cnameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByClassNamewithValue(String cnameValue, String data) throws Throwable;
	
	/**This method is used to fetch the data from dropdown using select By CSS Selector attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean selectByCssSelectorWithValue(String cssValue, String data) throws Throwable;
	
	/**This method is used to fetch the data from dropdown using select By Xpath attribute to locate
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByXpathWithValue(String xpathValue, String data) throws Throwable;
	
	/**This method is used to fetch the data from dropdown using select By visible text with Id attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByIdWithText(String idValue, String data) throws Throwable;
	
	/**This method is used to fetch the data from dropdown using select By visible text with Name attribute to locate
	 * @author balajih
	 * @param nameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByNameWithText(String nameValue, String data) throws Throwable;
	
	/**This method is used to fetch the data from dropdown using select By visible text with Class Name attribute to locate
	 * @author balajih
	 * @param cnameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByClassNamewithText(String cnameValue, String data) throws Throwable;
	
	/**This method is used to fetch the data from dropdown using select By visible text with CSS Selector attribute to locate
	 * @author balajih
	 * @param cssValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByCssSelectorWithText(String cssValue, String data) throws Throwable;
	
	/**This method is used to fetch the data from dropdown using select By visible text with Xpath attribute to locate
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean selectByXpathWithText(String xpathValue, String data) throws Throwable;
	
	/**This method is used to fetch the data from dropdown using select By visible text with tagName attribute to locate
	 * @author balajih
	 * @param tagNameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable 
	 */
	public boolean selectBytagName(String tagNameValue, String data) throws Throwable;
	
	/**This method is used to click OK button in Alert box
	 * @author balajih
	 * @return
	 * @throws Throwable
	 */
	public boolean clickOkAlertBox() throws Throwable;
	
	/**This method is used to click CANCEL button in Alert box
	 * @author balajih
	 * @return
	 * @throws Throwable
	 */
	public boolean clickCancelAlertBox() throws Throwable;
	
	/**This method is used to enter the value in the Alert box
	 * @author balajih
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean enterValueAlertBox(String data) throws Throwable;
	
	/**This method is used to verify the text in the Alert box
	 * @author balajih
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean VerifyTextAlertBox(String data) throws Throwable;
	
	/**This method is used to Mouse hover on the element using ID element.
	 * @author balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseHoverById(String idValue) throws Throwable;
	
	/**
	 * This method is used to switch the frame with id
	 *
	 * @author balajih & Udhay
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean switchToFrameByID(String data) throws Throwable;
	
	/**
	 * This method is used to switch the frame with name
	 *
	 * @author balajih 
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean switchToFrameByName(String data) throws Throwable;
	
	/**
	 * This method is used to switch the frame with index value
	 * 
	 * @author Udhayasundar
	 * @param indexValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean switchToFrameByIndex(int indexValue) throws Throwable;
	
	/**
	 * This method is used to switch the frame with WebElement
	 * @author balajih 
	 * @param xpathValue - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean switchToFrameByXpath(String xpathValue) throws Throwable;
	
	/**
	 * This method is used to switch to frame with CssSelector value
	 * @author Balajih
	 * @param CssSelectorValue
	 * @return
	 * @throws Throwable
	 */
	public boolean switchToFrameByCssSelector(String CssSelectorValue) throws Throwable;
	
	/**This method is to Switch to Default Content from nested windows
	 * @author balajih
	 * @return
	 */
	public boolean switchToDefaultContent();
	
	/**
	 * This method is used to sleep for the given seconds
	 *
	 * @author balajih
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public void waitForPageLoad(long seconds);
	
	/**
	 * This method is used to switch the frame with id
	 *
	 * @author balajih
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public String switchToWindow() throws Throwable;
	
	/**This method is used to Mouse hover on the element using windowHandles.
	 * @author balajih
	 * @param title 
	 * @return
	 * @throws Throwable
	 */
	public boolean switchWindowByTitle(String title);
	
	/**
	 * This method is used to open a new URL
	 * @author balajih
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean openbrowser(String URL) throws Throwable;
	
	/**
	 * This method will verify the fetched title is matching or not using the partial title.
	 *
	 * @author balajih
	 * @param title - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean VerifyTitleEndsWith(String title) throws Throwable;
	
	/**
	 * This method will enter the value using ClassName attribute in I/O device
	 * @author Balajih & udayasundar
	 * @param cnameValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean enterkeysByClassName(String cnameValue, String data) throws Throwable;
	
	/**
	 * This method will enter the value using Xpath attribute in I/O device
	 * @author Balajih
	 * @param xpathValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean enterkeysByXpath(String xpathValue, String data) throws Throwable;
	
	/**
	 * This method will enter the value using ID attribute in I/O device
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean enterkeysByID(String idValue, String data) throws Throwable;
	
	/**
	 * This method will enter the value By handling Browser Authentication using I/O device
	 *
	 * @author Balajih & udayasundar
	 * @param uName - The Data to be sent to the WebElement
	 * @param pwd - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public void handlingBAuthUsingRobo(String uName, String pwd);
	
	/**
	 * This method will verify the Web Table using Xpath
	 * @author balajih
	 * @param xpathValue - name of the webelement
	 * @param rowNum - The Data to be sent to the WebElement
	 * @param colNum - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public String verifyTablecellValueByXpath(String xpathValue, int rowNum, int colNum) throws Throwable ;
	
	/**This Method will fetch the Table row Count by Xpath WebElement
	 * 
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public int getTableRowcountByXpath(String xpathValue) throws Throwable;
	
	/**This Method will fetch the Table column Count by Xpath WebElement
	 * 
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public int getTableColcountByXpath(String xpathValue) throws Throwable;
	
	/**This Method is used to Kill the Browser drivers from task manager
	 * @author balajih
	 */
	public void killAllDrivers();
	
	/**This method is to clear Cache & Cookies in a browser
	 * @author balajih & Udhaysundar
	 * @param browserName - name of the webelement
	 * @param capabilities
	 */
	
	public void clearCookies(String browserName, DesiredCapabilities capabilities);
	
	/**
	 * This method will Upload the File from windows into Browser.
	 * @author Mohamed
	 * @param location - The Data to be sent to the WebElement
	 * @param 
	 * @return
	 */
	public void uploadFile(String location) throws Throwable;
	
	/**
	 * This method is used to Mouse hover on the element using xpath element.
	 * 
	 * @author Udhayasundar
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseHoverByXpath(String xpathValue) throws Throwable;
	
	/**
	 * This method is used to Mouse hover on the element using CSS element.
	 * 
	 * @author Udhayasundar
	 * @param cssValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseHoverByCSS(String cssValue) throws Throwable;
	
	/**
	 * This method is used to Mouse hover on the element using class name element.
	 * 
	 * @author Udhayasundar
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseHoverByClassName(String classNameValue) throws Throwable;
	
	/**
	 * This method is used to Mouse hover on the element using name element.
	 * 
	 * @author Udhayasundar
	 * @param nameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseHoverByName(String nameValue) throws Throwable;
	
	/**
	 * This method is used to Mouse hover on the element using LinkText element.
	 * 
	 * @author Udhayasundar
	 * @param linkTextValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseHoverByLinkText(String linkTextValue) throws Throwable;
	
	/**
	 * This method is used to Mouse hover on the element using Partial Link Text element.
	 * 
	 * @author Udhayasundar
	 * @param pLinkTextValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseHoverByPLinkText(String pLinkTextValue) throws Throwable; 
	
	/**
	 * This method is used to fetch the data from dropdown using select By Id
	 * attribute to locate 
	 * @author Udhayasundar
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean selectByIdWithindex(String idValue, int data) throws Throwable;
	
	/**
	 * This method is used to click the element By mouse hover using ID element.
	 * 
	 * @author Udhayasundar
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseClickByID(String idValue) throws Throwable;
	
	/**
	 * This method is used to click the element By mouse hover using className element.
	 * 
	 * @author Udhayasundar
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseClickByClass(String classNameValue) throws Throwable;
	
	/**
	 * This method is used to click the element By mouse hover using ID element.
	 * 
	 * @author Udhayasundar 
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actionClickByID(String idValue) throws Throwable;
	
	/**
	 * This method is used to click the element By mouse hover using className element.
	 * 
	 * @author Udhayasundar
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actionClickByClass(String classNameValue) throws Throwable;
	
	/**
	 * This method is used to context click the element By mouse hover using ID element.
	 * 
	 * @author Udhayasundar
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseCntxtClickById(String idValue) throws Throwable;
	
	/**
	 * This method is used to context click the element By mouse hover using ClassName element.
	 * 
	 * @author Udhayasundar
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseCntxtClickByClass(String classNameValue) throws Throwable;
	
	/**
	 * This method is used to context click the element By mouse hover using id element.
	 * 
	 * @author Udhayasundar
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actioncnxtClickById(String idValue) throws Throwable;
	
	/**
	 * This method is used to context click the element By mouse hover using class element.
	 * 
	 * @author Udhayasundar
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actioncnxtClickByClass(String classNameValue) throws Throwable;
	
	/**
	 * This method is used to double click the element By mouse hover using id element.
	 * 
	 * @author Udhayasundar
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actiondbleClickById(String idValue) throws Throwable;
	
	/**
	 * This method is used to double click the element By mouse hover using class name element.
	 * 
	 * @author Udhayasundar
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actiondbleClickByClass(String classNameValue) throws Throwable;

	/**
	 * This method is used to double click the element By mouse hover using id element.
	 * 
	 * @author Udhayasundar
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mousedbleClickById(String idValue) throws Throwable ;
	
	/**
	 * This method is used to double click the element By mouse hover using class name element.
	 * 
	 * @author Udhayasundar
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean mousedbleClickByclass(String classNameValue) throws Throwable;
	
	/**
	 * This method is used to drag and drop the element By Mouse hover using ID element.
	 * 
	 * @author Udhayasundar
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean DragAndDropById(String source, String target) throws Throwable;
	
	/**
	 * This method is used to drag and drop the element By Mouse hover using classname element.
	 * 
	 * @author Udhayasundar
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean DragAndDropByclass(String source, String target) throws Throwable;
	
	/**
	 * This method is used to send the keys By Mouse hover on the element using ID element.
	 * 
	 * @author Udhayasundar
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actionMseSendKeysById(String idValue,String data) throws Throwable;
	
	/**
	 * This method is used to send the keys By Mouse hover on the element using className element.
	 * 
	 * @author Udhayasundar
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actionMseSendKeysByclass(String classNameValue,String data) throws Throwable;
	
	/**
	 * This method is used to send the keys By Mouse hover on the element using ID element.
	 * 
	 * @author Udhayasundar
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actionSendKeysById(String idValue,String data) throws Throwable;
	
	/**
	 * This method is used to send the keys By Mouse hover on the element using className element.
	 * 
	 * @author Udhayasundar
	 * @param classNameValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean actionSendKeysByclass(String classNameValue,String data) throws Throwable;
	
	/**
	 * This method is used to compare the value between the element and input data
	 * if new line exist then it replace with space
	 * 
	 * @author Udhayasundar
	 * @param xpathValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean verifyValueWithNewLineByXpath(String xpathValue, String data) throws Throwable;
	
	/**This method is used to compare the value between the element and input data
	 * if Special Character exist then replace it with space
	 * @author Balajih
	 * @param xpathValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean verifyValueWithSpecialCharacterByXpath(String xpathValue, String data) throws Throwable;
	
	/**
	 * This method is used to compare the value between the element and input data
	 * if new line exist then it replace with space
	 * 
	 * @author Udhayasundar
	 * @param xpathValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean verifyValueByXpath(String xpathValue, String data) throws Throwable;
	
	/**
	 * This method will check the element is displaying or not using xpath
	 * 
	 * @author Udhayasundar
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public boolean checkElementIsDisplayed(String xpathValue) throws Throwable;
	
	/**
	 * This method will return the web element Text using xpath
	 * 
	 * @author Udhayasundar
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public String getTextByXpath(String xpathValue) throws Throwable;
	
	/**
	 * This method will return the web element Text using ID
	 * 
	 * @author Balajih
	 * @param idValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public String getTextById(String idValue) throws Throwable;
	
	/** This method is used to click the element using Java script
	 * @author udhayasundar
	 * @param xpathValue - name of the webelement
	 * @return
	 * @throws Throwable
	 */
	public void clickByJavaScript(String xpathValue) throws Throwable;
	
	/** This method is used to compare the value between the element and input data
	 * @author udhayasundar
	 * @param idValue - name of the webelement
	 * @param data - The Data to be sent to the WebElement
	 * @return
	 * @throws Throwable
	 */
	public boolean verifyMessageById(String idValue, String data) throws Throwable;
	
	/** This method is used to get text value using LinkText
	 * @author Balajih & Sivaprakash
	 * @param linkText - name of the webelement
	 * @throws Throwable
	 */
	public String getTextUsingLinkText(String linkText) throws Throwable;
	
	/** This method is used to view the element using scrollbar
	 * @author Sivaprakash
	 * @param idValue - name of the webelement
	 * @throws Throwable
	 */
	public void scrollIntoViewById(String idValue) throws Throwable;
	
	/** This method is used to view the element using scrollbar
	 * @author Sivaprakash
	 * @param xpathValue - name of the webelement
	 * @throws Throwable
	 */
	public void scrollIntoViewByXpath(String xpathValue) throws Throwable;
	
	/**This method will clear the contents of the text field
	 * @author Balajih
	 * @param xpathValue
	 * @param data
	 * @return
	 * @throws Throwable
	 */
	public boolean clearContentByXpath(String xpathValue) throws Throwable;
	
	/**This method is to click on the Browser Back button
	 * @author balajih
	 * @throws Throwable
	 */
	public void clickBrowserBackButton() throws Throwable;
	
	/**This method is to quit the current Browser opened for testing
	 * @author balajih
	 * @throws Throwable
	 */
	public void quitBrowser() throws Throwable;
	
	/**This method will check whether the element is enabled on the screen.
	 * @author Balajih
	 * @param xpathValue
	 * @return
	 * @throws Throwable
	 */
	public boolean checkElementIsEnabledByXpath(String xpathValue) throws Throwable;
	
	/**This method is used to mouse release on the element 
	 * @author Balajih
	 * @param xpathValue
	 * @return
	 * @throws Throwable
	 */
	public boolean mouseReleaseByXpath(String xpathValue) throws Throwable;
	
	/**This method is used to get Title of the page.
	 * @author Balajih
	 * @return
	 * @throws Throwable
	 */	
	public void getTitle() throws Throwable;
	
	/**This method will check whether element is displayed.
	 * @author Balajih
	 * @param xpathValue
	 * @return
	 * @throws Throwable
	 */
	public boolean checkElementIsDisplayedByXpath(String xpathValue) throws Throwable;
	
	/**This method will check whether element is displayed.
	 * @author Balajih
	 * @param tagName
	 * @return
	 * @throws Throwable
	 */
	public boolean checkElementIsDisplayedByTagName(String tagName) throws Throwable;
	
	/** This method will check whether element is displayed.
	 * @author Balajih
	 * @param className
	 * @return
	 * @throws Throwable
	 */
	public boolean checkElementIsDisplayedByClassName(String className) throws Throwable;
	
	/**This method will check whether element is displayed.
	 * @author Balajih
	 * @param id
	 * @return
	 * @throws Throwable
	 */
	public boolean checkElementIsDisplayedById(String id) throws Throwable;
	
	/**This method will check whether element is displayed.
	 * @author Balajih
	 * @param linkText
	 * @return
	 * @throws Throwable
	 */
	public boolean checkElementIsDisplayedByLinkText(String linkText) throws Throwable;
	
	/**This method is used to wait till element is visible for a given time.
	 * @author Balajih
	 * @param xpathValue
	 * @return
	 * @throws Throwable
	 */
	public void waitTillElementVisibleByXpath(String xpathValue);
	
	/**This method will return the web element Text
	 * @author Balajih
	 * @param linkText
	 * @return
	 * @throws Throwable
	 */
	public String getTextByLinkText(String linkText) throws Throwable;
	
	/** This method will return the web element Text 
	 * @author Balajih
	 * @param tagName
	 * @return
	 * @throws Throwable
	 */
	public String getTextByTagName(String tagName) throws Throwable;
	
	/** This method is used to click the element using Java script
	 * @author Balajih
	 * @param id
	 * @return
	 * @throws Throwable
	 */
	public void clickByJavaScriptId(String id) throws Throwable;
	
	/**This method is to reloads the page
	 * @author thenmozhi
	 * @throws Throwable
	 */
	public void pageRefresh();
	
	/**This method will check whether Header Embed Code is present in the webpage.
	 * @author Thenmozhi
	 * @param xpath
	 * @return
	 * @throws Throwable
	 */
	public void verifyHeaderEmbedCode(String xpath,String expResult) throws Throwable;
	
	/**This method will check whether Google Tag Manager Script code is present in the webpage.
	 * @author Thenmozhi
	 * @param xpath
	 * @return
	 * @throws Throwable
	 */
	public void  verifyGoogleTagManagerForScript(String xpath,String expResult) throws Throwable;
	
	/**This method will check whether Google Tag Manager NoScript code is present in the webpage.
	 * @author Thenmozhi
	 * @param xpath
	 * @return
	 * @throws Throwable
	 */
	public void verifyGoogleTagManagerForNoScript(String xpath,String expResult) throws Throwable;
	
	/**This method will check whether Footer Embed Code is present in the webpage.
	 * @author Thenmozhi
	 * @param xpath
	 * @return
	 * @throws Throwable
	 */
	public void verifyFooterEmbedCode(String xpath,String expResult) throws Throwable;
	
	/**This method will check whether Pardot Data Layer Code is present in the webpage.
	 * @author Thenmozhi
	 * @param xpath
	 * @return
	 * @throws Throwable
	 */
	public void verifyPardotDataLayerCode(String xpath,String expResult) throws Throwable;
}
