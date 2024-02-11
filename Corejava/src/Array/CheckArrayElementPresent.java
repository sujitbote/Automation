package Array;

import java.util.Arrays;

public class CheckArrayElementPresent 
{
	public static void main(String[] args) 
	{
		int a[]= {10, 20, 30, 40, 50};
		//System.out.println(Arrays.toString(i));
		
		int b = 40;
		
		System.out.println("given array is : " + Arrays.toString(a));
		System.out.println("value of b is = "+ b);
		
	
		if(a[0]==b)
		{
			System.out.println("value of b is present in array at 0th index");
		}
		
		else if(a[1]==b)
		{
			System.out.println("value of b is present in array at 1st index");
		}
		
		else if(a[2]==b)
		{
			System.out.println("value of b is present in array at 2nd index");
		}
		
		else if(a[3]==b)
		{
			System.out.println("value of b is present in array at 3rd index");
		}
		else if(a[4]==b)
		{
			System.out.println("value of b is present in array at 4th index");
		}
		else
		{
			System.out.println("value of b is not present in given array");
		}
		
		
		
	}

}
