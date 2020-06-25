package lenskart_cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(glue="lenskart_cucumber/steps",features="src/test/java/lenskart_cucumber/feature/lenskartF.feature",dryRun=false,snippets = SnippetType.CAMELCASE,monochrome = true)
public class LenskartRunner extends AbstractTestNGCucumberTests {

}
