package String;

public class VerticalCharPrint 
{
	public static void main(String[] args) 
	{
		String n1 = "world";
		
		
		  for(int i=n1.length()-1; i>=0; i--) 
		  { 
			  char ch = n1.charAt(i);
			  //System.out.print(n1.charAt(i)); 
			  System.out.println(ch); 

		  }
		 
		
		/*for(int i=0; i<=n1.length()-1; i++)
		{
			System.out.print(n1.charAt(i));
		}*/
		//System.out.println("length of string is: "+ n1.length());
		
		//System.out.println(n1.substring(3));

//		System.out.println(n1.substring(0, 1));
//		System.out.println(n1.substring(1, 2));
//		System.out.println(n1.substring(2, 3));
//		System.out.println(n1.substring(3, 4));
//		System.out.println(n1.substring(4, 5));
	}

}
