package String;

import java.util.ArrayList;
import java.util.Collections;

public class CountofCharinString 
{
	public static void main(String[] args) 
	{
		String a = "sujitboteafwFRGWDWQRef";

		ArrayList<Character> a1 = new ArrayList<Character>();

		for(int i=0; i<a.length(); i++)
		{
			a1.add(a.charAt(i));
		}
		
		System.out.println("given string: "+ a);
		
		System.out.println("count of chr in a given string");
		
		for(int i=0; i<a.length(); i++)
		{
			System.out.println("'"+a.charAt(i)+"'"+" : "+ Collections.frequency(a1, a.charAt(i)));
		}
		
	}

}
