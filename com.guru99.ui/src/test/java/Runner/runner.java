package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	
	@CucumberOptions (
		features={"src/test/java/featureFile/guru99.feature"},
		
		glue={"stepDefination"}
			
		)	
			
	public class runner extends AbstractTestNGCucumberTests{	
	}
