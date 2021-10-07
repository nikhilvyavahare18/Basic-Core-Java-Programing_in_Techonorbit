import java.util.Scanner;
public class If_else_Statement 
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter UserName");
		String username=sc.next();
		System.out.println("Enter Password");
		String password=sc.next();
		
		if(password.equals("root"))
		{
			System.out.println("Correct Password");
		}
		else
		{
			System.out.println("invalid Password");
		}
	}

}
