package setupClass.TestStep;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import setupClass.SetupClass;

public class DesignServicesFormSteps extends SetupClass{

	@Given("^user is already on design services page$")
	public void user_is_already_on_design_services_page() throws Throwable {
	    Thread.sleep(1000);
	    driver.get("https://www.slideteam.net/powerpoint_presentation_design_services");
	    Thread.sleep(1000);
	}

	@Then("^user enter name on design services form$")
	public void user_enter_name_on_design_services_form() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id("name")).sendKeys("Himanshi Sharma");
	    Thread.sleep(1000);
	}

	@Then("^user enter email on design services form$")
	public void user_enter_email_on_design_services_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("himanshi.sharma@slidetech.in");
		Thread.sleep(1000);
	}

	@Then("^user enter project description on design services form$")
	public void user_enter_project_description_on_design_services_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("comment")).sendKeys("This is a text message for QA purposes sent by an automated program. Please ignore.");
	    
	}

	@Then("^user attach a file on design services form$")
	public void user_attach_a_file_on_design_services_form() throws Throwable {
		Thread.sleep(1000);
	    	}

	@Then("^user submit the design services form$")
	public void user_submit_the_design_services_form() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id("finalSubmit")).click();
	    Thread.sleep(1000);
	}


}
