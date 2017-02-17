package com.esri.test.auto.testcases;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.esri.test.auto.pages.AEM_ASSET_PAGE;
import com.esri.test.auto.pages.AEM_HOMEPAGE;
import com.esri.test.auto.pages.AEM_SIGNIN_PAGE;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**This is complete Asset test case flow
 * @author Mohamed
 *
 */

public class AEM_ASSET_COMPLETE_FLOW_ENV2 extends ESRIWrappers{
	 @BeforeClass
	  public void startTestCase() {
		 dataSheetName="AEM_INPUT_Environment_6.2";
		 testCaseName="AEM_ASSET_INPUT (POM)";
		 testDescription="AEM ASSET FLOW";
	  }

	  @Test(dataProvider="fetchdata")
	public void assetflow(String username, String password, String foldertitle, String foldername, String location, String fileName,
			String parentFolder, String assettitle, String description, String searchTagType, String searchTagName,
			String searchtagdescname, String projecttitle, String wfname, String wfdesc, String cnum, String iuse,
			String username1, String password1, String url, String path) throws Throwable {
	 
		  openbrowser(url);
		  //Signin 
		   new AEM_SIGNIN_PAGE()
		  .enterUserName(username)
		  .enterPassword(password)
		  .clickSignin()
		   
		  //Verify Page Title
		  .verifyTitle()
		  .clickOnAdobeExperienceManager()
		  .clickOnAsset_NEW()
		  
		  //Create New Folder
		 .createNewFolder_Assert(foldertitle, foldername)
		  
		 //Upload Asset
		 .clickOnTestfolderanduploadasset_NewAssert(foldertitle, location)
		 
		 //View Asset property
		 .clickOnAssetproperty_NewAssert(fileName)
		  
		  //Add asset Tag
		 .addTitle_Desc_Tag(assettitle,description,searchTagType,searchTagName);
		   
		  //Search Asset by Tag
		  new AEM_HOMEPAGE()
		  .clickOnAdobeExperienceManager()
		  .clickOnAsset_NEW()
		  .searchForAsset(searchTagName,assettitle)
		  .closeSearch_NewAssert()
		  
		  //Search Asset by Description		 		  
		  .searchForAsset(searchtagdescname,assettitle)
		  .closeSearch_NewAssert()
	   
		  //Delete Assert and Folder
		  .clickOnFolder(foldertitle)
		  .selectAssertandDelete(assettitle)
		  .selectFolderTitleInAssertPage(foldertitle, parentFolder)
		  .deleteCreatedFolder(foldertitle)
		  .signoutUser();
  
	  	  }
	  	
	  	
	  
	  }
