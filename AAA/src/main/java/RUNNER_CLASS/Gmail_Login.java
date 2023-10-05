package RUNNER_CLASS;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "./src\\main\\java\\FEATURE\\Gmail.feature",
		glue = "Gmail_login.java"
		
		)
public class Gmail_Login {

}
