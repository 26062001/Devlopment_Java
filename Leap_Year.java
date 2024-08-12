import java.util.*;

class Leap_Year
{
	public static void main(String [] args)
	{
			Scanner sobj=new Scanner(System.in);
			
			System.out.println("Enter the Year");
			int Year=sobj.nextInt();
			
			if(Year%4==0)
			{
				System.out.println("Year is Leap Year");
			}
			else
			{
				System.out.println("Year is not Leap Year");
			}
	}
}