package Array;

public class ArrayCheck {

	public static void main(String[] args) 
	{
		
		int a1[] = {10,20,30,45,50};
		System.out.println(a1[0]);

		int b =45;
		
		for (int i=0; i<=a1.length-1; i++)
		{
			if(a1[i] == b )
			{
				System.out.println("number 45 is present in a given array at index of: "+a1[i]);
				break;
			}
			
		}
			
		
		{
			System.out.println("number 45 is not present in a given array");
			System.out.println(a1[0]);

		}

	}

}
