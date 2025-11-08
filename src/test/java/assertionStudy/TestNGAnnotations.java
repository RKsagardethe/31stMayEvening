package assertionStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestNGAnnotations {
  
	@Test
  public void resultValidation() 
  {
	  Reporter.log("a_running test validation", true);
  }
	
	@Test
	  public void resultValidationNew() 
	  {
		  Reporter.log("z_running test validation new", true);
	  }
  
	@BeforeMethod
	public void provideAdtressDetails()
	{
		Reporter.log("Providing pincode and mobile number", true);
	}
	
	@AfterMethod 
	public void clearHistory()
	{
		Reporter.log("clearing browsing history", true);
	}
	
//	@BeforeClass
//	public void provideMemberDetails()
//	{
//		Reporter.log("provide member details", true);
//	}
	
	@AfterClass
	public void tearDown()
	{
		Reporter.log("closing browser", true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("before test running", true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("after methods running", true);
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("before suite running", true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("after suite running", true);
	}
	
	
	
}
