package com.dsAlgo.Pages;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dsAlgo.selenium.base.SeleniumBase;
import com.dsAlgo.utils.ExcelReader;

public class ArrayPage extends SeleniumBase {
	ExcelReader excelReader = new ExcelReader();
	@FindBy(xpath = "//a[@href='array']")
	WebElement elegetstart_array;

	@FindBy(xpath = "//a[contains(text(),'Arrays in Python')]")
	WebElement elearraysInPythonLink;
	@FindBy(xpath = "//a[contains(text(),'Arrays Using List')]")
	WebElement elearraysUsingListLink;
	@FindBy(xpath = "//a[contains(text(),'Basic Operations in Lists')]")
	WebElement elebasicOpinListsLink;
	@FindBy(xpath = "//a[contains(text(),'Applications of Array')]")
	WebElement eleappOfArrayLink;
	@FindBy(xpath = "//a[contains(text(),'Search the array')]")
	WebElement elepract1;
	@FindBy(xpath = "//a[contains(text(),'Max Consecutive Ones')]")
	WebElement elepract2;
	@FindBy(xpath = "//a[contains(text(),'Find Numbers with Even Number of Digits')]")
	WebElement elepract3;
	@FindBy(xpath = "//a[contains(text(),'Squares of  a Sorted Array')]")
	WebElement elepract4;
	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement eleTextBox;
	@FindBy(xpath = "//*[@id='answer_form']")
	WebElement eleanswerform;

	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement eletryhere;

	@FindBy(id = "output")
	WebElement eleoutput;

	@FindBy(xpath = "//*[@class='button']")
	WebElement elesubmitButton;

	public ArrayPage() {
		PageFactory.initElements(driver, this);
	}

	public void getStarted() {
		click(elegetstart_array);
	}

	public void checkLinks() {

		for (int i = 1; i <= 4; i++) {
			WebElement allLinks = driver.findElement(By.xpath("(//a[@class='list-group-item'])[" + i + "]"));
			System.out.println("Print Links: " + allLinks.getText());
		}

	}

	private String[] expectedTitles = { "Arrays in Python", "Arrays Using List", "Basic Operations in Lists",
			"Applications of Array" };

	public void validateNavigatedLinks() {
		List<WebElement> allLinks = driver.findElements(By.xpath("(//a[@class='list-group-item'])"));
		int size = allLinks.size();
		for (int i = 0; i < size; i++) {
			int xpath_i = i + 1;
			driver.findElement(By.xpath("(//a[@class='list-group-item'])[" + xpath_i + "]"));
			allLinks.get(i).click();
			String actualTitle = driver.getTitle();
			String expectedTitle = expectedTitles[xpath_i - 1];
			Assert.assertEquals(actualTitle, expectedTitle);
			navigateBack();
		}

	}

	public void back() {
		navigateBack();
	}

	public void clickArraysinPython() {

		click(elearraysInPythonLink);
	}

	public void clickArraysUsingList() {

		click(elearraysUsingListLink);
	}

	public void clickBasicOperationsList() {

		click(elebasicOpinListsLink);
	}

	public void clickAppofArray() {

		click(eleappOfArrayLink);
	}

	public void practQues1() {
		click(elepract1);
	}

	public void practQues2() {
		click(elepract2);
	}

	public void practQues3() {
		click(elepract3);
	}

	public void practQues4() {
		click(elepract4);
	}

	public void enterCodePractice(String code, WebElement element) throws InterruptedException {
		// new
		// Actions(driver).keyDown(Keys.COMMAND).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.COMMAND).perform();
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).perform();
		String[] str1 = code.split("\n");
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equalsIgnoreCase("\\b")) {
				element.sendKeys(Keys.BACK_SPACE);
			} else {
				element.sendKeys(str1[i]);
				element.sendKeys(Keys.ENTER);
			}
		}

	}

	public void enterPythonCodePractice(String sheetname, int rownumber)
			throws InvalidFormatException, IOException, InterruptedException {
		waitForElement(eleanswerform);
		String code = excelReader.getCodefromExcel(sheetname, rownumber);
		System.out.println("code" + code);
		enterCodePractice(code, eleTextBox);

	}

	public void enterPythonCode(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		String code = excelReader.getCodefromExcel(sheetname, rownumber);
		sendKeys(eleTextBox, code);
	}

	public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult = excelReader.getResultfromExcel(sheetName, rowNum);
		return expectedResult;
	}

	public String getActualResult() {
		waitForElement(eleoutput);
		return eleoutput.getText();

	}

	public void clickTryhereBtn() {
		click(eletryhere);
	}

	public String getErrorText() {
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMsg;

	}

	public void clickSubmit() {
		click(elesubmitButton);
	}

}
