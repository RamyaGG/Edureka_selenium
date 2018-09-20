package testNG;

import org.testng.annotations.*;

public class TestTestNGDependency {
	@Test(priority=0)
	public void d() {
	}

	@Test(priority = 9, dependsOnMethods= {"f"})
	public void e() {
	}

	@Test(priority=0)
	public void d1() {
	}

	@Test(enabled=false)
	public void h() {
	}

	@Test(priority=34)
	public void f() {
	}

	@Test(priority=3)
	public void m() {
	}
}
