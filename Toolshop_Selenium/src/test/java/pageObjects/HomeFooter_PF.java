package pageObjects;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.LoggerLoad;

public class HomeFooter_PF {

@FindBy(xpath = "//*[contains(@role,'navigation')]") List<WebElement> pagination;
@FindBy(xpath = "//ul[@class='ngx-pagination responsive']/li") List<WebElement> no_pages;
@FindBy(xpath = "//*[text()='This is a DEMO application (']") WebElement Footer;
@FindBy(className = "pagination-next") WebElement pagination_next;
@FindBy(xpath = "//*[contains(@class,'page-item active')]") WebElement currentpage;
@FindBy(xpath = "//a[text()='3']") WebElement Lastpage;
@FindBy(xpath = "//li[@class='page-item disabled']") WebElement nextbtndisabled;
@FindBy(className = "pagination-previous") WebElement previousbtn;
@FindBy(xpath = "//a[text()='1']") WebElement startpage;
@FindBy(xpath = "//span[@aria-disabled='true' and text()=' Previous ']") WebElement previousbtndisabled;
@FindBy(linkText = "GitHub repo") WebElement Githubrepo;
@FindBy(linkText = "Privacy Policy") WebElement Privacypolicy;
@FindBy(linkText = "Barn Images") WebElement Barnimages;
@FindBy(linkText = "Unsplash") WebElement Unsplash;
    WebDriver driver;

    public HomeFooter_PF(WebDriver webdriver) {
        this.driver = webdriver;
        PageFactory.initElements(webdriver, this);
}
    public  List<WebElement> checkpagination() {
		//return pagination;
    	/*if (pagination.size()>0) {
    		System.out.println("Pagination exist");
    	for(int i = 0; i<pagination.size(); i++) {
    		pagination.get(i).click();
    	}
    }else {
    	System.out.println("pagination not exist");
    }
		return pagination;*/
    	 pagination.stream().map(s->s.getText()).collect(Collectors.toList());
		
		return pagination;
    }
    
    public String footertext() {
    	
		return Footer.getText();
    }
    public void clicknext() {
    	int size=no_pages.size();
    	System.out.println(size);
    	pagination_next.click();
    	
    }
    public  String currentpage() {
    	return currentpage.getText();
		
		
    }
    
    public List<WebElement> pagenav() {
   /*	no_pages.size();
   	for(int i=1; i<=no_pages.size(); i++) {
   		no_pages.get(i)	.click();
   }*/
    	return no_pages;
}
    public void clklastpage() {
    	Lastpage.click();
    }
    public void nextbtndisabled() {
    	nextbtndisabled.isEnabled();
		//String Disable = nextbtndisabled.getAttribute("aria-hidden");
		//System.out.println(Disable);
		//if(Disable.equals("true")) {
			//System.out.println("The next button is disabled");
		//}else {
			//System.out.println("The next button is enabled");
		//}
    	
    }
   /* public boolean nextdisabled() {
       return pagination_next.isEnabled();
    }*/
    public void previous() {
    	previousbtn.click();
    }
//Start page(1)
    public void startpageclk() {
    	startpage.click();
    }
    //previous disabled
    public void previousdis() {
    	previousbtndisabled.click();
    	String pre_disabled = previousbtndisabled.getAttribute("aria-disabled");
    	if(pre_disabled.equals("true")) {
    		LoggerLoad.info("The previous button is disabled");
    	}
    		else {
    			LoggerLoad.info("he previous button is enabled");
    		}
    	}
    //Githubrepo 
    public void githubrepo() {
    	Githubrepo.click();
    }
    //privacy policy
    public void privacypolicy() {
    	Privacypolicy.click();
    }
    public void barnimage() {
    Barnimages.click();
    }
    public void unsplash() {
    	Unsplash.click();
    }
    }
