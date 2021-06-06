package test.excalibur;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;

public class CarRentalcheckout {
	private WebDriver driver;
	
	@FindBy(name="customer-firstname")
	private WebElement fname;
	@FindBy(name="customer-lastname")
	private WebElement sname;
	@FindBy(name="customer-mobile")
	private WebElement mob;
	@FindBy(name="customer-email")
	private WebElement email;
	@FindBy(id="book-button")
	private WebElement book;
	
	
	
	
	public CarRentalcheckout (WebDriver driver){
	       this.driver=driver;

	       //Initialize Elements
	       PageFactory.initElements(driver, this);
	   }
	public void setFirstName(String arg) {
		fname.sendKeys(arg);
		
	}
	public void setLastName(String arg) {
		sname.sendKeys(arg);
		
	}
	public void setMobile(String arg) {
		mob.sendKeys(arg);
		
	}
	public void setEmail(String arg) {
		email.sendKeys(arg);
		
	}
	public void bookButton() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();",book );
		book.click();
		
	}
	


	
}
