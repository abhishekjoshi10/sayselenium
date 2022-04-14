package staleexceptionwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleException {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\joshi\\OneDrive\\Desktop\\testing\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement link=driver.findElement(By.xpath("//*[@id=\"homeBox1\"]"));
		
		link.click();
		driver.navigate().back();
		Thread.sleep(2000);
		try
		{
		link.click();
		}
		catch(StaleElementReferenceException ab)
		{
			
			WebElement link1 =driver.findElement(By.xpath("//*[@id=\"homeBox1\"]"));
			link1.click();
			
	
		}
	}

}
