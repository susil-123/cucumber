package com.awesomeQA.stepDefinition;

import com.awesomeQA.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinition {
	
    @Given("I am at the home page")
    public void I_am_at_the_home_page() {
    	
    	System.out.println("I_am_at_the_home_page");
    	
    }
    
    @When("I try to extract page title")
    public void I_try_to_extract_page_title() {
    	System.out.println("I_try_to_extract_page_title");
    	//func for extracting
//    	obj.extractText();
    }
     
    @Then("I get the page title")
    public void  I_get_the_page_title() {
    	System.out.println("I_get_the_page_title");
    	//func for asserting
    }
}
