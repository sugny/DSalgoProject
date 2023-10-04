package com.dsAlgo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsAlgo.selenium.base.SeleniumBase;

public class StackPage extends SeleniumBase {

	@FindBy(xpath = "//a[@href='stack']")
	WebElement elegetstarted;
	@FindBy(xpath = "//a[contains(text(),'Operations in Stack')]")
	WebElement eleoperationsbtn;
	@FindBy(xpath = "//*[text()='Try here>>>']")
	WebElement eletryherebtn;
	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement eleTextBox;
	@FindBy(xpath = "//*[text()='Run']")
	WebElement elerunbtn;
	@FindBy(xpath = "//*[@id='output']")
	WebElement eleoutput;
	@FindBy(xpath = "//a[@href='stack']")
	WebElement elegetstarted2;
	@FindBy(xpath = "//a[text()='Implementation']")
	WebElement eleimplement;
	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement eletryhere;
	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement eleTextBox2;
	@FindBy(xpath = "//*[text()='Run']")
	WebElement elerunbtn2;
	@FindBy(xpath = "//a[text()='Applications']")
	WebElement eleapplication;
	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement eletryhere3;
	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement eleTextBox3;
	@FindBy(xpath = "//*[text()='Run']")
	WebElement elerunbtn3;
	@FindBy(xpath = "//*[@id='output']")
	WebElement eleoutput3;
	@FindBy(xpath = "//*[text()='Practice Questions']")
	WebElement elepracticeque;
	@FindBy(xpath = "//a[text()='NumpyNinja']")
	WebElement eletitlepage;

	public StackPage() {
		PageFactory.initElements(driver, this);
	}

	public StackPage enterstack() {
		elegetstarted.click();
		return this;
	}

	public StackPage selectoperations() {
		eleoperationsbtn.click();
		return this;
	}

	public StackPage clickontrybtn() {
		eletryherebtn.click();
		return this;

	}

	public StackPage presenttext() {
		eleTextBox.sendKeys("print 'hi'");
		return this;
	}

	public StackPage runbtn() {
		elerunbtn.click();
		driver.navigate().back();

		return this;
	}

	public StackPage enterstack2() {
		elegetstarted.click();
		return this;
	}

	public StackPage implementationbtn() {
		eleimplement.click();
		return this;
	}

	public StackPage Tryherebtn() {
		eletryhere.click();
		return this;
	}

	public StackPage presenttext2() {
		eleTextBox2.sendKeys("print 'hi'");
		return this;
	}

	public StackPage runbtn2() {
		elerunbtn2.click();
		driver.navigate().back();
		return this;
	}

	public StackPage selectapplication() {
		eleapplication.click();
		return this;
	}

	public StackPage tryhere3() {
		eletryhere3.click();
		return this;
	}

	public StackPage presenttext3() {
		eleTextBox.sendKeys("print 'hi'");
		return this;
	}

	public StackPage runbtn3() {
		elerunbtn.click();
		driver.navigate().back();

		return this;
	}

	public StackPage enterstack3() {
		eleoutput3.click();
		return this;
	}

	public StackPage clickpracticebtn() {
		elepracticeque.click();
		verifyTitle("Practice Questions");
		return this;
	}

	public StackPage clickTitle() {
		eletitlepage.click();
		return this;
	}

}