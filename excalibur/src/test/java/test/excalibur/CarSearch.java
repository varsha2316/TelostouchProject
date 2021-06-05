package test.excalibur;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;

public class CarSearch {
	private WebDriver driver;
	
	@FindBy(xpath="//*[contains(text(),'Transmission')]")
	private WebElement trans;

	public CarSearch (WebDriver driver){
	       this.driver=driver;
	       

	       //Initialize Elements
	       PageFactory.initElements(driver, this);
	       
	   
	   }

	public void clicktrans() {
		trans.click();
	}
}
