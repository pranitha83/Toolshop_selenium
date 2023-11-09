package pageObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sortbutton_PF {
	
}
	
	/*public Sortbutton_PF(WebDriver webdriver) {
		 PageFactory.initElements(webdriver, this);
		 
	}
	
	@FindBy(xpath = "//*[text()=' Sort']") WebElement sort;
	@FindBy(xpath = "//div/select[1]" ) WebElement sortenabled;
	@FindBy(xpath = "//*[text()='Name (A - Z)']") WebElement a_z;
	@FindBy(xpath = "//*[text()='Name (Z - A)']") WebElement z_a;
	@FindBy(xpath = "//select/option[4]") WebElement price_High;
	@FindBy(xpath = "//select/option[5]") WebElement price_low;
	@FindBy(className = "card-title") List<WebElement> imagetext;
	
	
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

}

/*public void asserts(){
	List<WebElement> toolimages = driver.findelements(By.tagName("a"));
	List<String> orgimageorder = new ArrayList<String>();
	List<String> sortimageorder = new ArrayList<String>();
	
	for (WebElement toolcurrentimage:toolimages) {
		orgimageorder.add(toolcurrentimage.getAttribute("src"));
	}
	sortimageorder.addAll(orgimageorder);
	Collections.sort(sortimageorder);
	if(orgimageorder.equals(sortimageorder)) {
		System.out.println("Images are sorted correctly");
	}
	}*/

