package org.DeviceManager;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class IOSReal {

    private static IOSDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "17.1.1");
        capabilities.setCapability("deviceName", "Tes");
        capabilities.setCapability("browserName", "Safari");
        capabilities.setCapability("UDID", "00008030-000958262E42802E");
		capabilities.setCapability("deviceType", "iPhone");
        URL url = new URL("http://127.0.0.1:4723/wd/hub"); // Appium server URL

        driver = new IOSDriver(url, capabilities);
        
        // Optional: Set implicit wait time to handle dynamic elements
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            // Your test steps go here
            driver.get("https://example.com");
            // Add more test steps as needed
        } finally {
            // Quit the driver
            driver.quit();
        }
    }
}
