package utilities;

import org.openqa.selenium.WebDriver;

import driverFactory.Setupdriver;
import pageObjects.HomepageHeader_PF;

public class Context extends Setupdriver {
private HomepageHeader_PF home_pheader;
//private WebDriver driver;

	

public HomepageHeader_PF getHome_pheader() {
	if(home_pheader==null)
	{
		home_pheader= new HomepageHeader_PF(driver);
	}
	return home_pheader;
}






/*public WebDriver getDriver() {
	return driver;
}
*/


/*public void setDriver(WebDriver driver) {
	this.driver = driver;
}*/



/*public HomepageHeader_PF gethomepage() {
	if (home_pheader==null)
	{
		home_pheader=new HomepageHeader_PF(driver);
	}
	return home_pheader;
}*/
}
