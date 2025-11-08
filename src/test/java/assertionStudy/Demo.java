  package assertionStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  
	  String actual="test";
	  String expected="test";
	  
//	  if(actual.equals(expected)) 
//	  {
//		  System.out.println("TC passed");
//	  }
//	  else
//	  {
//		  System.out.println("TC failed");
//	  }
	  
	  Assert.assertEquals(actual, expected, "TC failed");
	  Reporter.log("TC passed", true);
  }
  
  
}
