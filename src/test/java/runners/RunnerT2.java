package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (plugin = {"pretty"},
                features = {"src/test/resources/features/testT2.feature"}
                , glue = {"steps"}
                , tags = {"@2nd_task"}
        )

public class RunnerT2 {}
