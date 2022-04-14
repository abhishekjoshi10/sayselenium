package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\OneDrive\\Desktop\\testing\\chromedriver_win32\\chromedriver.exe");
		 
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://chercher.tech/practice/explicit-wait");
		driver.manage().window().maximize();
		WebDriverWait waits =new WebDriverWait(driver,60);
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		waits.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
}
