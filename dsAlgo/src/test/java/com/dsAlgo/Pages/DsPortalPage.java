package com.dsAlgo.Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsAlgo.selenium.base.SeleniumBase;

public class DsPortalPage extends SeleniumBase {
	@FindBy(xpath = "//a[@href='/home']")
	WebElement eleGetStarted;
	String title;

	// Page Elements
	public DsPortalPage() {
		PageFactory.initElements(driver, this);
	}

	public DsPortalPage loadUrl() throws Throwable {
		getUrl("baseUrl");
		return this;
	}

	public HomePage clickGetStarted() {
		click(eleGetStarted);
		return new HomePage();
	}

	public void verifyPageTitle() {
		String title = driver.getTitle();
		assertEquals(title, "NumpyNinja", "Title is matched");
	}

}
