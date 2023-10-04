package com.dsAlgo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsAlgo.selenium.base.SeleniumBase;

public class QueuePage extends SeleniumBase {

	@FindBy(xpath = "//a[@href='/home']")
	WebElement elegetstartedhome;
	@FindBy(xpath = "//a[@href='queue']")
	WebElement eleenterqueue;
	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	WebElement eleselectimplimentation;
	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement eletryherebtn;
	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement eleTextBox4;
	@FindBy(xpath = "//*[text()='Run']")
	WebElement elerunbtn4;
	@FindBy(xpath = "//a[text()='Implementation using collections.deque']")
	WebElement eleusingcollection;
	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement eletryherebtn5;
	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement eleTextBox5;
	@FindBy(xpath = "//*[text()='Run']")
	WebElement elerunbtn5;
	@FindBy(xpath = "//a[text()='Implementation using array']")
	WebElement eleusingarray;
	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement eletryherebtn6;
	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement eleTextBox6;
	@FindBy(xpath = "//*[text()='Run']")
	WebElement elerunbtn6;
	@FindBy(xpath = "//a[text()='Queue Operations']")
	WebElement elequeueoperations;
	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement eletryherebtn7;
	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement eleTextBox7;
	@FindBy(xpath = "//*[text()='Run']")
	WebElement elerunbtn7;
	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement eleselectpracticeques;
	@FindBy(xpath = "//a[text()='NumpyNinja']")
	WebElement eletitlepageNN;

	public QueuePage() {
		PageFactory.initElements(driver, this);

	}

	public QueuePage enterbtn() {
		elegetstartedhome.click();
		return this;
	}

	public QueuePage enterqueue() {
		eleenterqueue.click();
		return this;
	}

	public QueuePage enterimplimentationbtn() {
		eleselectimplimentation.click();
		return this;
	}

	public QueuePage selecttryherebtn() {
		eletryherebtn.click();
		return this;
	}

	public QueuePage presenttext4() {
		eleTextBox4.sendKeys("print 'hello'");
		return this;
	}

	public QueuePage runbtn4() {
		elerunbtn4.click();
		driver.navigate().back();
		return this;
	}

	public QueuePage enterusingcollection() {
		eleusingcollection.click();
		return this;
	}

	public QueuePage clicktryherebtn() {
		eletryherebtn5.click();
		return this;
	}

	public QueuePage presenttext5() {
		eleTextBox4.sendKeys("print 'hello'");
		return this;
	}

	public QueuePage runbtn5() {
		elerunbtn4.click();
		driver.navigate().back();
		return this;
	}

	public QueuePage enterusingarray() {
		eleusingarray.click();
		return this;
	}

	public QueuePage clicktryherebtn6() {
		eletryherebtn5.click();
		return this;
	}

	public QueuePage presenttext6() {
		eleTextBox4.sendKeys("print 'hello'");
		return this;
	}

	public QueuePage runbtn6() {
		elerunbtn4.click();
		driver.navigate().back();
		return this;
	}

	public QueuePage enterqueueoperation() {
		elequeueoperations.click();
		return this;
	}

	public QueuePage clicktryherebtn7() {
		eletryherebtn7.click();
		return this;
	}

	public QueuePage presenttext7() {
		eleTextBox4.sendKeys("print 'hello'");
		return this;
	}

	public QueuePage runbtn7() {
		elerunbtn4.click();
		driver.navigate().back();
		return this;
	}

	public QueuePage clickpracticeque() {
		eleselectpracticeques.click();
		return this;
	}

	public QueuePage clicktitle() {
		eletitlepageNN.click();
		return this;
	}

	public void verifyTitlePage() {
		verifyTitle(" Practice Questions ");
	}
}