package step_Definitions;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Verify_Customer_Login_Functionalities extends Base{
	@Given("I am in the landing page")
	public void i_am_in_the_landing_page() throws InterruptedException {
		Thread.sleep(2000);
		navigateUrl("http://it.microtechlimited.com");
	}

	@When("I click in the Login menu")
	public void i_click_in_the_login_menu() throws InterruptedException {
		Thread.sleep(2000);
	   click(By.linkText("LOG IN"));
	}

	@Then("I click in the Customer Login menu")
	public void i_click_in_the_customer_login_menu() throws InterruptedException {
		Thread.sleep(2000);
		click(By.xpath("//a[@href='clogin.php']"));
	}

	@Then("I enter the UserId david@gmail.com")
	public void i_enter_the_user_id_david_gmail_com() throws InterruptedException {
		Thread.sleep(2000);
	    sendkeys(By.xpath("//input[@name='mailuid']"), "david@gmail.com");
	}

	@Then("I enter the password {int}")
	public void i_enter_the_password(Integer int1) {
	    sendkeys(By.xpath("//input[@name='pwd']"),"1234");
	}

	@Then("I click in the login button")
	public void i_click_in_the_login_button() {
		 click(By.name("login-submit"));
		
	}

	@Then("I verify that i am in the home page")
	public void i_verify_that_i_am_in_the_home_page() {
		String s = getElementText(By.xpath("//h2[text()='Welcome David']"));
		assertEquals("Welcome David", s);
		
	}



}//class
