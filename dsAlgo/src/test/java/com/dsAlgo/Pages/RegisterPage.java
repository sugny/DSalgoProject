package com.dsAlgo.Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsAlgo.selenium.base.SeleniumBase;
import com.dsAlgo.utils.LoggerLoad;

import io.cucumber.datatable.DataTable;

public class RegisterPage extends SeleniumBase {
	@FindBy(xpath = "//form/input[@type='submit']")
	WebElement eleregisterButton;
	@FindBy(xpath = "//*[@id='id_username']")
	WebElement eleusername;
	@FindBy(xpath = "//*[@id='id_password1']")
	WebElement elepassword;
	@FindBy(xpath = "//*[@id='id_password2']")
	WebElement eleconfirmpassword;
	@FindBy(xpath = "//*[@class='alert alert-primary']")
	WebElement elealertMsg;
	@FindBy(xpath = "//a[@href='/login']")
	WebElement elelogin;

	String prefix = "user";
	String suffix = Integer.toString(new Random().nextInt(1000)); // Generates a random number between 0 and 999
	String username = prefix + suffix;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnRegisterButton() {
		LoggerLoad.info("The user clicks on Register button");
		click(eleregisterButton);
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public void generateRandomUsername() {
		prefix = "user";
		suffix = Integer.toString(new Random().nextInt(1000)); // Generates a random number between 0 and 999
		username = prefix + suffix;
		LoggerLoad.info("The user enter username as : " + username);
		sendKeys(eleusername, username);

	}

	public void generateRandomPassword() throws InterruptedException {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#!";
		StringBuilder randomPassword = new StringBuilder();

		int passwordLength = 8; // Adjust the desired length of the password
		Random random = new Random();

		for (int i = 0; i < passwordLength; i++) {
			int index = random.nextInt(characters.length());
			randomPassword.append(characters.charAt(index));
		}

		LoggerLoad.info("The user enter password as :" + randomPassword.toString());
		sendKeys(elepassword, randomPassword.toString());

		Thread.sleep(2000);
		LoggerLoad.info("The user enter confirm password as : " + randomPassword.toString());
		sendKeys(eleconfirmpassword, randomPassword.toString());

	}

	public HomePage verifyTitleAndAlertMessage() {
		String title = driver.getTitle();
		assertEquals(title, "NumpyNinja", "Title is matched");
		String alert = elealertMsg.getText();
		LoggerLoad.info("The new account is created with the registered username : " + alert);
		assertTrue(alert.contains(username));
		return new HomePage();
	}

	public void entervalidUsername(DataTable dataTable) {
		List<Map<String, String>> userdetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userdetail) {
			String userName = form.get("username");
			LoggerLoad.info("The user enter username as : " + userName);
			sendKeys(eleusername, userName);
		}

	}

	public void entervalidPassword(DataTable dataTable) {
		List<Map<String, String>> userdetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userdetail) {
			String pwd = form.get("password");
			LoggerLoad.info("The user enter password as : " + pwd);
			sendKeys(elepassword, pwd);
		}
	}

	public void enterinvalidconfirmPassword(DataTable dataTable) {
		List<Map<String, String>> userdetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userdetail) {
			String confirmpwd = form.get("confirm password");
			LoggerLoad.info("The user enter password as : " + confirmpwd);
			sendKeys(eleconfirmpassword, confirmpwd);
		}
	}

	public void waitforTitle() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
	}

	public void alertValidation() {
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	}

	public LoginPage loginLink() {
		waitForElement(elelogin);
		click(elelogin);
		verifyTitle("Login");
		return new LoginPage();
	}

	public void validateRegistrationTitle() {
		verifyTitle("Registration");
	}

}
