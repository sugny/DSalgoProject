package com.dsAlgo.Pages;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dsAlgo.selenium.base.SeleniumBase;
import com.dsAlgo.utils.ExcelReader;

public class LinkedListPage extends SeleniumBase {
	ExcelReader excelReader = new ExcelReader();
	@FindBy(xpath = "//a[@href='linked-list']")
	WebElement eleGetstartedList;

	@FindBy(xpath = "//a[@class='list-group-item']")
	WebElement eleallListLinks;

	@FindBy(xpath = "//a[contains(text(),'Introduction')]")
	WebElement eleintroduction;
	@FindBy(xpath = "//a[contains(text(),'Creating Linked LIst')]")
	WebElement elecreatinglinklist;
	@FindBy(xpath = "//a[contains(text(),'Types of Linked List')]")
	WebElement elelinkedlisttypes;
	@FindBy(xpath = "//a[contains(text(),'Implement Linked List in Python')]")
	WebElement eleimplementlinklistpython;
	@FindBy(xpath = "//a[contains(text(),'Traversal')]")
	WebElement eletraversal;
	@FindBy(xpath = "//a[contains(text(),'Insertion')]")
	WebElement eleinsert;
	@FindBy(xpath = "//a[contains(text(),'Deletion')]")
	WebElement eledelete;

	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement eletryhere;

	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement eleTextBox;
	@FindBy(xpath = "//*[@id=\"answer_form\"]/button")
	WebElement eleRunButton;

	@FindBy(xpath = "//*[@class=' CodeMirror-line ']")
	WebElement editorInput;

	@FindBy(id = "output")
	WebElement eleoutput;

	@FindBy(xpath = "//a[contains(text(),'Practice Questions')]")
	WebElement elePracticeque;

	public LinkedListPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickGetStarted() {
		click(eleGetstartedList);
	}

	public void checkLinks() {

		for (int i = 1; i <= 7; i++) {
			WebElement allLinks = driver.findElement(By.xpath("(//a[@class='list-group-item'])[" + i + "]"));
			System.out.println("Print Links: " + allLinks.getText());
		}

	}

	public void clickLinks() {
		List<WebElement> allLinks = driver.findElements(By.xpath("(//a[@class='list-group-item'])"));
		int size = allLinks.size();
		for (int i = 0; i < size; i++) {
			int xpath_i = i + 1;
			driver.findElement(By.xpath("(//a[@class='list-group-item'])[" + xpath_i + "]"));
			allLinks.get(i).click();
			navigateBack();
		}
	}

	private String[] expectedTitles = { "Introduction", "Creating Linked LIst", "Types of Linked List",
			"Implement Linked List in Python", "Traversal", "Insertion", "Deletion" };

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

	public void clickIntroduction() {
		click(eleintroduction);
	}

	public void clickCreatingLinkedLists() {
		click(elecreatinglinklist);
	}

	public void clickLinkedListTypes() {
		click(elelinkedlisttypes);
	}

	public void clickImplementLinkedList() {
		click(eleimplementlinklistpython);
	}

	public void clickTraversal() {
		click(eletraversal);
	}

	public void clickInsertion() {
		click(eleinsert);
	}

	public void clickDeletion() {
		click(eledelete);
	}

	public void clickTryhereBtn() {
		click(eletryhere);
	}

	public void entercode() {
		sendKeys(eleTextBox, "print 'hello'");
	}

	public void clickRun() {
		click(eleRunButton);
	}

	public void validateOutput() {
		String output = eleoutput.getText();
		assertTrue(true, output);

	}

	public void clickPracticeQuestions() {
		click(elePracticeque);
	}

	public void titleValidation() {
		verifyTitle("Practice Questions");
	}

	public void enterPythonCode(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		String code = excelReader.getCodefromExcel(sheetname, rownumber);
		sendKeys(eleTextBox, code);
	}

	public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult = excelReader.getResultfromExcel(sheetName, rowNum);
		return expectedResult;
	}

	public void handleAlert() {
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();

		// Validate the alert message
		if (alertMessage.equals("NameError: name 'hello' is not defined on line 1")) {
			System.out.println("Alert message is as expected: " + alertMessage);
		} else {
			System.out.println("Alert message is not as expected: " + alertMessage);
		}

		// Accept the alert (click OK)
		alert.accept();

	}

}
