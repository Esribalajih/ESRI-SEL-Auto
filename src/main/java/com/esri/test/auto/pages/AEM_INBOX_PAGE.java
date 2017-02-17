package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author Mohamed This is the home page of AEM
 *
 */
public class AEM_INBOX_PAGE extends ESRIWrappers {

	public AEM_INBOX_PAGE() throws Throwable {
		waitForPageLoad(2);
		if(!VerifyTitle("AEM Inbox")){
		Reporter.reportStep("This is not a Home page", "FAIL"); 
		} 
		else{
			System.out.println("AEM Inbox page Launched Successfully");
		}
	}

	// Click on Email request flow with completion steps
	public AEM_INBOX_PAGE checkEmailRequestFlow(String stepName) throws Throwable{
		try {
			boolean flag = false;
			waitForPageLoad(3);
			//div[@class='foundation-content-current']/div[2]/div[1]/div/div/article[1]
			for (int count = 1; count <= 4; count++) {
				String workFlowName = driver.findElement(
						By.xpath("//div[@class='foundation-content-current']/div[2]/div[1]/div/div/article["+count+"]/a/div/div[1]/p[1]"))
						.getText();
				String stepflowName = driver.findElement(
						By.xpath("//div[@class='foundation-content-current']/div[2]/div[1]/div/div/article["+count+"]/a/div/div[1]/h4/span[1]"))
						.getText();
				if (workFlowName.equalsIgnoreCase("Esri Email Request Workflow")&&stepflowName.equalsIgnoreCase(stepName)) {
					clickByXpath("//div[@class='foundation-content-current']/div[2]/div[1]/div/div/article["
							+ count + "]/i");
					flag= true;
					Reporter.reportStep("Esri Email Request Workflow with completion "+stepflowName+" checked successfully" , "PASS");
					break;
				}
			}
			if(!flag){
				Reporter.reportStep("Esri Email Request Workflow with completion "+stepName+" not checked successfully" , "FAIL");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
		
	public AEM_INBOX_PAGE clickBrowseButton()throws Throwable{
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("projectpage.inboxBrowseButton.xpath"));
		return this;
	}
	
	public AEM_INBOX_PAGE clickStepCompleteButton()throws Throwable{
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("projectpage.inboxStepCompleteBtn.xpath"));
		return this;
	}
	
	
	public AEM_INBOX_PAGE clickCompleteButton()throws Throwable{
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("projectpage.inboxCompleteButton.xpath"));
		return this;
	}
	
	public AEM_PROJECTPAGE clickCloseButton()throws Throwable{
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("projectpage.inboxCloseButton.xpath"));
		return new AEM_PROJECTPAGE();
	}

	public AEM_INBOX_PAGE selectAssertFolder(String parentFolder, String fileName) throws Throwable{
		try {
			
			waitForPageLoad(2);
			driver.findElement(By.xpath("//div[text()='"+parentFolder+"']")).click();
			waitForPageLoad(2);
			driver.findElement(By.xpath("//div[text()='"+fileName+"']")).click();
			waitForPageLoad(2);
			//clickByXpath("//div[@id='mod-guid-4']/div[1]/button[1]");
			for(int i=1; i<=6;i++){
				String style=driver.findElement(By.xpath("//div[@id='mod-guid-"+i+"']")).getAttribute("style");
				System.out.println(style);
				if(!style.equalsIgnoreCase("margin-left: 0px; margin-top: 0px; display: none;")){
					mouseHoverByXpath("//div[@id='mod-guid-"+i+"']/div[1]/button[1]/i");
					clickByXpath("//div[@id='mod-guid-"+i+"']/div[1]/button[1]/i");
					break;
				}	
			}
			String path = getTextByXpath("//div[@class='coral-FixedColumn-column']/div[1]/span/span/input");
			System.out.println("Assert path: "+path);
			waitForPageLoad(2);
			//enterByXpath("//div[@class='coral-FixedColumn-column']/div[1]/span/span/input", "/content/dam/testfolder/Tulips.jpg");
			//enterByXpath("//div[@class='coral-FixedColumn-column']/div[1]/span/span/input", ""+Keys.ENTER);
			//waitForPageLoad(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		waitForPageLoad(10);
		return this;
	}
		
	public AEM_INBOX_PAGE refreshPage()throws Throwable{
		waitForPageLoad(2);
		driver.navigate().refresh();
		return this;
	}
	
}
