import java.util.Scanner;
public class Even_Odd_Number 
{
	public static  void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number\n");
		int n=sc.nextInt();
		
		for(int i=1 ; i< n; i++)
		{
			
			if(i%2==0)
			{
				System.out.println("Even Numbers" +i);
			}
			else
			{
				System.out.println("Odd NUmber"+i);
			}
		}
	}

}
