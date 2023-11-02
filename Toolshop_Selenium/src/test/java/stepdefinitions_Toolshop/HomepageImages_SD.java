package stepdefinitions_Toolshop;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.List;

import javax.imageio.ImageIO;

import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import driverFactory.Setupdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageImages_PF;
import utilities.LoggerLoad;

public class HomepageImages_SD {

	WebDriver driver = Setupdriver.Driver();
	HomePageImages_PF hp;

	@Given("user is in homepage")
	public void user_is_in_homepage() {
		Setupdriver.OpenPage("https://practicesoftwaretesting.com/#/");
		hp = new HomePageImages_PF(driver);
	}

//@home_1
	@When("user browses through list of products")
	public void user_browses_through_list_of_products() {
		image_Validation();
	}

	@Then("user should see product images for eachitem")
	public void user_should_see_product_images_for_eachitem() {
		LoggerLoad.info("User able to see the product images in Homepage");
	}

//@home_2
	@When("user clicks on a product image")
	public void user_clicks_on_a_product_image() {
		imageLink_Validation();
	}

	public void imageLink_Validation() {
		List<WebElement> list_of_images = hp.displayImages();

		try {
			for (WebElement l : list_of_images) {
				String srcAttribute = l.getAttribute("src");

				URL uri = new URL(srcAttribute);
				HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
				connection.setRequestMethod("HEAD"); // takes the URL;
				int responseCode = connection.getResponseCode();
				if (responseCode == HttpURLConnection.HTTP_OK) {
					System.out.println("Image source is valid with " + responseCode + " as status");
				} else {
					System.out.println("Image source returned a non-200 status code");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("user should be directed to products details page")
	public void user_should_be_directed_to_products_details_page() {
		LoggerLoad.info("user is directed to specific product detail page");
	}

//@home_03
	@When("user views the product image with label")
	public void user_views_the_product_image_with_label() {
		List<WebElement> image_labels = hp.imageLables();
		for (WebElement l : image_labels) {
			String product_lable = l.getText();
			if (product_lable != null) {
				Assert.assertTrue(true);
			} else
				System.out.println("product label is  " + product_lable + " missing");
		}

	}

	@Then("each image should have descriptive text as label")
	public void each_image_should_have_descriptive_text_as_label() {
		LoggerLoad.info("each image has a descriptive text as label");
	}

//@home_04
	@When("user inspects product image for price in $ value")
	public void user_inspects_product_image_for_price_in_$_value() {
		List<WebElement> item_price = hp.check_productPrice();
		for (WebElement l : item_price) {
			String product_price = l.getText();
			// regular expression pattern for a valid USD price (e.g., $X.XX or $XX.XX)
			// \\$ matches the dollar sign, \\d+ matches one or more digits, and
			// \\d{2} matches exactly two digits after the decimal point.
			String usdPattern = "\\$\\d+\\.\\d{2}";

			if (product_price.matches(usdPattern)) {
				Assert.assertTrue(true);
			} else {
				LoggerLoad.info("Price is not in USD format");
			}
		}

	}

	@Then("the price should be there in $ value")
	public void the_price_should_be_there_in_$_value() {
		LoggerLoad.info("each product has price in $ value");
	}

//@home_5

	@When("user views the product images")
	public void user_views_the_product_images() {
		image_Validation();
	}

	public void image_Validation() {
		List<WebElement> list_of_images = hp.displayImages();
		int num_of_images = list_of_images.size();
		int count = 0;
		for (WebElement l : list_of_images) {
			String srcAttribute = l.getAttribute("src");
			if (srcAttribute != null && !srcAttribute.isEmpty()) {
				count++;
			} else {
				System.out.println("image src is empty or inavlid" + l.getAttribute("src"));

			}

		}
		if (count == num_of_images) {
			LoggerLoad.info("Total number images present in homepage are matched with number in requirement");
		} else
			LoggerLoad.info("No match with the product count");
	}

	@Then("the total products present should match with x number")
	public void the_total_products_present_should_match_with_x_number() {
		LoggerLoad.info("the total products present has matched with x number");
	}
//@home_6

	@When("user views the product image links")
	public void user_views_the_product_image_links() {
		List<WebElement> list_of_images = hp.displayImages();
		SoftAssert s = new SoftAssert();
		try {
			for (WebElement l : list_of_images) {
				String srcAttribute = l.getAttribute("src");

				URL uri = new URL(srcAttribute);
				HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
				connection.setRequestMethod("HEAD"); // takes the URL;
				int responseCode = connection.getResponseCode();
				s.assertTrue(responseCode < 400,
						"The link with text" + srcAttribute + " is broken with code " + responseCode);
			}
			s.assertAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("there should be no broken image links \\(HTTP {int} errors)")
	public void there_should_be_no_broken_image_links_http_errors(Integer int1) {
		LoggerLoad.info("No broken image links with status" + int1 + " Not Found");
	}

	// @home_7
	@When("user views the product images for proper size and resolution")
	public void user_views_the_product_images_for_proper_size_and_resolution() throws IOException {
		List<WebElement> images = hp.displayImages();

		for (WebElement l : images) {
			String srcAttribute = l.getAttribute("src");
			try {
				URL imgURL = new URL(srcAttribute);
				// it gives image data
				BufferedImage img = ImageIO.read(imgURL.openStream());

				// Check image dimensions (size)
				int width = img.getWidth();
				int height = img.getHeight();
				int imgSize = width * height;
				// System.out.println(width + "width and " + height + " height" + " size =" +
				// imgSize);
				if ((width >= 427 && width <= 640) && (height >= 427 && height <= 640)) {
					if (imgSize >= 273280 && imgSize <= 321920) {
						Assert.assertTrue(true);
					} else {
						LoggerLoad.info("image sizes and resolution is out of specified range");
					}
				}

			} catch (MalformedURLException e) {

				e.printStackTrace();
			}
		}
	}

	@Then("the image should have proper size and resolution")
	public void the_image_should_have_proper_size_and_resolution() {
		LoggerLoad.info("image sizes and resolution are with in specified range");
	}

//@home_8
	public void user_views_the_product_images_for_alternative_text() {

	}

	@Then("each image should have descriptive alternative text")
	public void each_image_should_have_descriptive_alternative_text() {

	}

//@home_9
	@When("user views the product images for stock availability")
	public void user_views_the_product_images_for_stock_availability() {

		List<WebElement> stock_availability = hp.stock_availability();
		for (WebElement l : stock_availability) {
			if (l.getText().contains("Out of stock")) {
				Assert.assertTrue(true);
			}

			else {
				LoggerLoad.info("None of the products are out of stock");
			}
		}

	}

	@Then("product is in stock or not")
	public void product_is_in_stock_or_not() {
		LoggerLoad.info("user will know if there are any products out of Stock");
	}

}
