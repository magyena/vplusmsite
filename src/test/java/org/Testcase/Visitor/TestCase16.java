package org.Testcase.Visitor;

import java.io.IOException;
import java.util.HashMap;

import org.Actions.Click;
import org.Actions.Scroll;
import org.DeviceManager.IOSDriverManager;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.jcraft.jsch.JSchException;

import io.qameta.allure.Description;

public class TestCase16 extends IOSDriverManager {
	Click click = new Click();
	IOSDriverManager generated = new IOSDriverManager();
	String Hasil = generated.generateRandomPhoneNumber();
	Scroll scroll = new Scroll();

	@Description("Free VOD")
	@Test
	public void TC16() throws JSchException, IOException, InterruptedException {
		driver.get("https://www.visionplus.id");
		takeScreenshot(driver, "Testcase16","Step1");
		click.ClickVod();
		takeScreenshot(driver, "Testcase16","Step2");
		click.ClickPlay();
		Thread.sleep(50000);
		takeScreenshot(driver, "Testcase16","Step3");
		Thread.sleep(5000);
		
	
	
	}
}
