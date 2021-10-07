import java.util.Scanner;
public class Decision_making
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Name");
		String name=sc.next();
		System.out.println("Enter THe Age");
		int age=sc.nextInt();
		
		if(age<=18)
		{
			System.out.println("Welcome!!!!!    You Are Eligible");
		}
		else
		{
			System.out.println("Not Eligible!!!!!!!!!");
		}
	}

}
