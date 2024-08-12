import java.util.*;

/*
class PrimeRange
{

	public static void PrimeNumber(int Start,int End)
	{
		int iCnt=0,iTemp=0,i=0,Count=0;
		
		for(iCnt=Start;iCnt<=End;iCnt++)
		{
			for(i=2;i<=End;i++)
			{
				iTemp=iCnt;
				if(iCnt%i==0)
				{
					break;
				}
			}
			if((iTemp==i)||(iTemp==1))
			{
				Count++;
				System.out.print(iTemp+"\t");
			}
			
		}
		System.out.println("");
		System.out.println("Prime Number Count is:"+Count);
	}
	
	public static void  main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue1=0,iValue2=0;
		
		System.out.println("Enter the Starting Range");
		iValue1=sobj.nextInt();
		
		
		System.out.println("Enter the Ending Range");
		iValue2=sobj.nextInt();
		
		PrimeNumber(iValue1,iValue2);
	}
	
}
*/





class Demo
{

	public void PrimeNumber(int Start,int End)
	{
		int iCnt=0,iTemp=0,i=0,Count=0;
		
		for(iCnt=Start;iCnt<=End;iCnt++)
		{
			for(i=2;i<=End;i++)
			{
				iTemp=iCnt;
				if(iCnt%i==0)
				{
					break;
				}
			}
			if((iTemp==i)||(iTemp==1))
			{
				Count++;
				System.out.print(iTemp+"\t");
			}
			
		}
		System.out.println("");
		System.out.println("Prime Number Count is:"+Count);
	}
}
class PrimeRange
{
	public static void  main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue1=0,iValue2=0;
		
		System.out.println("Enter the Starting Range");
		iValue1=sobj.nextInt();
		
		
		System.out.println("Enter the Ending Range");
		iValue2=sobj.nextInt();
		
		Demo dobj=new Demo();
		dobj.PrimeNumber(iValue1,iValue2);
	}
	
}