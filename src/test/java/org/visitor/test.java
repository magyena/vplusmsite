package org.visitor;

import org.Actions.Click;
import org.DeviceManager.IOSDriverManager;
import org.testng.annotations.Test;
@Test
public class test extends IOSDriverManager {
	Click click = new Click ();
	@Test
	public void test1 () throws InterruptedException {
		driver.get("https://www.visionplus.id");
		click.OthersButton();
		click.VoucherButton();
		Thread.sleep(10000);
	}

}
