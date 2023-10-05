package RUNNER_CLASS;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src\\main\\java\\FEATURE\\ActiTime_Login.feature",
		glue="STEP_DEFINATION"
		                        )
public class ActiTime_login_Runner {


}
