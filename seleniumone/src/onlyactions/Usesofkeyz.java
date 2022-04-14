package onlyactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Usesofkeyz {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\OneDrive\\Desktop\\testing\\chromedriver_win32\\chromedriver.exe");
		 
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement txtfield =driver.findElement(By.xpath("//*[@id='txtUsername']"));
		
		Actions act = new Actions (driver);
		act.sendKeys(txtfield,"a").build().perform();
				
					 
				
				
	}

}
