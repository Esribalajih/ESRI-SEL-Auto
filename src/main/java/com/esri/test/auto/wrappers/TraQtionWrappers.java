package com.esri.test.auto.wrappers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.traqtion.test.auto.utils.DataInputProvider;
import com.traqtion.test.auto.utils.JSONTestDataReader;
import com.traqtion.test.auto.utils.Reporter;



public class TraQtionWrappers extends GenericWrappers{

	protected String browserName;
	protected String dataSheetName;
	protected String jsonTestData;
	protected static String testCaseName;
	protected static String Category;
	protected static String testDescription;

	@BeforeSuite
	public void beforeSuite() throws FileNotFoundException, IOException {
		Reporter.startResult();
		loadObjects();
	}
	@Parameters("browser")
	@BeforeMethod
	public void beforeMethod(String browserName) throws Throwable {
		Reporter.startTestCase();
		invokeApp(browserName);
	}


	//Reading test data from MS-Excel
	/*@DataProvider(name="fetchdata")
	public Object[][] getdata() throws Throwable {
		return DataInputProvider.getSheet(dataSheetName);

	}*/
	//Reading single test data from JSON File
	public JSONObject getTestData() throws FileNotFoundException, IOException, ParseException{
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("./data/"+jsonTestData+".json"));
		JSONObject jsonObject = (JSONObject) obj;
		return jsonObject;
	}
	
	@AfterMethod
	public void afterMethod() throws Throwable {
		Reporter.endResult();
		//quitBrowser();		
	}

	@AfterSuite
	public void afterSuite() throws Throwable {
		Reporter.endSuite();
		unloadObjects();
		quitBrowser();
	}

}
