package seleniumproject;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Sample1  {

	private static char[] test;
	private static String fileWithPath;
	private static Object File;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training\\Desktop\\sele\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		
		 WebElement username=driver.findElement(By.id("LoginForm_password"));//storing
		  username.sendKeys("abcd"); username.clear();
		  
		 driver.findElement(By.name("LoginForm[username]")).sendKeys("drdes");
		 driver.findElement(By.id("LoginForm_password")).sendKeys("udsjkfhsk");
		// driver.findElement(By.name("yt0")).click(); String test=((WebElement)
		//  driver.findElements(By.name("yt0"))).getText();
		 // driver.findElements(By.tagName("input")); System.out.println();
		///  Thread.sleep(3000);
		  
		  //System.out.println(test);
		//WebElement username=
				//driver.findElement(By.xpath("//*[@id=\"LoginForm_username\"]")).sendKeys("aishwaryarn");
	//WebElement web=driver.findElement(By.xpath("//p[contains(text(),'credentials')]"));
	//String str=web.getText();
	//System.out.println(str);
	//driver.findElement(By.xpath("//*[@id=\"LoginForm_username\"]")).getText();
		//driver.quit();
	
	//driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver");//alerts
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();
	//Thread.sleep(2000);
	//Alert alert=driver.switchTo().alert();
	//alert.accept();
	//Thread.sleep(5000);//alerts ends
	//frame
//driver.get("https://www.toolsqa.com/iframe-practice-page/");
//driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
//Thread.sleep(3000);
//WebElement ele =driver.findElement(By.name("iframe1"));
//driver.switchTo().frame(ele);

//driver.findElement(By.xpath("//div[@class='dt-mobile-header']//span[@class='menu-text' and contains(text(),'Software Testing Tutorial')]")).click();
//driver.switchTo().frame("iframe1");	
	
//driver.findElement(By.linkText("Home")).click();/*frames concepts
		//windows concept
		//driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		//driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		//driver.findElement(By.id("button1")).click();
		//String MainWindow=driver.getWindowHandle();
		
		//Set<String>i1=driver.getWindowHandles();
		//Iterator<String>i11=i1.iterator();
		//while(i11.hasNext())
		//{
		//	String ChildWindow=i11.next();
			//if(!MainWindow.equalsIgnoreCase(ChildWindow))
			//{
				//driver.switchTo().window(ChildWindow);
				//Thread.sleep(3000);
				//driver.close();
		//	}
			
		//}

//windows concept
		//page object model
		//driver.get("https://www.toolsqa.com/automation-practice-table/");
		/*String str="Financial Center";
		WebElement web=driver.findElement(By.xpath("//table[@class='tsc_table_s13']//th[text()='"+str+"']//following-sibling::td[2]"));
		String test =web.getText();
		System.out.println(test); 
		  	//page object model
		//automatically taking screenshots*/
		/*
		TakesScreenshot scrShot=((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\training\\Desktop\\Screenshots//aishu.png");
Files.copy(SrcFile,DestFile);

		 //screenshots
/*Actions actions=new Actions(driver);
WebElement mainMenu=driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a/span/span"));
actions.moveToElement(mainMenu);
WebElement subMenu=driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[11]/a/span/span"));
actions.moveToElement(subMenu);
actions.click().build().perform();
Thread.sleep(3000);*/
		

		/*{

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss"); 
		TakesScreenshot scrShot=((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		Files.copy(SrcFile, new File("C:\\Users\\training\\Desktop\\Screenshots//aishu.png"));
		}
	}*/

		// driver.quit();
		
		
		//driver.get("https://www.toolsqa.com/automation-practice-form/");
		//List<WebElement> username = driver.findElements(By.tagName("input"));
		//System.out.println(username.size());
		//WebElement rememberMe=driver.findElement(By.id("LoginForm_rememberMe"));
		//System.out.println(rememberMe.isDisplayed());
		
	 //Select continents=new Select(driver.findElement(By.id("continents")));
 //continents.selectByVisibleText("Africa");
	 //continents.deselectByIndex(0);
		//scrolling method
		/*driver.get("https://www.seleniumhq.org/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement Element=driver.findElement(By.xpath("//h2[text()='Selenium News']"));
		js.executeScript("arguments[0].scrollIntoView();",Element);*/
		//scrolling method
		
		//more screenshots
		
		/* Date d = new Date();
		 
        System.out.println(d.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
 TakesScreenshot scrShot=((TakesScreenshot)driver);
 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
 File DestFile=new File("C:\\Users\\hp\\Desktop\\New folder (2)"+sdf.format(d)+".png");
 Files.copy(SrcFile,DestFile);*/
 //more screenshots
		//taken value based on their type
		/*WebElement element=driver.findElement(By.name("yt0"));
		String toolTipText=element.getAttribute("value");
		System.out.println(toolTipText);
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		WebElement element=driver.findElement(By.xpath("//*[@id=\"page\"]/div[4]/div/div[2]/ol/li[1]/a"));
		String toolTipText=element.getAttribute("property");
		System.out.println(toolTipText);*/
		//use page factor
		//pagefactelements pge=new pagefactelements(driver);
		//pge.Username.sendKeys("aishwaryarn");

		//pge.Password.sendKeys("abcd");
		
		//page factor
		
	}

	private static void getText() {
		// TODO Auto-generated method stub
		
	}

	private static Alert findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}



