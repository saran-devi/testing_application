package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Feature/Search.feature", glue= "Stepdefinition", tags = "@searchgoogle", 
plugin={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class RunnerforGoogleSearch {

	
}
