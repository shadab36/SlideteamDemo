package setupClass.TestStep;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import setupClass.SetupClass;

public class BlogComment extends SetupClass {

	
	@Given("^user is already on blog form$")
	public void user_is_already_on_blog_form() throws Throwable {
		Thread.sleep(1000);
		driver.get("https://www.slideteam.net/blog/using-these-smart-goals-can-increase-your-impact-as-a-marketer/");
		Thread.sleep(1000);
	}

	@Then("^user enter name on blog form$") 
	public void user_enter_name_on_blog_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("author")).sendKeys("Himanshi Sharma");
		Thread.sleep(1000);
	}

	@Then("^user enter email on blog form$")
	public void user_enter_email_on_blog_form() throws Throwable{
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("sumit.kumar@slidetech.in");
		Thread.sleep(1000);
	}
	
	@Then("^user enter comment on blog form$")
	public void user_enter_comment_on_blog_form()throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("comment")).sendKeys("This is a text message for QA purposes sent by an automated program. Please ignore.");
		Thread.sleep(1000);
	}

	@Then("^user click on Submit button on blog form$")
	public void user_click_on_Submit_button_on_blog_form()throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("post-the-comment")).submit();
		Thread.sleep(1000);
	}
	
}
