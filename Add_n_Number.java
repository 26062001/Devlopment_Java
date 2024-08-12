import java.util.*;

class Add_n_Number
{
	
	public static int Add(int iNo)
	{
			int iCnt=0,iSum=0;
			for(iCnt=1;iCnt<=iNo;iCnt++)
			{
				iSum=iSum+iCnt;
			}
			return iSum;
	}
	
	
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0,iSum=0,iCnt=0;
		
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		for(iCnt=1;iCnt<=iValue;iCnt++)
		{
			iSum=iSum+iCnt;
		}
		System.out.println("Addition of n Number is:"+iSum);
		
		
		int iValue1=0;
		//Using Function
		System.out.println("Enter the Number");
		iValue1=sobj.nextInt();
		
		int iRet=Add(iValue1);
		System.out.println("Addition of n Number:"+iRet);
		
	}
}