package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class googlesearch {
	
	WebDriver driver;
	
	@Given("user open the google website")
	public void user_open_the_google_website() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
	    
	}
	@When("he searchs for computer")
	public void he_searchs_for_computer() {
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("computer");
		
		
	    
	}
	@Then("he sees the results.")
	public void he_sees_the_results() {
	    
	}



}
