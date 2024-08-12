import java.util.*;

class Digit_Sum_Even
{
	public static int Sum_Digit(int iNo)
	{
		int iDigit=0,iSum=0;
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if(iDigit%2==0)
			{
				iSum=iSum+iDigit;
			}
			iNo=iNo/10;
		}
		return iSum;
	}
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0,iRet=0;
		
		
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		iRet=Sum_Digit(iValue);
		System.out.println(" Even Digit Sum is:"+iRet);
			
	}
}