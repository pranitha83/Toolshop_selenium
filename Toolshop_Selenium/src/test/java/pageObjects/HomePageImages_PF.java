package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class HomePageImages_PF {

	public HomePageImages_PF(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//img[@class = \"card-img-top\"]")
	List<WebElement> images;
	@FindBy(xpath = "//h5[@class=\"card-title\"]")
	List<WebElement> imageLabel;
	@FindBy(xpath = "//span[@data-test=\"product-price\"]")
	List<WebElement> product_price;
	@FindBy(xpath = "//div[@class=\"card-footer\"]/span[@data-test=\"out-of-stock\"]")
	List<WebElement> imageFooter_stock;
	@FindBy(xpath = "//a[@class = \"card\"]")
	List<WebElement> entireImage;
	
	@FindBy(xpath = "//ul[@class=\"ngx-pagination responsive\"]/li")
	List<WebElement> pages;
	
	public List<WebElement> displayImages() {
		return images;
	}
	public List<WebElement> imageLables(){
		return imageLabel;
	}
	public List<WebElement> check_productPrice() {
		return product_price;
	}
	public List<WebElement> stock_availability() {
		return imageFooter_stock;
		
	}
	public List<WebElement> availability() {
		return entireImage;
		
	}
	public List<WebElement> page_Navigation() {
		return pages;
	}
	
}
