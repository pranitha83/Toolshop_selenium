package allHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driverFactory.Setupdriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.LoggerLoad;

public class Hooks {
@Before(order=0)
public static void setup1() {
	LoggerLoad.info("before order 0");
	Setupdriver.SetupDriver();
}
@Before(order=1)
public static void setup2() {
	Setupdriver.Driver();
}

@After
public static void screenshot(Scenario scenario) {
	if(scenario.isFailed()) {
		 final byte[] screenshot = ((TakesScreenshot)Setupdriver.Driver()).getScreenshotAs(OutputType.BYTES);
         scenario.attach(screenshot, "image/png", scenario.getName()); 
         
	}
	
}
}
