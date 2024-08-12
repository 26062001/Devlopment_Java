import java.util.*;

class Digit_Count
{
	public static int CountDigit(int iNo)
	{
		int iDigit=0,iCnt=0;
		while(iNo!=0)
		{
			iDigit=iNo%10;
			iCnt++;
			iNo=iNo/10;
		}
		return iCnt;
	}
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0,iRet=0;
		
		
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		iRet=CountDigit(iValue);
		System.out.println("Digit Couunt is:"+iRet);
			
	}
}