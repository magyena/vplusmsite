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

import org.Actions.Click;
import org.Actions.Input;
import org.Actions.Scroll;
import org.DeviceManager.IOSDriverManager;
import org.DeviceManager.Session;
import org.ObjectRepository.ObjectRepository;
import org.testng.annotations.DataProvider;

public class TestCase02 extends IOSDriverManager {
	Click click = new Click ();
	IOSDriverManager generated = new IOSDriverManager();
	String Hasil = generated.generateRandomPhoneNumber();
	Scroll scroll = new Scroll();
	Input input = new Input();
	@Description("User can register phone number")
	@Test(dataProvider = "dataLogin")
	public void TC2(HashMap<String, String> data) throws JSchException, IOException, InterruptedException {

		driver.get("https://www.visionplus.id");
		takeScreenshot(driver,"Testcase02","Step1" );
		click.OthersButton();
		takeScreenshot(driver,"Testcase02","Step2" );
		click.SinginButton();
		takeScreenshot(driver,"Testcase02","Step3" );
		input.FieldPhone(Hasil);
		takeScreenshot(driver,"Testcase02","Step4" );
		click.ContinueButton();
		takeScreenshot(driver,"Testcase02","Step5" );
		input.Password(data);
		takeScreenshot(driver,"Testcase02","Step6" );	
		click.ContinueButton();
		Thread.sleep(200);
		takeScreenshot(driver,"Testcase02","Step7" );
		
		IOSDriverManager extractor = new IOSDriverManager();

		try {
			// Extract OTP
			String otpValue = extractor.OTPTry("otp1");

			char otp1 = otpValue.charAt(0);
			char otp2 = otpValue.charAt(1);
			char otp3 = otpValue.charAt(2);
			char otp4 = otpValue.charAt(3);

			input.FirstOtp(String.valueOf(otp1));
			Thread.sleep(500);
			takeScreenshot(driver,"Testcase02","Step8" );
			input.SecondOtp(String.valueOf(otp2));
			Thread.sleep(500);
			takeScreenshot(driver,"Testcase02","Step9" );			
			input.ThridtOtp(String.valueOf(otp3));
			Thread.sleep(500);
			takeScreenshot(driver,"Testcase02","Step10" );
			input.FourthOtp(String.valueOf(otp4));
			Thread.sleep(500);
			takeScreenshot(driver,"Testcase02","Step11" );
			Thread.sleep(5000);
		} catch (JSchException | IOException e) {
			// Handle JSchException and IOException as needed
			e.printStackTrace();

		}
	}

	@DataProvider
	public Object[][] dataLogin() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/test/java/org.data/loginphone.json");
		return new Object[][] { { data.get(0) } };
	}

}