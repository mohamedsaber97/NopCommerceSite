package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", glue = "steps", tags = "@regression",
        plugin = {"pretty", "html:target/reports/httpReport.html", "json:target/reports/jsonReport.json"})
public class TestRunner {
}
