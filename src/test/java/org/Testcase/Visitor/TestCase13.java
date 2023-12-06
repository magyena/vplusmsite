package org.Testcase.Visitor;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
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

public class TestCase13 extends IOSDriverManager {
	Click click = new Click();
	IOSDriverManager generated = new IOSDriverManager();
	String Hasil = generated.generateRandomPhoneNumber();
	Scroll scroll = new Scroll();

	@Description("Visitor can't see Premium Sports Linear Channels")
	@Test(dataProvider = "dataLogin")
	public void TC13(HashMap<String, String> data) throws JSchException, IOException, InterruptedException {

		ObjectRepository objectRepository = new ObjectRepository(driver);
		driver.get("https://www.visionplus.id/");
		scroll.smoothScrollToBottom(driver);
		Thread.sleep(5000);
		click.ClickSeeAll();
		Thread.sleep(3000);
		scroll.smoothScrollToBottom1(driver);

		click.ClickPremiumSportsChannel();
		Thread.sleep(5000);

		Allure.addAttachment("Screenshot", "image/png", "image data");
	}

	@DataProvider
	public Object[][] dataLogin() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/test/java/org.data/loginphone.json");
		return new Object[][] { { data.get(0) } };

	}

}
