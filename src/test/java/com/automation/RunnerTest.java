package com.automation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Abdul on 24/03/2017.
 */



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        plugin = {"html:target/cucumber"},

        monochrome = false
)
public class RunnerTest {
}
