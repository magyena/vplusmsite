package org.Testcase.Visitor;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;

import java.util.HashMap;
import java.util.List;

import com.jcraft.jsch.JSchException;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import org.Actions.Click;
import org.Actions.Input;
import org.Actions.Scroll;
import org.DeviceManager.IOSDriverManager;
import org.DeviceManager.Session;
import org.ObjectRepository.ObjectRepository;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

public class TC_Register_phone extends IOSDriverManager {
	Click click = new Click ();
	IOSDriverManager generated = new IOSDriverManager();
	String Hasil = generated.generateRandomPhoneNumber();
	Scroll scroll = new Scroll();
	Input input = new Input();
	@Description("User get valid otp on user message")
	@Severity(SeverityLevel.CRITICAL)
	@Test(dataProvider = "dataLogin")
	public void TCRegisterBerhasil(HashMap<String, String> data)
			throws JSchException, IOException, InterruptedException {
		driver.get("https://www.visionplus.id");
		takeScreenshot(driver,"Testcase01","Step1" );
		click.OthersButton();
		takeScreenshot(driver,"Testcase01","Step2" );
		click.SinginButton();
		takeScreenshot(driver,"Testcase01","Step3" );
		input.FieldPhone(Hasil);
		takeScreenshot(driver,"Testcase01","Step4" );
		click.ContinueButton();
		takeScreenshot(driver,"Testcase01","Step5" );
		input.Password(data);
		takeScreenshot(driver,"Testcase01","Step6" );
		click.ContinueButton();
	//	takeScreenshot(driver,"Testcase01","Step7" );
		
		Thread.sleep(3000);
	}

	@DataProvider
	public Object[][] dataLogin() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/test/java/org.data/loginphone.json");
		return new Object[][] { { data.get(0) } };
	}

}