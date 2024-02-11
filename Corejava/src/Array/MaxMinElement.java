package Array;

import java.util.Arrays;

public class MaxMinElement {

	public static void main(String[] args)
	{
		
		int a[]= {100,20,400,10,665};
		
		int min = a[0];
		int max = a[0];
		
		for(int i=0; i<=a.length-1; i++)
		{
			
			if( a[i] < min)
			{
				min = a[i];
			}
			
			
			  if (a[i] > max)
			  {
				  max = a[i]; 
			  }
			 
		}
		
		System.out.println("min value in array is: "+min);
		System.out.println("max value in array is: "+max);

		
	/*	Arrays.sort(a1);
		
		System.out.println(Arrays.toString(a1));
		
		System.out.println("min numner in array is: "+a1[0]);
		System.out.println("max numner in array is: "+a1[4]);
*/

	}

}
