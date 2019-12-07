package secondTest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (plugin = {"pretty"},
                features={"src/test/resources/secondTest/features"},
                glue = {"secondTest/steps"},
                tags = {"@2nd_task"})

public class Runner {}
