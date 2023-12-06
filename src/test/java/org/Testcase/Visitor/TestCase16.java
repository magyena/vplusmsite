package org.Testcase.Visitor;

import java.io.IOException;
import java.util.HashMap;

import org.Actions.Click;
import org.Actions.Scroll;
import org.DeviceManager.IOSDriverManager;
import org.testng.annotations.Test;

import com.jcraft.jsch.JSchException;

import io.qameta.allure.Description;

public class TestCase16 extends IOSDriverManager{
	Click click = new Click ();
	IOSDriverManager generated = new IOSDriverManager();
	String Hasil = generated.generateRandomPhoneNumber();
	Scroll scroll = new Scroll();
	@Description("Pop Login in Premium Sports Linear Channels")
	@Test(dataProvider = "dataLogin")
	public void TC16(HashMap<String, String> data)
			throws JSchException, IOException, InterruptedException {

}
}
