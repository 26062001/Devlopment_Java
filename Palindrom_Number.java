import java.util.*;

class Palindrom_Number
{
	public static boolean Reverse(int iNo)
	{
		int iDigit=0,iRev=0,iTemp=0;
		iTemp=iNo;
		while(iNo!=0)
		{
			iDigit=iNo%10;
			iRev=(iRev*10)+iDigit;
			iNo=iNo/10;
		}
		if(iTemp==iRev)
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
		boolean bRet=false;
		
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		bRet= Reverse(iValue);
		if(bRet==true)
		{
			System.out.println("Number is Palindrom");
		}
		else
		{
			System.out.println("Number is not Palindrom");
		}
			
	}
}