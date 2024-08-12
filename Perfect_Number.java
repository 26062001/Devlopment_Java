import java.util.*;


class Perfect_Number
{
	public static boolean ChkPerfect(int iNo)
	{
		int iCnt=0,iSum=0,iTemp=0;
		iTemp=iNo;
		
		for(iCnt=1;iCnt<iNo;iCnt++)
		{
			if(iNo%iCnt==0)
			{
				iSum=iSum+iCnt;
			}
		}
		System.out.println("Addition is:"+iSum);
		if(iSum==iTemp)
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
		
		System.out.println("Enter the Number to Check Number is Perfect or Not");
		iValue=sobj.nextInt();
		
		boolean bRet=false;
		
		bRet=ChkPerfect(iValue);
		if(bRet==true)
		{
			System.out.println("Number is Perfect");
		}
		else
		{
			System.out.println("Number is not Perfect");
		}
		
	}
	
}