package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_PF {
@FindBy(linkText = "Register your account") WebElement register_account;
@FindBy(id = "first_name") WebElement firstname;	
	
	
	
	
	
	
	
	
	
	
	public  void register_clk() {
		register_account.click();
		
	}
}
