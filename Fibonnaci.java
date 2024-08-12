import java.util.*;

class Fibonnaci	
{
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iPrev=1,iNext=0,iTarget=0,iValue=0;
		
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		for(int iCnt=0;iCnt<=iValue;iCnt++)
		{
			iTarget=iPrev+iNext;
			System.out.print(iTarget+ "\t");
			iPrev=iNext;
			iNext=iTarget;
		}
	}
	
}

//Using Class

/*
class Demo
{
	public void Fibo(int iNo)
	{
		int iPrev=1,iNext=0,iTarget=0;
	
		for(int iCnt=0;iCnt<=iNo;iCnt++)
		{
			iTarget=iPrev+iNext;
			System.out.print(iTarget+ "\t");
			iPrev=iNext;
			iNext=iTarget;
		}
	}
		
}
class Fibonnaci	
{
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0;
		
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		Demo dobj=new Demo();
		dobj.Fibo(iValue);
		
	}
	
}
*/