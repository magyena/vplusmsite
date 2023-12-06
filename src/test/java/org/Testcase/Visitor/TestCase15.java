package org.Testcase.Visitor;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.Actions.Click;
import org.Actions.Scroll;
import org.DeviceManager.IOSDriverManager;
import org.ObjectRepository.ObjectRepository;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.jcraft.jsch.JSchException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class TestCase15 extends IOSDriverManager {
	Click click = new Click();
	IOSDriverManager generated = new IOSDriverManager();
	String Hasil = generated.generateRandomPhoneNumber();
	Scroll scroll = new Scroll();
	 IOSDriverManager screenshotHelper = new IOSDriverManager();

	@Description("Pop Login in Premium Sports Linear Channels")
	@Test(dataProvider = "dataLogin")
	public void TC15(HashMap<String, String> data) throws JSchException, IOException, InterruptedException {

		driver.get("https://www.visionplus.id/");
		takeScreenshot(driver,"Testcase15","Step1" );
		scroll.smoothScrollToBottom(driver);
		click.ClickSeeAll();
		takeScreenshot(driver,"Testcase15","Step2" );
		scroll.smoothScrollToBottom1(driver);
		Thread.sleep(1000);
		click.ClickPremiumSportsChannel();
		takeScreenshot(driver,"Testcase15","Step3" );
		click.ClickLogin();
		takeScreenshot(driver,"Testcase15","Step4" );
		
		Thread.sleep(5000);

		//  String path = screenshotHelper.getScreenshotPath("TestName", driver);
	       	}

	@DataProvider
	public Object[][] dataLogin() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/test/java/org.data/loginphone.json");
		return new Object[][] { { data.get(0) } };

	}

}
