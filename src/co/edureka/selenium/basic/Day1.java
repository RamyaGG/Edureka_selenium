package co.edureka.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Day1 {
	
	WebDriver driver;
	
	JavascriptExecutor jse;
	
	public void invokeBrowser(){
		try {
			System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			driver.get("https://www.edureka.co");
			searchCourse();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
		public void searchCourse(){
			
			
				try {
					driver.findElement(By.id("homeSearchBar")).sendKeys("Java");	
				//	Thread.sleep(2000);
					driver.findElement(By.id("homeSearchBarIcon")).click();
					driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
					
					jse = (JavascriptExecutor)driver;
					jse.executeScript("scroll(0,800)");
					
					driver.findElement(By.xpath("//label[contains(text(), 'Weekend')]")).click();
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
		
		}
		
	

	public static void main(String[] args) {
		Day1 myObj = new Day1();
		myObj.invokeBrowser();

	}

}
