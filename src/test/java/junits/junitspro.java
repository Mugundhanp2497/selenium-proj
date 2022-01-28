package junits;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitspro 
{
	@BeforeClass
	public static void sample()
	{
		System.out.println("mugu");
	}
	
	@Test
	public  void abc3()
	{
		System.out.println("3");
	}
    @Test
    public void abc2()
    {
    	System.out.println("2");

    }
    @Test
    public void abc1()
    {
    	System.out.println("1");
    }
    @After
    public  void samr()
    {
    	System.out.println("asdfghjk");
    }
    
    @Before
   public  void time()
    {
     Date d=new Date();
     System.out.println(d);
   
    }

}
