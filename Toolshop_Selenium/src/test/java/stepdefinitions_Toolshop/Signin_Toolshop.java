package stepdefinitions_Toolshop;

import driverFactory.Setupdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Singin_PF;

public class Signin_Toolshop {
	public Singin_PF signin;
	
	/*@Given("User should open the browser")
	public void user_should_open_the_browser() {
		Setupdriver.Driver();
	    
	}

	@When("User able to open Toolshop web page")
	public void user_able_to_open_toolshop_web_page() {
	   Setupdriver.OpenPage("https://practicesoftwaretesting.com/#/");
	}

	@Then("User able to signin")
	public void user_able_to_signin() {
	   signin = new Singin_PF(Setupdriver.Driver());
		signin.clk_signin();
	}*/
	
	@Given("user lauch the browser")
	public void user_lauch_the_browser() {
		Setupdriver.Driver();
	}

	@When("user gives correct Toolshop UrRL")
	public void user_gives_correct_toolshop_ur_rl() {
		 Setupdriver.OpenPage("https://practicesoftwaretesting.com/#/");
	}

	@When("user navigate to homepage")
	public void user_navigate_to_homepage() {
	    Setupdriver.GetTitle();
	}

	@Then("user click on signin button")
	public void user_click_on_signin_button() {
		signin = new Singin_PF(Setupdriver.Driver());
		signin.clk_signin();
	}
		
	}

