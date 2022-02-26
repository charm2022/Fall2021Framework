import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //Path to feature files
        features = {"Features/Hotels/HotelsSprint1.feature"},
        //Specify the step definition package name
        glue = {"StepDefinition"},
        dryRun = true,
        monochrome = true,

        //Tags to be executed
        tags = {"@test6"},
        plugin= {"pretty","html:test-output",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)
public final class TestRunner {


}

