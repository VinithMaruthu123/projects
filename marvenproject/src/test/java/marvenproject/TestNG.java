package marvenproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeClass
	private void method1() {
		System.out.println("Before class");
	}

	@AfterClass
	private void method2() {
		System.out.println("after class");
	}

	@BeforeSuite
	private void method3() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	private void method4() {
		System.out.println("After Suite");
	}

	@AfterMethod
	private void method5() {
		System.out.println("After method");
	}

	@BeforeMethod
	private void method6() {
		System.out.println("Before Method");
	}

	@BeforeTest
	private void method7() {
		System.out.println("Before Test");
	}

	@AfterTest
	private void method8() {
		System.out.println("After Test");
	}

	@Test(invocationCount = 0)
	private void Method() {
		System.out.println("Test no 1");
	}

	@Test
	private void Methoda() {
		System.out.println("Test no 2");
	}

	@Test
	private void Methodb() {
		System.out.println("Test no 3");
	}
}
