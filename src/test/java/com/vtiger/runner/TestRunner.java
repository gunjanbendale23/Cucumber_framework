package com.vtiger.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.plugin.Plugin;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(
        features = "src/test/resources/Features/",
        glue = "com.vtiger.stepdefinations",
        dryRun =false,
       // tags ="@lead",
        plugin = {
        "pretty",                                      // Console output
        "html:target/cucumber-html-report.html",       // HTML report
        "json:target/cucumber.json",                   // JSON report
        "junit:target/cucumber.xml"   ,               // JUnit XML report
                 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  // <--- This one

        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
      /*  @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }*/
}
