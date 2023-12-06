package org.Actions;

import java.util.Map;

import org.DeviceManager.IOSDriverManager;
import org.ObjectRepository.ObjectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Click extends IOSDriverManager {

	ObjectRepository obj = new ObjectRepository(driver);

	public void HomeButton() {
		obj.HomeButton().click();
	}

	public void SportButton() {
		obj.SportButton().click();
	}

	public void LiveTVButton() {
		obj.LiveTVButton().click();
	}

	public void GamesButton() {
		obj.GamesButton().click();
	}

	public void OthersButton() {
		obj.OthersButton().click();
	}

	public void SinginButton() {
		obj.SignInButton().click();
	}
	public void ContinueWithEmail() {
		obj.ContinueWithEmail();
	}
	public void ContinueWithGoogle() {
		obj.ContinueWithGoogle();
	}
	public void ContinueWithFacebook() {
		obj.ContinueWithFacebook();
	}
	public void SearchIcon() {
		obj.SearchIcon().click();
	}

	public void PackageButton() {
		obj.PackageButton().click();
	}

	public void VoucherButton() {
		obj.VoucherButton().click();
	}

	public void PairAndroidTVButton() {
		obj.PairAndroidTVButton();
	}

	public void RefferalCodeButton() {
		obj.ReferralCodeButton().click();
	}

	public void LinkedDeviceButton() { 
		obj.LinkedDeviceButton().click();
	}

	public void SettingsButton() {
		obj.SettingsButton();
	}
	public void SupportButton() {
		obj.SupportButton();
	}
	public void ContinueButton() {
		obj.ContinueButton().click();
	}

	public void RctiChannel() {
		obj.RctiChannel().click();
	}
	public void ClickPremiumChannel() {
		obj.PremiumChannel().click();
	}
	public  void ClickSeeAll() {
		obj.SeeAll().click();
	}
	public void ClickBack() {
		obj.PopupBackButton().click();;
	}
	  
	public void ClickLogin() {
		obj.PopupLoginButton().click();
	}
	public void ClickPremiumSportsChannel() {
		obj.PremiumSportsChannel().click();
	}
}//20 click