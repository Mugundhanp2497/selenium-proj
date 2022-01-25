package normalprog;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class fileop
{
	public static void main(String[] args) throws IOException 
	{
	
		File f=new File("D:\\mugu\\raju\\hari\\k.txt");
		// boolean b=f.mkdirs();
		//boolean n=f.createNewFile();
		//System.out.println(n);
		boolean m=f.canWrite();
		System.out.println(m);
		FileUtils.write(f, "i am mugu from tamil nadu /n trying to get job in IT ");
	}

}
