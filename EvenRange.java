import java.util.*;

class EvenRange
{
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue1=0,iValue2=0,iCnt=0;
		
		System.out.println("Enter the Starting Range");
		iValue1=sobj.nextInt();
		
		System.out.println("Enter the Ending Range");
		iValue2=sobj.nextInt();
		
		for(iCnt=iValue1;iCnt<=iValue2;iCnt++)
		{
			if(iCnt%2==0)
			{
				System.out.print(iCnt+ "\t");
			}
		}
	}
}


//Using Function

/*class EvenRange
{
		public static void EvenLimit(int Start,int End)
		{
			int iCnt=0;
			
			for(iCnt=Start;iCnt<=End;iCnt++)
			{
				if(iCnt%2==0)
				{
					System.out.print(iCnt+ "\t");
				}
			}
			
		}
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue1=0,iValue2=0,iCnt=0;
		
		System.out.println("Enter the Starting Range");
		iValue1=sobj.nextInt();
		
		System.out.println("Enter the Ending Range");
		iValue2=sobj.nextInt();
		
		 EvenLimit(iValue1,iValue2);
	}
}*/


//Using Class 
/*
class Demo
{
		public static void EvenLimit(int Start,int End)
		{
			int iCnt=0;
			
			for(iCnt=Start;iCnt<=End;iCnt++)
			{
				if(iCnt%2==0)
				{
					System.out.print(iCnt+ "\t");
				}
			}
			
		}
}

class EvenRange
{
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue1=0,iValue2=0,iCnt=0;
		
		System.out.println("Enter the Starting Range");
		iValue1=sobj.nextInt();
		
		System.out.println("Enter the Ending Range");
		iValue2=sobj.nextInt();
		
		Demo dobj=new Demo();
		dobj.EvenLimit(iValue1,iValue2);
	}
}

*/