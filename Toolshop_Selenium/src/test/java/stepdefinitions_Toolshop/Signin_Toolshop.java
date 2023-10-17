package stepdefinitions_Toolshop;

import driverFactory.Setupdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Singin_PF;

public class Signin_Toolshop {
	public Singin_PF signin;
	
	@Given("User should open the browser")
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
	}
		
	}

