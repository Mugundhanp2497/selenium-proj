package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class twotest {
	@Test(priority=-12)
	private void sample55() 
	{
		System.out.println("66");
		
	}
	@Test(invocationCount=10)
	private void samples()
	{
		System.out.println("11");
	}
	@BeforeClass(enabled=true)
	private void sample11()
	{
		System.out.println("22");
	}
	@AfterClass
	private void sample22()
	{
		System.out.println("33");
	}
	@BeforeMethod(enabled=false)
	private void sample33()
	{
		System.out.println("44");
	}
	@AfterMethod
	private void sample44()
	{
		System.out.println("55");
	}

}
