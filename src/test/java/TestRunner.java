import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //Path to feature files
        features = {"Features/Facebook"},
        //Specify the step definition package name
        glue = {"StepDefinition", "Web"},
        dryRun = true,
        monochrome = true,
        strict = true,

        //Tags to be executed
        tags = {"@sanity"},
        plugin= {"pretty","html:test-output",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)
public final class TestRunner {


}

