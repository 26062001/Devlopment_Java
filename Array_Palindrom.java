import java.util.*;

class Array_Palindrom
{
	public static boolean Chk_Palindrom(int iSize,int Arr[])
	{
		int iCnt=0,Start=0,End=0;
		End=iSize-1;
		while(Start<End)
		{
			if(Arr[Start]==Arr[End])
			{
					return true;
			}
			else
			{
				return false;
			}
			
		}
		return false;
	}
	
	
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iLength=0,iCnt=0;
		
		System.out.println("Enter the Number of Elements");
		iLength=sobj.nextInt();
		
		int Arr[]=new int[iLength];
		System.out.println("Enter the elements");
		for(iCnt=0;iCnt<iLength;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
		
		boolean bRet=Chk_Palindrom(iLength,Arr);
		if(bRet==true)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
	
		
		
	}
}