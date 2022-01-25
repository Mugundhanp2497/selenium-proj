package junits;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class junitcore
{
	@Test
	public void sample()
	{
	Result r=JUnitCore.runClasses(junit2.class,junitspro.class);
	}
}
