import java.util.Scanner;
public class Natural_Number
{
	static int i,n,sum=0;
	public static void main(String args[]) 
	{
		
		System.out.println("Enter The Number");
		Scanner sc=new Scanner(System.in);
		//i= sc.nextInt(n);
		
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			sum=sum+i;
		}		
		System.out.println("Sum of natural Number ="+sum);
		
	}

}
