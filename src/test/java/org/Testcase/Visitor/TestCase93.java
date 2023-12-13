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

public class TestCase93 extends IOSDriverManager {
	Click click = new Click();
	IOSDriverManager generated = new IOSDriverManager();
	Input input = new Input();
	@Description("User can play VOD on search Section [Cluster Pencarian Populer]")
	@Test(dataProvider = "dataLogin")
	public void TC93(HashMap<String, String> data) throws JSchException, IOException, InterruptedException {
		driver.get("https://www.visionplus.id");
		Thread.sleep(3000);
//		takeScreenshot(driver, "Testcase23","Step1");
		click.SearchIcon();
		Thread.sleep(3000);
		input.FieldSearch(data);
		click.ClickSearchResult();
		click.ClickPlay();
		Thread.sleep(10000);
	}
		

	@DataProvider
	public Object[][] dataLogin() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/test/java/org.data/Search.json");
		return new Object[][] { { data.get(0) } };
	}

}