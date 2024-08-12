import java.util.*;

class Reverse_Number
{
	public static int Reverse(int iNo)
	{
		int iDigit=0,iRev=0;
		while(iNo!=0)
		{
			iDigit=iNo%10;
			iRev=(iRev*10)+iDigit;
			iNo=iNo/10;
		}
		return iRev;
	}
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0,iRet=0;
		
		
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		iRet= Reverse(iValue);
		System.out.println("Reverse Number is:"+iRet);
			
	}
}