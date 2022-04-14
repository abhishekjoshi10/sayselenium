package handlings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocators {
	
	

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\OneDrive\\Desktop\\testing\\chromedriver_win32\\chromedriver.exe");
			
					ChromeDriver driver= new ChromeDriver();
			driver.get(" https://opensource-demo.orangehrmlive.com/");
			
			driver.manage().window().maximize();
			
			WebElement Username=driver.findElement(By.id("txtUsername"));
			
			Username.sendKeys("Admin");
			 driver.findElement(By.id("txtPassword"));
			 
			 WebElement password=driver.findElement(By.id("txtPassword"));
			 
			 password.sendKeys("admin123");
			 
			 WebElement btnLogin= driver.findElement(By.id("btnLogin"));
			
			 btnLogin.click();
			 
		}

}
