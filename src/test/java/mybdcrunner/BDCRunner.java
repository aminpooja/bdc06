package mybdcrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature99", glue = "bdcstepdefinations", tags= {"@Sanity"})
public class BDCRunner {

}
