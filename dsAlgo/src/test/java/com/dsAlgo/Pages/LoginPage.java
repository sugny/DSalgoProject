package com.dsAlgo.Pages;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsAlgo.selenium.base.SeleniumBase;
import com.dsAlgo.utils.ExcelReader;
import com.dsAlgo.utils.LoggerLoad;
import com.dsAlgo.utils.PropertyFileReader;

import io.cucumber.datatable.DataTable;

public class LoginPage extends SeleniumBase {

	String Excelpath = PropertyFileReader.getexcelfilepath();
	static String username;
	static String password;
	static String message;
	boolean isEmpty = true;

	@FindBy(name = "username")
	WebElement eleUsername;
	@FindBy(name = "password")
	WebElement elePassword;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement eleLogin;
	@FindBy(xpath = "//a[@href='/logout']")
	WebElement eleLogout;
	@FindBy(xpath = "//*[@class='alert alert-primary']")
	WebElement elealertMsg;
	@FindBy(xpath = "//a[@href='/register']")
	WebElement eleregister;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	/*
	 * public LoginPage enterUsername() { eleUsername.sendKeys("SeleniumTesting");
	 * return this; }
	 * 
	 * public LoginPage enterPassword() { elePassword.sendKeys("Selenium@123");
	 * return this; }
	 */

	public HomePage clickLoginButton() {
		eleLogin.click();
		return new HomePage();
	}

	public void verifyTitle() {
		verifyTitle("NumpyNinja");
	}

	public void entervalidUsername(DataTable dataTable) {
		List<Map<String, String>> userdetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userdetail) {
			String userName = form.get("username");
			LoggerLoad.info("The user enter username as : " + userName);
			sendKeys(eleUsername, userName);
		}

	}

	public void entervalidPassword(DataTable dataTable) {
		List<Map<String, String>> userdetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userdetail) {
			String pwd = form.get("password");
			LoggerLoad.info("The user enter password as : " + pwd);
			sendKeys(elePassword, pwd);
		}
	}

	public void readExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(Excelpath, sheetname);
		username = testdata.get(rownumber).get("username");
		password = testdata.get(rownumber).get("password");
		message = testdata.get(rownumber).get("expectedmessage");

		LoggerLoad.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");
		if (username != null || password != null)
			doLogin(username, password);
	}

	public boolean doLogin(String username, String password) {

		eleUsername.clear();
		sendKeys(eleUsername, username);
		elePassword.clear();
		sendKeys(elePassword, password);

		if (username.isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isEmpty = (boolean) js_user.executeScript("return arguments[0].required", eleUsername);
			return isEmpty;
		}

		if (password.isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isEmpty = (boolean) js_user.executeScript("return arguments[0].required", elePassword);
			return isEmpty;
		}

		return isEmpty;

	}

	public void logout() {
		click(eleLogout);
	}

	public HomePage verifyLogInAlertMessage() {
		String alert = elealertMsg.getText();
		LoggerLoad.info("You are logged in : " + alert);
		assertTrue(alert.contains("logged in"));
		return new HomePage();
	}

	public HomePage verifyLogOutAlertMessage() {
		String alert = elealertMsg.getText();
		LoggerLoad.info("Logged out successfully : " + alert);
		assertTrue(alert.contains("Logged out"));
		return new HomePage();
	}

	public RegisterPage registerLink() {
		click(eleregister);
		verifyTitle("Registration");
		return new RegisterPage();
	}

	public void enterinvalidUsername(DataTable dataTable) {
		List<Map<String, String>> userdetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userdetail) {
			String userName = form.get("username");
			if (userName == null) {
				clickLoginButton();
				alertValidation();
			} else {
				LoggerLoad.info("The user enter username as : " + userName);
				sendKeys(eleUsername, userName);
			}
		}
	}

	public void enterinvalidpassword(DataTable dataTable) {
		List<Map<String, String>> userdetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userdetail) {
			String pwd = form.get("password");
			if (pwd == null) {
				clickLoginButton();
				alertValidation();
			} else {
				LoggerLoad.info("The user enter password as : " + pwd);
				sendKeys(elePassword, pwd);
			}
		}

	}

	public void alertValidation() {
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	}
}
