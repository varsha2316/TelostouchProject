package test.excalibur;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.listener.Reporter;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import test.utils.xlsxReader;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

public class StepDef {
	
	@After
	public void tearDown(Scenario scenario) {
	    if (scenario.isFailed()) {
	      // Take a screenshot...
	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	      scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
	    }
	}
	
	private String url="";
	private WebDriver driver;

	@Given("^I have the website url \"([^\"]*)\"$")
	public void i_have_the_website_url(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		url=arg1;
	
	}

	@Then("^I launch the website$")
	public void i_launch_the_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(xlsxReader.getColumnData("test.xlsx", "Run", 0, 0).trim().equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","src/test/resources/driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("XXXX:  "+url);
		driver.get(url);
		
	   
	}

	@Then("^I validate homepage$")
	public void i_validate_hp() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    HomePage hp = new HomePage(driver);
	    Assert.assertTrue(hp.isPageOpened());
	    Reporter.addStepLog("suucessfully launched homepage");
	}
	
	@Then("^I click \"([^\"]*)\" of Homepage$")
	public void i_click_of_Homepage(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 HomePage hp = new HomePage(driver);
		 switch(arg1) {
		  case "Airport Car Rental Deals": {
		    hp.clickAirportCarRentalDeals();
		    break;
		  }
		  
		}
	}
	
	@Then("^I click Visit Website$")
	public void i_click_Visit_Website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().frame("master-1");
		driver.findElement(By.xpath("//span[contains(text(),'Visit Website')]")).click();		
	    
	}
	
	@Then("^I validate Car rental page$")
	public void i_validate_crp() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		int i=0;
		for(String s:driver.getWindowHandles())
		{
			if(!driver.getTitle().contains("Car Rental"))
			{
				driver.switchTo().window(s);
				Reporter.addStepLog("suucessfully entered the Car Rental Page window");
			}
				
			
		}
	    CarRentalPage cp = new CarRentalPage(driver);
	    
	    Assert.assertTrue(cp.isPageOpened());
	    
	}
	
	@Then("^I select country \"([^\"]*)\"$")
	public void i_select_country(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CarRentalPage cp = new CarRentalPage(driver);
		cp.selectCountry(arg1);
	   
	}

	@Then("^I select city \"([^\"]*)\"$")
	public void i_select_city(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CarRentalPage cp = new CarRentalPage(driver);
		cp.selectCity(arg1);
	}
	

	@Then("^I click Search button of Car rental page$")
	public void i_click_search_button_car_rental_page() throws Throwable
	{
		CarRentalPage cp = new CarRentalPage(driver);
		cp.clickSearch();
	}
	
	@Then("^I click transmission button of car search page$")
	public void i_click_transmission_button_of_car_search_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   CarSearch cs = new CarSearch(driver);
		cs.clicktrans();	   
	}

	
	@Then("^I close the website$")
	public void i_close() throws Throwable {
		driver.quit();
	}

}
