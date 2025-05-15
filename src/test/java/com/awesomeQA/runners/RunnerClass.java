 package com.awesomeQA.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features", glue= {"com.awesomeQA.stepDefinition"},tags= "@HomePage")
public class RunnerClass  extends AbstractTestNGCucumberTests{

}