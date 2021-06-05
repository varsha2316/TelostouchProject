package test.excalibur;



import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)


@CucumberOptions(features = {"classpath:features"},tags={"@acrf"},plugin={"pretty", "json:target/cucumber-reports/Cucumber.json",
		 "junit:target/cucumber-reports/Cucumber.xml",
		 "html:target/cucumber-reports","com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"},monochrome = true)
		 

public class CucumberTests {
	
	
		
	@AfterClass
	public static void setup()
	{
	
	Reporter.loadXMLConfig(new File("src/test/resources/extend-config.xml"));
	Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("Application Name", "TestApp");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	
	}
}
