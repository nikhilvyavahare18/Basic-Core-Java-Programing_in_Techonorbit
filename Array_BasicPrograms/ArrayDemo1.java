import java.util.Scanner;

public class ArrayDemo1 
{	
	public static void main(String[] args)
	{
		int array[]=new int[100];
		System.out.println("How many elemets you want??");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Please Enter The Array Elements");
	    n = sc.nextInt();
		
		for(int i=0;i<5;i++)
		{
			array[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+array[i];
		}
		System.out.println("Sum of the Numbers Are"+sum);
		
	}
}
