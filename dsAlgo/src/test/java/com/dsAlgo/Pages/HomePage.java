package com.dsAlgo.Pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsAlgo.selenium.base.SeleniumBase;


public class HomePage extends SeleniumBase {

	// elements
	String title;
	@FindBy(xpath = "//div[contains(text(),'not logged')]")
	WebElement eleAlertMessage;	@FindBy(xpath = "//a[@href='/register']")
	WebElement eleRegister;
	@FindBy(xpath = "//a[@href='/login']")
	WebElement eleSignIn;
	@FindBy(xpath = "//a[text()='Get Started']")
	WebElement eleGetStarted;

	// to get all getStarted link
	@FindAll({ @FindBy(xpath = "//a[text()=\"Get Started\"]") })
	private List<WebElement> eleGetStartedList;

	// the dropdown menu
	@FindBy(xpath = "//a[@href='#']")
	WebElement dropdown;
	@FindBy(xpath = "//div[@class='dropdown-menu show']")
	WebElement dropdown_array;
	@FindBy(xpath = "//*[@id='navbarCollapse']//a[2]")
	WebElement dropdown_linkedlist;
	@FindBy(xpath = "//*[@id='navbarCollapse']//a[3]")
	WebElement dropdown_stack;
	@FindBy(xpath = "//*[@id='navbarCollapse']//a[4]")
	WebElement dropdown_queue;
	@FindBy(xpath = "//*[@id='navbarCollapse']//a[5]")
	WebElement dropdown_tree;
	@FindBy(xpath = "//*[@id='navbarCollapse']//a[6]")
	WebElement dropdown_graph;
	@FindBy(xpath = "//a[@href='/logout']")
	WebElement signout;
	@FindBy(xpath = "//*[@class='alert alert-primary']")
	WebElement elealertMsg;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public LoginPage clickSigninLink() {
		click(eleSignIn);
		return new LoginPage();
	}

//	 public void signOut() {
//	    	click(signout);	
//	    }
//	 public RegisterPage validatelogoutAlert() {
//	    	String alert=elealertMsg.getText();
//			LoggerLoad.info("Logout success : " + alert);
//			assertTrue(alert.contains("Logged out successfully"));
//			return new RegisterPage();
//	    }

	public HomePage getStartedLink() {
		for (int i = 0; i < eleGetStartedList.size(); i++) {
			WebElement webElement = eleGetStartedList.get(i);
			click(webElement);
		}
		return this;
	}

	public HomePage dropDownMenu(String menu) {
		dropdown.click();
		switch (menu) {
		case "Arrays":
			// Loggerload.info("User click on " + string);
			dropdown_array.click();
			break;
		case "Linkedlist":
			// Loggerload.info("User click on " + string);
			dropdown_linkedlist.click();
			break;
		case "Stack":
			// Loggerload.info("User click on " + string);
			dropdown_stack.click();
			break;
		case "Queue":
			// Loggerload.info("User click on " + string);
			dropdown_queue.click();
			break;
		case "Tree":
			// Loggerload.info("User click on " + string);
			dropdown_tree.click();
			break;
		case "Graph":
			// Loggerload.info("User click on " + string);
			dropdown_graph.click();
			break;
		}
		return this;
	}

	public RegisterPage clickRegisterLink() {
		click(eleRegister);
		return new RegisterPage();
	}

	public void verifyTitlePageHome() {
		verifyTitle("NumpyNinja");
	}

}
