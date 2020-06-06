package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/featureFiles/carwale.feature",dryRun = false,glue = "stepDefenitions",snippets = SnippetType.CAMELCASE,monochrome = true)
public class CareWaleRunTest extends AbstractTestNGCucumberTests {

}
