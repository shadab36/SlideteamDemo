package setupClass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\Administrator\\Desktop\\slideteam.com.test\\src\\test\\resources\\login.feature"},
plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json","usage:target/usage.jsonx","junit:target/cucumber.xml"})


public class TestRunner {

	@BeforeClass
	public static void beforeClass() throws Exception {
		SetupClass.before_Class();
	}

	@AfterClass
	public static void afterClass() throws Exception {
		SetupClass.after_Class();
	}

}