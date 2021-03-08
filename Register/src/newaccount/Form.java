package newaccount;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Form {

	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe" );
		WebDriver r=new ChromeDriver();
		r.get("http://demo.automationtesting.in/Register.html");
		r.manage().window().maximize();
		
		
		Thread.sleep(3000);
		r.quit();
		
		
		
		
		
	
	
		}

}
