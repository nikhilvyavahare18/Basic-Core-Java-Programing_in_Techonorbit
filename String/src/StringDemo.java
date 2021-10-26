//to reverse the string

class StringDemo
{

	public static void main(String[] args)
	{
		String s="nikhil";
		
		System.out.println("Orignal String Is "+s);
		
		System.out.println("Length Of String Is "+s.length());
		
		System.out.println("Character At index " +s.charAt(5));
		
		String rev="";
		 
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 rev= rev+s.charAt(i);
			 
		 }	
		 System.out.println("REvese String is "+rev);
	}
	

}
