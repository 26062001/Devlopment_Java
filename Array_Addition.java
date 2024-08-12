import java.util.*;

class Array_Addition
{
	public static int Array_Sum(int iSize,int Arr[])
	{
		int iCnt=0,Sum=0;
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			Sum=Arr[iCnt]+Sum;
		}return Sum;
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
		
		int Addition=Array_Sum(iLength,Arr);
		System.out.println("Array Addition is:"+Addition);
		
	}
}