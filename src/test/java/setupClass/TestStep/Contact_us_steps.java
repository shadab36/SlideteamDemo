package setupClass.TestStep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import setupClass.SetupClass;

public class Contact_us_steps extends SetupClass {
	
	// contact us form
	
	@Given("^user is already on contact us form$")
	public void user_is_already_on_contact_us_form()  throws Throwable {
		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div.links:nth-child(6) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)")).click();
		Thread.sleep(1000);
	}

	@Then("^user enter name$")
	public void user_enter_name() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Himanshi Sharma");
		Thread.sleep(1000);
	    
	}

	@Then("^user enter email$")
	public void user_enter_email()throws Throwable
	{
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("sumit.kumar@slidetech.in");
		Thread.sleep(1000);
	}
	
	@Then("^user enter mobile number$")
	public void user_enter_mobile_number()  throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("telephone")).sendKeys("877566756657");
		Thread.sleep(1000);
	}

	@Then("^user enter comment$")
	public void user_enter_comment()throws Throwable  {
		Thread.sleep(1000);
		driver.findElement(By.id("comment")).sendKeys("This is a text message for QA purposes sent by an automated program. Please ignore. ");
		Thread.sleep(1000);
	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button()throws Throwable  {
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.btn > span:nth-child(1) > span:nth-child(1)")).click();
		Thread.sleep(1000);
	}

}
