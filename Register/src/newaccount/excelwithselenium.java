package newaccount;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excelwithselenium {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe" );
		WebDriver e=new ChromeDriver();
		e.get("http://demo.automationtesting.in/Register.html");
		e.manage().window().maximize();
		
		FileInputStream f= new FileInputStream("C:\\Users\\LENOVO\\Documents\\Custdetails.xls");
		Workbook b= Workbook.getWorkbook(f);
		Sheet s=b.getSheet(0);
		Thread.sleep(5000);
		int i;
	
		int rows= s.getRows();
		//int columns= s.getColumns();
		for(i=1;i<=rows;i++)
		{
			Thread.sleep(5000);
			//for(j=0;j<=columns;j++)
			
			
				String fn=s.getCell(0,i).getContents();
				String ln=s.getCell(1,i).getContents();
				String addr=s.getCell(2,i).getContents();
				String email=s.getCell(3,i).getContents();
				String phno=s.getCell(4,i).getContents();
				String pswrd=s.getCell(5,i).getContents();
				String cnpswrd=s.getCell(6,i).getContents();
			
				e.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(fn);
				e.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(ln);
				e.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys(addr);
				e.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys(email);
				e.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys(phno);
				Thread.sleep(5000);
				e.findElement(By.id("firstpassword")).sendKeys(pswrd);
				e.findElement(By.id("secondpassword")).sendKeys(cnpswrd);
				e.navigate().refresh();		
				
			}
		}
					
				
				
			}
		
		
	
		
	


