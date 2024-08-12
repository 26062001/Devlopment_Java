import java.util.*;

class Tabel
{
	
	public static void Tab(int iNo)
	{	
		int iCnt=0,iMult=1;
		for(iCnt=1;iCnt<=10;iCnt++)
		{
			iMult=iCnt*iNo;
			System.out.print(iMult+"\t");
		}
	}
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0;
		System.out.println("Enter the Number for Tabel");
		iValue=sobj.nextInt();
		System.out.println("-----------------");
		Tab(iValue);
	}
}


//Using Class
/*
class Demo
{
		public void Tab(int iNo)
		{	
			int iCnt=0,iMult=1;
			for(iCnt=1;iCnt<=10;iCnt++)
			{
				iMult=iCnt*iNo;
				System.out.print(iMult+"\t");
			}
			
		}
	
}
class Tabel
{
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0;
		System.out.println("Enter the Number for Tabel");
		iValue=sobj.nextInt();
		System.out.println("-----------------");
		
		Demo dobj=new Demo();
		

		dobj.Tab(iValue);
		
		
	}
}
*/