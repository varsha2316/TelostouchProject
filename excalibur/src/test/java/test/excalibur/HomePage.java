package test.excalibur;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;

public class HomePage {
	private WebDriver driver;
	
	@FindBy(id="domainname")
	private WebElement heading;
	
	@FindBy(xpath="//span[contains(text(),'Airport Car Rental Deals')]")
	private WebElement acrd;
	

	public HomePage (WebDriver driver){
	       this.driver=driver;

	       //Initialize Elements
	       PageFactory.initElements(driver, this);
	   }

	public boolean isPageOpened() {
		
		return heading.getText().contains("demoaut.com");
	}
	
	
	public void clickAirportCarRentalDeals()  {
		 driver.switchTo().frame("master-1");
		 acrd.click();
	}
	
}
