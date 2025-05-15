package com.awesomeQA.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.awesomeQA.pages.LoginPage;
import com.awesomeQA.utils.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPageStepDefinition{
	
	WebDriver driver = DriverManager.getDriver();
	LoginPage obj = new LoginPage();
	
	//hooks
	@After("@LoginPassCheck")
	public void tearDownLogin() {
		driver.manage().deleteAllCookies();
		System.out.println("cleared all cookies");
	}
	
	//functions
	@Given("I was in the home page")
	public void I_was_in_the_home_page() {
	    System.out.println("I_was_in_the_home_page");
	    // Function for navigating to home page
	    obj.getHomePage();
	}

	@When("I click on to login option")
	public void I_click_on_to_login_option() {
	    System.out.println("I_click_on_to_login_option");
	    // Function for clicking login option
	    obj.goToLoginPage();
	    
	}

	@SuppressWarnings("deprecation")
	@When("I passed correct {string} and {string} credentials")
	public void I_passed_correct_user_credentials(String email, String password) {
	    System.out.println("I_passed_correct_user_credentials");
	    // Function for entering valid credentials
	    boolean isLogged = obj.enterCredAndLogin(email, password);
	    System.out.println("Logged?: "+isLogged);
	    Assert.assertTrue("The user should be able to login...",isLogged);
	}

	@Then("I should login")
	public void I_should_login() {
	    System.out.println("I_should_login");
	    // Function for asserting successful login
	}
	

	@SuppressWarnings("deprecation")
	@When("I passed incorrect {string} and {string} credentials")
	public void I_passed_incorrect_user_credentials(String email, String password) {
	    System.out.println("I_passed_incorrect_user_credentials");
	    // Function for entering invalid credentials
	    boolean isLogged = obj.enterCredAndLogin(email, password);
	    System.out.println("Logged?: "+isLogged);
	    Assert.assertFalse("The user should'nt be able to login...",isLogged);
	}

	@Then("I should not login")
	public void I_should_not_login() {
	    System.out.println("I_should_not_login");
	    // Function for asserting failed login
	}


}
