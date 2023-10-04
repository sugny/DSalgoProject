package com.dsAlgo.Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dsAlgo.selenium.base.SeleniumBase;

public class DataStructuresPage extends SeleniumBase {

	@FindBy(xpath = "//a[@href ='data-structures-introduction']")
	WebElement elegetStartedDSintro_link;
	@FindBy(xpath = "//a[contains(text(),'Time Complexity')]")
	WebElement eletimecomplexity_link;
	@FindBy(xpath = "//a[contains(text(),'Practice Questions')]")
	WebElement elePracticeque;
	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement eletryhere;

	public DataStructuresPage() {
		PageFactory.initElements(driver, this);
	}

	public void getStarted_DS() {
		click(elegetStartedDSintro_link);
	}

	public void back() {
		navigateBack();
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void clickOnTimeComplexitylink() {
		eletimecomplexity_link.click();

	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void checkLinks() {
		WebElement allLinks = driver.findElement(By.xpath("(//a[@class='list-group-item'])[1]"));
		System.out.println("Print Links: " + allLinks.getText());
	}

	public void clickPracticeQuestions() {
		click(elePracticeque);
	}

	public void clickTryhereBtn() {
		click(eletryhere);
	}

	public void clickLinks() {
		WebElement allLinks = driver.findElement(By.xpath("(//a[@class='list-group-item'])[1]"));
		click(allLinks);
	}

	public void validateNavigatedDSLinks() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Time Complexity";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
