package Runners;

import Utilities.PWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {""},
        glue = {"StepDefinitions"}
        ,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class ParallelTest extends AbstractTestNGCucumberTests {


      @BeforeClass
      @Parameters("browserType")
      public void beforeClass(String browserType)
      {
              PWD.threadBrowserName.set(browserType);
      }

}
