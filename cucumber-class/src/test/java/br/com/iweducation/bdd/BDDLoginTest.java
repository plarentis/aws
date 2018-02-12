package br.com.iweducation.bdd;

import org.openqa.selenium.WebDriver;

import br.com.iweducation.utils.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BDDLoginTest {

	private WebDriver driver;
	
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() {

		driver = DriverFactory.open();
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
	
	
	}

	@When("^user enters correct username and password$")
	public void user_enters_correct_username_and_password() {
		System.out.println("foi");
	}

	@Then("^user gets confirmation$")
	public void user_gets_confirmation() {
		System.out.println("foi");
	}

}
