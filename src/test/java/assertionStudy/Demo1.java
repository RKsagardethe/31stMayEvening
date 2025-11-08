package assertionStudy;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo1 {
//  @Test
 // public void a() {
//	  String a="Test";
//	  String b="test";
//	  Assert.assertEquals(a, b, "a and b are not equal TC failed");
//  }
  
//	  @Test
//	public void a()
//	{
//		String a="Test1";
//		String b="Test";
//		Assert.assertNotEquals(a, b, "a and b are equal TC failed");
//	}
//	  
//	  @Test
//		public void a()
//		{
//			boolean result=false;
//			Assert.assertTrue(result, "Result is false TC failed");
//		}
	
//	  @Test
//		public void a()
//		{
//			boolean result=true;
//			Assert.assertFalse(result, "Result is true TC failed");
//		}
	  
//	@Test
//	public void a()
//	{
//		String url="https://www.coverfox.com/";
//		Assert.assertNotNull(url, "url is null");
//	}
	
//	@Test
//	public void a()
//	{
//		String url="//www.coverfox.com/";
//		Assert.assertNull(url, "url is not null");
//	}
	
//	@Test
//	public void a()
//	{
//		Assert.fail();
//	}
	  
//	@Test
//	public void a()
//	{
//		String url=null;
//		Assert.assertNotNull(url, "url is null TC is Failed");
//		String a="test";
//		String b="test";
//		Assert.assertEquals(a, b, "a and b are not equal TC ");
//	}
	
	SoftAssert softAssert=new SoftAssert();
	
	@Test
	public void a()
	{
		String url=null;
		softAssert.assertNotNull(url);
		String a="test1";
		String b="test";
		softAssert.assertEquals(a, b);
		
		softAssert.assertAll();
	}
}
