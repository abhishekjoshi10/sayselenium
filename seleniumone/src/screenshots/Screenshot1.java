package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\OneDrive\\Desktop\\testing\\chromedriver_win32\\chromedriver.exe");
		 
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http://www.groww.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Login/Register']")).click();
		Thread.sleep(2000);
		TakesScreenshot sshot =(TakesScreenshot)driver;
         File source=sshot.getScreenshotAs(OutputType.FILE);   
         File destination = new File("C:\\Users\\joshi\\OneDrive\\Desktop\\sql\\ajss.png");
         FileHandler.copy(source, destination);
	}

}
