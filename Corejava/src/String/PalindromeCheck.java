package String;

public class PalindromeCheck 
{
	public static void main(String[] args) 
	{
		String input = "level";
		String output ="";
		
		for(int i=input.length()-1; i>=0; i--)
		{
			output = output+input.charAt(i);

		}
		
		System.out.println("origional string is: "+input);

		System.out.println("reverse string is: "+output);
		
		System.out.println("isit a pallindrome: "+input.equals(output));
		
		
	}
	
	

}
