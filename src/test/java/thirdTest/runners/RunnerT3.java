package thirdTest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (plugin = {"pretty"},
                features={"src/test/resources/thirdTest/features"},
                glue = {"thirdTest/steps"},
                tags = {"@3rd_task"})

public class RunnerT3 {}
