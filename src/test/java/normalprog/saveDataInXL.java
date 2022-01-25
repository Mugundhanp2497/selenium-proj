package normalprog;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class saveDataInXL 
{
	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();   
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://www.facebook.com/");
	d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	WebElement a=d.findElement(By.xpath("//input[@name='firstname']"));
	a.sendKeys("mugu");
	WebElement b=d.findElement(By.xpath("//input[@name='lastname']"));
	b.sendKeys("perumal");
	String aa=a.getAttribute("value");
	String bb=b.getAttribute("value");
	System.out.println(aa+"||"+bb);
	File f=new File("C:\\Users\\mugunthan\\eclipse-workspace\\mavenProjectOne\\xlFiles\\mugu.xlsx");
	Workbook w=new XSSFWorkbook();
	Sheet s=w.createSheet("createAccDetails");
	Row r0=s.createRow(1);
	Cell c0=r0.createCell(0);
	Cell c1=r0.createCell(1);
	c0.setCellValue(aa);
	c1.setCellValue(bb);
	FileOutputStream fo=new FileOutputStream(f);
	w.write(fo);
	
	
	
	
	}
}
