import java.util.Scanner;
public class To_Print_Array_Element
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Array Element");
		int n= sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Array Elements are"+i);
			a[i-1]=sc.nextInt();
		}
		for(int i=0;a[i]<n;a[i]++)
		{
		System.out.println("Array Value"+a[i]);
		}
	}

}
