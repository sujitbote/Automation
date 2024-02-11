package Array;

//import java.util.Arrays;

public class PrintArrayFormat 
{

	public static void main(String[] args) 
	{
		try
		{
			String name[] = {"ram", "sita", "vishnu"};
			int rollno[] = {1,2,3};
			int salary[]= {6543, 9685, 7463};
			
			for(int i=0; i<name.length; i--)
			{
				System.out.println(name[i]+"\t" +rollno[i]+"\t"+salary[i]);
			}
			
			System.out.println("--------------------------");
			
			for(int i=0; i<name.length; i++)
			{
				System.out.println(name[i]+rollno[i]+salary[i]);
			}
			

			System.out.println("--------------------------");
			
			for(int i=0; i<name.length; i++)
			{
				System.out.println(name[i]);
				System.out.println("\t"+rollno[i]);
				System.out.println("\t"+salary[i]);

			}
		}
		
		catch (ArrayIndexOutOfBoundsException ex1)
		{
			System.out.println(ex1);
		}
		
		
	}
}
