package com.awesomeQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.awesomeQA.utils.DriverManager;


public class RegisterPage {
	WebDriver driver;
	
	@FindBy(xpath = "//a[@title='My Account']")
    WebElement dropDownMyAccount;
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	WebElement dropDownRegister;
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement inpFirstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement inpLastName;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement inpEmail;
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement inpTelephone;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement inpPassword;
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement inpPasswordConfirm;
	@FindBy(xpath = "//input[@name='agree']")
	WebElement inpPolicy;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement btnRegister;
	
	
	public RegisterPage() {
		this.driver = DriverManager.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void getHomePage() {
		driver.get("https://awesomeqa.com/ui/");
	}
	
	public void gotoRegisterPage() {
		dropDownMyAccount.click();
		dropDownRegister.click();
	}
	
	public boolean enterCredAndRegister(String firstName, String lastName, String email, String telephone, String password, String confirmPassword) {
		inpFirstName.sendKeys(firstName);
		inpLastName.sendKeys(lastName);
		inpEmail.sendKeys(email);
		inpTelephone.sendKeys(telephone);
		inpPassword.sendKeys(password);
		inpPasswordConfirm.sendKeys(confirmPassword);
		inpPolicy.click();
		btnRegister.click();
		return isRegistered();
	}
	
	public boolean isRegistered() {
	try {
		return driver.findElement(By.xpath("//h1[contains(text(),'Your Account Has Been Created')]")).isDisplayed();
	}
	catch(NoSuchElementException e) {
		return false;
	}
	catch(Exception e) {
		System.out.println("exception from register page...");
		return false;
	}
	
	}
	
}
