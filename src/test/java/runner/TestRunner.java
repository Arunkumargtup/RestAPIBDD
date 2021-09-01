package runner;

import java.io.File;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"},
				 glue= {"steps"},
				// tags="@getSingleUser",
				 dryRun=false,
				 plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				 )
public class TestRunner extends AbstractTestNGCucumberTests{

}
