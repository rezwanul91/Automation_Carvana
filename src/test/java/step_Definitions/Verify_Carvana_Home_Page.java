package step_Definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Carvana_Home_Page extends Base{

	@Given("I am in landing page")
	public void i_am_in_landing_page() throws InterruptedException {
		Thread.sleep(000);
		navigateUrl("https://www.carvana.com/");
	}

	@When("I click in sign in menu")
	public void i_click_in_sign_in_menu() throws InterruptedException {
		Thread.sleep(2000);
		click(By.xpath("//div[@class=\"Account__SignInWrapper-sc-9sbd5p-0 dVhVkI\"]/div/a"));
	}
	

	@Then("I enter email id rezwanul0091@gmail.com")
	public void i_enter_email_id_rezwanul0091_gmail_com() throws InterruptedException {
		Thread.sleep(2000);
		sendkeys(By.id("email"), "rezwanul0091@gmail.com");
	}
	
	@Then("I click in continue button and Input password")
	public void i_click_in_continue_button_and_input_password() throws InterruptedException {
		click(By.xpath("//button[text()='Continue']"));
		Thread.sleep(2000);
		sendkeys(By.id("password"), "C@rvana2023$");
	}

	@Then("I click in sign in button")
	public void i_click_in_sign_in_button() throws InterruptedException {
		Thread.sleep(2000);
		click(By.xpath("//button[text()='Sign In']"));
	}

	@Then("I verify that i am in home page")
	public void i_verify_that_i_am_in_home_page() throws InterruptedException {
		Thread.sleep(2000);
		String actual = getElementText(By.xpath("//span[text()='Trucks']"));
		assertEquals("Trucks", actual);
	}
	
	

}// class
