package cucumber2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(monochrome=true,plugin={"pretty","html:cucumberreports1"})//for reports
@CucumberOptions(monochrome=true,tags={"@uat"})
public class Runner {

}
