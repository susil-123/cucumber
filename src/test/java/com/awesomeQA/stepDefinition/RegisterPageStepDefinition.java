package com.awesomeQA.stepDefinition;

import org.openqa.selenium.WebDriver;
import com.awesomeQA.pages.RegisterPage;
import com.awesomeQA.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class RegisterPageStepDefinition {
	RegisterPage obj = new RegisterPage();
	WebDriver driver = DriverManager.getDriver();
	
	@After("@RegisterPageCorrectCred")
	public void tearDownRegister() {
		driver.manage().deleteAllCookies();
		System.out.println("cleared all cookies");
	}

    @When("I click on to register option")
    public void I_click_on_to_register_option() {
    	System.out.println("I_click_on_to_register_option");
//        func for in clicking on reg
    	obj.gotoRegisterPage();
    }

    @When("I passed correct {string}, {string}, {string}, {string}, {string}, {string} credentials")
    public void I_click_on_to_register_option_correctCreds(String firstName, String lastName, String email, String telephone, String password, String confirmPassword) {
    	System.out.println("I_click_on_to_register_option_correctCreds");
//        func for passing parameter
    	boolean isRegistered = obj.enterCredAndRegister(firstName, lastName, email, telephone, password, confirmPassword);
    	Assert.assertTrue("User should be able to register...",isRegistered);
    	
    }

    @When("I passed incorrect {string}, {string}, {string}, {string}, {string}, {string} credentials")
    public void I_click_on_to_register_option_incorrectCreds(String firstName, String lastName, String email, String telephone, String password, String confirmPassword) {
    	System.out.println("I_click_on_to_register_option_incorrectCreds");
//        func for passing parameter
    	boolean isRegistered = obj.enterCredAndRegister(firstName, lastName, email, telephone, password, confirmPassword);
    	Assert.assertFalse("User should not be able to register...",isRegistered);
    	
    }

    @Then("I should be registered successfully")
    public void I_should_be_registered_successfully() {
    	System.out.println("I_should_be_registered_successfully");
//        func for reg
        
}

    @Then("I should not be registered successfully")
    public void I_should_not_be_registered_successfully() {
    	System.out.println("I_should_not_be_registered_successfully");
//        func for reg
    	
    }
    
    
}
