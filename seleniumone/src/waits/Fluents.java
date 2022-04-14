package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluents {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\OneDrive\\Desktop\\testing\\chromedriver_win32\\chromedriver.exe");
		 
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		FluentWait<WebDriver> waitss=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring((NoSuchElementException.class));
		driver.findElement(By.xpath("//*[@id='alert']")).click();
		waitss.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
 