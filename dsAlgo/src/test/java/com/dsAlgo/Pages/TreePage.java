package com.dsAlgo.Pages;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsAlgo.selenium.base.SeleniumBase;
import com.dsAlgo.utils.ExcelReader;
import com.dsAlgo.utils.LoggerLoad;

public class TreePage extends SeleniumBase {

	String title = "Tree";

	ExcelReader excelReader = new ExcelReader();

	@FindBy(xpath = "//a[@href='tree']")
	WebElement eleGetStarted;
	@FindBy(xpath = "//a[contains(text(),'Overview of Trees')]")
	WebElement eleOverviewOfTree;
	@FindBy(xpath = "//a[contains(text(),'Terminologies')]")
	WebElement eleTerminologies;
	@FindBy(xpath = "//a[contains(text(),'Types of Trees')]")
	WebElement eleTypesOfTrees;
	@FindBy(xpath = "//a[contains(text(),'Tree Traversals')]")
	WebElement eleTreeTraversals;
	@FindBy(xpath = "//a[contains(text(),'Traversals-Illustration')]")
	WebElement eleTraversalsIllustration;
	@FindBy(xpath = "//a[contains(text(),'Binary Trees')]")
	WebElement eleBinaryTrees;
	@FindBy(xpath = "//a[contains(text(),'Types of Binary Trees')]")
	WebElement eleTypesOfBinaryTrees;
	@FindBy(xpath = "//a[contains(text(),'Implementation in Python')]")
	WebElement eleImplementationInPython;
	@FindBy(xpath = "//a[contains(text(),'Binary Tree Traversals')]")
	WebElement eleBinaryTreeTraversals;
	@FindBy(xpath = "//a[contains(text(),'Implementation of Binary Trees')]")
	WebElement eleImplementationOfBinaryTrees;
	@FindBy(xpath = "//a[contains(text(),'Applications of Binary trees')]")
	WebElement eleApplicationsOfBinaryTrees;
	@FindBy(xpath = "//a[contains(text(),'Binary Search Trees')]")
	WebElement eleBinarySearchTrees;
	@FindBy(xpath = "//a[contains(text(),'Implementation Of BST')]")
	WebElement eleImplementationOfBST;
	@FindBy(xpath = "//a[contains(text(),'Practice Questions')]")
	WebElement elePracticeQuestions;
	@FindBy(xpath = "//a[contains(text(),'Sign out')]")
	WebElement eleSignOut;

	@FindBy(xpath = "//a[contains(text(),'Try here>>>')]")
	WebElement eleTryHere;
	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement eleTextBox;
	@FindBy(xpath = "//button[text()='Run']")
	WebElement eleRun;
	@FindBy(id = "output")
	WebElement eleOutput;

	public TreePage() {
		PageFactory.initElements(driver, this);
	}

	public TreePage clickGetStarted() {
		click(eleGetStarted);
		verifyTitle(title);
		return this;
	}

	public TreePage clickOverviewOfTree() {

		click(eleOverviewOfTree);
		LoggerLoad.info(" Title of the page " + driver.getTitle());
		return this;
	}

	public TreePage clickTerminologies() {

		click(eleTerminologies);
		LoggerLoad.info(" Title of the page " + driver.getTitle());
		return this;

	}

	public TreePage clickTypesOfTrees() {

		click(eleTypesOfTrees);
		LoggerLoad.info(" Title of the page " + driver.getTitle());
		return this;
	}

	public TreePage clickTreeTraversals() {

		click(eleTreeTraversals);
		LoggerLoad.info(" Title of the page " + driver.getTitle());
		return this;
	}

	public TreePage clickTraversalsIllustration() {

		click(eleTraversalsIllustration);
		LoggerLoad.info(" Title of the page " + driver.getTitle());
		return this;
	}

	public TreePage clickBinaryTrees() {

		click(eleBinaryTrees);
		LoggerLoad.info(" Title of the page " + driver.getTitle());
		return this;
	}

	public TreePage clickTypesOfBinaryTrees() {

		click(eleTypesOfBinaryTrees);
		LoggerLoad.info(" Title of the page " + driver.getTitle());
		return this;
	}

	public TreePage clickImplementationInPython() {

		click(eleImplementationInPython);
		LoggerLoad.info(" Title of the page " + driver.getTitle());
		return this;
	}

	public TreePage clickBinaryTreeTraversals() {

		click(eleBinaryTreeTraversals);
		LoggerLoad.info(" Title of the page " + driver.getTitle());
		return this;
	}

	public TreePage clickImplementationOfBinaryTrees() {

		click(eleImplementationOfBinaryTrees);
		LoggerLoad.info(" Title of the page " + driver.getTitle());
		return this;
	}

	public TreePage clickApplicationsOfBinaryTrees() {

		click(eleApplicationsOfBinaryTrees);
		LoggerLoad.info(" Title of the page " + driver.getTitle());
		return this;
	}

	public TreePage clickBinarySearchTrees() {

		click(eleBinarySearchTrees);
		LoggerLoad.info(" Title of the page " + driver.getTitle());
		return this;
	}

	public TreePage clickImplementationOfBST() {

		click(eleImplementationOfBST);
		LoggerLoad.info(" Title of the page " + driver.getTitle());
		return this;
	}

	public TreePage clickPracticeQuestion() {

		click(elePracticeQuestions);
		LoggerLoad.info(" Title of the page " + driver.getTitle());
		return this;
	}

	public TreePage clickTryHere() {
		click(eleTryHere);
		return this;
	}

	public TreePage enterTreePythoncode(String sheetname, Integer rownumber)
			throws InvalidFormatException, IOException, InvalidFormatException, IOException {
		String code = excelReader.getCodefromExcel(sheetname, rownumber);
		sendKeys(eleTextBox, code);
		return this;
	}

	public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult = excelReader.getResultfromExcel(sheetName, rowNum);
		return expectedResult;
	}

	public TreePage clickRun() {
		click(eleRun);
		return this;
	}

	public TreePage getConsoleResult() {
		String output = eleOutput.getText();
		assertTrue(true, output);
		return this;
	}

	public TreePage navigateBackAndSignOut() {
		driver.navigate().back();
		click(eleSignOut);
		return this;
	}

	public String getAlertMsg() {
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMsg;
	}
}
