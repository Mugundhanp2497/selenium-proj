package sampleTestPro;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BcAdactin;

public class TcAdactin extends BcAdactin
{
	static String nr;
public static void main(String[] args) throws IOException 
{
  browserLaunch();   
  waits(10);
  max();
  get("http://adactinhotelapp.com");
  WebElement x=driver.findElement(By.xpath("//input[@type='text']"));
  x.sendKeys(xluse("demopro","demo",1,0,""));
  WebElement y=driver.findElement(By.xpath("//input[@type='password']"));
  y.sendKeys(xluse("demopro","demo",1,1,""));
  WebElement z=driver.findElement(By.xpath("//input[@name='login']"));
  z.click();
  WebElement a= driver.findElement(By.xpath("//select[@name='location']"));
  selectmeth(a,1);	
  WebElement b=driver.findElement(By.xpath("//select[@name='hotels']"));
  selectmeth(b,1);
  WebElement c=driver.findElement(By.xpath("//select[@name='room_type']"));
  selectmeth(c,1);
  WebElement d= driver.findElement(By.xpath("//select[@name='room_nos']"));
  selectmeth(d,1);
 WebElement e= driver.findElement(By.xpath("//select[@name='adult_room']"));
  selectmeth(e,1);
 WebElement f=  driver.findElement(By.xpath("//select[@name='child_room']"));
selectmeth(f,1);
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
driver.findElement(By.xpath("//input[@name='continue']")).click();
WebElement g=driver.findElement(By.xpath("//input[@name='first_name']"));
g.sendKeys(xluse("demopro","demo",3,0,""));
WebElement h=driver.findElement(By.xpath("//input[@name='last_name']"));
h.sendKeys(xluse("demopro","demo",3,1,""));
WebElement i=driver.findElement(By.xpath("//textarea[@name='address']"));
i.sendKeys(xluse("demopro","demo",3,2,""));
WebElement j=driver.findElement(By.xpath("//input[@name='cc_num']"));
j.sendKeys(xluse("demopro","demo",3,3,""));
WebElement k=driver.findElement(By.xpath("//input[@name='cc_cvv']"));
k.sendKeys(xluse("demopro","demo",3,4,""));
WebElement zz=driver.findElement(By.xpath("//select[@name='cc_type']"));
selectmeth(zz,1);
WebElement zx=driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
selectmeth(zx,1);
WebElement zy=driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
selectmeth(zy,11);
driver.findElement(By.xpath("//input[@name='book_now']")).click();
WebElement recvd=driver.findElement(By.xpath("//input[@name='order_no']"));
nr=recvd.getAttribute("value");
System.out.println("nr="+nr);
xluse("demopro","demo",4,0,nr);
}
}
