package waits;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.sun.tools.javac.util.Options;

public class Explicit2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\OneDrive\\Desktop\\testing\\chromedriver_win32\\chromedriver.exe");
		 
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
	//	Options.addArguments ("headless");
		try {
			WebDriverWait waits=new  WebDriverWait(driver,10);
			waits.until(ExpectedConditions.titleContains("Selenium Automation Practice Form"));
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("its Time out! true");
			
		}
		finally {
			System.out.println("Title of the page is "+driver.getTitle());
			
			driver.close();
		}
					}

}
