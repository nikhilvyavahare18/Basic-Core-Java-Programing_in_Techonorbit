import java.util.Scanner;
public class Switch_Demo

{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the Frist Number");
		int frist_Number =sc.nextInt();
		System.out.println("ENter the Second Number");
		int second_Number =sc.nextInt();
		
		System.out.println("ENter The Operations +, - ,*, /");
		char ch =sc .next().charAt(0);
		switch(ch)
		{
		case '+':
			int c = frist_Number+second_Number;
			System.out.println("Addition\n" +c);
			break;
			
		case '-':
			 c = frist_Number-second_Number;
			System.out.println("Subtraction\n" +c);
			break;
			
		case '*':
		    c = frist_Number*second_Number;
			System.out.println("Multiplication\n" +c);
			break;
			
		case '/':
		    c = frist_Number/second_Number;
			System.out.println("Division\n" +c);
			break;
			
		default :
		System.out.println("Invalid Operator");
			
		
		
		}
	}
	
	

}
