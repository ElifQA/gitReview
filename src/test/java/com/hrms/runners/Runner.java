package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features="src/test/resources/Features",
        glue ="com/hrms/steps"   ,
        dryRun=false,
        monochrome=true,
        plugin= {"pretty","html:target/cucumber-default-reports","json:target/cucumber.json"}
		)


public class Runner {

}
