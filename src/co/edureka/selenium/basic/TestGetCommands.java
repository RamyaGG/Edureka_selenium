package co.edureka.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGetCommands {
	
	WebDriver driver;
	
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			getCommands();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public void getCommands() {
		
		try {
			driver.get("https://amazon.in");
			driver.findElement(By.linkText("Today's Deals")).click();
			String title = driver.getTitle();
			System.out.println("Title of the URL is"+title);
			System.out.println("Current URL is "+driver.getCurrentUrl());
			System.out.println("Page Source");
			System.out.println(driver.getPageSource());
			driver.quit();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		TestGetCommands myObj = new TestGetCommands();
		myObj.invokeBrowser();
		

	}

}
