import java.util.*;

/*class Factors
{
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0,iCnt=0;
		
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		 for(iCnt=1;iCnt<=iValue;iCnt++)
		 {
			if(iValue%iCnt==0)
				
			System.out.print(iCnt+ "\t");
		 }
	}
}
*/




/*
class Factors
{
	public static void Factors1(int iNo)
	{
		int iCnt=0;
		for(iCnt=1;iCnt<=iNo;iCnt++)
		{
			if(iNo%iCnt==0)
			{
				System.out.print(iCnt+ "\t");
			}
		 }
	}
	
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0,iCnt=0;
		
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		Factors1(iValue);
	}
}
*/
class Fact
{
	int iCnt=0,iFact=1;
	
	public void Factors1(int iNo)
	{
		int iCnt=0,iFact=1;
		for(iCnt=1;iCnt<=iNo;iCnt++)
		{
			if(iNo%iCnt==0)
			{
				System.out.print(iCnt+"\t");
			}
		}
	}
	
}
class Factors
{
	
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0,iCnt=0;
		
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		Fact fobj=new Fact();
		fobj.Factors1(iValue);
	}
}