package org.ObjectRepository;

import java.time.Duration;
import java.util.Map;

import org.DeviceManager.IOSDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.functions.ExpectedCondition;

public class ObjectRepository extends IOSDriverManager {

	public WebElement HomeButton() { // click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt='home'])[1]")));
	}

	public WebElement SportButton() {// click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt='sport tv'])[1]")));
	}

	public WebElement LiveTVButton() { // click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt='live tv'])[1]")));
	}

	public WebElement GamesButton() { // click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt='games'])[1]")));
	}

	public WebElement OthersButton() {// click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt='others'])[1]")));
	}

	public WebElement SearchIcon() {// click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt='search'])[1]")));
	}

	public WebElement SignInButton() {// click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Sign In')])[1]")));
	}

	public WebElement PackageButton() {// click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"q-app\"]/div/div[2]/aside/div/div[2]/div/div/div[1]/div[2]")));
	}

	public WebElement VoucherButton() {// click
		return driver.findElement(By.xpath("//*[@id=\"q-app\"]/div/div[2]/aside/div/div[2]/div/div/div[2]/div[2]"));
	}

	public WebElement PairAndroidTVButton() {// click
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/div[2]/div/div/div[3]/div[2]"));
	}

	public WebElement ReferralCodeButton() {// click
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/div[2]/div/div/div[4]/div[2]"));
	}

	public WebElement LinkedDeviceButton() {// click
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/div[2]/div/div/div[5]/div[2]"));
	}

	public WebElement SettingsButton() {// click
		return driver.findElement(By.xpath("//*[@id=\"q-app\"]/div/div[2]/aside/div/div[2]/div/div/div[6]/div[2]/span"));
	}

	public WebElement SupportButton() {// click
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/div[2]/div/div/div[7]"));
	}

	public WebElement FieldEmail() { // input
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/form/div/div/input")));
	}

	public WebElement FieldPhoneNumber() { // input
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='8123456xxx'])[1]")));
	}

	public WebElement ContinueWithEmail() { // click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space()='Continue with Email'])[1]")));
	}

	public WebElement ContinueButton() { // click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space()='Continue'])[1]")));
	}

	public WebElement ContinueWithGoogle() { // click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space()='Continue with Google'])[1]")));
	}

	public WebElement ContinueWithFacebook() { // click
		return driver.findElement(By.xpath("(//button[normalize-space()='Continue with Facebook'])[1]"));
	}

	public WebElement FieldPassword() { // input
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='Your password'])[1]")));
	}

	public WebElement otp1() { // input
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='-'])[1]")));
	}

	public WebElement otp2() { // input
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='-'])[2]")));
	}

	public WebElement otp3() { // input
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='-'])[3]")));
	}

	public WebElement otp4() { // input
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='-'])[4]")));
	}

	public WebElement RctiChannel() { // click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt='RCTI'])[1]")));
	}

	public WebElement SeeAll() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[1]/div/div[1]/main/div[2]/div[2]/div/div[4]/div[1]/div[3]")));
	}

	public WebElement PremiumChannel() { // click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed

		return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//img[@alt='CELEBRITIES TV'])[1]")));
	}

	public  WebElement PopupBackButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed

		return wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//body/div[5]/div[2]/div/div/div[2]/div/button[1]/div[2]/div")));
	}

	public  WebElement PopupLoginButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/button[2]")));
	}
	
	public WebElement PremiumSportsChannel() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//img[@alt='SPORTSTARS'])[1]")));
	}
	public WebElement VOD() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt='Temen Ngekost'])[1]")));
	}
	public WebElement PlayButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/main/div[1]/div/div[2]/div[2]/div[1]/button/div[2]")));
	}
	public WebElement ShareButton() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/main/div[1]/div/div[2]/div[2]/div[3]/button/div[2]")));
	}
	public WebElement Eps1() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[normalize-space()='Love Language - Episode - 1'])[1]")));
	}
	public WebElement EpgBeforeToday() {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='date_num_box noselecttext'][normalize-space()='10'])[1]")));
	}
	
	public WebElement Epg1() {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()='11:00 - 12:00'])[1]")));
	}
	public WebElement LoginButtonFromEpg() {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space()='Login'])[1]")));
	}
	public WebElement Emailepg() {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[2]/div/div/div/div/div[2]/div[2]/button[1]")));
	}
	public WebElement InputEmailEpg() {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[2]/div/div/div/div/div[2]/form/div/div/input")));
	}
	public WebElement Googleepg() {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"google-signin-btn-0\"]")));
	}
	public WebElement ContinueButtonEpg() {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[2]/div/div/div/div/div[2]/form/button")));
	}
	public WebElement FieldPasswordEPG() {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[2]/div/div/div/div/div[2]/form/div/div[2]/div[1]/input")));
	}
	public WebElement FieldSearch() {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div/div[1]/div[2]/label/div/div/div/input")));
	}
	public WebElement SearchResult() {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div[1]/div/div/div/div/div[2]/a/div")));
	}
	public WebElement SignoutButton() {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='q-btn inline q-btn-item non-selectable no-shadow full-width q-btn--standard q-btn--rectangle text-white q-focusable q-hoverable q-btn--no-uppercase'])[1]")));
	}
	public WebElement ClosePopup() {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div[1]/img[1]")));
	}
	//(//img[@alt='close'])[1]
	
	
	
	
	public ObjectRepository(WebDriver driver) {
		{
			PageFactory.initElements(driver, this);
		}
	}

}
