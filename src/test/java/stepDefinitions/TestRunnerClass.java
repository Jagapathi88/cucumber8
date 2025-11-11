package stepDefinitions;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src\\test\\java\\FeaturesFiles", glue={"stepDefinitions","cucumber8.Base"},tags = "@busBooking",
plugin= {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json","rerun:target/rerun.txt"})


@Test
public class TestRunnerClass extends AbstractTestNGCucumberTests    {

}
