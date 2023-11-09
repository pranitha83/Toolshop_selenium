package stepdefinitions_Toolshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.core.config.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverFactory.Setupdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Sortbutton_PF;

public class Sortbutton_SD {
	public Sortbutton_PF sortbutton;
}
	

	/*@Given("user is in the home page")
	public void user_is_in_the_home_page() {
		Setupdriver.Driver();	
		Setupdriver.OpenPage("https://practicesoftwaretesting.com/#/");
			}

	@When("user validate the sort is enabled")
	public void user_validate_the_sort_is_enabled() {
		sortbutton = new Sortbutton_PF(Setupdriver.Driver());
	    sortbutton.chk_sort();
	}

	@Then("User should see sort dropdown")
	public void user_should_see_sort_dropdown() {
	   sortbutton.chk_sortenabled();
	}

	@When("user validate the sort dropdown is enabled")
	public void user_validate_the_sort_dropdown_is_enabled() {
		sortbutton = new Sortbutton_PF(Setupdriver.Driver());
		sortbutton.chk_sortenabled();
	}

	@Then("User should able to click sort dropdown")
	public void user_should_able_to_click_sort_dropdown() throws InterruptedException {
		 sortbutton.chk_sortenabled();
		 Thread.sleep(500);
	}
	
	
	@When("user clicks on {string} in sort dropdown")
	public void user_clicks_on_in_sort_dropdown(String dropdown) throws InterruptedException {
		sortbutton = new Sortbutton_PF(Setupdriver.Driver());
		
		if(dropdown.equals("sort(A-Z)")) {
			sortbutton.clk_a_z();
			Thread.sleep(1000);;		
		}
	
		else if (dropdown.equals("sort(Z-A)")) {
			sortbutton.clk_z_a();
			Thread.sleep(1000);;	
		}
		
		else if(dropdown.equals("sort(High-low)")) {
			sortbutton.clk_highLow();
			Thread.sleep(1000);
		}
		else if (dropdown.equals("sort(Low-High")) {
			sortbutton.clk_lowHigh();
			Thread.sleep(1000);
		}
	}
	@Then("user able to view tools images in {string}")
	public void user_able_to_view_tools_images_in(String sortorder) throws InterruptedException {
	   
		
		List<WebElement>imagetexts = sortbutton.chk_imgtxt();
		List<String> imageTextvalues = new ArrayList<>();
		
		for(WebElement text:imagetexts) {
			imageTextvalues.add(text.getText());
		}
		if(sortorder.equals("A-Z")) {
			Collections.sort(imageTextvalues);
			Thread.sleep(500);
		}
		else if(sortorder.equals("Z-A")) {
			Collections.sort(imageTextvalues);
			Thread.sleep(500);
		}
		
		else if (sortorder.equals("High-Low")) {
			Collections.sort(imageTextvalues);
			Thread.sleep(500);	
		}
		else if (sortorder.equals("Low-High")) {
			Collections.sort(imageTextvalues);
			Thread.sleep(500);	
		}
		for (String elements:imageTextvalues) {
			Thread.sleep(500);
			System.out.println(elements);
		}
		
	}
}	
	
	
/*
	/*@When("user clicks on Name\\(A-Z) in sort dropdown")
	public void user_clicks_on_name_a_z_in_sort_dropdown() {
		sortbutton = new Sortbutton_PF(Setupdriver.Driver());
	   sortbutton.clk_a_z();
	  List<WebElement>pdtnames = sortbutton.chk_imgtxt();
	    for(WebElement imagetext : pdtnames) {
	    	System.out.println(imagetext.getText());
	    }
	

	@Then("user able to view tools images in the alphabetical order")
	public void user_able_to_view_tools_images_in_the_alphabetical_order() {
		
	}
		/*sortbutton = new Sortbutton_PF(Setupdriver.Driver());
		sortbutton.chk_imgtxt();
		
		/*List<WebElement>pdtnames = sortbutton.chk_imgtxt();
		//List<WebElement> toolimages = driver.findelements(By.tagName("a"));
		List<String> orgimageorder = new ArrayList<String>();
		List<String> sortimageorder = new ArrayList<String>();
		
		for (WebElement toolcurrentimage:pdtnames) {
			orgimageorder.add(toolcurrentimage.getAttribute("src"));
		}
		sortimageorder.addAll(orgimageorder);
		Collections.sort(sortimageorder);
		if(orgimageorder.equals(sortimageorder)) {
			System.out.println("A-Z images are:");
		}
		
	    /*List<WebElement>pdtnames = sortbutton.chk_imgtxt();
	    for(WebElement imagetext : pdtnames) {
	    	System.out.println(imagetext.getText());
	    }
	    
	}
	
	/*List<WebElement>elementstext=home_pheader.getText();
	  for(WebElement Text : elementstext) {
		  System.out.println(Text.getText());
	  }*/

	/*@When("user clicks on Name\\(Z-A) in sort dropdown")
	public void user_clicks_on_name_z_a_in_sort_dropdown() {
		sortbutton = new Sortbutton_PF(Setupdriver.Driver());
	    sortbutton.clk_z_a();
	}

	@Then("user able to view tools images in the reverse alphabetical order")
	public void user_able_to_view_tools_images_in_the_reverse_alphabetical_order() {
		//sortbutton.asserts();
	}

	@When("user clicks on price \\(High-Low) in sort dropdown")
	public void user_clicks_on_price_high_low_in_sort_dropdown() {
		sortbutton = new Sortbutton_PF(Setupdriver.Driver());
	sortbutton.clk_highLow();
	}

	@Then("user able to view tools images with price High to low")
	public void user_able_to_view_tools_images_with_price_high_to_low() {
		//sortbutton.asserts();
	 
	}
	@When("user clicks on price \\(Low-High) in sort dropdown")
	public void user_clicks_on_price_low_high_in_sort_dropdown() {
		sortbutton = new Sortbutton_PF(Setupdriver.Driver());
		sortbutton.clk_lowHigh();
	}

	@Then("user able to view tools images with Low to High")
	public void user_able_to_view_tools_images_with_low_to_high() {
		//sortbutton.asserts();
	}*/

	

