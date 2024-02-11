package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScannerInput {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int input1[] = new int[2];
		int input2[] = new int[2];
		
		
		for(int i=0; i<=input1.length-1; i++)
		{
			System.out.println("enter array element for input1:");
			input1[i] = sc.nextInt();
			
		}
		System.out.println("first array is: "+Arrays.toString(input1));

		for(int i=0; i<=input2.length-1; i++)
		{
			System.out.println("enter array element for input2:");
			input2[i] = sc.nextInt();
			
		}
		
		System.out.println("second array is: "+Arrays.toString(input2));
		
		//input1.equals(input2);
		System.out.println("is both arrays equal? : "+input1.equals(input2));
		sc.close();

	}

}
