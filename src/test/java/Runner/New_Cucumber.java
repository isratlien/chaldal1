package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(/*tags ="@smoke",*/ features = {"src/test/resources/Feature/Item.feature"},
        glue = {"StepDefination"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports/report.html"
        })
@Test
public class New_Cucumber extends AbstractTestNGCucumberTests {
}