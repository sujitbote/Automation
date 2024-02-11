package dataProvider_singleDimArray;

import java.util.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation_1 
{
	
	@DataProvider(name="data1")
	public Object[][] provideData()
	{
		
		//Object[][] obj = new Object[][]{{10},{20},{30}};
		
		return new Object[][]{{"sujit"},{"kiran"},{30}};
		
		//return obj;
		
	}
	
	@Test(dataProvider="data1")
	public void testCase1(Object a)
	{
		//System.out.println(a);
		
		String b = a.toString();
		
		String c =b.concat(" just printing it");
		
		System.out.println(c);
		
	}

	
	
	
	
//	@DataProvider(name="Data1")
//	public Object[][] dataContainer()
//	{
//		Object[][] obj = {{10},{20},{30}};
//		
//		return obj;
//	}
//	
//	@Test(dataProvider="Data1")
//	public void mehod1(int a)
//	{
//		System.out.println(a);
//		
//	}
	

}
