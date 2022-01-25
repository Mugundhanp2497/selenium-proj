package junits;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterClass;

public class junit2
{
	@BeforeClass
	public static void a()
	{
		System.out.println("and");
	}
	@Test
	public void b()
	{
		System.out.println("or");
	}
	@Test
	public void c()
	{
		System.out.println("nand");
	}
	@Before
	public void e()
	{
		Date d=new Date();
		System.out.println(d);
				
	}
	@After
	public void d()
	{
		Date d=new Date();
		System.out.println(d);
	}
	@AfterClass
	public static void f()
	{
		System.out.println("the end");
	}

}
