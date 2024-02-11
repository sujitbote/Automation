package testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo_Assign5
{
//	@BeforeSuite
//	public static void case1()
//	{
//		System.out.println("this is BeforeSuite");
//	}
//	
//	@BeforeTest
//	public static void case2()
//	{
//		System.out.println("this is BeforeTest");
//	}
//	
//	@BeforeClass
//	public static void case3()
//	{
//		System.out.println("this is BeforeClass");
//	}
	
	@BeforeMethod
	public static void case4()
	{
		System.out.println("this is BeforeMethod");
	}
	
//	@Test
//	public static void case5()
//	{
//		System.out.println("this is test");
//	}
//	
//	@Test
//	public static void case51()
//	{
//		System.out.println("this is test");
//	}
	
	@AfterMethod
	public static void case6()
	{
		System.out.println("this is AfterMethod");
	}
	
	@AfterClass
	public static void case7()
	{
		System.out.println("this is AfterClass");
	}
	
//	@AfterTest
//	public static void case8()
//	{
//		System.out.println("this is AfterTest");
//	}
	
	@AfterSuite
	public static void case9()
	{
		System.out.println("this is AfterSuite");
	}
	

}
