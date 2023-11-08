package utilities;

import driverFactory.Setupdriver;
import pageObjects.HomeFooter_PF;
import pageObjects.HomepageHeader_PF;

public class Context extends Setupdriver {
private HomepageHeader_PF home_pheader;
private HomeFooter_PF home_footer;


	

public HomepageHeader_PF getHome_pheader() {
	if(home_pheader==null)
	{
		home_pheader= new HomepageHeader_PF(driver);
	}
	return home_pheader;
	
	
}
public HomeFooter_PF getHome_footer(){
if (home_footer==null)
{
	home_footer=new HomeFooter_PF(driver);
}
return home_footer;
}

}
