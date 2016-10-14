package com.esri.test.auto.pages;

import org.openqa.selenium.By;
import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * @author balajih
 *
 */
public class EsriTrainingCatalogSearchPage extends ESRIWrappers {
	static String firstcardTitle;

	public EsriTrainingCatalogSearchPage() throws Throwable {
		waitForPageLoad(3);
		if (!VerifyTitle("Search the Esri Training Catalog")) {
			Reporter.reportStep("Esri Training catalog find training title did not match", "FAIL");
		}

	}
	public EsriTrainingHomePage getCardTitle() throws Throwable{
		
		
		firstcardTitle= getTextByXpath(prop.getProperty("Training.catalogCardTitle1.xpath"));
		clickByXpath(prop.getProperty("Homepage.clickMain.xpath"));
		return new EsriTrainingHomePage();
	}

	public EsriTrainingCatalogSearchPage enterKeywords(String data) throws Throwable {
		enterByXpath(prop.getProperty("Training.catalogEnterKeywordFindTraining.xpath"), data);
		return this;
	}

	public EsriTrainingCatalogSearchPage clickSearch() throws Throwable {
		clickByXpath(prop.getProperty("Training.catalogclickSearch.xpath"));
		return this;
	}

	public EsriTrainingCatalogSearchPage clearSearch() throws Throwable {
		clearContentByXpath(prop.getProperty("Training.catalogEnterKeywordFindTraining.xpath"));
		return this;
	}

	public EsriTrainingCatalogSearchPage resultsCount() throws Throwable {
		waitForPageLoad(2);
		System.out.println(getTextByXpath(prop.getProperty("Training.catalogResultsDisplayAfterSearch.xpath")));
		return this;
	}

	public EsriTrainingCatalogSearchPage filterSelect() throws Throwable {
		clickByXpath(prop.getProperty("Training.catalogfilterSelectGISCapabilites.xpath"));
		clickByXpath(prop.getProperty("Training.catalogfilterClickGISCapabilites.xpath"));
		clickByXpath(prop.getProperty("Training.catalogfilterSelectAllProducts.xpath"));
		clickByXpath(prop.getProperty("Training.catalogfilterClickAllProducts.xpath"));
		clickByXpath(prop.getProperty("Training.catalogfilterSelectAllLearningFormats.xpath"));
		clickByXpath(prop.getProperty("Training.catalogfilterClickAllLearningFormats.xpath"));
		return this;
	}

	public EsriTrainingCatalogSearchPage filterVersionSelect(String data) throws Throwable {
		selectByXpathWithValue(prop.getProperty("Training.catalogFilterVersion.xpath"), data);
		return this;
	}

	public EsriTrainingCatalogSearchPage filterVersionSort(String data) throws Throwable {
		selectByXpathWithValue(prop.getProperty("Training.catalogFilterSort.xpath"), data);
		return this;
	}

	public EsriTrainingCatalogSearchPage checkBox() throws Throwable {
		clickByXpath(prop.getProperty("Training.catalogCheckboxAvailableWithMaintenance.xpath"));
		clickByXpath(prop.getProperty("Training.catalogCheckboxFreeTraining.xpath"));
		String message = getTextByXpath(prop.getProperty("Training.catalogZeroTrainingMessage.xpath"));
		System.out.println(getTextByXpath(prop.getProperty("Training.catalogZeroTrainingMessage.xpath")));
		if (message.equalsIgnoreCase("0 training options found.")) {
			clickByXpath(prop.getProperty("Training.catalogCheckboxAvailableWithMaintenance.xpath"));
			clickByXpath(prop.getProperty("Training.catalogCheckboxFreeTraining.xpath"));
			waitTillElementVisibleByXpath(prop.getProperty("Training.catalogFilterSortClick.xpath"));
			clickByXpath(prop.getProperty("Training.catalogFilterSortClick.xpath"));
			clickByLinkText(prop.getProperty("Training.catalogFilterSortOptionSelect.linkText"));
		} else {
			System.out.println("Trainingsfound");
		}

		waitForPageLoad(2);
		return this;

	}

	public EsriTrainingCatalogSearchPage listView() throws Throwable {
		clickByXpath(prop.getProperty("Training.catalogListView.xpath"));
		waitForPageLoad(5);
		return this;
	}

	public EsriTrainingCardPage clickViewDetails() throws Throwable {
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		return new EsriTrainingCardPage();
	}



	public EsriTrainingCatalogSearchPage clickFindTraining() throws Throwable {
		mouseHoverByXpath(prop.getProperty("Training.catalogMouseHover.xpath"));
		clickByXpath(prop.getProperty("Training.catalogClickFindTraining.xpath"));
		return new EsriTrainingCatalogSearchPage();
	}

	public EsriTrainingCatalogSearchPage selectFilterMOOC() throws Throwable {

		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersElearning.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersMoocs.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		checkElementIsDisplayedByClassName(prop.getProperty("Training.catalogCardTableVerify.class"));
		clickBrowserBackButton();
		waitForPageLoad(2);
		return this;
	}

	public EsriTrainingCatalogSearchPage selectFilterInstructorLed() throws Throwable {

		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersInstructorled.xpath"));
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));

		boolean status = false;
		try {
			driver.findElement(By.xpath(prop.getProperty("Training.catalogCardWishList.xpath"))).click();
			System.out.println("Card added to WishList");
			status = true;
		} catch (Exception e) {
		}
		if (!status) {
			System.out.println(checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardAddedToWishList")));
			System.out.println("Card is already added to WishList");

		}

		/*
		 * if (checkElementIsDisplayedByXpath(prop.getProperty(
		 * "Training.catalogCardWishList.xpath"))) {
		 * 
		 * clickBrowserBackButton(); waitForPageLoad(2); } else if
		 * (checkElementIsDisplayedByXpath(prop.getProperty(
		 * "Training.catalogCardAddedToWishList"))) { clickBrowserBackButton();
		 * } else { System.out.println("WishList checkbox is not identified.");
		 * }
		 */

		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectFilterWebCourses() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		waitForPageLoad(3);
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersElearning.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersWebCourses.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectFilterTrainingSeminars() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		waitForPageLoad(3);
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersElearning.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersTrainingSeminars.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectFilterMoocs() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersElearning.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersMoocs.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectFilterVideos() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersElearning.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersVideos.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectFilterLessons() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersElearning.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersLessons.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectFilterLearningPlans() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		// mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersElearning.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersLearningPlans.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		waitForPageLoad(3);
		checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectFilterGeoInquiries() throws Throwable {
		waitForPageLoad(3);

		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersTeacherResources.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersGeoInquiries.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		waitForPageLoad(3);
		checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectFilterSpatialLabs() throws Throwable {
		waitForPageLoad(3);

		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersTeacherResources.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersSpatialLabs.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		waitForPageLoad(3);
		checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectFilterMappingOurWorld() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersTeacherResources.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersMappingOurWorld.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		waitForPageLoad(3);
		checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectFilterThinkingSpatially() throws Throwable {
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersTeacherResources.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersThinkingSpatially.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		waitForPageLoad(3);
		checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectFilterBooks() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersBooks.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		waitForPageLoad(3);
		checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectFilterTechnicalCertifications() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersTechnicalCertifications.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		waitForPageLoad(3);
		checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectTakeCoursesFilterInstructorLed() throws Throwable {

		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersInstructorled.xpath"));
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		clickByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		// clickbyLinkText(prop.getProperty("Training.takeCoursesInstructorLed.linktext"));

		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("unexpected alert not present");
		}
		getTitle();

		// Boolean addedWishList
		// =checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardAddedToWishList"));
		// Boolean
		// addToWishList=checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardWishList.xpath"));
		/*
		 * boolean status = false; try{
		 * clickbyXpath(prop.getProperty("Training.catalogCardWishList.xpath"));
		 * System.out.println("Card added to WishList"); status = true; }
		 * catch(Exception e){ } if(!status){
		 * System.out.println(checkElementIsDisplayedByXpath(prop.getProperty(
		 * "Training.catalogCardAddedToWishList"))); System.out.println(
		 * "Card is already added to WishList"); clickBrowserBackButton(); }
		 */
		/*
		 * if (checkElementIsDisplayedByXpath(prop.getProperty(
		 * "Training.catalogCardWishList.xpath"))) {
		 * 
		 * clickBrowserBackButton(); waitForPageLoad(2); } else if
		 * (checkElementIsDisplayedByXpath(prop.getProperty(
		 * "Training.catalogCardAddedToWishList"))) { clickBrowserBackButton();
		 * } else { System.out.println("WishList checkbox is not identified.");
		 * }
		 */

		clickBrowserBackButton();
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectTakeCoursesFilterWebCourses() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		waitForPageLoad(3);
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersElearning.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersWebCourses.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		clickByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("unexpected alert not present");
		}
		checkElementIsDisplayedById(prop.getProperty("Training.takeCoursesWebCourseLaunchcourseTitle.id"));
		clickBrowserBackButton();
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectTakeCoursesFilterTrainingSeminars() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		waitForPageLoad(3);
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersElearning.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersTrainingSeminars.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		clickByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("unexpected alert not present");
		}
		checkElementIsDisplayedById(prop.getProperty("Training.takeCoursesWebCourseLaunchcourseTitle.id"));
		clickBrowserBackButton();
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectTakeCoursesFilterMoocs() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersElearning.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersMoocs.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		String buttonname = getTextByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));

		try {
			if (buttonname.equalsIgnoreCase("View My Schedule")) {
				clickByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
				waitForPageLoad(3);
				getTitle();
				clickBrowserBackButton();
			} else if (buttonname.equalsIgnoreCase("Count Me In")) {
				checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
			}
		} catch (Exception e) {
			System.out.println("Unable to find the button");
		}
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectTakeCoursesFilterVideos() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersElearning.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersVideos.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		clickByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		getTitle();
		clickBrowserBackButton();
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectTakeCoursesFilterLessons() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersElearning.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersLessons.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		clickByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		// Storing parent window reference into a String Variable
		String Parent_Window = driver.getWindowHandle();
		// Switching from parent window to child window
		for (String Child_Window : driver.getWindowHandles()) {
			driver.switchTo().window(Child_Window);
			// Performing actions on child window
			getTitle();
			System.out.println(getTextByTagName(prop.getProperty("Training.window.tagName")));
		}
		// Switching back to Parent Window
		driver.switchTo().window(Parent_Window);
		// Performing some actions on Parent Window
		getTitle();
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectTakeCoursesFilterLearningPlans() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));		
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersLearningPlans.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		waitForPageLoad(3);
		getTextByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		String buttonname = getTextByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));

		try {
			if (buttonname.equalsIgnoreCase("View Progress")) {
				clickByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
				waitForPageLoad(3);
				getTitle();
				clickBrowserBackButton();
			} else if (buttonname.equalsIgnoreCase("Enroll")) {
				checkElementIsDisplayedByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
				getTitle();
			}
		} catch (Exception e) {
			System.out.println("Unable to find the button.");
		}
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectTakeCoursesFilterGeoInquiries() throws Throwable {
		waitForPageLoad(3);

		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersTeacherResources.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersGeoInquiries.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		String Parent_Window = driver.getWindowHandle();
		// Switching from parent window to child window
		for (String Child_Window : driver.getWindowHandles()) {
			driver.switchTo().window(Child_Window);
			// Performing actions on child window			
			System.out.println(getTextByTagName(prop.getProperty("Training.window.tagName")));
		}
		// Switching back to Parent Window
		driver.switchTo().window(Parent_Window);
		// Performing some actions on Parent Window
		getTitle();
		clickBrowserBackButton();

		return this;
	}

	public EsriTrainingCatalogSearchPage selectTakeCoursesFilterSpatialLabs() throws Throwable {
		waitForPageLoad(3);

		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersTeacherResources.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersSpatialLabs.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		getTitle();
		clickBrowserBackButton();
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectTakeCoursesFilterMappingOurWorld() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersTeacherResources.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersMappingOurWorld.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		String Parent_Window = driver.getWindowHandle();
		// Switching from parent window to child window
		for (String Child_Window : driver.getWindowHandles()) {
			driver.switchTo().window(Child_Window);
			// Performing actions on child window			
			System.out.println(getTextByTagName(prop.getProperty("Training.window.tagName")));
		}
		// Switching back to Parent Window
		driver.switchTo().window(Parent_Window);
		// Performing some actions on Parent Window
		getTitle();
		clickBrowserBackButton();

		return this;
	}

	public EsriTrainingCatalogSearchPage selectTakeCoursesFilterThinkingSpatially() throws Throwable {
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		mouseHoverByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersTeacherResources.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersThinkingSpatially.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		
		// Storing parent window reference into a String Variable
		String Parent_Window = driver.getWindowHandle();
		// Switching from parent window to child window
		for (String Child_Window : driver.getWindowHandles()) {
			driver.switchTo().window(Child_Window);
			// Performing actions on child window			
			System.out.println(getTextByTagName(prop.getProperty("Training.window.tagName")));

		}
		// Switching back to Parent Window
		driver.switchTo().window(Parent_Window);
		// Performing some actions on Parent Window
		getTitle();
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingCatalogSearchPage selectTakeCoursesFilterBooks() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersBooks.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		clickByLinkText(prop.getProperty("Training.store.linkText"));
		mouseHoverByXpath(prop.getProperty("Training.catalogMouseHover.xpath"));
		clickByXpath(prop.getProperty("Training.catalogClickFindTraining.xpath"));
		System.out.println("Titleof the page is" + driver.getTitle());
		return this;
	}

	public EsriTrainingCatalogSearchPage selectTakeCoursesFilterTechnicalCertifications() throws Throwable {
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersClick.xpath"));
		clickByXpath(prop.getProperty("Training.catalogLearningFormatsFiltersTechnicalCertifications.xpath"));
		waitForPageLoad(2);
		clickByXpath(prop.getProperty("Training.catalogClickDetails.xpath"));
		waitForPageLoad(3);
		clickByXpath(prop.getProperty("Training.catalogCardButtonCheck.xpath"));
		clickByLinkText(prop.getProperty("Training.store.linkText"));
		mouseHoverByXpath(prop.getProperty("Training.catalogMouseHover.xpath"));
		clickByXpath(prop.getProperty("Training.catalogClickFindTraining.xpath"));

		return this;
	}

}
