import java.util.*;

class Demo
{
	public int Factorial(int iNo)
	{
		int iFact=1,iCnt=0;
		for(iCnt=1;iCnt<=iNo;iCnt++)
		{
			iFact=iFact*iCnt;
		}
		return iFact;
	}
}

class Factorial
{
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0,iFact=1,iCnt=0;
		
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		for(iCnt=1;iCnt<=iValue;iCnt++)
		{
			iFact=iFact*iCnt;
		}
		
		System.out.println("Factorial is:"+iFact);
		
		//Using Function
		Demo dobj=new Demo();
		int iFact1=0;
		
		iFact=dobj.Factorial(iValue);
		System.out.println("Factorial is:"+iFact);
		
	}
}