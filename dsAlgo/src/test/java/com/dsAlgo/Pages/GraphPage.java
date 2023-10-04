package com.dsAlgo.Pages;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dsAlgo.selenium.base.SeleniumBase;

public class GraphPage extends SeleniumBase {

	@FindBy(xpath = "//a[@href='graph']")
	WebElement eleGetstartedList;
	@FindBy(xpath = "//a[@class='list-group-item']")
	WebElement eleallListLinks;
	@FindBy(xpath = "(//a[contains(text(),'Graph')])[2]")
	WebElement elegraphlink;
	@FindBy(xpath = "//a[contains(text(),'Graph Representations')]")
	WebElement elegraphrepresentlink;
	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement eletryhere;

	public GraphPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickGetStarted() {
		click(eleGetstartedList);
	}

	public void clickGraphLink() {
		click(elegraphlink);
	}

	public void clickGraphRepLink() {
		click(elegraphrepresentlink);
	}

	public void back() {
		navigateBack();
	}

	public void clickTryhereBtn() {
		click(eletryhere);
	}

	public void checkLinks() {
		for (int i = 1; i <= 2; i++) {
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

	private String[] expectedTitles = { "Graph", "Graph Representations" };

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

}
