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

public class TestCase23 extends IOSDriverManager {
	Click click = new Click();
	IOSDriverManager generated = new IOSDriverManager();
	String Hasil = generated.generateRandomPhoneNumber();
	Scroll scroll = new Scroll();
	Input input = new Input();
	@Description("User can login from epg with  Email")
	@Test(dataProvider = "dataLogin")
	public void TC23(HashMap<String, String> data) throws JSchException, IOException, InterruptedException {
		driver.get("https://www.visionplus.id");
		Thread.sleep(3000);
		//takeScreenshot(driver, "Testcase23","Step1");
		click.LiveTVButton();
		takeScreenshot(driver, "Testcase23","Step2");
		click.RctiChannel();
		takeScreenshot(driver,"Testcase23","Step3");
		click.ClickBeforeTodayEpg();
		takeScreenshot(driver,"Testcase23","Step4");
		click.ClickContentBeforeTodayEpg();
		takeScreenshot(driver, "Testcase23","Step5");
		click.ClickLoginFromEPG();
		takeScreenshot(driver, "Testcase23","Step6");
		click.ClickContinueWithEmailfromEPG();
		takeScreenshot(driver, "Testcase23","Step8");
		input.FieldEmailEpg(data);
		takeScreenshot(driver, "Testcase23","Step9");
		click.ClickEpgContinueButton();
		takeScreenshot(driver, "Testcase23","Step10");
		input.FieldPasswordEPG(data);
		takeScreenshot(driver, "Testcase23","Step11");
		click.ClickEpgContinueButton();	
		Thread.sleep(5000);
		takeScreenshot(driver, "Testcase23","Step12");

	}
		

	@DataProvider
	public Object[][] dataLogin() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/test/java/org.data/Email.json");
		return new Object[][] { { data.get(0) } };
	}

}