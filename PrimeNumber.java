import java.util.*;

/*
class PrimeNumber
{
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0;
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		int iCnt=0,iTemp=0;
		iTemp=iValue;
		for(iCnt=2;iCnt<=iValue;iCnt++)
		{
			if(iValue%iCnt==0)
			{
				break;
			}
		}
		if((iTemp==iCnt)||(iTemp==1))
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}
		
	}
}

*/
//Using Function

/*
class PrimeNumber
{
	public static boolean ChkPrime(int iNo)
	{
		int iCnt=0,iTemp=0;
		iTemp=iNo;
		for(iCnt=2;iCnt<=iNo;iCnt++)
		{
			if(iNo%iCnt==0)
			{
				break;
			}
		}
		if((iTemp==iCnt)||(iTemp==1))
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
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		boolean bRet=false;
		bRet=ChkPrime(iValue);
		if(bRet==true)
		{
			System.out.println(iValue+ "Number is Prime");
		}
		else
		{
			System.out.println(iValue+ "Number is not Prime");
		}
	}
}

*/

//Using Class


class ChkPrimeNumber
{
		public boolean ChkPrime(int iNo)
		{
			int iCnt=0,iTemp=0;
			iTemp=iNo;
			for(iCnt=2;iCnt<=iNo;iCnt++)
			{
				if(iNo%iCnt==0)
				{
					break;
				}
			}
			if((iTemp==iCnt)||(iTemp==1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
}


class PrimeNumber
{
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue=0;
		System.out.println("Enter the Number");
		iValue=sobj.nextInt();
		
		boolean bRet=false;
		ChkPrimeNumber obj=new ChkPrimeNumber();
		
		bRet=obj.ChkPrime(iValue);
		if(bRet==true)
		{
			System.out.println(iValue+ "Number is Prime");
		}
		else
		{
			System.out.println(iValue+ "Number is Prime");
		}
		
	}
}
