package StepDefination1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

            ( 
            		features ={"src/test/java/FeatureFiles"},
            		glue="StepDefination1",
            		tags="@regression",
            		dryRun = false,
            		monochrome = false,
            		plugin= {"pretty","html:target/HTMLReports/index.html",
            				
            				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
            		
            		}
            		
      		
            		
            		
            		)



public class TestRunner1 {

}
