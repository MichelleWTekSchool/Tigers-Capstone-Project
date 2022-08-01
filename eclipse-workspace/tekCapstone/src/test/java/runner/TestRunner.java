package runner;

//public class TestRunner {

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

//	Cucumber Options: 
//		We will use JUnit to setup the TestRunner class and to run our tests 
//		we will use the @RunWith(Cucumber.class)
//		Cucumber Option, by using these option we can glue our features with stepDefinition methods and by using 
//		other option, we can add the feature,scenario, or scenario outline tag and run those specific test 
//		@CucumberOptions(we can use all cucumber options we need here)

//	The options in cucumber are: 
//		features = we can add the path to our feature files here 
//		glue = we can add the path to our stepDefinitions and those stepDefinitions will be glued to our features 
//		tag = By adding the tags we will specify which feature, scenario, scenario outline we want to run 
//		dryRun = If we set this to true, it will check and make sure we have stepDefinition methods for each of the 
//		test step in our feature files, but if we set this to false, then it will run all of the tests that we have added 
//		the tag in feature file and to tag option in TestRunner class 
//		monochrome = will help us to print the stepDefinition methods in clean format in the console and we have to set this to true 
		@RunWith(Cucumber.class)
		@CucumberOptions(
				//make sure when you type classpath:features, all letters are lower case
				features = "classpath:feature",//*could also be:   ".\\src\\test\\resources\\feature",
				glue = "stepDefinition",//here we provide path to def classes
				tags = "@test",
				dryRun = false,//false so it checks if any step in feature fails
				monochrome = true,//true so console output is readable
				plugin = {
						"pretty",
						"html:target/site/cucumber-pretty",
						"json:target/cucumber.json"
				},

				publish = true//set to true to have a execution report
				)
		
public class TestRunner {
	
	@AfterClass
	public static void generateReport() {
		CucumberReportingConfig.reportConfig();
				
			}
			
}
