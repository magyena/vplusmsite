package org.DeviceManager;



import org.testng.annotations.AfterTest;


public class Session extends IOSDriverManager 
{
	@AfterTest
	public void tearDown() {
		try
		{
			driver.quit();
			driver.close();
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}


}