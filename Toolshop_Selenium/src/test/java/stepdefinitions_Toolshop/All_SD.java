package stepdefinitions_Toolshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverFactory.Setupdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.All_PF;


public class All_SD {
		
	
	public All_PF Homepage;
	WebDriver driver = Setupdriver.Driver();
	
	// Sort button validation

	@Given("user is in the home page")
	public void user_is_in_the_home_page() {
		Setupdriver.Driver();	
		Setupdriver.OpenPage("https://practicesoftwaretesting.com/#/");
		Homepage = new All_PF (driver);
			}

	@When("user validate the sort is enabled")
	public void user_validate_the_sort_is_enabled() {
		boolean homeclickable = Homepage.homeclickable();
		Assert.assertTrue(homeclickable);
		Homepage.chk_sort();
	}

	@Then("User should see sort dropdown")
	public void user_should_see_sort_dropdown() {
		Homepage.chk_sortenabled();
	}

	@When("user validate the sort dropdown is enabled")
	public void user_validate_the_sort_dropdown_is_enabled() {
		Homepage.chk_sortenabled();
	}

	@Then("User should able to click sort dropdown")
	public void user_should_able_to_click_sort_dropdown() throws InterruptedException {
		Homepage.chk_sortenabled();
		 Thread.sleep(1000);
	}

	@When("user clicks on {string} in sort dropdown")
	public void user_clicks_on_in_sort_dropdown(String dropdown) throws InterruptedException {
		
		Homepage.chk_sortenabled();
		
		if(dropdown.equals("sort(A-Z)")) {
			Homepage.clk_a_z();
			Thread.sleep(1000);;		
		}

		else if (dropdown.equals("sort(Z-A)")) {
			Homepage.clk_z_a();
			Thread.sleep(1000);;	
		}
		
		else if(dropdown.equals("sort(High-Low)")) {
			Homepage.clk_highLow();
			Thread.sleep(1000);
		}
		else if (dropdown.equals("sort(Low-High)")) {
			Homepage.clk_lowHigh();
			Thread.sleep(1000);
		}
	}
	@Then("user able to view tools images in {string}")
	public void user_able_to_view_tools_images_in(String sortorder) throws InterruptedException {
	   
		
		List<WebElement>imagetexts = Homepage.chk_imgtxt();
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
		
		else if (sortorder.equals("(High-Low)")) {
			Collections.sort(imageTextvalues);
			Thread.sleep(500);	
		}
		else if (sortorder.equals("(Low-High)")) {
			Collections.sort(imageTextvalues);
			Thread.sleep(500);	
		}
		for (String elements:imageTextvalues) {
			Thread.sleep(500);
			System.out.println(elements);
		}
		
	}
	
	//Price slider Validation
	
	@Given("User is on the price slider bar")
	public void user_is_on_the_price_slider_bar() {
		Homepage = new All_PF (driver);
		Homepage.chk_enable();	
	}
	
	@When("user moves the slider to the middle position")
	public void user_moves_the_slider_to_the_middle_position() {
		 
		Homepage.chk_middle();
	}

	@Then("Slider value should be {int}% and Slider pointer should be in the middle position")
	public void slider_value_should_be_and_slider_pointer_should_be_in_the_middle_position(Integer int1) {
		
		/*Homepage.chk_middle();
		 Actions builder = new Actions(driver);
		 int sliderele = Integer.parseInt(Homepage.sliderelement()) ;
		 int sliderWidth = Homepage.sliderele.getSize().getWidth();
		 int xOffset = (int) (sliderWidth * (minPrice / 250));
		 builder.clickAndHold(sliderele).moveByOffset(xOffset, 0).release().perform();
		System.out.println("SLIDER POSITION:PRICE SLIDES TO THE MIDDLE RANGE");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
				
	}

	@When("user moves the slider to the min position")
	public void user_moves_the_slider_to_the_min_position() {
		
		Homepage.chk_min();
	}

	@Then("Slider value should be {int}% and Slider pointer should be in the leftmost position")
	public void slider_value_should_be_and_slider_pointer_should_be_in_the_leftmost_position(Integer int1) {
		
		Homepage.chk_min(); 
		System.out.println("SLIDER POSITION:PRICE SLIDES TO THE MIN RANGE");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("user moves the slider to the max position")
	public void user_moves_the_slider_to_the_max_position() {
		
		Homepage.chk_max();
	}

	@Then("Slider value should be {int}% and Slider pointer should be in the rightmost position")
	public void slider_value_should_be_and_slider_pointer_should_be_in_the_rightmost_position(Integer int1) throws InterruptedException {
		
		Homepage.chk_max();
		  System.out.println("SLIDER POSITION:PRICE SLIDES TO THE MAX RANGE");
			//try {
				Thread.sleep(3000);
			//} catch (InterruptedException e) {
			//	e.printStackTrace();
			//} 
	}

	@When("user moves the slider to the specific position")
	public void user_moves_the_slider_to_the_specific_position() {
		
		Homepage.chk_specprice();
		
	}

	@Then("slider value shoud reflect the chosen position")
	public void slider_value_shoud_reflect_the_chosen_position() {
		
		Homepage.chk_specprice();
		 System.out.println("SLIDER POSITION:PRICE SLIDES TO THE MAX RANGE");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
	}
	
	//Search Bar Validation

@When("user validate the search bar")
public void user_validate_the_search_bar() {
	boolean homeclickable = Homepage.homeclickable();
	Assert.assertTrue(homeclickable);
	Homepage.chk_search();
}

@Then("user validate the search button")
public void user_validate_the_search_button() {
  boolean homeenable = Homepage.homeenable();
  Assert.assertTrue(homeenable);
  Homepage.chk_Sbtn();
}

@When("user validate the search bar is enabled")
public void user_validate_the_search_bar_is_enabled() {
		  boolean homeenable = Homepage.homeenable();
		  Assert.assertTrue(homeenable);
		  Homepage.chk_search();
}

@Then("user validate the search button is clickable")
public void user_validate_the_search_button_is_clickable() {
    boolean homeclickable = Homepage.homeclickable();
    Assert.assertTrue(homeclickable);
    Homepage.chk_Sbtn();
}

@When("user enter common tool name without specifications and clicks the search button")
public void user_enter_common_tool_name_without_specifications_and_clicks_the_search_button(io.cucumber.datatable.DataTable dataTable) {
    List<String> toolname = dataTable.asList(String.class);
    Homepage.entertoolname(toolname.get(1));
    Homepage.chk_Sbtn();
    
}

@Then("displays the tools related to the search")
public void displays_the_tools_related_to_the_search() {
	
    
}

@When("user enter the specific tool name and clicks the search button")
public void user_enter_the_specific_tool_name_and_clicks_the_search_button(io.cucumber.datatable.DataTable dataTable) {
	List<String> spctoolname = dataTable.asList(String.class);
	Homepage.entertoolname(spctoolname.get(1));
	Homepage.chk_Sbtn();
    
}

@Then("displays the exact tools that have been searched with \\({string}) imagetext")
public void displays_the_exact_tools_that_have_been_searched_with_imagetext(String string) {
    
}

@When("user enters an invalid name in the search bar and clicks the search button")
public void user_enters_an_invalid_name_in_the_search_bar_and_clicks_the_search_button(io.cucumber.datatable.DataTable dataTable) {
	List<String> invalidtoolname = dataTable.asList(String.class);
	Homepage.entertoolname(invalidtoolname.get(1));
	Homepage.chk_Sbtn();
    
}

@Then("displays empty details with \\({string})")
public void displays_empty_details_with(String string) {

}

@When("user click on {string} in the search bar")
public void user_click_on_in_the_search_bar(String string) {
   Homepage.chk_clear();
}

@Then("displays all the general tools images")
public void displays_all_the_general_tools_images() throws InterruptedException {
 

	List<WebElement>imagetexts = Homepage.chk_imgtxt();
	List<String> imageTextvalues = new ArrayList<>();
	
	for (String elements:imageTextvalues) {
		Thread.sleep(500);
		System.out.println(elements);
	}
	
}

}

/*@Then("User should able to click the Home button")
public void user_should_able_to_click_the_home_button() {
   boolean homeclickable = home_pheader.homeclickable();
   Assert.assertTrue(homeclickable);
}*/
