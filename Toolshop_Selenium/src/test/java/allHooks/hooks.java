package allHooks;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverFactory.Setupdriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Context;
import utilities.LoggerLoad;

public class hooks {
private	Context context;
public hooks(Context context) {
	this.context=context;
		
	}
@Before(order=0)
public static void setup1() {
	LoggerLoad.info("before order 0");
	//Setupdriver.SetupDriver();
Context.SetupDriver();
}
@Before(order=1)
public static void setup2() {
	LoggerLoad.info("before order 1");
	//Setupdriver.Driver();
	Context.Driver();
}

@After(order=0)
public static void screenshot(Scenario scenario) {
	if(scenario.isFailed()) {
		 final byte[] screenshot = ((TakesScreenshot)Context.Driver()).getScreenshotAs(OutputType.BYTES);
         scenario.attach(screenshot, "image/png", scenario.getName()); 
         
	}
	
}
@AfterAll
public static void after() {
	//Setupdriver.TearDown();
	Context.TearDown();

}
}

