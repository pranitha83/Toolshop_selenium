package pageObjects;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class All_PF {
	
	//private Actions actions;

	public All_PF(WebDriver driver) {
		 
		//this.actions = new Actions(driver);

		PageFactory.initElements(driver, this);
		 
	}
	
	// Price Slider WebElement
	
	@FindBy(xpath = "//div/ngx-slider") WebElement sliderele;
	@FindBy (xpath = "//div/h4[2]") WebElement price_Enable;
	@FindBy(xpath = "//ngx-slider/span[5]") WebElement pricemin;
	@FindBy(xpath = "//ngx-slider/span[@aria-valuemax='200']") WebElement pricemax;
	@FindBy(xpath = "//ngx-slider/span[@aria-valuetext='100']") WebElement middle;
	@FindBy(xpath = "//ngx-slider/span[@aria-valuetext='158']") WebElement price137;
	
	//Sort button WebElement
	
	@FindBy(xpath = "//*[text()=' Sort']") WebElement sort;
	@FindBy(xpath = "//div/select[1]" ) WebElement sortenabled;
	@FindBy(xpath = "//*[text()='Name (A - Z)']") WebElement a_z;
	@FindBy(xpath = "//*[text()='Name (Z - A)']") WebElement z_a;
	//@FindBy(xpath = "//*[text()='Price (High - Low)']") WebElement price_High;
	@FindBy(xpath = "//select/option[@value ='price,desc']") WebElement price_High;
	//@FindBy(xpath = "//select/option[4]") WebElement price_High;
	//@FindBy(xpath = "//select/option[5]") WebElement price_low;
	//@FindBy(xpath = "//select/option[@value ='price,asc']") WebElement price_low;
	@FindBy(xpath = "//*[text()='Price (Low - High)']") WebElement price_low;
	@FindBy(className = "card-title") List<WebElement> imagetext;
	
	//Search Button
	
	@FindBy(xpath = "//div/input[@type='text']") WebElement searchbox;
	@FindBy(xpath = "//div/button[2]") WebElement serachbtn;
	@FindBy(xpath = "//div/button[@type='reset']") WebElement searchX;	
	

	public void chk_enable() {
		price_Enable.click();
		
	}
	public String chk_min()  {
		pricemin.click();
		return pricemin.getText();
		}
	
	public String chk_max() {
		pricemax.click();
		return pricemax.getText();
	}
	
	public String chk_middle()  {
		middle.click();
		return middle.getText();
	}
	
	public String chk_specprice()  {
		price137.click();
		return price137.getText();
	}

		// Sort button Validation

public void chk_sort() {
sort.click();
}
public void chk_sortenabled() {
sortenabled.click();
}
public void clk_a_z() {
a_z.click();
}

public List<WebElement> chk_imgtxt() {
return imagetext;
}

public void clk_z_a() {
z_a.click();
}
public void clk_highLow() {
price_High.click();
}
public void clk_lowHigh() {
price_low.click();
}

public String sliderelement() {
	return sliderele.getAttribute("aria-valuenow");
    
       
}

public String getCurrentMinPrice() {
    return pricemin.getText();
}

public String getCurrentMaxPrice() {
    return pricemax.getText();
}


//Search button Validation

public void chk_search() {
	searchbox.click();
	
}
public void entertoolname(String name) {
	searchbox.sendKeys(name);
	
}

public String displaymsg() {
	
	String msg = null;
	String value = searchbox.getAttribute("Searchbox");
	if(value.equalsIgnoreCase("true"))
	{
		msg = "No results found.";
	}
	return msg;
	
}

public void chk_Sbtn() {
	serachbtn.click();
	
}

public void chk_clear() {
	searchX.click();	
	
}
public boolean homeclickable() {
	return false;
}
public boolean homeenable() {
	return false;
	
}


}
	
	
	
	

