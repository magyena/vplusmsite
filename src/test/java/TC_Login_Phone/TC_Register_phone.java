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
	public void TCRegisterBerhasil(HashMap<String, String> data)
			throws JSchException, IOException, InterruptedException {

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