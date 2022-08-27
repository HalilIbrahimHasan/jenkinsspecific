package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html"
               
        },
        features = "./src/test/resources/features",//MUST
        glue = "stepdefinitions",//MUST
        tags = "@login",
        dryRun = false

)
public class Runner {
}
