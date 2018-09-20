 package testNG;

import org.testng.annotations.*;

public class TestNGAnnotations {
	@Test
	public void f1() {
		System.out.println("Inside f1");
	}

	@Test
	public void f2() {
		System.out.println("Inside f2");
	}

	@BeforeTest
	public void beforeAnyTheTests() {
		System.out.println("Before Any Tests");
	}

	@AfterTest
	public void afterAllTheTests() {
		System.out.println("After All the Tests");
	}

	@BeforeMethod
	public void beforeEveryMethod() {
		System.out.println("Before Every test Method");
	}

	@AfterMethod
	public void afterEveryMethod() {
		System.out.println("After Every test Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Any Class");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");

	}

}
