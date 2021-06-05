package test.excalibur;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;

public class CarRentalPage {
	private WebDriver driver;
	
	@FindBy(id="search-country")
	private WebElement sc;
	
	@FindBy(id="search-city")
	private WebElement scy;
	
	@FindBy(xpath="//*[@id='search-button']")
	private WebElement sb;

	public CarRentalPage (WebDriver driver){
	       this.driver=driver;

	       //Initialize Elements
	       PageFactory.initElements(driver, this);
	   }

public boolean isPageOpened() {
		
		return sc.isDisplayed();
				
	}
	
public void selectCountry(String arg)
{
	Select select=new Select(sc);
	select.selectByVisibleText(arg);
	
}

public void selectCity(String arg)
{
	Select select=new Select(scy);
	select.selectByVisibleText(arg);
	
}
	
public void clickSearch() throws InterruptedException
{
	Thread.sleep(5000);
	sb.click();
	
}
	
}
