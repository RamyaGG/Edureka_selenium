package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestDependencyUsingFacebook {
	WebDriver driver;

	@Test
	public void openBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.get("http://facebook.com");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test(dependsOnMethods = { "openBrowser" })
	public void loginToFacebook() {
		driver.findElement(By.id("email")).sendKeys("ramyagg3@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("loginbutton")).submit();
	}
}
