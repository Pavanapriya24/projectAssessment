package com.cts.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@CucumberOptions(features="src/main/resources/feature",
                 glue= {"com/cts/stepdefinition"},monochrome=true)
              
@RunWith(Cucumber.class)
public class RunnerTest {

	
}
