package stepdefinitions_Toolshop;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.languagetool.JLanguageTool;
import org.languagetool.Language;
import org.languagetool.rules.RuleMatch;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v116.page.Page;
import org.openqa.selenium.support.ui.Sleeper;

import driverFactory.Setupdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomepageHeader_PF;
import utilities.Context;
import utilities.LoggerLoad;
import java.net.HttpURLConnection;
import java.net.URL;
public class HomePageHeader_Toolshop {
	 HomepageHeader_PF home_pheader;
	Context context;
	public HomePageHeader_Toolshop(Context context) {
		this.context=context;
		home_pheader=context.getHome_pheader();
	}
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
	}
	
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
	}*/
	@Given("User launch the browser")
	public void user_launch_the_browser() throws InterruptedException {
		//Setupdriver.Driver();
		Context.Driver();
		Thread.sleep(2000);
	}

	@When("User gives the valid Toolshop URL")
	public void user_gives_the_valid_toolshop_ur_rl() {
		//Setupdriver.OpenPage("https://practicesoftwaretesting.com/#/");
		Context.OpenPage("https://practicesoftwaretesting.com/#/");
	}

	@Then("User should land on Home Page")
	public void user_should_land_on_home_page() {
		//String Homepage_Title = Setupdriver.GetTitle();
		String Homepage_Title = Context.GetTitle();
		assertEquals("Practice Software Testing - Toolshop - v5.0", Homepage_Title);
		
	}
	//Invalid URL
	@When("User gives the invalid Toolshop URL")
	public void user_gives_the_invalid_toolshop_url() throws InterruptedException {
		
		//LoggerLoad.info("browser");
	  Context.OpenPage("https://practicesoftwaretesting.com/home");
	}

	@Then("User should recieve {int} page not found error")
	public void user_should_recieve_page_not_found_error(Integer int1) {
	  // String Title = Setupdriver.GetTitle();
		 String Title = Context.GetTitle();
	   System.out.println(Title);
	   assertEquals(Title, "404 Not Found");
	  
	}
	//Bad request
	
	@When("User send the bad request")
	public void user_send_the_bad_request() {
		 Context.OpenPage("https://practicesoftwaretesting.com/%");
	}
	
	  @Then("HTTP response {int}")
	public void http_response(Integer int1) {
		 // String Title1 = Setupdriver.GetTitle();
		  String Title1 = Context.GetTitle();
		  System.out.println(Title1);
		  assertEquals(Title1, "400 Bad Request");;
		
		  
		  
		 

					
				/*	try {
						URL uri = new URL("https://practicesoftwaretesting.com/%");
						HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
						connection.setRequestMethod("HEAD"); // takes the URL;
						int responseCode = connection.getResponseCode();
						System.out.println(responseCode);
					} catch (IOException e) {
						
						e.printStackTrace();
					}*/
					
	}

	@Then("User should see correct spellings in all fields")
	public void user_should_see_correct_spellings_in_all_fields() {
	 // home_pheader= new HomepageHeader_PF(Setupdriver.Driver());
	  List<WebElement>elementstext=home_pheader.getText();
	  for(WebElement Text : elementstext) {
		  System.out.println(Text.getText());
		  
	  }
	 
	}
	
	@Then("User should see logo is properly aligned")
	public void user_should_see_logo_is_properly_aligned() {
		  //home_pheader= new HomepageHeader_PF(Setupdriver.Driver());

		boolean logovisible = home_pheader.checklogoexist();
		
		Assert.assertTrue(logovisible);
		/*if (logovisible) {
			System.out.println("Logo is visible");
		}else {
			System.out.println("Logo is not visible");
		}*/
	}
		

	@Then("User should see Home button")
	public void user_should_see_home_button() {
		//home_pheader= new HomepageHeader_PF(Setupdriver.Driver());
		boolean homebuttonvisible = home_pheader.checkhomebutton();
		if (homebuttonvisible) {
			System.out.println("Home button is visible");
		}else {
			System.out.println("Home button is not visible");
		}
	}
	@Then("User should able to click the Home button")
	public void user_should_able_to_click_the_home_button() {
	   boolean homeclickable = home_pheader.homeclickable();
	   Assert.assertTrue(homeclickable);
	}

	@Then("User should able to see Categories dropdown")
	public void user_should_able_to_see_categories_dropdown() {
	  boolean checkCategoriesBtn = home_pheader.checkCategoriesBtn();
	  Assert.assertTrue(checkCategoriesBtn);
	}

	@Then("User should able to click on Categories dropdown")
	public void user_should_able_to_click_on_categories_dropdown() {
	  boolean categoriesBtnClickable = home_pheader.categoriesBtnClickable();
	  Assert.assertTrue(categoriesBtnClickable);
	  
	  home_pheader.listElements();
	 
	}
   
	@Then("User should able to see Contact button")
	public void user_should_able_to_see_contact_button() {
	  boolean checkcontactBtn = home_pheader.contact();
	  Assert.assertTrue(checkcontactBtn);
	}

	@Then("User should able to click on Contact button")
	public void user_should_able_to_click_on_contact_button() {
	 boolean contactclickable = home_pheader.contactclickable();
	 Assert.assertTrue(contactclickable);
	}

	@Then("User should see Sign in button")
	public void user_should_see_sign_in_button() {
	 boolean checksigninBtn = home_pheader.signin();
	Assert.assertTrue(checksigninBtn);
	}

	@Then("User should able to click Sign in button")
	public void user_should_able_to_click_sign_in_button() {
	  boolean signinclickable = home_pheader.signinclickable();
	  Assert.assertTrue(signinclickable);
	}

	@Then("User should see image")
	public void user_should_see_image() {
	   boolean checktopimage = home_pheader.topimage();
	   Assert.assertTrue(checktopimage);
	}






}
