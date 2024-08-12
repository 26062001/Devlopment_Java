import java.util.*;

class Array_Max_Min
{
	public static int Maximum(int Arr[],int iSize)
	{
		int iCnt=0,iMax=Arr[0];
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			if(Arr[iCnt]>iMax)
			{
				iMax=Arr[iCnt];
			}
			
		}return iMax;
	}
	
	public static int Minimum(int Arr[],int iSize)
	{
		int iCnt=0,iMin=Arr[0];
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			if(Arr[iCnt]<iMin)
			{
				iMin=Arr[iCnt];
			}
			
		}
		return iMin;
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
		
		int Max=Maximum(Arr,iLength);
		System.out.println("Maximum Element in Array is:"+Max);
		
		int Min=Minimum(Arr,iLength);
		System.out.println("Minimum Element in Array is:"+Min);
		
		int Diff=Max-Min;
		System.out.println("The Differance between Maximum and Minimum:"+Diff);
		
	}
}