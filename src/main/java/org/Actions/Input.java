package org.Actions;

import java.util.Map;

import org.DeviceManager.IOSDriverManager;
import org.ObjectRepository.ObjectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v117.database.Database;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Input extends IOSDriverManager{
	
	
	ObjectRepository obj = new ObjectRepository(driver);
	
	public void FieldPhone (String Hasil) {
		obj.FieldPhoneNumber().sendKeys(Hasil);
	}
	public void FieldPhoneDataEPG (Map<String,String> data) {
		obj.FieldPhoneNumber().sendKeys(data.get("phone"));
	}
	public void InputEmail (Map<String,String> data) {
		obj.FieldEmail().sendKeys(data.get("email "));
	}
	public void Password(Map<String, String> data) {
		obj.FieldPassword().sendKeys(data.get("password"));
	}
	public void FirstOtp(String Otp1) {
		obj.otp1().sendKeys(String.valueOf(Otp1));
	}
	public void SecondOtp(String Otp2) {
		obj.otp2().sendKeys(String.valueOf(Otp2));
	}
	public void ThridtOtp(String Otp3) {
		obj.otp3().sendKeys(String.valueOf(Otp3));
	}
	public void FourthOtp(String Otp4) {
		obj.otp4().sendKeys(String.valueOf(Otp4));
	}
	public void FieldEmailEpg(Map<String,String> data) {
		obj.InputEmailEpg().sendKeys(data.get("email"));
	}
	public void FieldPasswordEPG(Map<String,String>data) {
		obj.FieldPasswordEPG().sendKeys(data.get("password"));
	}
	public void FieldSearch(Map<String,String>data) {
		obj.FieldSearch().sendKeys(data.get("Search1"));
	}
}
