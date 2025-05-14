package com.awesomeQA.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue= {"com/awesomeQA/stepDefinition"})
public class RunnerClass  extends AbstractTestNGCucumberTests{

}