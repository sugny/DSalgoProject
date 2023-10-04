package hooks;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.annotations.BeforeTest;

import com.dsAlgo.selenium.base.SeleniumBase;
import com.dsAlgo.utils.LoggerLoad;
import com.dsAlgo.utils.PropertyFileReader;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import java.nio.file.Files;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {

	private static SeleniumBase seleniumBase;
	static String browserName;
	static Scenario scenario;
	private static final String SCREENSHOT_DIR = "./src/test/resources/Screenshots/";

	@BeforeAll
	public static void before() throws Throwable {
		// Get browser Type from property file
		browserName = PropertyFileReader.getGlobalValue("browserName");
		// Initialize the driver
		seleniumBase = new SeleniumBase();
		seleniumBase.setDriver(browserName);
	}

	@BeforeTest
	public void scenario(Scenario scenario) throws Throwable {

		LoggerLoad.info(
				"===============================================================================================");
		LoggerLoad.info(scenario.getSourceTagNames() + " : " + scenario.getName());
		LoggerLoad.info(
				"-----------------------------------------------------------------------------------------------");
	}

	@AfterStep
	public void afterStep(Scenario scenario) {
		if (scenario.isFailed()) {
			LoggerLoad.error("Step Failed, Taking Screenshot");

			// Capture the screenshot
			byte[] screenshotBytes = ((TakesScreenshot) SeleniumBase.driver).getScreenshotAs(OutputType.BYTES);

			// Generate a unique filename for the screenshot (e.g., timestamp)
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmssSSS");
			String timestamp = dateFormat.format(new Date());

			String screenshotFileName = SCREENSHOT_DIR + "screenshot_" + timestamp + ".png";

			// Save the screenshot to a file
			File screenshotFile = new File(screenshotFileName);
			try {
				Files.createDirectories(screenshotFile.getParentFile().toPath());
				Files.write(screenshotFile.toPath(), screenshotBytes);
			} catch (IOException e) {
				e.printStackTrace();
			}

			// Attach the screenshot to the Cucumber scenario
			scenario.attach(screenshotBytes, "image/png", "My screenshot");

			// Attach the same screenshot to the Allure report
			Allure.addAttachment("My screenshot", "image/png", screenshotFile.toURI().toString());
		}
	}

	@AfterAll
	public static void after() {
		seleniumBase.quitApp();
	}
}