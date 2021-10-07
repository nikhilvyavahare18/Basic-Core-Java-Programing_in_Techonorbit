import java.util.Scanner;
public class Count_Number
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number");
		long n= sc.nextLong();
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println("Count_NUmbers  "+count);
	}

}
