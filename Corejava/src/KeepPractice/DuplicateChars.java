package KeepPractice;

import java.util.HashSet;

public class DuplicateChars
{

	public static void main(String[] args) 
	{
	
		HashSet<Character> set = new HashSet<Character>();
		HashSet<Character> set1 = new HashSet<Character>();

		
		String str = "sujit bote bb".replaceAll(" ", "");
		
		System.out.println("duplicates: ");
		
		for(char c : str.toCharArray())
		{
			if(!(set.add(c)))
			{
				set1.add(c);
			}
		}
		
		
		for (char c: set1)
		{
			System.out.print(c+" ");
		}
		
		
        

	}
	
}
