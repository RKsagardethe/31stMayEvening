package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		//Give feature file path
		features= {
		"C:\\Users\\Sagar\\eclipse-workspace\\31stMayCoverFoxTest\\src\\test\\resources\\FeatureFiles\\CoverFoxHealthInsurence.feature",
		//"C:\\Users\\Sagar\\eclipse-workspace\\31stMayCoverFoxTest\\src\\test\\resources\\FeatureFiles\\multipleScenarios.feature"
//		"C:\\Users\\Sagar\\eclipse-workspace\\31stMayCoverFoxTest\\src\\test\\resources\\FeatureFiles\\CoverFoxMultipleData.feature"
	//	"C:\\Users\\Sagar\\eclipse-workspace\\31stMayCoverFoxTest\\src\\test\\resources\\FeatureFiles\\GmailLogInDataTable.feature"
		},
		//Provide step definition package name
		glue= {"stepDefinitions", "hooks"},	
		plugin = {"pretty", "html:target/cucumber-reports/reports.html"},
		publish = true,
		
		dryRun = false
		
		)

//runner class must extend AbstractTestNGCucumberTests
public class HealthInsurenceRunner extends AbstractTestNGCucumberTests {
	//Right Click this class and run as testNG
	@Override
		@DataProvider(parallel=false)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
	
}
