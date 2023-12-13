package org.Testcase.Visitor;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.Actions.Click;
import org.Actions.Input;
import org.Actions.Scroll;
import org.DeviceManager.IOSDriverManager;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jcraft.jsch.JSchException;

import io.qameta.allure.Description;

public class TestCase22 extends IOSDriverManager {
	Click click = new Click();
	IOSDriverManager generated = new IOSDriverManager();
	String Hasil = generated.generateRandomPhoneNumber();
	Scroll scroll = new Scroll();
	Input input = new Input();
	@Description("User can login from epg with phone number")
	@Test(dataProvider = "dataLogin")
	public void TC22(HashMap<String, String> data) throws JSchException, IOException, InterruptedException {
		driver.get("https://www.visionplus.id");
		Thread.sleep(3000);
		takeScreenshot(driver, "Testcase22","Step1");
		click.LiveTVButton();
		takeScreenshot(driver, "Testcase22","Step2");
		click.RctiChannel();
		takeScreenshot(driver,"Testcase22","Step3");
		click.ClickBeforeTodayEpg();
		takeScreenshot(driver,"Testcase22","Step4");
		click.ClickContentBeforeTodayEpg();
		takeScreenshot(driver, "Testcase22","Step5");
		click.ClickLoginFromEPG();
		takeScreenshot(driver, "Testcase22","Step6");
		input.FieldPhoneDataEPG(data);
		takeScreenshot(driver, "Testcase22","Step7");
		click.ContinueButton();
		takeScreenshot(driver, "Testcase22","Step8");
		input.Password(data);
		takeScreenshot(driver, "Testcase22","Step9");
		click.ContinueButton();
		Thread.sleep(10000);
		takeScreenshot(driver, "Testcase22","Step10");
		
	}
		

	@DataProvider
	public Object[][] dataLogin() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/test/java/org.data/loginphone.json");
		return new Object[][] { { data.get(0) } };
	}

}