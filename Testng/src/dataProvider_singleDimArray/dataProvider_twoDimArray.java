package dataProvider_singleDimArray;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider_twoDimArray 
{
	
	@DataProvider(name="test1")
	public Object[][] data1()
	{
		Object[][] obj = new Object[2][2];
		
		obj[0][0]="emp1 name";
		obj[0][1]="sujit";
		obj[1][0]="emp2 name";
		obj[1][1]="ram";
		
		return obj;
	
	}
	
	@Test(dataProvider="test1")
	public void testcase1(String a, String b)
	{
		System.out.println(a);
		//System.out.println(b);
	}
	
	

}
