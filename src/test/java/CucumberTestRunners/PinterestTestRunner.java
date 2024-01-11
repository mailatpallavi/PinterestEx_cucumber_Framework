package CucumberTestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "stepDefinitions" }, monochrome = true, plugin = { "pretty",
		"html:target/HTMLReports/report.html", "json:target/JSONReports/report.json",
		"junit:target/JUNITReports/report.xml" })
public class PinterestTestRunner {

}
