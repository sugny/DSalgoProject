package com.dsAlgo.selenium.base;


import java.time.Duration;


import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dsAlgo.utils.PropertyFileReader;

public class SeleniumBase {

	public WebDriverWait wait;
	String url;
	public static WebDriver driver;
	String title;
	

	public WebDriver setDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else if (browser.equalsIgnoreCase("fireFox"))
			driver = new FirefoxDriver();
		if (browser.equalsIgnoreCase("safari"))
			driver = new SafariDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}

	public static WebDriver getdriver() {
		return driver;
	}

	public void click(WebElement ele) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
		} catch (StaleElementReferenceException e) {
			throw new RuntimeException();
		}
	}

	public WebDriver getUrl(String key) throws Throwable {
		url = PropertyFileReader.getGlobalValue(key);
		driver.get(url);
		return driver;
	}
	
	

	public String getTitle() {
		title = driver.getTitle();
		return title;
	}

	public boolean verifyTitle(String title) {
		if (driver.getTitle().equals(title)) {
			System.out.println("Page title: " + title + " matched successfully");
			return true;
		} else {
			System.out.println("Page url: " + title + " not matched");
		}
		return false;
	}

	public void closeApp() {
		driver.close();
	}
	public void quitApp() {
		driver.quit();
	}

	public void sendKeys(WebElement element,String name) {
		new Actions(driver).sendKeys(element,name).perform();
	}

	public void selectDropDownUsingText(WebElement eleDropDown, String value) {
		new Select(eleDropDown).selectByVisibleText(value);
	}
	
	public void navigateBack() {
		driver.navigate().back();
	}
	
	public void waitForElement(WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(element));

	}
	
	
}
