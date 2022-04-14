package handlings;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {
	
	public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\OneDrive\\Desktop\\testing\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
	driver.manage().window().maximize();
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("menu_admin_UserManagement")).click();
	driver.findElement(By.id("ohrmList_chkSelectAll")).click();
	Thread.sleep(1000);
	boolean output =driver.findElement(By.id("ohrmList_chkSelectAll")).isSelected();
    System.out.println(output);
    driver.quit();
	
	}
}
