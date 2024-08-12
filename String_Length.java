import java.util.*;

class String_Length
{
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String Name=sobj.nextLine();
		
		System.out.println("Entered String is:"+Name);
		
		int Length=Name.length();
		System.out.println("String Length is:"+Length);
		
	}
}