package io.cucumber.skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefs {
	WebDriver driver;
	
	@Given("The URL of demo webshop")
	public void the_URL_of_demo_webshop() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Downloads\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.findElements(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a")).get(0).click();
	  
	}

	@When("User enters XYZ as username")
	public void user_enters_XYZ_as_username() throws Throwable {
		 driver.findElement(By.id("Email")).sendKeys("prabhakar.devineni@accenture.com");
	}

	@When("user enters Pass as password")
	public void user_enters_Pass_as_password() throws Throwable {
		
		driver.findElement(By.id("Password")).sendKeys("Nov@2018");
	    
	}

	@When("User clicks Login")
	public void user_clicks_Login() throws Throwable{
		driver.findElement(By.cssSelector("input[value='Log in")).click();
	   
	}

	@Then("User is Valid")
	public void user_is_Valid() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	    
	}
}
  