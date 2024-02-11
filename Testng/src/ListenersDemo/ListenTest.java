package ListenersDemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ItestListCls.class)

public class ListenTest 
{
//	@AfterSuite
//	public void test4()
//	{
//		System.out.println("test case 4");
//	}
//	
//	@BeforeSuite
//	public void test3()
//	{
//		System.out.println("test case 3");
//	}
//	
//	@BeforeTest
//	public void test2()
//	{
//		System.out.println("test case 2");
//	}
//	
	@Test
	public void test1()
	{
		System.out.println("test case 1");
		
	}
}
