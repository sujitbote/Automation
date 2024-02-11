package testNGPractice;

import org.testng.annotations.Test;

public class InvocatnCountAssign6_7
{
	@Test (priority=0, invocationCount = 1)
	public void demo1()
	{
		System.out.println("this @Test 1");
	}
	
	@Test (priority=-1,invocationCount = 2)
	public void demo2()
	{
		System.out.println("this @Test 2");
	}

}
