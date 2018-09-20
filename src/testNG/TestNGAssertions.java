package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGAssertions {
	WebDriver driver;

	@BeforeTest
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			driver.get("http://www.gmail.com");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void testEquality() {
		Assert.assertEquals(true, isEqual(10, 11));
		System.out.println("Ramya");
	}

	public boolean isEqual(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	@Test
	public void getTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Gmail");
		System.out.println("GGRamya");
	}

	/*@AfterTest
	public void closeBrowser() {
		driver.quit(); 
	} */
}
