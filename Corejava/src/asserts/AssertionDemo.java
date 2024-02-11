package asserts;

import java.util.Arrays;
import java.util.Scanner;

public class AssertionDemo
{
	
	public static void main(String[] args)
	{
		
		int a[] = new int[4];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("insert array elements");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		assert a.length == 4:"condition not satisfied";
		
		System.out.println("condition is satisfied");

		sc.close();
		
		System.out.println(Arrays.toString(a));
		
	}
	
	
	

}
