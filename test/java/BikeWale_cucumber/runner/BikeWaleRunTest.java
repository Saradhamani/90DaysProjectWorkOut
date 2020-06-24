package BikeWale_cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(glue="BikeWale_cucumber/steps",features = "src/test/java/BikeWale_cucumber/feature/bikewaleF.feature",dryRun = false,monochrome = true)
public class BikeWaleRunTest extends AbstractTestNGCucumberTests {

}
