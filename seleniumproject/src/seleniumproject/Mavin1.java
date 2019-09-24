package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mavin1 {

	public static void main(String[] args) {
		WebDriver driver;
		
	System.setProperty("Webdriver.Chrome.driver","C:\\selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://connect.maveric-systems.com/index.php/site/login");
	driver.findElement(By.id("LoginForm_username")).sendKeys("abcd");
	

	}

}