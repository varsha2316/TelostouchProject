package test.excalibur;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;

public class CarSearch {
	private WebDriver driver;
	
	@FindBy(xpath="//*[@class='pull-right']/a/h4")
	private WebElement deal;
	
	@FindBy(xpath="//div[@class='col-xs-12 pCentered'] /button[1]")
	private WebElement getdeal;
	
	@FindBy(id="options-submit")
	private WebElement nextbutton;

	public CarSearch (WebDriver driver){
	       this.driver=driver;
	       

	       //Initialize Elements
	       PageFactory.initElements(driver, this);
	       
	   
	   }


	public void clicktrans() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		deal.click();
		
	}
	
	public void clickdeal() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(5000);
		getdeal.click();
		
	}
	
	public void nextdeal() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();",nextbutton );
		nextbutton.click();
		
	}
	
	
	
}
