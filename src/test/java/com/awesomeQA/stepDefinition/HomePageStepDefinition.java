package com.awesomeQA.stepDefinition;

import com.awesomeQA.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomePageStepDefinition {
	HomePage obj  = new HomePage();
	
    @Given("I am at the home page")
    public void I_am_at_the_home_page() {
    	System.out.println("I_am_at_the_home_page");
    	
    }
    
    @SuppressWarnings("deprecation")
	@When("I try to extract page title")
    public void I_try_to_extract_page_title() {
    	System.out.println("I_try_to_extract_page_title");
    	//func for extracting
    	String pageTitleExtracted = obj.extractText();
    	String pageTitleExpected = "Your Store";
    	Assert.assertEquals(pageTitleExpected, pageTitleExtracted);
    }
     
    @Then("I get the page title")
    public void  I_get_the_page_title() {
    	System.out.println("I_get_the_page_title");
    	//func for asserting
    }
}
