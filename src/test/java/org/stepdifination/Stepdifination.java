package org.stepdifination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdifination {

	WebDriver driver;

	@Given("launch the webdriver")
	public void launch_the_webdriver() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}

	@When("User enter the valid username and password")
	public void user_enter_the_valid_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("mugunthan");
		driver.findElement(By.name("pass")).sendKeys("m@12345");
		
	}

	@Then("validate the login")
	public void validate_the_login() {
		driver.findElement(By.name("login")).click();
	}

}
