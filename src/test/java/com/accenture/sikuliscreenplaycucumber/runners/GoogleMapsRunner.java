package com.accenture.sikuliscreenplaycucumber.runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features", 
		glue= {"com.accenture.sikuliscreenplaycucumber.step_definitions"})
public class GoogleMapsRunner {

}
