package com.esri.test.auto.pages;
import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;
import org.openqa.selenium.By;

/**
 * @author Mohamed
 * This is the Asset page of AEM
 *
 */

//Click on Public Folder
public class AEM_ASSET_PAGE extends ESRIWrappers {

	public AEM_ASSET_PAGE() throws Throwable{
		waitForPageLoad(2);
		if(!VerifyTitle("AEM Assets")){
			Reporter.reportStep("This is not a Home page", "FAIL");
		}
		else System.out.println("AEM Assets page Launched Successfully");
	}
	
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
		uploadFile(location);
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
	
	//Create New folder with Folder Title and Folder Name
		public AEM_ASSET_PAGE createNewFolder_Assert(String foldertitle, String foldername) throws Throwable{
				
			try{
				clickByXpath(prop.getProperty("Homepage.asstcreateButton.xpath"));
				Reporter.reportStep("Create button is Clicked", "PASS");
				waitForPageLoad(2);
				clickByXpath(prop.getProperty("Homepage.asstcreatenwfolder.xpath"));
				Reporter.reportStep("Create new Folder is clicked", "PASS");
				waitForPageLoad(2);
				enterByXpath(prop.getProperty("Homepage.adfoldertitle.xpath"),foldertitle);
				Reporter.reportStep("Folder Title is entered", "PASS");
				waitForPageLoad(2);
				enterByXpath(prop.getProperty("Homepage.adfoldername.xpath"),foldername);
				Reporter.reportStep("Folder Name is entered", "PASS");
				waitForPageLoad(2);
				clickByXpath(prop.getProperty("Homepage.adfoldersubmitbtn.xpath"));
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
		public AEM_ASSET_PAGE clickOnTestfolderanduploadasset_NewAssert(String folderTitle,String location) throws Throwable{
		
		try{
			waitForPageLoad(5);
			clickOnFolder(folderTitle);
			waitForPageLoad(4);
			clickByXpath(prop.getProperty("Homepage.asstcreateButton.xpath"));
			Reporter.reportStep("Create button is Clicked", "PASS");
			waitForPageLoad(2);
			clickByXpath(prop.getProperty("Homepage.uploadassetFile.xpath"));
			Reporter.reportStep("Upload is selected", "PASS");
			uploadFile(location);
			waitForPageLoad(3);
			clickByXpath(prop.getProperty("Homepage.uploadassetButton.xpath"));
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
		public AEM_ASSET_PAGE clickOnAssetproperty_NewAssert(String assertTitle) throws Throwable{
		
		try{
			waitForPageLoad(3);
			int folderCount = driver
					.findElements(By
							.xpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item"))
					.size();
			for (int count = 1; count <= folderCount; count++) {
				String fileName = driver.findElement(
						By.xpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["
						+count+"]/coral-card/div/coral-card-content/coral-card-title")).getText();
				if (fileName.equalsIgnoreCase(assertTitle)) {
					clickByXpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["+count+"]/coral-card/coral-card-info");
					Reporter.reportStep("Assert is clicked", "PASS");
					break;
				}
			}
			//clickByXpath(prop.getProperty("Homepage.assertImage.xpath"));
			//Reporter.reportStep("Assert Image is clicked", "PASS");
			waitForPageLoad(2);
			clickByXpath(prop.getProperty("Homepage.assertproperty.xpath"));
			Reporter.reportStep("Asset properties is selected", "PASS");
			System.out.println("Asset Property is viewed");
			waitForPageLoad(2);
			}
		catch(Exception e){
			e.printStackTrace();
		}
		return this;
		}
		
	
		//Edit Asset property, add Asset Title, Description and Tag
		public AEM_ASSET_PAGE addTitle_Desc_Tag(String assetTitle, String assertDesc, String tagType, String tagName) throws Throwable{
		
		try{
			waitForPageLoad(2);
			enterByXpath(prop.getProperty("Homepage.assertpropertyTitle.xpath"),assetTitle);
			Reporter.reportStep("Asset title is Added", "PASS");
			enterByXpath(prop.getProperty("Homepage.assertpropertyDesc.xpath"),assertDesc);
			Reporter.reportStep("Asset Description is Added", "PASS");
			clickByXpath(prop.getProperty("Homepage.assertpropertyTagButton.xpath"));
			Reporter.reportStep("Tag browse button is clicked", "PASS");
			waitForPageLoad(2);
			System.out.println(tagType);
			clickByXpath("//div[text()='"+tagType+"']");                      //prop.getProperty("Homepage.assertpropertyTagType.xpath"));
			Reporter.reportStep("Asset tag is selected", "PASS");
			waitForPageLoad(2);
			System.out.println(tagName);
			clickByXpath("//div[text()='"+tagName+"']");					  //prop.getProperty("Homepage.assertpropertyTagName.xpath"));
			Reporter.reportStep("Asset tag is confirmed", "PASS");
			waitForPageLoad(2);
			clickByXpath(prop.getProperty("Homepage.assertpropertyOkButton.xpath"));
			Reporter.reportStep("Asset properties are added", "PASS");
			System.out.println("Asset Title and Tag has added");
			waitForPageLoad(3);
			clickByXpath(prop.getProperty("Homepage.assertpropertysaveBtn.xpath"));
			Reporter.reportStep("Asset Title and Tag has added", "PASS");
			waitForPageLoad(3);
			clickByXpath(prop.getProperty("Homepage.assertpropertycloseBtn.xpath"));
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		return this;
		}

		//Click on Adobe Experience Manager Link
		public AEM_HOMEPAGE clickOnAdobeExperienceManager() throws Throwable{
			try {
				clickByXpath(prop.getProperty("Homepage.adobeExpManager.xpath"));
				waitForPageLoad(2);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new AEM_HOMEPAGE();
		}
		
		//Search Asset Tag Using Tag new ENV 
		public AEM_ASSET_PAGE searchForAsset(String searchtagname, String searchName)throws Throwable{
		boolean flag=false;
		try{
			waitForPageLoad(2);
			clickByXpath(prop.getProperty("Homepage.assetsearchicon.xpath"));
			waitForPageLoad(2);
			enterkeysByXpath(prop.getProperty("Homepage.assetsearchtextfield.xpath"),searchtagname);
			Reporter.reportStep(searchtagname+" is entered for searching", "PASS");
			waitForPageLoad(3);
				int folderCount = driver
						.findElements(By
								.xpath("//coral-masonry[@id='granite-omnisearch-result']/coral-masonry-item"))
						.size();
				for (int count = 1; count <= folderCount; count++) {
					String fileName = driver.findElement(
							By.xpath("//coral-masonry[@id='granite-omnisearch-result']/coral-masonry-item["
							+count+"]/coral-card/div/coral-card-content/coral-card-title")).getText();
					if (fileName.equalsIgnoreCase(searchName)) {
						Reporter.reportStep("Asset is displaying using search", "PASS");
						flag=true;
						break;
					}
				}
				if(!flag){
					Reporter.reportStep("Asset is not displayed on search", "FAIL");
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return this;
		}
		
		//Closing the search panel in Home page
		public AEM_ASSET_PAGE closeSearch_NewAssert()throws Throwable{
		
		try {
			clickByXpath(prop.getProperty("Homepage.assetclosesearchtextfield.xpath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
		}
		
		
	// Enter into Newly created folder and upload an Asset
	public AEM_ASSET_PAGE clickOnFolder(String fName) throws Throwable {
		try {
			waitForPageLoad(2);
			int folderCount = driver
					.findElements(By
							.xpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item"))
					.size();
			for (int count = 1; count <= folderCount; count++) {
				String folderName = driver.findElement(
						By.xpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["
								+ count + "]/coral-card/div/coral-card-content/coral-card-title"))
						.getText();
				if (folderName.equalsIgnoreCase(fName)) {
					System.out.println(folderName);
					clickByXpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["
							+ count + "]/coral-card/div/coral-card-content/coral-card-title");
					Reporter.reportStep("Test Folder is clicked", "PASS");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
		
	// Enter into Newly created folder and upload an Asset
		public AEM_ASSET_PAGE selectAssertandDelete(String JpegName) throws Throwable {
			try {
				waitForPageLoad(3);
				int folderCount = driver
						.findElements(By
								.xpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item"))
						.size();
				for (int count = 1; count <= folderCount; count++) {
					String folderName = driver.findElement(
							By.xpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["
							+count+"]/coral-card/div/coral-card-content/coral-card-title")).getText();
					if (folderName.equalsIgnoreCase(JpegName)) {
						mouseHoverByXpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["+count+"]/coral-card/div/coral-card-content/coral-card-title");
						mouseHoverByXpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["+count+"]/coral-quickactions/button[1]");
						System.out.println("mouse hovered");
						clickByJavaScript("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["+count+"]/coral-quickactions/button[1]/coral-button-label");
						Reporter.reportStep("Assert is clicked", "PASS");
						break;
					}
				}
				
//				String assertName = getTextByXpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item[1]/coral-card/div/coral-card-content/coral-card-title");
//				System.out.println(assertName);
//				mouseHoverByXpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item[1]/coral-card/div/coral-card-content/coral-card-title");
//				mouseHoverByXpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item[1]/coral-quickactions/button[1]");
//				System.out.println("mouse hovered");
//				clickByJavaScript("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item[1]/coral-quickactions/button[1]/coral-button-label");
				//clickByXpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item[1]/coral-quickactions/button[1]/coral-button-label");
				waitForPageLoad(3);
				clickByXpath(prop.getProperty("Homepage.deleteAssertFileFolderBtn.xpath"));
				waitForPageLoad(2);
				clickByXpath(prop.getProperty("Homepage.deleteAssertPopupBtn.xpath"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
	
		//Select the created folder and navigate to parent folderAsset
		public AEM_ASSET_PAGE selectFolderTitleInAssertPage(String fromfolderName, String toFolderName) throws Throwable {
			try {
				waitForPageLoad(3);
				clickByXpath("//button[text()='"+fromfolderName+"']");
				clickByXpath("//coral-selectlist-item[text()='"+toFolderName+"']");
				waitForPageLoad(3);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}
		
		//signout User
	public AEM_ASSET_PAGE signoutUser() throws Throwable {
		try {
			waitForPageLoad(2);
			clickByXpath(prop.getProperty("Homepage.userIcon.xpath"));
			clickByXpath(prop.getProperty("Homepage.signOutBtn.xpath"));
			Reporter.reportStep("Signout successfully", "PASS");
			waitForPageLoad(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	// Delete Newly created folder
		public AEM_ASSET_PAGE deleteCreatedFolder(String fName) throws Throwable {
			try {
				waitForPageLoad(2);
				int folderCount = driver
						.findElements(By
								.xpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item"))
						.size();
				for (int count = 1; count <= folderCount; count++) {
					String folderName = driver.findElement(
							By.xpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["
									+ count + "]/coral-card/div/coral-card-content/coral-card-title"))
							.getText();
					if (folderName.equalsIgnoreCase(fName)) {
						System.out.println(folderName);
						mouseHoverByXpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["
								+ count + "]/coral-card/div/coral-card-content/coral-card-title");
						mouseHoverByXpath("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["
								+ count + "]//coral-quickactions/button[1]");
						clickByJavaScript("//div[@class='foundation-layout-panel-content']/coral-masonry/coral-masonry-item["
								+ count + "]//coral-quickactions/button[1]");
						waitForPageLoad(3);
						clickByXpath(prop.getProperty("Homepage.deleteAssertFileFolderBtn.xpath"));
						waitForPageLoad(2);
						clickByXpath(prop.getProperty("Homepage.deleteAssertPopupBtn.xpath"));
						Reporter.reportStep("Test Folder is deleted", "PASS");
						break;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return this;
		}

  	}
	