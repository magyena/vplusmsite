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

	public void ClickSeeAll() {
		obj.SeeAll().click();
	}

	public void ClickBack() {
		obj.PopupBackButton().click();
		;
	}

	public void ClickLogin() {
		obj.PopupLoginButton().click();
	}

	public void ClickPremiumSportsChannel() {
		obj.PremiumSportsChannel().click();
	}

	public void ClickVod() {
		obj.VOD().click();
	}

	public void ClickPlay() {
		obj.PlayButton().click();
	}

	public void ClickShare() {
		obj.ShareButton().click();
	}

	public void Clickeps1() {
		obj.Eps1().click();
	}

	public void ClickBeforeTodayEpg() {
		obj.EpgBeforeToday().click();
	}

	public void ClickContentBeforeTodayEpg() {
		obj.Epg1().click();
	}

	public void ClickLoginFromEPG() {
		obj.LoginButtonFromEpg().click();
	}

	public void ClickContinueWithEmailfromEPG() {
		obj.Emailepg().click();
	}

	public void ClickContinueWithGooglefromEPG() {
		obj.Googleepg().click();
	}

	public void ClickEpgContinueButton() {
		obj.ContinueButtonEpg().click();
	}

	public void ClickSearchResult() {
		obj.SearchResult().click();
	}

	public void ClickSignoutButton() {
		obj.SignoutButton().getClass();
	}
	public void ClickClosePopup() {
		obj.ClosePopup().click();
	}
}