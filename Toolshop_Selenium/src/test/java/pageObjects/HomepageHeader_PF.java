package pageObjects;

import org.languagetool.JLanguageTool;
import org.languagetool.rules.RuleMatch;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.swabunga.spell.engine.SpellDictionaryHashMap;
import java.util.ArrayList;

import com.swabunga.spell.event.SpellCheckEvent;
import com.swabunga.spell.event.TeXWordFinder;

import java.io.IOException;
import java.util.List;


public class HomepageHeader_PF {
    @FindBy(xpath = "//*[text()='Sign in']") WebElement Signin;
    @FindBy(tagName = "a") List<WebElement> Text;
    @FindBy(id = "Layer_1") WebElement Logo;
    @FindBy(xpath = "//*[text()='Home']") WebElement Homebutton;
    @FindBy(xpath = "//*[text()=' Categories ']") WebElement CategoriesBtn;
    @FindBy (xpath = "//*[contains(@class,'dropdown-item')]")List<WebElement> values;
    @FindBy(linkText = "Contact") WebElement contact;
    @FindBy(linkText = "Sign in") WebElement signin;
    @FindBy(xpath = "//*[contains(@class,'img-fluid')]") WebElement topimage;

    WebDriver driver;

    public HomepageHeader_PF(WebDriver webdriver) {
        this.driver = webdriver;
        PageFactory.initElements(webdriver, this);
    }

    public void clickSignIn() {
      
    }

  
       	 
      
    // Method to retrieve the entire page text
       public List<WebElement>getText() {
          
       return Text;
         
       }
  
	public boolean checklogoexist() {
		return Logo.isDisplayed();
	}

     public boolean checkhomebutton() {
    	 return Homebutton.isDisplayed();
     }
      public boolean homeclickable(){
    	  return Homebutton.isEnabled();
      }
      
      public boolean checkCategoriesBtn() {
		      return CategoriesBtn.isDisplayed();
}
      public boolean categoriesBtnClickable() {
    	  return CategoriesBtn.isEnabled();
    	  
      }
      public void listElements() {
    	  CategoriesBtn.click();
    	  System.out.println(values.size());
    		  for (int i=0;i<values.size();i++) {
    			  System.out.println(values.get(i).getText());
    	  }
    	 
    	  
    	    }
      public boolean contact()
      {
    	  return contact.isDisplayed();
      }
      public boolean contactclickable() {
    	   return contact.isEnabled();
      }
      
      public boolean signin() {
    	  return signin.isDisplayed();
      }
      
      public boolean signinclickable() {
    	  return signin.isEnabled();
      }
      
      public boolean topimage() {
    	  return topimage.isDisplayed();
      }
      
      
    	}

    	
      


   

