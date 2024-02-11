package Array;

import java.util.Arrays;

public class MaxMinInNegativeArray {

	public static void main(String[] args) 
	{
		int a[] = {-69,-38,-335,-42,-54};
		
		int min = a[0];
		int max = a[0];
		
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
			
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		
	
		
		System.out.println("min no is: "+min);
		System.out.println("max no is: "+max);
		
		
		//int b[] = {69,8,335,2,54};

		/*
		 * Arrays.sort(a); //Arrays.sort(b);
		 * 
		 * 
		 * System.out.println(Arrays.toString(a));
		 * //System.out.println(Arrays.toString(b));
		 * 
		 * 
		 * System.out.println(a[0]);
		 * 
		 * System.out.println(a.length-1);
		 */

	}

}
