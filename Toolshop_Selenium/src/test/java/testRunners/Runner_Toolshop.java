package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/Toolshop.html"},  //cucumber reports
		monochrome=true,  //console output color and eliminate junk characters
		//dryRun=false, // (=true)->compilation purpose mostly to chk stepdefinitions are implemented or not
		tags = "", //tags from feature file
		features = {"src/test/resources/Features_Toolshop"}, //location of feature files, we can give this way-->".//features//"
		glue= {"stepdefinitions_Toolshop","allHooks"}) //location of step definition files, gives granural level of info in test result

		
public class Runner_Toolshop {
	
}
