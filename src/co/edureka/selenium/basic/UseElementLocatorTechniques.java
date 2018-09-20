package co.edureka.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseElementLocatorTechniques {
	
	WebDriver driver;

	public void invokeBrowser(String url) {
		try {
			System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.get(url);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void elementLocatorTechniquesUsingAmazon() {
		try {
			invokeBrowser("http://www.amazon.in");
			driver.findElement(By.linkText("Your Amazon.in")).click();
			driver.navigate().back();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Laptops");
			driver.findElement(By.className("nav-input")).click();
			driver.navigate().back();
			driver.findElement(By.partialLinkText("Customer")).click();
			driver.findElement(By.xpath("//div[@id='nav-tools']/a[@id='nav-link-yourAccount']/span[2]")).click();  
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void elementLocatorTechniquesUsingFacebook() {
		try {
			invokeBrowser("http://www.facebook.com");
			driver.findElement(By.name("firstname")).sendKeys("Ramya");
			driver.findElement(By.cssSelector("input#email")).sendKeys("ramya@gmail.com");
			driver.findElement(By.name("lastname")).sendKeys("GG");
			//driver.findElement(By.cssSelector("button._6j mvm _6wk _6wl _58mi _3ma _6o _6v")).click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		UseElementLocatorTechniques obj = new UseElementLocatorTechniques();
		obj.elementLocatorTechniquesUsingAmazon();
		//obj.elementLocatorTechniquesUsingFacebook();
	}

}
