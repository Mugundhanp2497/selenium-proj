package normalprog;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createxl 
{
	public static void main(String[] args) throws IOException 
	{
	File f=new File("C:\\Users\\mugunthan\\eclipse-workspace\\mavenProjectOne\\xlFiles\\xl1.xlsx");	
	Workbook w=new XSSFWorkbook();
	Sheet s1=w.createSheet("mugu");
	Row r0=s1.createRow(0);
	Row r1=s1.createRow(1);
	Row r2=s1.createRow(2);
	Cell c0=r0.createCell(0);
	Cell c1=r0.createCell(1);
	Cell c2=r0.createCell(2);
	Cell c3=r1.createCell(0);
	Cell c4=r1.createCell(1);
	Cell c5=r1.createCell(2);
	Cell c6=r2.createCell(0);
	Cell c7=r2.createCell(1);
	Cell c8=r2.createCell(2);
    c0.setCellValue("1");
    c1.setCellValue("mugu");
    c2.setCellValue("neyveli");
    c3.setCellValue("2");
    c4.setCellValue("raju");
    c5.setCellValue("trichy");
    c6.setCellValue("3");
    c7.setCellValue("hari");
    c8.setCellValue("trichy");
    FileOutputStream f2=new FileOutputStream(f);
    w.write(f2);
    
    
		
	}

}
