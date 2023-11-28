package TC_Login_Phone;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.jcraft.jsch.JSchException;

import DeviceManage.IOSDriverManager;
import ObjectRepository.ObjectRepository;

import org.testng.annotations.DataProvider;



public class TC_Register_phone extends IOSDriverManager {

	@Test(dataProvider = "dataLogin")
	public void TCRegisterBerhasil(HashMap<String, String> data) throws JSchException, IOException, InterruptedException {

    IOSDriverManager generated = new IOSDriverManager();
	String Hasil = generated.generateRandomPhoneNumber();
	driver.get("https://www.visionplus.id");
	Thread.sleep(1000);
	
	ObjectRepository objectRepository = new ObjectRepository(driver);
	objectRepository.clickOther();
	Thread.sleep(1000);
	objectRepository.clickSignIn();
	Thread.sleep(1000);
	objectRepository.SendKeysPhoneNumber(Hasil);
	Thread.sleep(500);
	objectRepository.continueButton();
	Thread.sleep(500);
	objectRepository.fieldpassword(data);
	Thread.sleep(500);
	objectRepository.continueButton();
	Thread.sleep(500);//		
//		WebElement Signin = driver.findElement(ObjectRepository.SignInButton);
//		Signin.click();
//		Thread.sleep(1000);
//	       WebElement FieldPhone = driver.findElement(ObjectRepository.ObjectRepository.FieldPhoneNumber);
//	       FieldPhone.sendKeys(Hasil);
//		
//		

//		driver.findElement(ObjectRepository.ObjectRepository.OthersButton).click();
//		Thread.sleep(1000);
//		driver.findElement(ObjectRepository.ObjectRepository.SignInButton).click();
//		Thread.sleep(1000);
//		driver.findElement(ObjectRepository.ObjectRepository.FieldPhoneNumber).sendKeys(Hasil);
//		Thread.sleep(1000);
//		driver.findElement(ObjectRepository.ObjectRepository.ContinueButton).click();
//		Thread.sleep(2000);
//		driver.findElement(ObjectRepository.ObjectRepository.FieldPassword).sendKeys(data.get("password"));
//		Thread.sleep(1000);
//		driver.findElement(ObjectRepository.ObjectRepository.ContinueButton).click();
//		Thread.sleep(500);

		IOSDriverManager extractor = new IOSDriverManager();

		try {
			// Extract OTP
			String otpValue = extractor.OTPTry("otp1");

			char otp1 = otpValue.charAt(0);
			char otp2 = otpValue.charAt(1);
			char otp3 = otpValue.charAt(2);
			char otp4 = otpValue.charAt(3);
//			driver.findElement(ObjectRepository.OTP1).sendKeys(String.valueOf(otp1));
			objectRepository.inputotp1(String.valueOf(otp1));
			Thread.sleep(500);
			objectRepository.inputotp2(String.valueOf(otp2));
			Thread.sleep(500);
			objectRepository.inputotp3(String.valueOf(otp3));
			Thread.sleep(500);
			objectRepository.inputotp4(String.valueOf(otp4));
			Thread.sleep(500);
//			driver.findElement(ObjectRepository.ObjectRepository.OTP2).sendKeys(String.valueOf(otp2));
//			Thread.sleep(500);
//			driver.findElement(ObjectRepository.ObjectRepository.OTP3).sendKeys(String.valueOf(otp3));
//			Thread.sleep(500);
//			driver.findElement(ObjectRepository.ObjectRepository.OTP4).sendKeys(String.valueOf(otp4));

			Thread.sleep(10000); // You may want to handle InterruptedException appropriately
		} catch (JSchException | IOException e) {
			// Handle JSchException and IOException as needed
			e.printStackTrace();

		} finally {
			if (driver != null) {
				driver.quit();

			}
		}

	}

	@DataProvider
	public Object[][] dataLogin() throws IOException {
		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "/src/test/java/com.data/loginphone.json");
		return new Object[][] { { data.get(0) } };

	}
}

// MKM TECHNIVAL ACCOUNT
// user : adityo.putro, pass : Adityo@430