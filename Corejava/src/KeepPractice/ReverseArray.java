package KeepPractice;

import java.util.Arrays;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		
		int MyArray[] = {1,2,3,4};
		
		//int RevArray[]= {};
		
		
		int RevArray[] = new int[4];
		
		
		
		for(int i= MyArray.length-1, k=0; i>=0; i--,k++)
		{
			//int k = 0;
			
			RevArray[k] = MyArray[i];
			
			//k++;
			
			//System.out.println("reverse array is: " + Arrays.toString(RevArray));

			
		}
		
		//System.out.println("reverse array is: " + RevArray[]);
		
		System.out.println("reverse array is: " + Arrays.toString(RevArray));
		
		

		
	}

}
