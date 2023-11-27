package stepdefinitions_Toolshop;

import org.openqa.selenium.WebDriver;

import driverFactory.Setupdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Price_PF;


public class Price_SD {
	
}

	/*public Price_PF pricebar; 
	WebDriver driver = Setupdriver.Driver();
	
	@Given("User is on the price slider bar")
	public void user_is_on_the_price_slider_bar() {
		
		Setupdriver.Driver();	
		Setupdriver.OpenPage("https://practicesoftwaretesting.com/#/");
		 
		pricebar = new Price_PF (driver);
		 pricebar.chk_enable();	
	}

	@When("user moves the slider to the middle position")
	public void user_moves_the_slider_to_the_middle_position() {
		 
		//pricebar = new Price_PF(Setupdriver.Driver());
		pricebar.chk_middle();
	}

	@Then("Slider value should be {int}% and Slider pointer should be in the middle position")
	public void slider_value_should_be_and_slider_pointer_should_be_in_the_middle_position(Integer int1) {
		
		pricebar.chk_middle();
		System.out.println("SLIDER POSITION:PRICE SLIDES TO THE MIDDLE RANGE");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

	@When("user moves the slider to the min position")
	public void user_moves_the_slider_to_the_min_position() {
		
		//pricebar = new Price_PF(Setupdriver.Driver());
	    pricebar.chk_min();
	}

	@Then("Slider value should be {int}% and Slider pointer should be in the leftmost position")
	public void slider_value_should_be_and_slider_pointer_should_be_in_the_leftmost_position(Integer int1) {
		
		pricebar.chk_min(); 
		System.out.println("SLIDER POSITION:PRICE SLIDES TO THE MIN RANGE");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("user moves the slider to the max position")
	public void user_moves_the_slider_to_the_max_position() {
		
		//pricebar = new Price_PF(Setupdriver.Driver());
	    pricebar.chk_max();
	}

	@Then("Slider value should be {int}% and Slider pointer should be in the rightmost position")
	public void slider_value_should_be_and_slider_pointer_should_be_in_the_rightmost_position(Integer int1) throws InterruptedException {
		
		pricebar.chk_max();
		  System.out.println("SLIDER POSITION:PRICE SLIDES TO THE MAX RANGE");
			//try {
				Thread.sleep(3000);
			//} catch (InterruptedException e) {
			//	e.printStackTrace();
			//} 
	}

	@When("user moves the slider to the specific position")
	public void user_moves_the_slider_to_the_specific_position() {
		
		//pricebar = new Price_PF(Setupdriver.Driver());
		pricebar.chk_specprice();
		
	}

	@Then("slider value shoud reflect the chosen position")
	public void slider_value_shoud_reflect_the_chosen_position() {
		
		pricebar.chk_specprice();
		 System.out.println("SLIDER POSITION:PRICE SLIDES TO THE MAX RANGE");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
	}


	
}
	
	/*@Given("User is on the price slider bar")
	public void user_is_on_the_price_slider_bar() {
		Setupdriver.Driver();	
		Setupdriver.OpenPage("https://practicesoftwaretesting.com/#/");
	}

	@When("user moves the slider to the middle position")
	public void user_moves_the_slider_to_the_middle_position() throws InterruptedException {
		 pricebar = new Price_PF(Setupdriver.Driver());
			pricebar.chk_middle();
			System.out.println("SLIDER POSITION:PRICE SLIDES TO THE MIDDLE RANGE");
			Thread.sleep(500);
			
	}
	
	@Then("Slider thumb should be in the middle position")
	public void slider_thumb_should_be_in_the_middle_position() {
	   
	}

	@Then("Slider value should be {int}%")
	public void slider_value_should_be(Integer int1) {
		try {
			pricebar.chk_middle();
		} catch (InterruptedException e) {
			System.out.println("Price bar is in not working ");
		}
		
	}

	@When("user moves the slider to the min position")
	public void user_moves_the_slider_to_the_min_position() throws InterruptedException {
		 pricebar = new Price_PF(Setupdriver.Driver());
		pricebar.chk_min();
		System.out.println("SLIDER POSITION:PRICE SLIDES TO THE MIN RANGE");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Price bar is in not working ");
		}
				
	}
	
	@Then("Slider thumb should be in the leftmost position")
	public void slider_thumb_should_be_in_the_leftmost_position() {
	    
	}

	///*@Then("Slider value should be {string}")
	public void slider_value_should_be(String string) {
	 
	}
//
	@When("user moves the slider to the max position")
	public void user_moves_the_slider_to_the_max_position() throws InterruptedException {
		pricebar = new Price_PF(Setupdriver.Driver());
		pricebar.chk_max();
		System.out.println("SLIDER POSITION:PRICE SLIDES TO THE MAX RANGE");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Price bar is in not working ");
		}
	}

	@When("user moves the slider to the specific position")
	public void user_moves_the_slider_to_the_specific_position() throws InterruptedException {
		pricebar = new Price_PF(Setupdriver.Driver());
		pricebar.chk_specprice();
		
	}

	@Then("slider value shoud reflect the chosen position")
	public void slider_value_shoud_reflect_the_chosen_position() throws InterruptedException {
		pricebar.chk_specprice();
		System.out.println("SLIDER POSITION:PRICE SLIDES TO THE SPECIFIC RANGE");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Price bar is in not working ");
		}
	}
	
	@Then("Slider thumb should be in the rightmost position")
	public void slider_thumb_should_be_in_the_rightmost_position() {
	    
	}


}
	
		
	/*@Given("User is on the price slider bar")
	public void user_is_on_the_price_slider_bar() {
		Setupdriver.Driver();	
		Setupdriver.OpenPage("https://practicesoftwaretesting.com/#/");
			
	}

	@When("user moves the slider to the middle position")
	public void user_moves_the_slider_to_the_middle_position() {
	    pricebar = new Price_PF(Setupdriver.Driver());
		pricebar.chk_middle();
	}

	@Then("Slider value should be {int}%")
	public void slider_value_should_be(Integer int1) {
	    
	}

	@When("user moves the slider to the min position")
	public void user_moves_the_slider_to_the_min_position() {
	   
	}

	@When("user moves the slider to the max position")
	public void user_moves_the_slider_to_the_max_position() {
	  
	}

	@When("user moves the slider to the specific position")
	public void user_moves_the_slider_to_the_specific_position() {
	    
	}

	@Then("slider value shoud reflect the chosen position")
	public void slider_value_shoud_reflect_the_chosen_position() {
	 
	}


	
}*/
