package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

public class EsriTrainingMyLearningPage extends ESRIWrappers {

	public EsriTrainingMyLearningPage() throws Throwable {
		waitForPageLoad(3);
		if (!VerifyTitle("Your Esri Training Learning Dashboard")) {
			Reporter.reportStep("Title of the Learning page did not match", "FAIL");
		}
	}

	public EsriTrainingWishList wishList() throws Throwable {
		mouseHoverByXpath(prop.getProperty("Training.wishlistClickWishList.xpath"));
		clickByXpath(prop.getProperty("Training.wishlistClickWishList.xpath"));
		return new EsriTrainingWishList();
	}

	public EsriTrainingMyLearningPage dashBoard() throws Throwable {
		checkElementIsDisplayedByXpath(prop.getProperty("Training.myDashBoardMyScheduleBox.xpath"));
		checkElementIsDisplayedByXpath(prop.getProperty("Training.myDashBoardMyWishListBox.xpath"));
		checkElementIsDisplayedByXpath(prop.getProperty("Training.myDashBoardMyLearningPlanBox.xpath"));
		checkElementIsDisplayedByXpath(prop.getProperty("Training.myDashBoardMyLearningActivityBox.xpath"));
		Boolean recommendedTraining = checkElementIsDisplayedByXpath(prop.getProperty("Training.recommendedTraining.xpath"));
		if (recommendedTraining) {
			waitForPageLoad(3);
			scrollIntoViewByXpath(prop.getProperty("Training.recommendedTraining.xpath"));
			clickByXpath(prop.getProperty("Training.recommendedTraining.xpath"));
			waitForPageLoad(2);
			checkElementIsDisplayedByXpath(prop.getProperty("Training.recommendedTrainingTitle.xpath"));
			clickBrowserBackButton();
		} else {
			System.out.println("Recommended training is not available");
		}
		Boolean myWishList = checkElementIsDisplayedByXpath(prop.getProperty("Training.myWishlistLaunchcourse.xpath"));
		if (myWishList) {
			clickByXpath(prop.getProperty("Training.myWishlistLaunchcourse.xpath"));
			try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				System.out.println("unexpected alert not present");
			}
			checkElementIsDisplayedById(prop.getProperty("Training.myWishlistLaunchcourseTitle.id"));
			clickBrowserBackButton();
		} else {
			System.out.println("No WishList is available");
		}
		Boolean myLearningActivity = checkElementIsDisplayedByXpath(prop.getProperty("Training.myLearningActivityclickButton.xpath"));
		if (myLearningActivity) {
			clickByXpath(prop.getProperty("Training.myLearningActivityclickButton.xpath"));
			try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				System.out.println("unexpected alert not present");
			}
			checkElementIsDisplayedById(prop.getProperty("Training.myLearningActivityclickButtonTitle.id"));
			clickBrowserBackButton();
		} else {
			System.out.println("No WishList is available");
		}
/*		try {
			Boolean myLearningPlan = checkElementIsDisplayedByXpath(prop.getProperty("Training.myLearningPlans.xpath"));
			if (myLearningPlan) {
				clickbyXpath(prop.getProperty("Training.myLearningPlans.xpath"));
				waitForPageLoad(2);
				checkElementIsDisplayedByXpath(prop.getProperty("Training.myLearningPlansPage.xpath"));
				clickBrowserBackButton();
			} else {
				System.out.println("No Learning plan is available");
			}
		} catch (Exception e) {
			
		}*/

		return this;
	}

	public EsriTrainingMyLearningPage myLearningActivityEnterKeyWord(String data) throws Throwable {
		mouseHoverByXpath(prop.getProperty("Training.myLearningActivityMouseHover.xpath"));
		clickByXpath(prop.getProperty("Training.myLearningActivityClickActiviy.xpath"));
		waitForPageLoad(3);
		mouseReleaseByXpath(prop.getProperty("Training.myLearningActivityMouseHover.xpath"));
		enterByXpath(prop.getProperty("Training.myLearningActivityEnterKeyword.xpath"), data);
		return this;
	}

	public EsriTrainingMyLearningPage myLearningActivityFilterCheck(String data) throws Throwable {

		selectByXpathWithText(prop.getProperty("Training.myLearningActivityFilterClick.xpath"), data);
		return this;
	}

	public EsriTrainingMyLearningPage myLearningActivityDownloadTranscript(String data) throws Throwable {
		selectByXpathWithText(prop.getProperty("Training.myLearningActivitySortFilter.xpath"), data);
		if (checkElementIsEnabledByXpath(prop.getProperty("Training.myLearningActivityCheckBoxInprogress.xpath"))) {
			System.out.println("Checkbox is selected");
		} else {
			clickByXpath(prop.getProperty("Training.myLearningActivityCheckBoxInprogress.xpath"));
		}
		if (checkElementIsEnabledByXpath(prop.getProperty("Training.myLearningActivityCheckBoxCompleted.xpath"))) {
			System.out.println("Checkbox is selected");
		} else {
			clickByXpath(prop.getProperty("Training.myLearningActivityCheckBoxCompleted.xpath"));
		}
		clickByJavaScript(prop.getProperty("Training.myLearningActivityCheckBoxArchived.xpath"));
		System.out.println(getTextByXpath(prop.getProperty("Training.myLearningActivityFilterResults.xpath")));
		clearContentByXpath(prop.getProperty("Training.myLearningActivityEnterKeyword.xpath"));
		waitForPageLoad(1);
		if (checkElementIsDisplayedByXpath(prop.getProperty("Training.myLearningActivitycourseBtton.xpath"))) {
			clickByXpath(prop.getProperty("Training.myLearningActivitycourseBtton.xpath"));
			try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				System.out.println("unexpected alert not present");
			}
			checkElementIsDisplayedById(prop.getProperty("Training.myLearningActivityLaunchcourseTitle.id"));
			clickBrowserBackButton();
		} else {
			System.out.println("No course are available");
		}
		waitForPageLoad(2);
		clickByClassName(prop.getProperty("Training.myLearningActivityDownloadTranscript.class"));
		waitForPageLoad(2);
		checkElementIsDisplayedByXpath(prop.getProperty("Training.myLearningActivityPrintButton.xpath"));
		clickBrowserBackButton();
		return this;
	}

	public EsriTrainingMyLearningPage myLearningActivityEnterCourse(String data) throws Throwable {
		waitTillElementVisibleByXpath(prop.getProperty("Training.myLearningActivityClickEnterCourseCode.xpath"));
		clickByXpath(prop.getProperty("Training.myLearningActivityClickEnterCourseCode.xpath"));
		enterByXpath(prop.getProperty("Training.myLearningActivityEnterCourseCode.xpath"), data);
		clickByXpath(prop.getProperty("Training.myLearningActivitySubmit.xpath"));
		if (checkElementIsDisplayedByXpath(prop.getProperty("Training.myLearningActivitySubmitInvalidCode.xpath"))) {
			System.out
					.println(getTextByXpath(prop.getProperty("Training.myLearningActivitySubmitInvalidCode.xpath")));
		} else {
			System.out.println("no error message is displayed");
		}

		return this;
	}

	public EsriTrainingMyLearningPage mySchedule(String data) throws Throwable {

		mouseHoverByXpath(prop.getProperty("Training.scheduleMouseHover.xpath"));
		clickByXpath(prop.getProperty("Training.scheduleClick.xpath"));
		waitForPageLoad(2);
		checkElementIsDisplayedByXpath(prop.getProperty("Training.scheduleMonth.xpath"));
		checkElementIsDisplayedByXpath(prop.getProperty("Training.scheduleDay.xpath"));
		checkElementIsDisplayedByXpath(prop.getProperty("Training.scheduleYear.xpath"));
		clickByXpath(prop.getProperty("Training.scheduleCalendarClick.xpath"));
		clickByXpath(prop.getProperty("Training.scheduleQuestions.xpath"));
		clickByXpath(prop.getProperty("Training.scheduleHelp.xpath"));
		System.out.println(getTextByXpath(prop.getProperty("Training.scheduleHelp.xpath")));
		clickBrowserBackButton();
		clickByXpath(prop.getProperty("Training.scheduleAddClass.xpath"));
		enterById(prop.getProperty("Training.scheduleEnterID.id"), data);
		clickByXpath(prop.getProperty("Training.scheduleSubmit.xpath"));
		System.out.println(getTextByXpath(prop.getProperty("Training.scheduleErrorMessage.xpath")));

		return this;

	}

	public EsriTrainingMyLearningPage myLearningPlans() throws Throwable {
		mouseHoverByXpath(prop.getProperty("Training.learningPlansMouseHover.xpath"));
		clickByXpath(prop.getProperty("Training.learningPlansClick.xpath"));
		waitForPageLoad(2);
		if (checkElementIsDisplayedByLinkText(prop.getProperty("Training.learningPlansLinkClick.linkText"))) {
			clickByLinkText(prop.getProperty("Training.learningPlansLinkClick.linkText"));
			//waitTillElementVisibleByXpath(prop.getProperty("Training.learningPlansButtonClick.xpath"));
			clickByXpath(prop.getProperty("Training.learningPlansButtonClick.xpath"));
			waitForPageLoad(2);
			try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				System.out.println("unexpected alert not present");
			}			
			checkElementIsDisplayedByTagName(prop.getProperty("Training.learningPlansContentTitle.tagName"));
			clickBrowserBackButton();
		} else {
			System.out.println("No learning plan is available");
		}

		return this;
	}
	public EsriTrainingMyLearningPage headerEmbedCode() throws Throwable{
		verifyHeaderEmbedCode(prop.getProperty("Tag.HeaderEmbedCode.xpath"),prop.getProperty("Tag.HeaderEmbedCode.text"));
		return this;
	}
	public EsriTrainingMyLearningPage googleTagManagerForScript() throws Throwable{
		verifyGoogleTagManagerForScript(prop.getProperty("Tag.GoogleTagManagerForScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForScript.text"));
		return this;
	}	
	public EsriTrainingMyLearningPage googleTagManagerForNoScript() throws Throwable{
		verifyGoogleTagManagerForNoScript(prop.getProperty("Tag.GoogleTagManagerForNoScript.xpath"),prop.getProperty("Tag.GoogleTagManagerForNoScript.text"));
		return this;
	}
	public EsriTrainingMyLearningPage footerEmbbedCode() throws Throwable{
		verifyFooterEmbedCode(prop.getProperty("Tag.FooterEmbbedCode.xpath"),prop.getProperty("Tag.FooterEmbbedCode.text"));
		return this;
	}
	public EsriTrainingMyLearningPage pardotDataLayerCode() throws Throwable{
		verifyPardotDataLayerCode(prop.getProperty("Tag.PardotDataLayerCode.xpath"),prop.getProperty("Tag.PardotDataLayerCode.text"));
		return this;
	}
}
