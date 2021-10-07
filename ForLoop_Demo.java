import java.util.Scanner;
public class ForLoop_Demo
{
	static int i,n,sum=0;
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number\n");
		int n=sc.nextInt();
		
		for(i=0;i<n;i++)
			{
			sum=sum+i;
			
			}
		System.out.println("Sum Of Number Is \n" +sum);
	}
	
		
	
	
	
	
}
