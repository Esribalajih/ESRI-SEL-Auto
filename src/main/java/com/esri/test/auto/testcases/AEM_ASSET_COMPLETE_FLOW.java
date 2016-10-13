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

public class AEM_ASSET_COMPLETE_FLOW extends ESRIWrappers{
	 @BeforeClass
	  public void startTestCase() {
		 dataSheetName="AEM_INPUT";
		 testCaseName="AEM_ASSET_INPUT (POM)";
		 testDescription="AEM ASSET FLOW";
	  }

	  @Test(dataProvider="fetchdata")
	  public void assetflow(String username,String password,String foldertitle,String foldername,String location,String assettitle,String description,String searchtagname,String searchtagdescname,String projecttitle,String wfname,String wfdesc,String cnum,String iuse) throws Throwable{
		  //Signin 
		  new AEM_SIGNIN_PAGE()
		  .enterUserName(username)
		  .enterPassword(password)
		  .clickSignin();
		  //Verify Page Title
		  new AEM_HOMEPAGE()
		  .verifyTitle()
		  .clickOnAsset();
		  //Create New Folder
		  new AEM_ASSET_PAGE()
		  .clickOnPublic()
		  .createNewFolder(foldertitle, foldername);
		  
		  //Upload Asset
		  new AEM_HOMEPAGE()
		  .clickOnAsset();
		  new AEM_ASSET_PAGE()
		  .clickOnPublic()
		  .clickOnTestfolderanduploadasset(location);
		 
		  //View Asset property
		  new AEM_HOMEPAGE()
		  .clickOnAsset();
		  new AEM_ASSET_PAGE()
		  .clickOnPublic()
		  .clickOnAssetproperty();
		  
		  //Add asset Tag
		  new AEM_HOMEPAGE()
		  .clickOnAsset();
		  new AEM_ASSET_PAGE()
		  .clickOnPublic()
		  .clickOnAssetproperty()
		  .addAssetTag(assettitle);
		   
		  //Add Asset Description
		  new AEM_HOMEPAGE()
		  .clickOnAsset();
		  new AEM_ASSET_PAGE()
		  .clickOnPublic()
		  .clickOnAssetproperty()
		  .editAssetTag(description);
		  
		  //Search Asset by Tag
		  new AEM_HOMEPAGE()
		  .clickOnAsset();
		  new AEM_ASSET_PAGE()
		  .searchForAssetTagByTag(searchtagname);
		  
		  //Search Asset by Description		 		  
		  new AEM_HOMEPAGE()
		  .clickOnAsset();
		  new AEM_ASSET_PAGE()
		  .closeSearch()
		  .searchForAssetTagByDescription(searchtagdescname);
		   
		  //Search Asset and Delete
		  new AEM_HOMEPAGE()
		  .clickOnAsset();
		  new AEM_ASSET_PAGE()
		  .closeSearch()
		  .searchForAssetTagByTag(searchtagname)
		  .deleteAsset()
		  .closeSearch()
		  .deselect();
		   
		  
		  //Delete folder and Close the session
		  new AEM_HOMEPAGE()
		  .clickOnAsset();
		  new AEM_ASSET_PAGE()
		  .deletetestfolder()
		  .deselect();
		   
		  
	  }
	  
}

