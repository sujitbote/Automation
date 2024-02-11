package grouping;

import org.testng.annotations.Test;

public class ExcludeinGrouping_Assign12
{
	@Test(groups= {"Component","System"})
	 void testcase1()
	 {
		System.out.println("1");
	 }
	
	@Test(groups= {"System"})
	 void testcase2()
	 {
		System.out.println("2");
	 }
	@Test(groups= {"Regression","System","Smoke"})
	 void testcase3()
	 {
		System.out.println("3");
	 }
	@Test(groups= {"Integration"})
	 void testcase4()
	 {
		System.out.println("4");
	 }

}
