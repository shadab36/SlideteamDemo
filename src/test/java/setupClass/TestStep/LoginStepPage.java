package setupClass.TestStep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import setupClass.SetupClass;

public class LoginStepPage extends SetupClass{
	
	@Given("^User is already on Sign in page$")
	public void user_is_already_on_Sign_in_page() throws Throwable {
		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".authorization-link > a:nth-child(1)")).click();
	   
	}

	@Then("^user enter username$")
	public void user_enter_username() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("himanshi.sharma@slidetech.in");
		Thread.sleep(1000);
	}

	@Then("^user enter password$")
	public void user_enter_password() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("123456");
		Thread.sleep(1000);
	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("send2")).click();
		Thread.sleep(1000);
	}

	@Then("^user in on pricing page$")
	public void user_in_on_pricing_page() throws Throwable {
		Thread.sleep(1000);
	  driver.findElement(By.cssSelector("li.menu-item:nth-child(1) > a:nth-child(1)")).click();
	  Thread.sleep(1000);
	}

}
