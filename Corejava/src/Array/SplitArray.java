package Array;

import java.util.Arrays;

public class SplitArray extends Object
{
	public static void main(String[] args) 
	{
		
		String str = "my name is sujit bote";
		System.out.println("origional string is: "+ str);

		
		//String str1[] = {"my name is sujit bote"};
		
		//SplitArray s1 = new SplitArray();
		
		//System.out.println(s1.getClass());
		
		//System.out.println(str.getClass());
		
		
		
		//System.out.println(Arrays.toString(str.split("i", 3)));
		//System.out.println(Arrays.toString(str.split(" ", 1)));
		
		String[] a1 = str.split("i", 3);

		System.out.println("splitted string and converted into array: "+Arrays.toString(a1));
		
		
		String a2 = a1[0];
		
		System.out.println("array at zero index: "+a2);
		
		String a3 =a2.trim();
		
		System.out.println(a3);

//		
//		for(int i=0; i<a1.length; i++)
//		{
//			System.out.println(a1[0]);
//		}
	}


}
