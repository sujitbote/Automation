package String;

import java.util.Arrays;

public class AnagramString 
{
	public static void main(String[] args) 
	{
		String a = "raaace";
		String b = "aaacer";
		
		System.out.println(a);
		System.out.println(b);

		
		char c1[] = a.toCharArray();
		char c2[] = b.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String sorteda = Arrays.toString(c1);
		String sortedb = Arrays.toString(c2);

		System.out.println(sorteda);
		System.out.println(sortedb);

		
		if(sorteda.equals(sortedb))
		{
			System.out.println("its a anagram");
		}
		else
		{
			System.out.println("its not anagram");
		}

		
		
	}
	
	

}
