package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Cucumber {
	WebDriver driver;
	
	@Given("^The user is in demoqa registration page$")
	public void the_user_is_in_demoqa_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "E:\\eclips workout\\Cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
	}

	@When("^The user enters firstname and lastnamen$")
	public void the_user_enters_firstname_and_lastnamen() throws Throwable {
		driver.findElement(By.id("name_3_firstname")).sendKeys("praveen");
		driver.findElement(By.id("name_3_lastname")).sendKeys("kumar");
	}

	@Then("^The user verifies the entered text in firstname and lastname field(\\d+)$")
	public void the_user_verifies_the_entered_text_in_firstname_and_lastname_field(int arg1) throws Throwable {
		Assert.assertEquals("praveen", driver.findElement(By.id("name_3_firstname")).getAttribute("Value"));
		Assert.assertEquals("kumar", driver.findElement(By.id("name_3_lastname")).getAttribute("Value"));
	}


}
