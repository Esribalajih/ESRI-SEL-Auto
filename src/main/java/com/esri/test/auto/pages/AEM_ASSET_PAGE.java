package com.esri.test.auto.pages;
import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;
import com.esri.test.auto.pages.AEM_SIGNIN_PAGE;

/**
 * @author Mohamed
 * This is the Asset page of AEM
 *
 */

//Click on Public Folder
public class AEM_ASSET_PAGE extends ESRIWrappers {

	public AEM_ASSET_PAGE clickOnPublic() throws Throwable{
		
	try{
		waitForPageLoad(1);
		clickByXpath(prop.getProperty("Homepage.asstpublic.xpath"));
		Reporter.reportStep("Public Folder is Clicked", "PASS");
		waitForPageLoad(2);
					
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return this;
		}
	
	//Create New folder with Folder Title and Folder Name
	public AEM_ASSET_PAGE createNewFolder(String foldertitle, String foldername) throws Throwable{
		
	try{
			 
		clickByXpath(prop.getProperty("Homepage.asstpubliccreatenew.xpath"));
		Reporter.reportStep("Create tab is Clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.asstcreatenewfolder.xpath"));
		Reporter.reportStep("Create new Folder is clicked", "PASS");
		waitForPageLoad(2);
		enterById(prop.getProperty("Homepage.addfoldertitle.id"),foldertitle);
		Reporter.reportStep("Folder Title is entered", "PASS");
		waitForPageLoad(2);
		enterById(prop.getProperty("Homepage.addfoldername.id"),foldername);
		Reporter.reportStep("Folder Name is entered", "PASS");
		waitForPageLoad(2);
		clickById(prop.getProperty("Homepage.addfoldersubmitbtn.id"));
		Reporter.reportStep("Submit button is clicked", "PASS");
		waitForPageLoad(2);
		System.out.println("Folder is Created");
		waitForPageLoad(2);
		Reporter.reportStep("Folder is created", "PASS");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return this;
	
	}

	//Enter into Newly created folder and upload an Asset
	public AEM_ASSET_PAGE clickOnTestfolderanduploadasset(String location) throws Throwable{
	
	try{
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.testfolder.xpath"));
		Reporter.reportStep("Test Folder is clicked", "PASS");
		waitForPageLoad(4);
		clickByXpath(prop.getProperty("Homepage.uploadasset.xpath"));
		Reporter.reportStep("Upload is selected", "PASS");
		Runtime.getRuntime().exec("D:\\Project\\AEM\\Autoit\\file upload firefox.exe");
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Homepage.uploadassetconfirm.xpath"));
		Reporter.reportStep("Upload confirm button is clicked", "PASS");
		System.out.println("Asset is Uploaded");
		waitForPageLoad(5);
		Reporter.reportStep("Asset is uploaded", "PASS");
		}
	catch(Exception e){
		e.printStackTrace();
	}
	return this;
	}

	//Click on Asset and view its property by clicking on Eye View
	public AEM_ASSET_PAGE clickOnAssetproperty() throws Throwable{
	
	try{
		
		clickByXpath(prop.getProperty("Homepage.testfolder.xpath"));
		Reporter.reportStep("Test Folder is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.assetitem.xpath"));
		Reporter.reportStep("Asset is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.asseteye.xpath"));
		Reporter.reportStep("Asset eye is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.assetprop.xpath"));
		Reporter.reportStep("Asset properties is selected", "PASS");
		System.out.println("Asset Property is viewed");
		waitForPageLoad(2);
		}
	catch(Exception e){
		e.printStackTrace();
	}
	return this;
	}

	//Edit Asset property and Add Asset Tag
	public AEM_ASSET_PAGE addAssetTag(String assettitle) throws Throwable{
	
	try{
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.assetpropedit.xpath"));
		Reporter.reportStep("Asset edit button is clicked", "PASS");
		waitForPageLoad(2);
		enterByXpath(prop.getProperty("Homepage.assetxmpmetadatatitle.xpath"),assettitle);
		Reporter.reportStep("Asset title is Added", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.assetjcrmetadatatag.xpath"));
		Reporter.reportStep("Tag browse button is clicked", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.tagassettype.xpath"));
		Reporter.reportStep("Asset tag is selected", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.tagassettypeok.xpath"));
		Reporter.reportStep("Asset tag is confirmed", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.assetpropok.xpath"));
		Reporter.reportStep("Asset properties are edited", "PASS");
		System.out.println("Asset Title and Tag has added");
		waitForPageLoad(3);
		Reporter.reportStep("Asset Title and Tag has added", "PASS");
		
		}
	catch(Exception e){
		e.printStackTrace();
	}
	return this;
	}

	//Edit Asset property and Add Asset Description
	public AEM_ASSET_PAGE editAssetTag(String description) throws Throwable{
	
	try{
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.assetpropedit.xpath"));
		Reporter.reportStep("Asset edit button is clicked", "PASS");
		waitForPageLoad(2);
		enterByXpath(prop.getProperty("Homepage.xmpmetadatadesc.xpath"),description);
		Reporter.reportStep("Asset description is entered", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.assetpropok.xpath"));
		System.out.println("Asset Description is added");
		waitForPageLoad(2);
		Reporter.reportStep("Asset Description is added", "PASS");
		}
	catch(Exception e){
	e.printStackTrace();
	}
	return this;
	}

	//Search Asset Tag Using Tag (Reused in Delete case)
	public AEM_ASSET_PAGE searchForAssetTagByTag(String searchtagname)throws Throwable{
	
	try{
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.assetsearch.xpath"));
		waitForPageLoad(2);
		enterkeysByXpath(prop.getProperty("Homepage.assetsearchfield.xpath"),searchtagname);
		Reporter.reportStep("Asset tag name is entered for searching", "PASS");
		waitForPageLoad(2);
		System.out.println("Asset is displaying using Tag search");
		waitForPageLoad(3);
		Reporter.reportStep("Asset is displaying using Tag search", "PASS");
		}
	catch(Exception e){
	e.printStackTrace();
	}
	return this;
	}

	//Search Asset Tag using Description
	public AEM_ASSET_PAGE searchForAssetTagByDescription(String searchtagdescname)throws Throwable{
	
	try{
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.assetsearch.xpath"));
		waitForPageLoad(2);
		enterkeysByXpath(prop.getProperty("Homepage.assetsearchfield.xpath"),searchtagdescname);
		Reporter.reportStep("Asset description is entered for searching", "PASS");
		System.out.println("Asset is displaying using Description search");
		waitForPageLoad(3);
		Reporter.reportStep("Asset is displaying using Description search", "PASS");
		}
	catch(Exception e){
	e.printStackTrace();
	}
	return this;
	}

	//This method is used to delete the Asset in Test folder
	public AEM_ASSET_PAGE deleteAsset()throws Throwable{
	
	try{
		clickByXpath(prop.getProperty("Homepage.selectbtn.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.testassetonsearch.xpath"));
		Reporter.reportStep("Asset is selected to delete", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.morebtn.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.deletebtn.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.confirmdelete.xpath"));
		System.out.println("Asset is searched and Deleted");
		waitForPageLoad(3);
		Reporter.reportStep("Asset is searched and Deleted", "PASS");
		}
	catch(Exception e){
	e.printStackTrace();
	}
	return this;
	}

	//This method used to delete the test folder
	public AEM_ASSET_PAGE deletetestfolder()throws Throwable{
	
	try{
		clickByXpath(prop.getProperty("Homepage.asstpublic.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.selectbtnindir.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.testfolder.xpath"));
		Reporter.reportStep("Test folder is selected for deleting", "PASS");
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.morebtn1.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.deletebtn1.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.confirmdelete1.xpath"));
		System.out.println("Test Folder deleted successfully");
		waitForPageLoad(5);
		Reporter.reportStep("Test Folder deleted succesfully", "PASS");
		}
	catch(Exception e){
	e.printStackTrace();
	}
	return this;
	}

	//Closing the search panel in Home page
	public AEM_ASSET_PAGE closeSearch()throws Throwable{
	
	try{
		clickByXpath(prop.getProperty("Homepage.assetsearchclose.xpath"));
		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}

	//Used to deselect the select button
	public AEM_ASSET_PAGE deselect()throws Throwable{
	
	try{
		clickByXpath(prop.getProperty("Homepage.deselectindir.xpath"));
		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}
	
	//Clicking on Test folder
	public AEM_ASSET_PAGE clickOnTestfolder() throws Throwable{
		
	try{
			
		clickByXpath(prop.getProperty("Homepage.testfolder.xpath"));
		waitForPageLoad(1);
		Reporter.reportStep("Asset is Displaying", "PASS");
		}
		catch(Exception e){
		e.printStackTrace();
		}
		return this;
		}
	
	//This method is for Sign out from current user
	public AEM_ASSET_PAGE clickSignOut()throws Throwable{
		
	try{	
		
		clickByXpath(prop.getProperty("AEMProject.userchange.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Homepage.signoutbtn.xpath"));
		waitForPageLoad(2);
		Reporter.reportStep("User1 sign out is done", "PASS");
		}
		catch(Exception e){
		e.printStackTrace();
		}
    	return this;
    	}
	
	//This method is to launch new url in current browser
	public AEM_ASSET_PAGE launchNewURl(String url)throws Throwable{
		
	 try{	
		openbrowser(url);
		}
		catch(Exception e){
		e.printStackTrace();
		}
	    return this;
	    }
    	}
	