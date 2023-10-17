package driverFactory;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.LoggerLoad;

public class Setupdriver {
private static WebDriver driver;
static ResourceBundle rb;  //for reading properties file
static String br;   //to store browser name

private static WebDriver GetDriver() {
	rb=ResourceBundle.getBundle("Config");
	br=rb.getString("browser");
	if (br.equals("CHROME")) {
		LoggerLoad.info("enter getbrowser");
		driver=new ChromeDriver();
		}
	else if  (br.equals("edge")){
		driver=new EdgeDriver();
	}
	else if (br.equals("FIREFOX")) {
		driver=new FirefoxDriver();
	}
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	return driver;
}
public static void OpenPage(String url) {
	
	LoggerLoad.info("current page :"+url);
	driver.get(url);
}
public static String GetTitle() {
	return driver.getTitle();
}
public static void NavBack() {
	driver.navigate().back();
	
}
public static  WebDriver Driver() {
	return driver;
	
}
public static void SetupDriver() {
	if(driver==null) {
		GetDriver();
	}
	
}
	public static void TearDown() {
		if(driver!=null) {
			LoggerLoad.info("enter teardown");
			driver.quit();
		}
		
	}
}

