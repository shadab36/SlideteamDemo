package setupClass.TestStep;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import setupClass.SetupClass;

public class Contact_Us_To_Get_Started extends SetupClass{

	@Given("^user is already on contact us to get started form$")
	public void user_is_already_on_contact_us_to_get_started_form()  throws Throwable{
		Thread.sleep(1000);
		driver.get("https://www.slideteam.net/powerpoint_presentation_design_services/hire-a-designer");
		Thread.sleep(1000);
	}

	@Then("^user enter name on gs form$")
	public void user_enter_name_on_gs_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Himanshi sharma");
		Thread.sleep(1000);
	}

	@Then("^user enter email on gs form$")
	public void user_enter_email_on_gs_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("sumit.kumar@slidetech.in");
		Thread.sleep(1000);
	}

	@Then("^user enter phone number on gs form$")
	public void user_enter_phone_number_on_gs_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("telephone")).sendKeys("8295782957");
		Thread.sleep(1000);
	    
	}

	@Then("^user enter message on gs form$")
	public void user_enter_message_on_gs_form()  throws Throwable{
		Thread.sleep(1000);
		driver.findElement(By.id("comment")).sendKeys("This is a text message for QA purposes sent by an automated program. Please ignore.");
		Thread.sleep(1000);
	}

	@Then("^user click on submit button on gs form$")
	public void user_click_on_submit_button_on_gs_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.className("text-center")).submit();
		Thread.sleep(1000);
	}
	
}
