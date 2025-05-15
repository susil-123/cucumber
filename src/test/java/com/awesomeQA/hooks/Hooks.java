package com.awesomeQA.hooks;

import org.openqa.selenium.WebDriver;

import com.awesomeQA.utils.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
	
	public Hooks() {
		this.driver = DriverManager.getDriver();
	}
	
//	@Before("@LoginFailCheck")
//	public void clearCookies() {
//		driver.manage().deleteAllCookies();
//		System.out.println("cleared all cookies");
//	}
	
	@After("@LoginPassCheck")
	public void clearCookies() {
//		driver.manage().deleteAllCookies();
		System.out.println("cleared all cookies");
	}
}
