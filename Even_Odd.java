import java.util.*;

class Even_Odd
{
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0;
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		if(iValue%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}

//Using Static Function
/*
class Even_Odd
{
	
	public static boolean Chk_Even_Odd(int iNo)
	{
		if(iNo%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0;
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		boolean bRet=false;
		bRet=Chk_Even_Odd(iValue);
		if(bRet==true)
		{
			System.out.println(iValue+  "Number is Even");
		}
		else
		{
			System.out.println(iValue+  "Number is Odd");
		}
	}
}
*/

//Using Class
/*
class Chk_Even_Odd
{
		public boolean Even_Odd_Chk(int iNo)
		{
			if(iNo%2==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
}

class Even_Odd
{
	
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0;
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		Chk_Even_Odd obj =new Chk_Even_Odd();
		boolean bRet=false;
		bRet=obj.Even_Odd_Chk(iValue);
		if(bRet==true)
		{
			System.out.println(iValue+"Number is Even");
		}
		else
		{
			System.out.println(iValue+"Number is Odd");
		}
	}
}
*/