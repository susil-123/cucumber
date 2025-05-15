package com.awesomeQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.awesomeQA.utils.DriverManager;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[@title='My Account']")
    WebElement dropDownMyAccount;
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement dropDownLogin;
	@FindBy(xpath = "//input[@name='email']")
	WebElement inpEmail;
	@FindBy(xpath = "//input[@name='password']")
	WebElement inpPassword;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement btnSubmit;
	
	public LoginPage() {
		this.driver = DriverManager.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void getHomePage() {
		driver.get("https://awesomeqa.com/ui/");
	}
	
	public void goToLoginPage() {
		dropDownMyAccount.click();
		dropDownLogin.click();
	}
	
	public boolean enterCredAndLogin(String email, String password) {
		inpEmail.sendKeys(email);
		inpPassword.sendKeys(password);
		btnSubmit.click();
		return isLogged();
	}
	
	public boolean isLogged() {
	try {
		return driver.findElement(By.xpath("(//a[contains(text(),'Logout')])[2]")).isDisplayed();
	}
	catch(NoSuchElementException e) {
		return false;
	}
	catch(Exception e) {
		System.out.println("exception from login page...");
		return false;
	}
	
	}
	
}
