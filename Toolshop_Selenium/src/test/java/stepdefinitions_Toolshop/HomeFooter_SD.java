package stepdefinitions_Toolshop;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;
import utilities.Context;
import utilities.LoggerLoad;

public class HomeFooter_SD {
HomeFooter_PF homefooter;
HomepageHeader_PF home_pheader;
Context context;
public HomeFooter_SD(Context context) {
	this.context=context;
	homefooter=context.getHome_footer();
	//home_pheader=context.getHome_pheader();
}
	@Given("User is in  Home Page")
	public void user_is_in_home_page()  {
	  String URL= Context.GetTitle();
	  System.out.println(URL);
	
	}

	@When("User scrolls down in home page")
	public void user_scrolls_down_in_home_page() throws InterruptedException {
	  JavascriptExecutor jse = (JavascriptExecutor)context.driver;
	  jse.executeScript("window.scrollBy(0,200)");
	 Thread.sleep(2000);
	}

	@Then("User should  see the pagination in given format \\(<<,Previous disabled and {int} Next >> labels are enabled )followed by the text {string}")
	public void user_should_see_the_pagination_in_given_format_previous_disabled_and_next_labels_are_enabled_followed_by_the_text(Integer int1, String string) {
	
		List<WebElement> paginationtext=homefooter.checkpagination();
		for(WebElement pagination : paginationtext) {
			LoggerLoad.info(pagination.getText());
			//System.out.println(pagination.getText());
			//System.out.println(homefooter.footertext());
		}
	//List<String>	paginationtext= homefooter.checkpagination();
		
		//System.out.println(paginationtext.size());
		
		
	}
	//Next button
	
	@When("User click Next or >>")
	public void user_click_next_or() {
		//List<String>	paginationtext= homefooter.checkpagination();

	//homefooter.clicknext();
		List<WebElement>pages = homefooter.pagenav();
		for (WebElement e: pages) {
			System.out.println("1."+e.getText());
			if(e.getText().equalsIgnoreCase("Next")) {
				e.click();
			}
			else
			{
				System.out.println("you are on last page:" +e.getText());
				
			}
		}
}
		
	  
	

	@Then("User able to see next page")
	public void user_able_to_see_next_page() {
	 String h= homefooter.currentpage(); 
	 //System.out.println(h);
	 LoggerLoad.info(h);
	}

	@When("User click Last page")
	public void user_click_last_page() {
	   homefooter.clklastpage();
	  
	}

	@Then("User able to see last page with Next and >> buttons are disabled")
	public void user_able_to_see_last_page_with_next_and_buttons_are_disabled() {
		String currentpagetext= homefooter.currentpage(); 
		 LoggerLoad.info(currentpagetext);
		 Pattern pattern = Pattern.compile("\\d+");
		 Matcher matcher = pattern.matcher(currentpagetext);
		 String pageValue = null;
		 if(matcher.find()) {
			 pageValue = matcher.group();
		 }
		 try {
			
			 //String pageValue = null;
			int currentpage=Integer.parseInt(pageValue);
		System.out.println(currentpage);
	if( currentpage==3) {
		homefooter.nextbtndisabled();
		//String disabled = homefooter.nextbtndisabled();
		//boolean next_disabled = homefooter.nextdisabled();
		//Assert.assertTrue(next_disabled);
	}
	
		
	}catch(NumberFormatException e) {
		System.out.println("Failed to parse the currantpage as integer");
	}

	}
	@When("User click Previous or <<")
	public void user_click_previous_or() {
	 LoggerLoad.info(homefooter.currentpage()); 
		homefooter.previous();
	   
	}

	@Then("User able to see previous page")
	public void user_able_to_see_previous_page() {
		 LoggerLoad.info(homefooter.currentpage()); 
		
	}

	@When("User click Start page")
	public void user_click_start_page() {
	   homefooter.startpageclk();
	}

	@Then("User able to see first page with disabled Previous,<<")
	public void user_able_to_first_page_with_disabled_previous() {
	 LoggerLoad.info(homefooter.currentpage());
	 String currentpagetext= homefooter.currentpage(); 
	 LoggerLoad.info(currentpagetext);
	 Pattern pattern = Pattern.compile("\\d+");
	 Matcher matcher = pattern.matcher(currentpagetext);
	 String pageValue = null;
	 if(matcher.find()) {
		 pageValue = matcher.group();
	 }
	 try {
		
		 //String pageValue = null;
		int currentpage=Integer.parseInt(pageValue);
	System.out.println(currentpage);
if( currentpage==1) {
	homefooter.previousdis();
}
	 }catch(NumberFormatException e) {
			System.out.println("Failed to parse the currantpage as integer");
		}

	}

	@When("User click github link")
	public void user_click_github_link() throws InterruptedException {
	 homefooter.githubrepo();
	 Thread.sleep(3000);
	 //WebDriver driver = Context.GetDriver();
	 //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10) );
	 
	}

	@Then("User able to see the github page opens in another browser tab")
	public void user_able_to_see_the_github_page_opens_in_another_browser_tab() {
		 // WebDriver driver = Context.GetDriver();
		  String originalwindow = Context.windowhandle();
		  for (String windowHandle : Context.windowhandles()) {
		    	if(!originalwindow.contentEquals(windowHandle)) {
		    		//driver.switchTo().window(windowHandle);
		    	Context.handles(1);	
		    	System.out.println((Context.windowhandle()));
		    	System.out.println(Context.url());	 
		    	//https://github.com/testsmith-io/practice-software-testing
				       // break;
		    	
		    	
		    	}
		    
		        }

		 
		  
		
		  
		/*   ArrayList<String> tabs = new ArrayList<String>(Context.windowhandles());
		   driver.switchTo().window(tabs.get(0));
		  LoggerLoad.info(driver.getWindowHandle());
		  LoggerLoad.info(driver.getPageSource());
		   //System.out.println(driver.getPageSource());
		  
		   /* Iterator<String> it = Windowhandles.iterator();
		    String parentwindow = it.next();
		   // String childwindow = it.next();
		    while(it.hasNext()) {
		    	System.out.println(parentwindow);
		    	//System.out.println(child);
		    }
	
		System.out.println(Windowhandles);
		    for (String windowHandle : Windowhandles) {
		        driver.switchTo().window(windowHandle);
		      // driver.findElement(By.id("discussions-tab"));
		        break;
		        }*/
		    }

		   
	
	//Assert.assertEquals((Context.GetDriver()).getTitle(), "GitHub Page Title");
	
	
	
	@When("User click Privacy Policy")
	public void user_click_privacy_policy() {
	 homefooter.privacypolicy();
	}

	@Then("User able the see the privacy policy page opens in same browser tab")
	public void user_able_the_see_the_privacy_policy_page_opens_in_same_browser_tab() {
		
		  LoggerLoad.info(Context.url());
	}
		 
		        
		    
	

	@When("User click Barn Images")
	public void user_click_barn_images() {
	  homefooter.barnimage();
	}

	@Then("User able to see Barn images tab in the browser")
	public void user_able_to_see_barn_images_tab_in_the_browser() {
	
		  String originalwindow = Context.windowhandle();
		  for (String windowHandle : Context.windowhandles()) {
		    	if(!originalwindow.contentEquals(windowHandle)) {
		    		//driver.switchTo().window(windowHandle);
		    	Context.handles(2);	
		    	System.out.println((Context.windowhandle()));
		    	System.out.println(Context.url());	
		    	}
		  }
	}

	@When("User click Unsplash")
	public void user_click_unsplash() {
		homefooter.unsplash();
	}

	@Then("User able to see Unsplash page in another browser tab")
	public void user_able_to_see_unsplash_page_in_another_browser_tab() {
		  String originalwindow = Context.windowhandle();
		  for (String windowHandle : Context.windowhandles()) {
		    	if(!originalwindow.contentEquals(windowHandle)) {
		    		//driver.switchTo().window(windowHandle);
		    	Context.handles(3);	
		    	//System.out.println((Context.windowhandle()));
		    	System.out.println(Context.url());	
		    	}
		  }
	}
	}





