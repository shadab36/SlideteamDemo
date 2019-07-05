package setupClass.TestStep;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import setupClass.SetupClass;

public class ResearchServicesSteps extends SetupClass {

	
	@Given("^user is already on Submit Your Business Research Requirements form$")
	public void user_is_already_on_Submit_Your_Business_Research_Requirements_form() throws Throwable  {
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div.links:nth-child(6) > ul:nth-child(2) > li:nth-child(10) > a:nth-child(1)")).click();
		Thread.sleep(1000);
	}

	@Then("^user enter name on rs form$")
	public void user_enter_name_on_rs_form()  throws Throwable{
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Himanshi Sharma");
		Thread.sleep(1000);
	}

	@Then("^user enter email on rs form$")
	public void user_enter_email_on_rs_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("form_email")).sendKeys("sumit.kumar@slidetech.in");
		Thread.sleep(1000);
	}

	@Then("^user enter mobile number on rs form$")
	public void user_enter_mobile_number_on_rs_form()throws Throwable  {
		Thread.sleep(1000);
		driver.findElement(By.id("telephone")).sendKeys("5678912345");
		Thread.sleep(1000);
	}

	@Then("^user enter comment on rs form$")
	public void user_enter_comment_on_rs_form()  throws Throwable{
		Thread.sleep(1000);
		driver.findElement(By.id("comment")).sendKeys("This is a text message for QA purposes sent by an automated program. Please ignore.");
		Thread.sleep(1000);
	}

	@Then("^user enter captcha on rs form$")
	public void user_enter_captcha_on_rs_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("captcha_business_research_services_captcha")).sendKeys("23102018");
		Thread.sleep(1000);
	}

	@Then("^user click on submit button on rs form$")
	public void user_click_on_submit_button_on_rs_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("finalSubmit")).submit();
		Thread.sleep(1000);
	}

}
