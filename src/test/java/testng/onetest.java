package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class onetest
{
	@Test(priority=-12)
	private void sample5() 
	{
		System.out.println("6");
		
	}
	@Test(invocationCount=10)
	private void sample()
	{
		System.out.println("1");
	}
	@BeforeClass(enabled=true)
	private void sample1()
	{
		System.out.println("2");
	}
	@AfterClass
	private void sample2()
	{
		System.out.println("3");
	}
	@BeforeMethod(enabled=false)
	private void sample3()
	{
		System.out.println("4");
	}
	@AfterMethod
	private void sample4()
	{
		System.out.println("5");
	}

}
