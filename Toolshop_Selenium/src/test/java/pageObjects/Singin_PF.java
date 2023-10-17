package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Singin_PF {
@FindBy(xpath = "//*[text()='Sign in']") WebElement Signin;

 
public Singin_PF(WebDriver webdriver) {
	 PageFactory.initElements(webdriver, this);
}
	

public  void clk_signin() {
	Signin.click();
	
}

}

