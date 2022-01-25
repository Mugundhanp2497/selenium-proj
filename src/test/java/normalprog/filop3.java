package normalprog;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class filop3 
{
	public static void main(String[] args) throws IOException ,NullPointerException{
	File f=new File("D:\\aak\\mugu\\raja\\gh.txt");
	//f.mkdirs();
	f.createNewFile();
	FileUtils.write(f, "dfghjkl,mnFilb56iookjhgf");
	FileUtils.write(f,"   sdfghjk,",true);
	//System.out.println(f.list());
	//System.out.println(f.listFiles());
	System.out.println(f.getAbsolutePath());
	System.out.println(f.getAbsoluteFile());
	//f.delete();
	
	}}
