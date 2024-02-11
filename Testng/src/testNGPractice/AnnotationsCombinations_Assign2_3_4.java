package testNGPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsCombinations_Assign2_3_4
{
	@BeforeSuite
	public void demoBeforsuite()
	{
		System.out.println("this @AfterSuite");
	}
	
	@AfterMethod
	public void demoAftermethod()
	{
		System.out.println("this @AfterMethod");
	}
	
	@AfterSuite
	public void demoAftersuite()
	{
		System.out.println("this @BeforeSuite");
	}
	
	@BeforeMethod
	public void demoBeformethod()
	{
		System.out.println("this @BeforeMethod");
	}
	

	
//	@Test
//	public void demo1()
//	{
//		System.out.println("this @Test 1");
//	}
//	@Test
//	public void demo2()
//	{
//		System.out.println("this @Test 2");
//	}
//	@Test
//	public void demo3()
//	{
//		System.out.println("this @Test 3");
//	}
	
	
	

}
