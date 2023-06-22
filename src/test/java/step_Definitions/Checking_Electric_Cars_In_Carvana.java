package step_Definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checking_Electric_Cars_In_Carvana extends Base{
	
	@Given("I am in The Carvana Landing Page")
	public void i_am_in_the_carvana_landing_page() throws InterruptedException {
		Thread.sleep(2000);
		navigateUrl("https://www.carvana.com");
	}

	@When("I Click in SignIn Menu")
	public void i_click_in_sign_in_menu() throws InterruptedException {
		Thread.sleep(3000);
		click(By.xpath("//div[@class=\"Account__SignInWrapper-sc-9sbd5p-0 dVhVkI\"]/div/a"));
	}

	@Then("I Insert EmailId")
	public void i_insert_email_id() throws InterruptedException {
		Thread.sleep(3000);
		sendkeys(By.id("email"), "rezwanul0091@gmail.com");
	}

	@Then("I Click In The Continue Button")
	public void i_click_in_the_continue_button() throws InterruptedException {
		click(By.xpath("//button[text()='Continue']"));
		Thread.sleep(3000);
		sendkeys(By.id("password"), "C@rvana2023$");
	}

	@Then("I Click In The SignIn Button")
	public void i_click_in_the_sign_in_button() throws InterruptedException {
		Thread.sleep(3000);
		click(By.xpath("//button[text()='Sign In']"));
	}

	@Then("I Click Electic Cars Menu")
	public void i_click_electic_cars_menu() throws InterruptedException {
		Thread.sleep(3000);
	    click(By.xpath("//a[@href='/cars/electric']"));
	}
	
	@Then("Click In The {int} Hyundai Ioniq")
	public void click_in_the_hyundai_ioniq(Integer int1) throws InterruptedException {
	    Thread.sleep(3000);
	    sendkeys(By.xpath("//input[@class='react-autosuggest__input']"), "2019 Hyundai Ioniq");
	}
	
	@Then("Click Go Button")
	public void click_go_button() {
	   click(By.xpath("//div[@id='react-autowhatever-1']//following::button[1]"));
	}
	
	@Then("I verify that i am in right page")
	public void i_verify_that_i_am_in_right_page() {
	    String s = getElementText(By.xpath("//div[@class='SearchHeaderstyles__SearchTitleWrapper-sc-1wbj0et-0 iSKIpf']/h1"));
	    assertEquals("USED CARS", s);
	}
}//class
