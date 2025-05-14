package com.awesomeQA.pages;

import org.openqa.selenium.WebDriver;

import com.awesomeQA.utils.DriverManager;

public class HomePage {
	
	
	WebDriver driver;

    public HomePage() {
        this.driver = DriverManager.getDriver(); // 💥 Will fail if ChromeDriver not set up
    }
	
	public void extractText() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
}
